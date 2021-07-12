import io.ktor.client.*
import io.ktor.client.request.*
import kotlinx.browser.document

suspend fun main() {
//    document.write("Hello, world!")
    val r = getBSShopBattleInfo()
    document.write(r)
}

// JSから呼び出される関数
@JsName("getBSShopBattleInfo")
suspend fun getBSShopBattleInfo(): String {
    val url = "https://www.battlespirits.com/shopbattle/list.php?pref=24"
    return HttpClient().get<String>(url)
}