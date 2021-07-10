
# ApplyScheduleSetReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleSetId** | **kotlin.String** | 反映するスケジュールセットID&lt;br&gt; ●チェック内容   - null、空文字はエラー | 
**groupId** | **kotlin.String** | 対象のgroupId&lt;br&gt; ●チェック内容   - null、空文字はエラー | 
**deviceIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | 対象deviceIdのリスト&lt;br&gt; ●チェック内容   - nullは、エラー   - 空のリストは、許可 | 
**isExclude** | [**inline**](#IsExcludeEnum) | deviceIdsの内容指定。   - true：deviceIdsは、非選択デバイス   - false：deviceIdsは、選択デバイス  ●チェック内容   - true/false以外は、エラー | 


<a name="IsExcludeEnum"></a>
## Enum: isExclude
Name | Value
---- | -----
isExclude | true, false



