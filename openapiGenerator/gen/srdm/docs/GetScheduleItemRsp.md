
# GetScheduleItemRsp

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**common** | [**CommonRsp**](CommonRsp.md) |  |  [optional]
**execAtStartupFlag** | [**inline**](#ExecAtStartupFlagEnum) | 起動時実行の有効／無効   - true：起動時実行有効   - false：起動時実行無効 |  [optional]
**schedule** | [**kotlin.collections.List&lt;GetScheduleRspSchedule&gt;**](GetScheduleRspSchedule.md) | 実行スケジュール&lt;br&gt; |  [optional]


<a name="ExecAtStartupFlagEnum"></a>
## Enum: execAtStartupFlag
Name | Value
---- | -----
execAtStartupFlag | true, false



