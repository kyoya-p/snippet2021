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
import kotlinx.serialization.json.*
import kotlin.js.Promise


@Serializable
data class Battle(val date: String, val time: String, val cond: String, val cost: String, val members: String)

@Serializable
data class Shop(val name: String, val addr: String, val battles: List<Battle>)

@Serializable
data class Location(val lat: Double, val lng: Double)

@Serializable
data class Geometry(val location: Location)

@Serializable
data class GeocodeRes(val formatted_address: String, val geometry: Geometry)


class AppSetting {
    val appId = "bsShopMap"
    var lat
        get() = window.localStorage.getItem("$appId.location.lat")?.toDouble() ?: 34.6485976
        set(v: Double) = window.localStorage.setItem("$appId.location.lat", v.toString())
    var lng
        get() = window.localStorage.getItem("$appId.location.lng")?.toDouble() ?: 135.7824642
        set(v: Double) = window.localStorage.setItem("$appId.location.lng", v.toString())
    var zoom
        get() = window.localStorage.getItem("$appId.location.zoom")?.toInt() ?: 17
        set(v: Int) = window.localStorage.setItem("$appId.location.zoom", v.toString())
}

var app = AppSetting()

private val json = Json { ignoreUnknownKeys = true }

@ExperimentalCoroutinesApi
fun geocodePromise(geocoder: dynamic, addr: String) = Promise<GeocodeRes> { resolve, reject ->
    Geocode(geocoder, addr) { results: dynamic, status: String ->
        if (status == "OK") resolve(json.decodeFromString<List<GeocodeRes>>(JSON.stringify(results)).last())
        else reject(Exception("Error: geocodePromise(addr=$addr):status=$status"))
    }
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
        <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDrO7W7Sb6RCpHTsY3GaP-zODRP_HtY4nI&callback=initMap"></script>
        """.trimIndent()
    )
}


@ExperimentalCoroutinesApi
@FlowPreview
@DelicateCoroutinesApi
fun main2(map: dynamic) = GlobalScope.promise {

    map.setCenter(LatLng(app.lat, app.lng))
    map.setZoom(app.zoom)

    map.addListener("drag") {
        val loc = map.getCenter()
        app.lat = loc.lat()
        app.lng = loc.lng()
        Unit
    }
    map.addListener("zoom_changed") {
        app.zoom = map.getZoom()
        Unit
    }
    val infoWindow = InfoWindow()
    val client = HttpClient { install(JsonFeature) { serializer = KotlinxSerializer() } }

    // val url = "https://www.battlespirits.com/shopbattle/list.php?pref=24"
    fun url(pref: Int) = "https://asia-northeast1-bsbattlemap.cloudfunctions.net/getshop?pref=$pref"
    val shops = (30..30).flatMap { Json.decodeFromString<List<Shop>>(client.get(url(it))) }
    val geocoder = Geocoder()
    shops.forEach { shop ->
        val g = geocodePromise(geocoder, shop.addr).await()
        val b = shop.battles.first()

        val marker = Marker(map, LatLng(g.geometry.location.lat, g.geometry.location.lng), shop.name)
        marker.addListener("click") {
            infoWindow.close()
            val cont = "${shop.name}\n${b.date}${b.time}"
            infoWindow.setContent(cont.toString())
            infoWindow.open(map, marker)
        }

        delay(300)
    }
}
