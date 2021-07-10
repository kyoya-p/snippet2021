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
 * @param logId デバイス操作ログID
 * @param kind 種類<br>information／error
 * @param timestamp 操作日時
 * @param domainId 操作実施者が属するドメインのドメインID
 * @param domainName 操作実施者が属するドメインのドメイン名
 * @param accountId 操作実施者のアカウントID
 * @param accountName 操作実施者のアカウント名
 * @param accountStatus 操作実施者のアカウントの状態<br>active／locked／deleted／manualLocked
 * @param operation 操作内容<br>操作内容は、「SRDM_IDP_Data_Model_Definition.xlsx」を参照。
 * @param code 操作結果コード<br>0000：正常／0000以外：異常<br>異常の場合の結果コードは、「SRDM_IDP_Data_Model_Definition.xlsx」を参照。
 */
@Serializable
data class GetDeviceOperationLogRspLogList (
    /* デバイス操作ログID */
    @SerialName(value = "logId") val logId: kotlin.String? = null,
    /* 種類<br>information／error */
    @SerialName(value = "kind") val kind: kotlin.String? = null,
    /* 操作日時 */
    @SerialName(value = "timestamp") val timestamp: kotlin.Long? = null,
    /* 操作実施者が属するドメインのドメインID */
    @SerialName(value = "domainId") val domainId: kotlin.String? = null,
    /* 操作実施者が属するドメインのドメイン名 */
    @SerialName(value = "domainName") val domainName: kotlin.String? = null,
    /* 操作実施者のアカウントID */
    @SerialName(value = "accountId") val accountId: kotlin.String? = null,
    /* 操作実施者のアカウント名 */
    @SerialName(value = "accountName") val accountName: kotlin.String? = null,
    /* 操作実施者のアカウントの状態<br>active／locked／deleted／manualLocked */
    @SerialName(value = "accountStatus") val accountStatus: kotlin.String? = null,
    /* 操作内容<br>操作内容は、「SRDM_IDP_Data_Model_Definition.xlsx」を参照。 */
    @SerialName(value = "operation") val operation: kotlin.String? = null,
    /* 操作結果コード<br>0000：正常／0000以外：異常<br>異常の場合の結果コードは、「SRDM_IDP_Data_Model_Definition.xlsx」を参照。 */
    @SerialName(value = "code") val code: kotlin.String? = null
)
