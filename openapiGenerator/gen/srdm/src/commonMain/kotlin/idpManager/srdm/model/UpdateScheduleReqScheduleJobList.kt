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
 * @param jobType ジョブタイプ<br> 実行するジョブを指定。   - powerOn：電源オン状態へ遷移   - standby：電源待機状態へ遷移  ●チェック内容   - 指定文字列以外は、エラー
 * @param schedule 実行スケジュール<br> ●チェック内容   - nullは、エラー   - 空のリストは、エラー。
 */
@Serializable
data class UpdateScheduleReqScheduleJobList (
    /* ジョブタイプ<br> 実行するジョブを指定。   - powerOn：電源オン状態へ遷移   - standby：電源待機状態へ遷移  ●チェック内容   - 指定文字列以外は、エラー */
    @SerialName(value = "jobType") val jobType: UpdateScheduleReqScheduleJobList.JobType? = null,
    /* 実行スケジュール<br> ●チェック内容   - nullは、エラー   - 空のリストは、エラー。 */
    @SerialName(value = "schedule") val schedule: kotlin.collections.List<UpdateScheduleReqSchedule>? = null
) {

    /**
    * ジョブタイプ<br> 実行するジョブを指定。   - powerOn：電源オン状態へ遷移   - standby：電源待機状態へ遷移  ●チェック内容   - 指定文字列以外は、エラー
    * Values: powerOn,standby
    */
    @Serializable(with = JobType.Serializer::class)
    enum class JobType(val value: kotlin.String){
        powerOn("powerOn"),
        standby("standby");

        object Serializer : CommonEnumSerializer<JobType>("JobType", values(), values().map { it.value.toString() }.toTypedArray())
    }
}

