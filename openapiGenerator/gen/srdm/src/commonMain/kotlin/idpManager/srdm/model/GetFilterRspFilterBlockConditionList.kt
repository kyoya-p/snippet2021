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

/**
 * 
 * @param detailOperation 詳細条件区分<br>\"and\" または、 \"or\"
 * @param detailConditionList 
 */
@Serializable
data class GetFilterRspFilterBlockConditionList (
    /* 詳細条件区分<br>\"and\" または、 \"or\" */
    @SerialName(value = "detailOperation") val detailOperation: kotlin.String? = null,
    @SerialName(value = "detailConditionList") val detailConditionList: kotlin.collections.List<GetFilterRspFilterDetailConditionList>? = null
)

