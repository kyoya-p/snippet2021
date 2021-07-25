import google.maps.interop.Marker
import google.maps.interop.jsGeocode
import google.maps.interop.jsGeocoder
import google.maps.interop.jsLatLng
import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import kotlinx.browser.window
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.*
import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.serialization.*
import kotlinx.serialization.json.Json
import org.w3c.dom.get
import org.w3c.dom.parsing.DOMParser
import kotlin.js.Promise
import kotlin.math.pow
import kotlin.time.Duration.Companion.days
import kotlin.time.Duration.Companion.hours
import kotlin.time.ExperimentalTime

@Serializable
data class Battle(val date: String, val time: String, val cond: String, val cost: String, val members: String)

@Serializable
data class Shop(val name: String, val addr: String, val battles: List<Battle>)

@Serializable
data class Pref(val name: String, val prefId: Int)

@Serializable
data class LatLng(val lat: Double, val lng: Double)

@Serializable
data class GeocoderGeometry(val location: LatLng)

@Serializable
data class Geocode(
    val formatted_address: String,
    val geometry: GeocoderGeometry,
    val address_components: List<GeocoderAddressComponent>,
    val types: List<String>,
)

@Serializable
data class GeocoderAddressComponent(val long_name: String, val short_name: String, val types: List<String>)

@ExperimentalTime
class App(val map: dynamic) {
    val appId = "bsShopMap"
    val json = Json { ignoreUnknownKeys = true }
    val geocoder by lazy { jsGeocoder() }

    suspend fun start() {
        map.setCenter(jsLatLng(center.lat, center.lng))
        map.setZoom(zoom)
        callbackFlow {
            map.addListener("dragend") { trySend(null) }
            map.addListener("zoom_changed") { trySend(null) }
            awaitClose {}
        }.collectLatest {
            val c = map.getCenter()
            center = LatLng(c.lat(), c.lng())
            val z = map.getZoom()
            zoom = z
            println("drag/zoom ($center,$zoom)")
        }
    }

    inline fun <reified T> getterRaw(key: String): T? = kotlin.runCatching {
        window.localStorage.getItem("$appId.$key")?.let { json.decodeFromString<T>(it) }
    }.getOrNull()

    inline fun <reified T> setterRaw(key: String, value: T) =
        window.localStorage.setItem("$appId.$key", json.encodeToString(value))

    fun now() = Clock.System.now()

    // localStorageに期限内で型が一致する値があれば返す。無ければnullを返す
    inline fun <reified T> getter(key: String): T? {
        val t = getterRaw<Long>("$key._t")
        if (t == null) return null
        if (t <= now().toEpochMilliseconds()) return null
        //期限内ならlocalStorageを利用
        val r = getterRaw<T>(key)
        if (r == null) return null
        return r
    }

    // localStorageに指定の型で書き込む。有効期限を指定しなければ360日有効
    @ExperimentalTime
    inline fun <reified T> setter(
        key: String, value: T, limit: Instant = Clock.System.now() + days(360)
    ) {
        setterRaw(key, value)
        setterRaw("$key._t", limit.toEpochMilliseconds())
    }

    /*    @ExperimentalTime
        var lat
            get() = getter<Double>("location.lat") ?: 34.6485976
            set(v) = setter("location.lat", v.toString())

        @ExperimentalTime
        var lng
            get() = getter<Double>("location.lng") ?: 135.7824642
            set(v) = setter("location.lng", v.toString())
     */
    var center: LatLng
        get() = getter("location.pos") ?: LatLng(34.648597, 135.7824642)
        set(pos) = setter("location.pos", pos)

    @ExperimentalTime
    var zoom
        get() = getter<Int>("location.zoom") ?: 17
        set(v) = setter("location.zoom", v.toString())

    // https://rennnosukesann.hatenablog.com/entry/2018/03/18/231401
    fun prefList(): List<Pref> {
        val dom = DOMParser().parseFromString(bsPrefData, "text/html")
        val aList = dom.getElementsByTagName("a")
        return (0 until aList.length).mapNotNull { i -> aList[i] }.mapNotNull { e ->
            runCatching {
                val a = e.attributes["href"]!!
                val pref = a.value.match("""list\.php\?pref=(\d+)""")?.get(1)?.toInt()!!
                pref to (e.textContent ?: "")
            }.getOrNull()
        }.map { Pref(it.second, it.first) }
    }

    // ショップリストのFlowを返す。localStorageに保存する(有効期限12時間)
    @ExperimentalTime
    @ExperimentalCoroutinesApi
    @FlowPreview
    suspend fun shopsFlow(prefId: Int): Flow<Shop> {
        val key = "shops($prefId)"
        val shops1 = getter<List<Shop>>(key)
        if (shops1 != null) return shops1.asFlow()

        // val url = "https://www.battlespirits.com/shopbattle/list.php?pref=24"
        val client = HttpClient { install(JsonFeature) { serializer = KotlinxSerializer() } }
        val url = "https://asia-northeast1-bsbattlemap.cloudfunctions.net/getshop?pref=$prefId"
        val shops2 = Json.decodeFromString<List<Shop>>(client.get<String>(url))
        setter(key, shops2, now() + hours(12))
        return shops2.asFlow()
    }

    @ExperimentalTime
    fun geocode0(
        pos: LatLng? = null,
        addr: String? = null,
        retry: Int,
        itv: Int,
        op: (Geocode?, String) -> Unit
    ): Unit {
        val key = "geocode_" + when {
            pos != null -> json.encodeToString(pos)
            addr != null -> json.encodeToString(addr)
            else -> throw Exception("Exception: Parameter Type mismatch")
        }

        getter<Geocode>(key)?.let { op(it, "OK"); return }

        val op0: (dynamic, String) -> Unit = { results, status ->
            //println("Status=$status")
            when {
                status == "OK" -> {
                    val g = json.decodeFromString<List<Geocode>>(JSON.stringify(results)).firstOrNull()
                    if (g != null) setter(key, g)
                    op(g, status)
                }
                status != "OVER_QUERY_LIMIT" -> op(null, status)
                retry == 0 -> op(null, status)
                else -> {
                    console.log("geocode() retry(remaining:$retry,interval:$itv)")
                    window.setTimeout({ geocode0(pos, addr, retry - 1, itv * 2, op) }, itv)
                }
            }
        }
        when {
            pos != null -> jsGeocode(geocoder, pos, op0)
            addr != null -> jsGeocode(geocoder, addr, op0)
            else -> throw Exception("Exception: Parameter Type mismatch")
        }
    }

    fun geocodeP(pos: LatLng? = null, addr: String? = null, retry: Int = 0, itv: Int = 200) =
        Promise<Geocode?> { res, err ->
            geocode0(pos, addr, retry, itv) { g, st ->
                res(g)
            }
        }

    suspend fun geocode(pos: LatLng, retry: Int = 0, itv: Int = 200) =
        geocodeP(pos = pos, retry = retry, itv = itv).await()

    suspend fun geocode(addr: String, retry: Int = 0, itv: Int = 200) =
        geocodeP(addr = addr, retry = retry, itv = itv).await()

    fun addShopMarker(shop: Shop, pos: LatLng, onClick: (dynamic) -> Unit = {}): dynamic =
        Marker(map, pos, shop.name, onClick)


}


