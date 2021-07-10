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
 * @param scheduleSetIdList 対象scheduleSetIdのリスト<br> ●チェック内容   - nullは、エラー   - 空のリストは、許可
 */
@Serializable
data class DeleteScheduleSetReq (
    /* 対象scheduleSetIdのリスト<br> ●チェック内容   - nullは、エラー   - 空のリストは、許可 */
    @SerialName(value = "scheduleSetIdList") @Required val scheduleSetIdList: kotlin.collections.List<kotlin.String>
)

