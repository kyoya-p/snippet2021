
# UpdateScheduleReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deviceId** | **kotlin.String** | 対象のdeviceId&lt;br&gt; ●チェック内容   - null、空文字はエラー | 
**scheduleJobList** | [**kotlin.collections.List&lt;UpdateScheduleReqScheduleJobList&gt;**](UpdateScheduleReqScheduleJobList.md) | 登録するスケジュールのリスト&lt;br&gt; 空のリストを指定することで登録済みのスケジュールを削除できる。&lt;br&gt; ●チェック内容   - nullは、エラー   - 空のリストは、許可。 | 
**groupId** | **kotlin.String** | 操作実施グループのgroupId&lt;br&gt; groupIdを指定した場合、指定されたgroupIdのグループ操作ログに記録する。&lt;br&gt; null、空文字の場合、groupIdが指定されていないものとし、グループ操作ログの記録は行わない。&lt;br&gt; |  [optional]



