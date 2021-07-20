import kotlin.math.*
import google.maps.interop.*
import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.coroutines.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.*
import kotlin.js.Date
import kotlin.js.Promise


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

    // localStorageに型が一致するかつ最近の情報があればそれを、無ければNullを返す
    inline fun <reified T> getter(key: String): T? = kotlin.runCatching {
        window.localStorage.getItem("$appId.$key")?.let { json.decodeFromString<Pair<Date, T>?>(it)?.second }
    }.getOrNull()

    // localStorageに時間情報とともに書き込む
    inline fun <reified T> setter(key: String, value: T) =
        window.localStorage.setItem("$appId.$key", json.encodeToString(Date.now() to value))

    var lat
        get() = getter<Double>("location.lat") ?: 34.6485976
        set(v) = setter("location.lat", v.toString())
    var lng
        get() = getter<Double>("location.lng") ?: 135.7824642
        set(v) = setter("location.lng", v.toString())
    var zoom
        get() = getter<Int>("location.zoom") ?: 17
        set(v) = setter("location.zoom", v.toString())

    suspend fun getShopsInfo(pref: Int): List<Shop> {
        suspend fun getShopFromSite(pref: Int): List<Shop> {
            // val url = "https://www.battlespirits.com/shopbattle/list.php?pref=24"
            val client = HttpClient { install(JsonFeature) { serializer = KotlinxSerializer() } }
            fun url(pref: Int) = "https://asia-northeast1-bsbattlemap.cloudfunctions.net/getshop?pref=$pref"
            val shops = Json.decodeFromString<List<Shop>>(client.get(url(pref)))
            return shops
        }

        val key = "pref.$pref"
        return getter(key) ?: getShopFromSite(pref).also { setter(key, it) }
    }

    suspend fun getGeocode(geocoder: dynamic, addr: String): Geocode? {
        return getter("geocode.$addr") ?: geocode(geocoder, addr)?.also { setter("geocode.$addr", it) }
    }

    @ExperimentalCoroutinesApi
    fun geocodePromise(geocoder: dynamic, addr: String) = Promise<Geocode> { resolve, reject ->
        jsGeocode(geocoder, addr) { results: dynamic, status: String ->
            if (status == "OK") resolve(app.json.decodeFromString<List<Geocode>>(JSON.stringify(results)).last())
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

@DelicateCoroutinesApi
@FlowPreview
@ExperimentalCoroutinesApi
suspend fun main() {
    window.asDynamic().main2 = ::main2

    document.write(
        """
        <div id="maps" style="width:100%; height:600px"></div>
        <script type="text/javascript">
        function initMap() {
            var opts = {
                zoom: 15,
                center: new google.maps.LatLng(35.17117347046399, 136.8825592840424)
            };
            var map = new google.maps.Map(document.getElementById("maps"), opts);
            main2(map);
        }       
        </script>
        <script async defer src="https://maps.googleapis.com/maps/api/js?v=3&key=AIzaSyDrO7W7Sb6RCpHTsY3GaP-zODRP_HtY4nI&callback=initMap"></script>
        """.trimIndent()
    )
}

@ExperimentalCoroutinesApi
@FlowPreview
@DelicateCoroutinesApi
fun main2(map: dynamic) = GlobalScope.promise {
    val geocoder = jsGeocoder()
    val prefMap = prefList()
        .mapNotNull { (k, v) -> app.getGeocode(geocoder, v)?.let { it to k } }
        .toMap()
    map.setCenter(LatLng(app.lat, app.lng))
    map.setZoom(app.zoom)

    map.addListener("drag") {
        val loc = map.getCenter()
        app.lat = loc.lat()
        app.lng = loc.lng()
        //howShops()
        Unit
    }
    map.addListener("zoom_changed") {
        app.zoom = map.getZoom()
        Unit
    }
    val infoWindow = InfoWindow()
//    val client = HttpClient { install(JsonFeature) { serializer = KotlinxSerializer() } }
//    // val url = "https://www.battlespirits.com/shopbattle/list.php?pref=24"
//    fun url(pref: Int) = "https://asia-northeast1-bsbattlemap.cloudfunctions.net/getshop?pref=$pref"
    val shops = app.getShopsInfo(30)
    shops.forEach { shop ->
        val g = app.getGeocode(geocoder, shop.addr)!!

        val marker = Marker(map, LatLng(g.geometry.location.lat, g.geometry.location.lng), shop.name)
        marker.addListener("click") {
            infoWindow.close()
            val cont = "<p>${shop.name}<p>" + shop.battles.joinToString("") {
                "<p>${it.date}${it.time}:${it.cond} ${it.members}<p>"
            }
            infoWindow.setContent(cont)
            infoWindow.open(map, marker)
        }

        delay(300)
    }
}

