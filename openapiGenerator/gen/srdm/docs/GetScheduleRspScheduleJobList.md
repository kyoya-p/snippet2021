
# GetScheduleRspScheduleJobList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobType** | [**inline**](#JobTypeEnum) | ジョブタイプ   - powerOn：電源オン状態へ遷移   - standby：電源待機状態へ遷移 |  [optional]
**schedule** | [**kotlin.collections.List&lt;GetScheduleRspSchedule&gt;**](GetScheduleRspSchedule.md) | 実行スケジュール&lt;br&gt; |  [optional]


<a name="JobTypeEnum"></a>
## Enum: jobType
Name | Value
---- | -----
jobType | powerOn, standby



