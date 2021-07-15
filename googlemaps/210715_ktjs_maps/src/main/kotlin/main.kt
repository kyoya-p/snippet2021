import kotlinx.browser.document
import kotlinx.browser.window


fun main() {
    document.write(
        """
<div id="maps" style="width:100%; height:400px"></div>
<script type="text/javascript">
function initMap_org() {
    var opts = {
        zoom: 15,
        center: new google.maps.LatLng(35.709984,139.810703)
    };
    var map = new google.maps.Map(document.getElementById("maps"), opts);
}       
</script>
<script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDrO7W7Sb6RCpHTsY3GaP-zODRP_HtY4nI&callback=initMap"></script>
    """.trimIndent()
    )
}

@JsName("opts")
val opts = mapOf(
    "zoom" to 15,
    "center" to js("google.maps.LatLng(35.709984,139.810703)")
)

@JsName("initMap")
fun initMap() {
    val map = js("""google.maps.Map(document.getElementById("maps"), opts);""")
}

fun main1() {
    document.write("<p id='main'>")
    val mpos = window.document.getElementById("main")!!
    window.onmousemove = { ev ->
        val mouseInfo = "(${ev.x}, ${ev.y})"
        mpos.textContent = mouseInfo
        window.document.title = mouseInfo
        Unit // dynamic型を返せとのことだが...
    }
}