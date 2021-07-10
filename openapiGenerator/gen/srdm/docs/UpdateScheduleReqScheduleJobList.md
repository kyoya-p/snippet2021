
# UpdateScheduleReqScheduleJobList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobType** | [**inline**](#JobTypeEnum) | ジョブタイプ&lt;br&gt; 実行するジョブを指定。   - powerOn：電源オン状態へ遷移   - standby：電源待機状態へ遷移  ●チェック内容   - 指定文字列以外は、エラー |  [optional]
**schedule** | [**kotlin.collections.List&lt;UpdateScheduleReqSchedule&gt;**](UpdateScheduleReqSchedule.md) | 実行スケジュール&lt;br&gt; ●チェック内容   - nullは、エラー   - 空のリストは、エラー。 |  [optional]


<a name="JobTypeEnum"></a>
## Enum: jobType
Name | Value
---- | -----
jobType | powerOn, standby



