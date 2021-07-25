package google.maps.interop

import LatLng

fun jsLatLng(lat: Double, lng: Double) = js("new google.maps.LatLng(lat, lng)")
fun Marker(map: dynamic, pos: dynamic, t: String, clickEventFunc: (ev: dynamic) -> Unit = {}): dynamic {
    val marker = js("new google.maps.Marker({position:pos,map:map,title:t})")
    js("google.maps.event.addListener(marker, 'click', clickEventFunc)")
    return marker
}

fun InfoWindow() = js("""new google.maps.InfoWindow()""")

fun jsGeocoder(): dynamic = js("new google.maps.Geocoder()")

fun jsGeocode(geocoder: dynamic, pos: String, op: (results: dynamic, status: String) -> Unit): dynamic {
    console.log("geocode($pos)")
    return js("geocoder.geocode({'address':pos,'region':'jp'},op)")
}

fun jsGeocode(geocoder: dynamic, pos: LatLng, op: (results: dynamic, status: String) -> Unit): dynamic {
    console.log("geocode({'latLng':$pos})")
    return js("geocoder.geocode({'latLng':{'lat':pos.lat,'lng':pos.lng}},op)")
}