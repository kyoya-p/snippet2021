import google.maps.interop.*
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.last
import kotlin.time.Duration.Companion.seconds
import kotlin.time.ExperimentalTime


@ExperimentalTime
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

@ExperimentalTime
suspend fun test() = runCatching {
    fun assert(op: () -> Boolean): Unit {
        if (!op()) throw Exception("Test failed")
    }

    app.setterRaw<String>("z", "z")
    val z = app.getterRaw<String>("z")
    println("z=[$z]")
    println("1")
    val a = app.getter<String>("a")
    assert { a == null }

    println("2")
    app.setter<String>("a", "qwert", app.now())
    println("3")
    assert { app.getter<String>("a") == null }
    app.setter<String>("a", "qwert", app.now() + seconds(3))

    val x = app.getter<String>("a")
    println("4:[$x]")
    assert { x == "qwert" }

    delay(seconds(0.5))
    println("5")
    assert { app.getter<String>("a") == "qwert" }
    delay(seconds(1))
    println("6")
    assert { app.getter<String>("a") == "qwert" }
    println("6")
    delay(seconds(1))
    assert { app.getter<String>("a") == "qwert" }
    println("7")
    delay(seconds(1))
    assert { app.getter<String>("a") == null }

    val v = app.shopsFlow().last()
    assert { v.name == "沖縄県" }
}.onFailure { ex -> println("Failed: $ex"); ex.printStackTrace() }
    .onSuccess { println("Passed") }


@ExperimentalTime
@ExperimentalCoroutinesApi
@FlowPreview
@DelicateCoroutinesApi
fun main2(map: dynamic) = GlobalScope.promise {

    val prefMap = prefList()
        .mapNotNull { (k, v) -> app.getGeocode(v)?.let { it to k } }
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


    app.shopsFlow().collect { shop ->
        val g = app.getGeocode(shop.addr)!!

        val marker = Marker(map, LatLng(g.geometry.location.lat, g.geometry.location.lng), shop.name)
        marker.addListener("click") {
            infoWindow.close()
            val cont = "<p>${shop.name}<p>" + shop.battles.joinToString("") {
                "<p>${it.date}${it.time}:${it.cond} ${it.members}<p>"
            }
            infoWindow.setContent(cont)
            infoWindow.open(map, marker)
        }
        delay(10)
    }
}

