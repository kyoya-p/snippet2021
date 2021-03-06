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
 * @param command 実行コマンド   - standby：電源待機状態へ移行   - powerOn：電源オン状態へ移行  ●チェック内容   - 指定文字列以外は、エラー
 * @param deviceIds 対象deviceIdのリスト<br> ●チェック内容   - nullは、エラー   - 空のリストは、許可
 * @param isExclude deviceIdsの内容指定。   - true：deviceIdsは、非選択デバイス   - false：deviceIdsは、選択デバイス  ●チェック内容   - true/false以外は、エラー
 * @param groupId 対象のgroupId<br> null、空文字の場合、groupIdが指定されていないものとする。<br> groupIdが指定されている場合、指定されたgroupIdのグループで登録されたデバイスを対象とする。<br> 下位のグループが存在する場合、下位のグループに登録されたデバイスに対しても実行する。<br> （結果、操作を実行したグループで参照しているデバイス全てが更新される）<br> groupIdが指定されている場合、指定されたgroupIdのグループ操作ログを記録する。<br> groupIdが指定されていない場合、グループ操作ログの記録は行わない。
 */
@Serializable
data class ExecuteManagePowerReq (
    /* 実行コマンド   - standby：電源待機状態へ移行   - powerOn：電源オン状態へ移行  ●チェック内容   - 指定文字列以外は、エラー */
    @SerialName(value = "command") @Required val command: ExecuteManagePowerReq.Command,
    /* 対象deviceIdのリスト<br> ●チェック内容   - nullは、エラー   - 空のリストは、許可 */
    @SerialName(value = "deviceIds") @Required val deviceIds: kotlin.collections.List<kotlin.String>,
    /* deviceIdsの内容指定。   - true：deviceIdsは、非選択デバイス   - false：deviceIdsは、選択デバイス  ●チェック内容   - true/false以外は、エラー */
    @SerialName(value = "isExclude") @Required val isExclude: ExecuteManagePowerReq.IsExclude,
    /* 対象のgroupId<br> null、空文字の場合、groupIdが指定されていないものとする。<br> groupIdが指定されている場合、指定されたgroupIdのグループで登録されたデバイスを対象とする。<br> 下位のグループが存在する場合、下位のグループに登録されたデバイスに対しても実行する。<br> （結果、操作を実行したグループで参照しているデバイス全てが更新される）<br> groupIdが指定されている場合、指定されたgroupIdのグループ操作ログを記録する。<br> groupIdが指定されていない場合、グループ操作ログの記録は行わない。 */
    @SerialName(value = "groupId") val groupId: kotlin.String? = null
) {

    /**
    * 実行コマンド   - standby：電源待機状態へ移行   - powerOn：電源オン状態へ移行  ●チェック内容   - 指定文字列以外は、エラー
    * Values: standby,powerOn
    */
    @Serializable(with = Command.Serializer::class)
    enum class Command(val value: kotlin.String){
        standby("standby"),
        powerOn("powerOn");

        object Serializer : CommonEnumSerializer<Command>("Command", values(), values().map { it.value.toString() }.toTypedArray())
    }
    /**
    * deviceIdsの内容指定。   - true：deviceIdsは、非選択デバイス   - false：deviceIdsは、選択デバイス  ●チェック内容   - true/false以外は、エラー
    * Values: `true`,`false`
    */
    @Serializable(with = IsExclude.Serializer::class)
    enum class IsExclude(val value: kotlin.Boolean){
        `true`("true"),
        `false`("false");

        object Serializer : CommonEnumSerializer<IsExclude>("IsExclude", values(), values().map { it.value.toString() }.toTypedArray())
    }
}

