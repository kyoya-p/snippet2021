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
 * @param parentGroupId 親グループID
 * @param groupId グループID
 * @param groupName グループ名
 */
@Serializable
data class GetSRDMGroupListRspGroupList (
    /* 親グループID */
    @SerialName(value = "parentGroupId") val parentGroupId: kotlin.String? = null,
    /* グループID */
    @SerialName(value = "groupId") val groupId: kotlin.String? = null,
    /* グループ名 */
    @SerialName(value = "groupName") val groupName: kotlin.String? = null
)

