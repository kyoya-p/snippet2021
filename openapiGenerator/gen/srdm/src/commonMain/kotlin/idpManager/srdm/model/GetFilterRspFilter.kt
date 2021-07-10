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

import idpManager.srdm.model.GetFilterRspFilterBlockConditionList

import kotlinx.serialization.*
import kotlinx.serialization.internal.CommonEnumSerializer

/**
 * 
 * @param filterId filterId
 * @param filterType フィルタータイプ<br>system：システム定義フィルター／\"userDefined\"：ユーザ定義
 * @param filterName フィルター名
 * @param blockOperation ブロック条件区分<br>\"and\" または、 \"or\"
 * @param blockConditionList 
 */
@Serializable
data class GetFilterRspFilter (
    /* filterId */
    @SerialName(value = "filterId") val filterId: kotlin.String? = null,
    /* フィルタータイプ<br>system：システム定義フィルター／\"userDefined\"：ユーザ定義 */
    @SerialName(value = "filterType") val filterType: kotlin.String? = null,
    /* フィルター名 */
    @SerialName(value = "filterName") val filterName: kotlin.String? = null,
    /* ブロック条件区分<br>\"and\" または、 \"or\" */
    @SerialName(value = "blockOperation") val blockOperation: kotlin.String? = null,
    @SerialName(value = "blockConditionList") val blockConditionList: kotlin.collections.List<GetFilterRspFilterBlockConditionList>? = null
)
