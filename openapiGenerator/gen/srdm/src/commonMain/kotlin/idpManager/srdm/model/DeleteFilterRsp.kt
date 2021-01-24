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
 * deleteFilter response parameter.
 * @param common 
 */
@Serializable
data class DeleteFilterRsp (
    @SerialName(value = "common") val common: CommonRsp? = null
)

