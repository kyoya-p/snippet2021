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

import idpManager.srdm.model.CommonRsp
import idpManager.srdm.model.RegisterDeviceManuallyRspCount
import idpManager.srdm.model.RegisterDeviceManuallyRspRegisterErrorList

import kotlinx.serialization.*
import kotlinx.serialization.internal.CommonEnumSerializer

/**
 * registerDeviceManually response parameter.
 * @param common 
 * @param count 
 * @param registerErrorList 登録エラーのリスト
 */
@Serializable
data class RegisterDeviceManuallyRsp (
    @SerialName(value = "common") val common: CommonRsp? = null,
    @SerialName(value = "count") val count: RegisterDeviceManuallyRspCount? = null,
    /* 登録エラーのリスト */
    @SerialName(value = "registerErrorList") val registerErrorList: kotlin.collections.List<RegisterDeviceManuallyRspRegisterErrorList>? = null
)

