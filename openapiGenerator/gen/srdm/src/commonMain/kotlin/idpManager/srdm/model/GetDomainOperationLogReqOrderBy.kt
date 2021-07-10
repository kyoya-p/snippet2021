/**
* idpManager API Specification
* このドキュメントは、idpManagerのAPI仕様書です。
*
* The version of the OpenAPI document: 2.11.0.18
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package idpManager.srdm.model


import kotlinx.serialization.*
import kotlinx.serialization.internal.CommonEnumSerializer

/**
 * 
 * @param key ソートキー<br> 指定可能な項目は、以下の通り。 - ソートキー一覧   <table border=\"1\">     <tr><th>キー</th><th>説明</th></tr>     <tr><td>kind</td><td>種類</td></tr>     <tr><td>timestamp</td><td>日時</td></tr>     <tr><td>accountId</td><td>アカウントID</td></tr>     <tr><td>accountName</td><td>アカウント名</td></tr>     <tr><td>operation</td><td>操作内容 (*1)</td></tr>     <tr><td>code</td><td>操作結果コード</td></tr>   </table>  *1)操作内容のソートは、「SRDM_IDP_Data_Model_Definition.xlsx」に記載されている操作内容の値を文字コードでソートする<br> ●チェック内容   - 指定値以外は、エラー
 * @param order ソート順<br>   - ascending:昇順   - descending:降順  ●チェック内容   - 指定値以外は、エラー
 */
@Serializable
data class GetDomainOperationLogReqOrderBy (
    /* ソートキー<br> 指定可能な項目は、以下の通り。 - ソートキー一覧   <table border=\"1\">     <tr><th>キー</th><th>説明</th></tr>     <tr><td>kind</td><td>種類</td></tr>     <tr><td>timestamp</td><td>日時</td></tr>     <tr><td>accountId</td><td>アカウントID</td></tr>     <tr><td>accountName</td><td>アカウント名</td></tr>     <tr><td>operation</td><td>操作内容 (*1)</td></tr>     <tr><td>code</td><td>操作結果コード</td></tr>   </table>  *1)操作内容のソートは、「SRDM_IDP_Data_Model_Definition.xlsx」に記載されている操作内容の値を文字コードでソートする<br> ●チェック内容   - 指定値以外は、エラー */
    @SerialName(value = "key") @Required val key: kotlin.String,
    /* ソート順<br>   - ascending:昇順   - descending:降順  ●チェック内容   - 指定値以外は、エラー */
    @SerialName(value = "order") @Required val order: GetDomainOperationLogReqOrderBy.Order
) {

    /**
    * ソート順<br>   - ascending:昇順   - descending:降順  ●チェック内容   - 指定値以外は、エラー
    * Values: ascending,descending
    */
    @Serializable(with = Order.Serializer::class)
    enum class Order(val value: kotlin.String){
        ascending("ascending"),
        descending("descending");

        object Serializer : CommonEnumSerializer<Order>("Order", values(), values().map { it.value.toString() }.toTypedArray())
    }
}

