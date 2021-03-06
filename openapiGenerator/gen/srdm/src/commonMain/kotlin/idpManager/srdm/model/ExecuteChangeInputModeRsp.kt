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

import kotlinx.serialization.*
import kotlinx.serialization.internal.CommonEnumSerializer

/**
 * executeChangeInputMode response parameter.
 * @param common 
 * @param targetList 実行対象のdeviceIdのリスト
 */
@Serializable
data class ExecuteChangeInputModeRsp (
    @SerialName(value = "common") val common: CommonRsp? = null,
    /* 実行対象のdeviceIdのリスト */
    @SerialName(value = "targetList") val targetList: kotlin.collections.List<kotlin.String>? = null
)

