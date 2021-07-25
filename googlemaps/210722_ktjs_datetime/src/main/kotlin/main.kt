import google.maps.interop.InfoWindow
import google.maps.interop.jsIcon
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toInstant
import kotlinx.datetime.toLocalDateTime
import kotlin.time.Duration
import kotlin.time.Duration.Companion.days
import kotlin.time.Duration.Companion.hours
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

    val infoWindow = InfoWindow()
    val prefList = app.prefList()
    prefList.flatMap { pref -> app.shopsFlow(pref.prefId).toList() }.forEachIndexed { i, shop ->
        val g = app.geocode(addr = shop.addr, 10)
        if (g == null) {
            println("Error: ZERO_RESULT: geocode(${shop.addr}) ")
            return@forEachIndexed
        }
        val futureBattles = shop.battles.filter { b -> b.dateTime() > Clock.System.now() } //現在以降のバトル
        val nextBattle = futureBattles.minByOrNull { b -> b.dateTime() }
        val nextBattleTime = nextBattle?.dateTime()
        val now = Clock.System.now()
        val scale = when {
            nextBattleTime == null -> 6
            nextBattleTime - now < days(1) -> 14
            nextBattleTime - now < days(2) -> 12
            else -> 8
        }
        val opa = when {
            else -> 0.8
        }
        val color = when {
            nextBattle?.cost == "無料 " -> "#FF2020"
            else -> "#804040"
        }
        val marker = app.addShopMarker(shop, g.geometry.location) { }
        marker.setOptions(jsIcon(scale = scale, color = color, opa = opa))
        marker.addListener("click") {
            infoWindow.close()
            val cont = "<p>${shop.name}<p>" + shop.battles.joinToString("") { b ->
                "<p>${b.date}${b.time}:${b.cond} ${b.cost} ${b.members}<p>"
            }
            infoWindow.setContent(cont)
            infoWindow.open(map, marker)

        }
    }

//  map.addListener("drag") { dragOp() }
//  map.addListener("dragend") { dragEndOp() }
}



