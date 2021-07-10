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
 * @param requestId unregisterDevice()APIで発行されたrequestId<br> ●チェック内容   - 数値以外は、エラー
 */
@Serializable
data class GetUnregisterDeviceResultReq (
    /* unregisterDevice()APIで発行されたrequestId<br> ●チェック内容   - 数値以外は、エラー */
    @SerialName(value = "requestId") @Required val requestId: kotlin.Int
)
