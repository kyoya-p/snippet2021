
# UpdateScheduleSetReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleSetId** | **kotlin.String** | 対象スケジュールのscheduleSetId&lt;br&gt; ●チェック内容   - null、空文字はエラー | 
**scheduleSetName** | **kotlin.String** | スケジュールセット名&lt;br&gt; ●チェック内容   - null、空文字は、エラー   - マルチバイト文字含め、印刷可能な文字は指定可能 | 
**jobList** | [**kotlin.collections.List&lt;CreateScheduleSetReqJobList&gt;**](CreateScheduleSetReqJobList.md) | 登録するスケジュールのリスト&lt;br&gt; ●チェック内容   - null、空のリストは、エラー | 



