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
 * @param groupIdList 対象のgroupIdのリスト<br> ●チェック内容   - null、空のリストは、エラー
 * @param operation 操作<br> IDP関連のグループに関する情報を変更する。   - moveTrash：ゴミ箱へ移動（指定グループを削除状態にする）   - restore：ゴミ箱から戻す（指定グループを通常状態にする）   - delete：ゴミ箱から削除（指定グループに関する情報を削除する）  ●チェック内容   - 指定文字列以外は、エラー
 */
@Serializable
data class RemoveGroupReq (
    /* 対象のgroupIdのリスト<br> ●チェック内容   - null、空のリストは、エラー */
    @SerialName(value = "groupIdList") @Required val groupIdList: kotlin.collections.List<kotlin.String>,
    /* 操作<br> IDP関連のグループに関する情報を変更する。   - moveTrash：ゴミ箱へ移動（指定グループを削除状態にする）   - restore：ゴミ箱から戻す（指定グループを通常状態にする）   - delete：ゴミ箱から削除（指定グループに関する情報を削除する）  ●チェック内容   - 指定文字列以外は、エラー */
    @SerialName(value = "operation") @Required val operation: RemoveGroupReq.Operation
) {

    /**
    * 操作<br> IDP関連のグループに関する情報を変更する。   - moveTrash：ゴミ箱へ移動（指定グループを削除状態にする）   - restore：ゴミ箱から戻す（指定グループを通常状態にする）   - delete：ゴミ箱から削除（指定グループに関する情報を削除する）  ●チェック内容   - 指定文字列以外は、エラー
    * Values: moveTrash,restore,delete
    */
    @Serializable(with = Operation.Serializer::class)
    enum class Operation(val value: kotlin.String){
        moveTrash("moveTrash"),
        restore("restore"),
        delete("delete");

        object Serializer : CommonEnumSerializer<Operation>("Operation", values(), values().map { it.value.toString() }.toTypedArray())
    }
}

