import google.maps.interop.jsGeocode
import google.maps.interop.jsGeocoder
import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import kotlinx.browser.window
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.await
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
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
data class Location(val lat: Double, val lng: Double)

@Serializable
data class GeocoderGeometry(val location: Location)

@Serializable
data class Geocode(
    val formatted_address: String,
    val geometry: GeocoderGeometry,
    val address_components: List<GeocoderAddressComponent>,
    val types: List<String>,
)

@Serializable
data class GeocoderAddressComponent(val long_name: String, val short_name: String, val types: List<String>)

class App {
    val appId = "bsShopMap"
    val json = Json { ignoreUnknownKeys = true }
    val geocoder by lazy { jsGeocoder() }

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

    @ExperimentalTime
    var lat
        get() = getter<Double>("location.lat") ?: 34.6485976
        set(v) = setter("location.lat", v.toString())

    @ExperimentalTime
    var lng
        get() = getter<Double>("location.lng") ?: 135.7824642
        set(v) = setter("location.lng", v.toString())

    @ExperimentalTime
    var zoom
        get() = getter<Int>("location.zoom") ?: 17
        set(v) = setter("location.zoom", v.toString())

    // 住所から座標を取得。住所が不正ならnullを返す。localStorageに保存する
    @ExperimentalTime
    suspend fun getGeocode(addr: String): Geocode? {
        val g1 = getter<Geocode>("geocode.$addr")
        if (g1 != null) return g1
        val g2 = geocode(geocoder, addr)
        if (g2 == null) return null
        setter("geocode.$addr", g2)
        return g2
    }

    // ショップリストのFlowを返す。localStorageに保存する(有効期限12時間)
    @ExperimentalTime
    @ExperimentalCoroutinesApi
    @FlowPreview
    suspend fun shopsFlow() = channelFlow<Shop> {
        val key = "shops"
        val shops0 = getter<List<Shop>>(key)
        if (shops0 != null) {
            shops0.forEachIndexed { i, shop ->
                while (trySend(shop).isFailure) {
                    println("Fail: trySend(${shop.name} : ${shop.addr})")
                    delay(300)
                }
            }
        } else {
            // val url = "https://www.battlespirits.com/shopbattle/list.php?pref=24"
            val client = HttpClient { install(JsonFeature) { serializer = KotlinxSerializer() } }
            val shops = prefList().entries.asFlow().flatMapMerge { (prefNo, prefName) ->
                println()
                print("$prefNo:$prefName - ")
                val url = "https://asia-northeast1-bsbattlemap.cloudfunctions.net/getshop?pref=$prefNo"
                Json.decodeFromString<List<Shop>>(client.get<String>(url)).asFlow()
                    .map { it.also { trySend(it).isSuccess } }
            }.toList()
            setter(key, shops, now() + hours(12))
        }
    }

    @ExperimentalCoroutinesApi
    fun geocodePromise(geocoder: dynamic, addr: String) = Promise<Geocode> { resolve, reject ->
        jsGeocode(geocoder, addr) { results: dynamic, status: String ->
            if (status == "OK") resolve(
                app.json.decodeFromString<List<Geocode>>(JSON.stringify(results)).last()
            )
            else reject(Exception("Error: geocodePromise(addr=$addr):status=$status"))
        }

    }

    suspend fun geocode(geocoder: dynamic, addr: String): Geocode? {
        repeat(10) { i ->
            runCatching {
                return geocodePromise(geocoder, addr).await()
            }.onFailure { ex ->
                console.log("Exception: ${ex.message}")
            }
            console.log("geocode($addr) retry[$i]")
            delay((100 * 2.0.pow(i)).toLong())
        }
        return null
    }
}

var app = App()
fun addShops(prefMap: Map<Geocode, Int>, loc: Location) {
    operator fun Location.minus(o: Location) = ((lat - o.lat).pow(2) + (lng - o.lng).pow(2)).pow(0.5)
    val a = prefMap.entries.sortedBy { (g, i) -> g.geometry.location - loc }.first()
    console.log("Loc=$a")
}

