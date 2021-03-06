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
import idpManager.srdm.model.GetScheduleSetListRspScheduleSetList

import kotlinx.serialization.*
import kotlinx.serialization.internal.CommonEnumSerializer

/**
 * getScheduleSetList response parameter.
 * @param common 
 * @param scheduleSetList スケジュールセットのリスト<br>
 */
@Serializable
data class GetScheduleSetListRsp (
    @SerialName(value = "common") val common: CommonRsp? = null,
    /* スケジュールセットのリスト<br> */
    @SerialName(value = "scheduleSetList") val scheduleSetList: kotlin.collections.List<GetScheduleSetListRspScheduleSetList>? = null
)

