
# GetScheduleListRspScheduleList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleId** | **kotlin.String** | スケジュールID |  [optional]
**jobType** | [**inline**](#JobTypeEnum) | ジョブタイプ   - update：デバイス情報更新 |  [optional]
**scheduleName** | **kotlin.String** | スケジュール名 |  [optional]
**execOnScheduleFlag** | [**inline**](#ExecOnScheduleFlagEnum) | スケジュール実行の有効／無効   - true：スケジュール実行有効   - false：スケジュール実行無効 |  [optional]


<a name="JobTypeEnum"></a>
## Enum: jobType
Name | Value
---- | -----
jobType | update


<a name="ExecOnScheduleFlagEnum"></a>
## Enum: execOnScheduleFlag
Name | Value
---- | -----
execOnScheduleFlag | true, false



