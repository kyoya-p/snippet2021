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
 * @param groupId 対象グループのgroupId<br> ●チェック内容   - null、空文字はエラー
 * @param startIndex 子グループの開始インデックス<br> expand=childrenOnlyの場合のみ有効。<br> expand=\"no\"の場合は、無効（全件取得）。<br> ●チェック内容   - 数値以外はエラー
 * @param count 子グループの要求件数<br> expand=childrenOnlyの場合のみ有効。<br> expand=\"no\"の場合は、無効（全件取得）。<br> ●チェック内容   - 数値以外はエラー
 * @param expand 下位グループの展開要求を指定。<br>   - no:要求したグループのみ   - childrenOnly:要求グループの子グループのみ  ●チェック内容   - 指定値以外は、エラー
 */
@Serializable
data class GetSRDMGroupListReq (
    /* 対象グループのgroupId<br> ●チェック内容   - null、空文字はエラー */
    @SerialName(value = "groupId") @Required val groupId: kotlin.String,
    /* 子グループの開始インデックス<br> expand=childrenOnlyの場合のみ有効。<br> expand=\"no\"の場合は、無効（全件取得）。<br> ●チェック内容   - 数値以外はエラー */
    @SerialName(value = "startIndex") val startIndex: kotlin.Int? = null,
    /* 子グループの要求件数<br> expand=childrenOnlyの場合のみ有効。<br> expand=\"no\"の場合は、無効（全件取得）。<br> ●チェック内容   - 数値以外はエラー */
    @SerialName(value = "count") val count: kotlin.Int? = null,
    /* 下位グループの展開要求を指定。<br>   - no:要求したグループのみ   - childrenOnly:要求グループの子グループのみ  ●チェック内容   - 指定値以外は、エラー */
    @SerialName(value = "expand") val expand: GetSRDMGroupListReq.Expand? = null
) {

    /**
    * 下位グループの展開要求を指定。<br>   - no:要求したグループのみ   - childrenOnly:要求グループの子グループのみ  ●チェック内容   - 指定値以外は、エラー
    * Values: `false`,childrenOnly
    */
    @Serializable(with = Expand.Serializer::class)
    enum class Expand(val value: kotlin.String){
        `false`("false"),
        childrenOnly("childrenOnly");

        object Serializer : CommonEnumSerializer<Expand>("Expand", values(), values().map { it.value.toString() }.toTypedArray())
    }
}

