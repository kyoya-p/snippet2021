import google.maps.interop.*
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.collect


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

fun test() {

    val a = app.getterRaw<String>("a") == "qwert"


}


@ExperimentalCoroutinesApi
@FlowPreview
@DelicateCoroutinesApi
fun main2(map: dynamic) = GlobalScope.promise {
    app.shopsFlow().collect {
        println(it)
    }
    return@promise

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

        delay(300)
    }
}

