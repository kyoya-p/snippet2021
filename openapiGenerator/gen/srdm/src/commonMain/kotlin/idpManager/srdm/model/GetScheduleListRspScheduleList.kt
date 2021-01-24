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
 * @param scheduleId スケジュールID
 * @param jobType ジョブタイプ   - update：デバイス情報更新
 * @param scheduleName スケジュール名
 * @param execOnScheduleFlag スケジュール実行の有効／無効   - true：スケジュール実行有効   - false：スケジュール実行無効
 */
@Serializable
data class GetScheduleListRspScheduleList (
    /* スケジュールID */
    @SerialName(value = "scheduleId") val scheduleId: kotlin.String? = null,
    /* ジョブタイプ   - update：デバイス情報更新 */
    @SerialName(value = "jobType") val jobType: GetScheduleListRspScheduleList.JobType? = null,
    /* スケジュール名 */
    @SerialName(value = "scheduleName") val scheduleName: kotlin.String? = null,
    /* スケジュール実行の有効／無効   - true：スケジュール実行有効   - false：スケジュール実行無効 */
    @SerialName(value = "execOnScheduleFlag") val execOnScheduleFlag: GetScheduleListRspScheduleList.ExecOnScheduleFlag? = null
) {

    /**
    * ジョブタイプ   - update：デバイス情報更新
    * Values: update
    */
    @Serializable(with = JobType.Serializer::class)
    enum class JobType(val value: kotlin.String){
        update("update");

        object Serializer : CommonEnumSerializer<JobType>("JobType", values(), values().map { it.value.toString() }.toTypedArray())
    }
    /**
    * スケジュール実行の有効／無効   - true：スケジュール実行有効   - false：スケジュール実行無効
    * Values: `true`,`false`
    */
    @Serializable(with = ExecOnScheduleFlag.Serializer::class)
    enum class ExecOnScheduleFlag(val value: kotlin.Boolean){
        `true`("true"),
        `false`("false");

        object Serializer : CommonEnumSerializer<ExecOnScheduleFlag>("ExecOnScheduleFlag", values(), values().map { it.value.toString() }.toTypedArray())
    }
}

