import io.ktor.client.*
import io.ktor.client.request.*

suspend fun parse(): String {
    val url = "https://www.battlespirits.com/shopbattle/list.php?pref=24"
    val html = HttpClient().get<String>(url)
    return html
}
