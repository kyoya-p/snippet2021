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
import idpManager.srdm.model.GetScheduleRspSchedule

import kotlinx.serialization.*
import kotlinx.serialization.internal.CommonEnumSerializer

/**
 * getScheduleItem response parameter.
 * @param common 
 * @param execAtStartupFlag 起動時実行の有効／無効   - true：起動時実行有効   - false：起動時実行無効
 * @param schedule 実行スケジュール<br>
 */
@Serializable
data class GetScheduleItemRsp (
    @SerialName(value = "common") val common: CommonRsp? = null,
    /* 起動時実行の有効／無効   - true：起動時実行有効   - false：起動時実行無効 */
    @SerialName(value = "execAtStartupFlag") val execAtStartupFlag: GetScheduleItemRsp.ExecAtStartupFlag? = null,
    /* 実行スケジュール<br> */
    @SerialName(value = "schedule") val schedule: kotlin.collections.List<GetScheduleRspSchedule>? = null
) {

    /**
    * 起動時実行の有効／無効   - true：起動時実行有効   - false：起動時実行無効
    * Values: `true`,`false`
    */
    @Serializable(with = ExecAtStartupFlag.Serializer::class)
    enum class ExecAtStartupFlag(val value: kotlin.Boolean){
        `true`("true"),
        `false`("false");

        object Serializer : CommonEnumSerializer<ExecAtStartupFlag>("ExecAtStartupFlag", values(), values().map { it.value.toString() }.toTypedArray())
    }
}
