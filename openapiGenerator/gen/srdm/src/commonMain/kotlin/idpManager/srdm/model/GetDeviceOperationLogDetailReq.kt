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
 * @param logId 対象デバイス操作ログのlogId<br> ●チェック内容   - null、空文字はエラー
 */
@Serializable
data class GetDeviceOperationLogDetailReq (
    /* 対象デバイス操作ログのlogId<br> ●チェック内容   - null、空文字はエラー */
    @SerialName(value = "logId") @Required val logId: kotlin.String
)

