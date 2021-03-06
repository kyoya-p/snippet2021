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
 * checkProgress response parameter.
 * @param common 
 * @param isComplete 非同期処理実行状況<br>（true:非同期処理完了。または、指定されたrequestIdの非同期処理は未実行／false:非同期処理実行中）
 */
@Serializable
data class CheckProgressRsp (
    @SerialName(value = "common") val common: CommonRsp? = null,
    /* 非同期処理実行状況<br>（true:非同期処理完了。または、指定されたrequestIdの非同期処理は未実行／false:非同期処理実行中） */
    @SerialName(value = "isComplete") val isComplete: CheckProgressRsp.IsComplete? = null
) {

    /**
    * 非同期処理実行状況<br>（true:非同期処理完了。または、指定されたrequestIdの非同期処理は未実行／false:非同期処理実行中）
    * Values: `true`,`false`
    */
    @Serializable(with = IsComplete.Serializer::class)
    enum class IsComplete(val value: kotlin.Boolean){
        `true`("true"),
        `false`("false");

        object Serializer : CommonEnumSerializer<IsComplete>("IsComplete", values(), values().map { it.value.toString() }.toTypedArray())
    }
}

