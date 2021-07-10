
# ExecuteUpdateInformationReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isExclude** | [**inline**](#IsExcludeEnum) | deviceIdsの内容指定。   - true：deviceIdsは、非選択デバイス   - false：deviceIdsは、選択デバイス  ●チェック内容   - true/false以外は、エラー | 
**groupId** | **kotlin.String** | 対象のgroupId&lt;br&gt; null、空文字の場合、groupIdが指定されていないものとする。&lt;br&gt; groupIdが指定されている場合、指定されたgroupIdのグループで登録されたデバイスを対象とする。&lt;br&gt; 下位のグループが存在する場合、下位のグループに登録されたデバイスに対しても実行する。&lt;br&gt; （結果、操作を実行したグループで参照しているデバイス全てが更新される）&lt;br&gt; groupIdが指定されている場合、指定されたgroupIdのグループ操作ログを記録する。&lt;br&gt; groupIdが指定されていない場合、グループ操作ログの記録は行わない。 |  [optional]
**deviceIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | 対象deviceIdのリスト&lt;br&gt; ●チェック内容   - null、空のリストは、許可 |  [optional]


<a name="IsExcludeEnum"></a>
## Enum: isExclude
Name | Value
---- | -----
isExclude | true, false



