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
import idpManager.srdm.model.GetDeviceLogDetailRspItemList

import kotlinx.serialization.*
import kotlinx.serialization.internal.CommonEnumSerializer

/**
 * getDomainOperationLogDetail response parameter.
 * @param common 
 * @param logId ドメイン操作ログID（リクエストパラメータと同じ値）
 * @param resultCount 詳細項目の件数
 * @param itemList 詳細項目のリスト<br>詳細項目が存在しない場合は、空のリストを返す。
 */
@Serializable
data class GetDomainOperationLogDetailRsp (
    @SerialName(value = "common") val common: CommonRsp? = null,
    /* ドメイン操作ログID（リクエストパラメータと同じ値） */
    @SerialName(value = "logId") val logId: kotlin.String? = null,
    /* 詳細項目の件数 */
    @SerialName(value = "resultCount") val resultCount: kotlin.Int? = null,
    /* 詳細項目のリスト<br>詳細項目が存在しない場合は、空のリストを返す。 */
    @SerialName(value = "itemList") val itemList: kotlin.collections.List<GetDeviceLogDetailRspItemList>? = null
)

