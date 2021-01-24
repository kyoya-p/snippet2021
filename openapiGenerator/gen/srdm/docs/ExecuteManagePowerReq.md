
# ExecuteManagePowerReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**command** | [**inline**](#CommandEnum) | 実行コマンド   - standby：電源待機状態へ移行   - powerOn：電源オン状態へ移行  ●チェック内容   - 指定文字列以外は、エラー | 
**deviceIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | 対象deviceIdのリスト&lt;br&gt; ●チェック内容   - nullは、エラー   - 空のリストは、許可 | 
**isExclude** | [**inline**](#IsExcludeEnum) | deviceIdsの内容指定。   - true：deviceIdsは、非選択デバイス   - false：deviceIdsは、選択デバイス  ●チェック内容   - true/false以外は、エラー | 
**groupId** | **kotlin.String** | 対象のgroupId&lt;br&gt; null、空文字の場合、groupIdが指定されていないものとする。&lt;br&gt; groupIdが指定されている場合、指定されたgroupIdのグループで登録されたデバイスを対象とする。&lt;br&gt; 下位のグループが存在する場合、下位のグループに登録されたデバイスに対しても実行する。&lt;br&gt; （結果、操作を実行したグループで参照しているデバイス全てが更新される）&lt;br&gt; groupIdが指定されている場合、指定されたgroupIdのグループ操作ログを記録する。&lt;br&gt; groupIdが指定されていない場合、グループ操作ログの記録は行わない。 |  [optional]


<a name="CommandEnum"></a>
## Enum: command
Name | Value
---- | -----
command | standby, powerOn


<a name="IsExcludeEnum"></a>
## Enum: isExclude
Name | Value
---- | -----
isExclude | true, false



