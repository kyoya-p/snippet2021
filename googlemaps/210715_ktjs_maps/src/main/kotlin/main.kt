import kotlinx.browser.document
import kotlinx.browser.window

fun latLng(lat: Double, lng: Double) = js("new google.maps.LatLng(lat, lng)")
fun marker(map: dynamic, position: dynamic, title: String) =
    js("new google.maps.Marker({position:position,map:map,title:title})")


fun main() {
    window.asDynamic().main2 = { map: dynamic ->
        marker(map, latLng(35.17117347046399, 136.8825592840424), "名古屋駅")
    }

    document.write(
        """
        <div id="maps" style="width:100%; height:400px"></div>
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
