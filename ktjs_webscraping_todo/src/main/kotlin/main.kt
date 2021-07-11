import io.ktor.client.*
import io.ktor.client.request.*
import kotlinx.browser.document

fun main() {
    document.write("Hello, world!")
}

// JSから呼び出される関数
@JsName("getBSShopBattleInfo")
suspend fun getBSShopBattleInfo(): String {
    val url = "https://www.battlespirits.com/shopbattle/list.php?pref=24"
    return HttpClient().get<String>(url)
}