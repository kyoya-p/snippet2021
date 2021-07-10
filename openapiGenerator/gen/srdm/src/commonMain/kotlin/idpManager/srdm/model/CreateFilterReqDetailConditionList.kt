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
 * @param column カラム名（キー）<br> 指定可能文字は、SRDM_IDP_DeviceList_Filter.xlsx 参照。<br> ●チェック内容   - 指定可能文字以外は、エラー
 * @param operationId 条件区分（演算子）<br> 指定可能文字は、SRDM_IDP_DeviceList_Filter.xlsx 参照。<br> ●チェック内容   - 指定可能文字以外は、エラー
 * @param valueString 入力値   - 条件区分が\"isNull\", \"isNotNull\"の場合はnullを指定。   - 条件区分が\"between\"の場合は、2つの入力値を\"/\"で結合。  ●チェック内容   - nullは、エラー 
 */
@Serializable
data class CreateFilterReqDetailConditionList (
    /* カラム名（キー）<br> 指定可能文字は、SRDM_IDP_DeviceList_Filter.xlsx 参照。<br> ●チェック内容   - 指定可能文字以外は、エラー */
    @SerialName(value = "column") @Required val column: kotlin.String,
    /* 条件区分（演算子）<br> 指定可能文字は、SRDM_IDP_DeviceList_Filter.xlsx 参照。<br> ●チェック内容   - 指定可能文字以外は、エラー */
    @SerialName(value = "operationId") @Required val operationId: kotlin.String,
    /* 入力値   - 条件区分が\"isNull\", \"isNotNull\"の場合はnullを指定。   - 条件区分が\"between\"の場合は、2つの入力値を\"/\"で結合。  ●チェック内容   - nullは、エラー  */
    @SerialName(value = "valueString") @Required val valueString: kotlin.String
)

