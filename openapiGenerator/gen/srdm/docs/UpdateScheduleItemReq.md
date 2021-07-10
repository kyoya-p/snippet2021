
# UpdateScheduleItemReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupId** | **kotlin.String** | 対象グループのgroupId&lt;br&gt; ●チェック内容   - null、空文字はエラー | 
**scheduleId** | **kotlin.String** | 対象スケジュールのscheduleId&lt;br&gt; ●チェック内容   - null、空文字はエラー | 
**execAtStartupFlag** | [**inline**](#ExecAtStartupFlagEnum) | 起動時実行の有効／無効を指定。   - true：起動時実行有効   - false：起動時実行無効  ●チェック内容   - true/false以外は、エラー | 
**schedule** | [**kotlin.collections.List&lt;UpdateScheduleReqSchedule&gt;**](UpdateScheduleReqSchedule.md) | 実行スケジュール&lt;br&gt; ●チェック内容   - nullは、エラー   - 空のリストは、許可 | 


<a name="ExecAtStartupFlagEnum"></a>
## Enum: execAtStartupFlag
Name | Value
---- | -----
execAtStartupFlag | true, false



