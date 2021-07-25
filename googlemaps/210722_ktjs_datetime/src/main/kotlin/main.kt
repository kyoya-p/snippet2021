import google.maps.interop.InfoWindow
import google.maps.interop.jsLatLng
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.*
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
@ExperimentalCoroutinesApi
@FlowPreview
@DelicateCoroutinesApi
fun main2(map: dynamic) = GlobalScope.promise {
    val app = App(map)
    launch {
        app.start()
    }
    // 最後に表示していた座標を再現

    val infoWindow = InfoWindow()
    val prefList = app.prefList()
    prefList.flatMap { pref -> app.shopsFlow(pref.prefId).toList() }.forEachIndexed { i, shop ->
        val g = app.geocode(addr = shop.addr, 10)
        if (g == null) {
            println("Error: ZERO_RESULT: geocode(${shop.addr}) ")
        } else {
            println("Addr[$i]:${shop.addr}->${g.formatted_address}")
            val marker = app.addShopMarker(shop, g.geometry.location) { }
            marker.addListener("click") {
                infoWindow.close()
                val cont = "<p>${shop.name}<p>" + shop.battles.joinToString("") { btl ->
                    "<p>${btl.date}${btl.time}:${btl.cond} ${btl.members}<p>"
                }
                infoWindow.setContent(cont)
                infoWindow.open(map, marker)
            }
        }
    }

//  map.addListener("drag") { dragOp() }
//  map.addListener("dragend") { dragEndOp() }
}



