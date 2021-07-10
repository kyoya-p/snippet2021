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
 * @param scheduleSetId 対象スケジュールのscheduleSetId<br> ●チェック内容   - null、空文字はエラー
 */
@Serializable
data class GetScheduleSetReq (
    /* 対象スケジュールのscheduleSetId<br> ●チェック内容   - null、空文字はエラー */
    @SerialName(value = "scheduleSetId") @Required val scheduleSetId: kotlin.String
)

