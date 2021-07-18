package google.maps.interop

fun LatLng(lat: Double, lng: Double) = js("new google.maps.LatLng(lat, lng)")
fun Marker(m: dynamic, p: dynamic, t: String, clickEventFunc: (ev: dynamic) -> Unit = {}): dynamic {
    val marker = js("new google.maps.Marker({position:p,map:m,title:t})")
    js("google.maps.event.addListener(marker, 'click', clickEventFunc)")
    return marker
}

fun InfoWindow() = js("""new google.maps.InfoWindow()""")

fun Geocoder(): dynamic = js("new google.maps.Geocoder()")
fun Geocode(geocoder: dynamic, addr: String, op: (results: dynamic, status: String) -> Unit): dynamic =
    js("geocoder.geocode({'address':addr,'region':'jp'},op)")
