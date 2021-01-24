
# UpdateScheduleReqSchedule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startTimestamp** | **kotlin.Long** | 開始日時&lt;br&gt; Timestampで指定する。タイムゾーンはUTC+00:00&lt;br&gt; ●チェック内容   - 数値以外は、エラー。   - null、指定なしは、エラー。 | 
**endTimestamp** | **kotlin.Long** | 終了日時&lt;br&gt; Timestampで指定する。タイムゾーンはUTC+00:00&lt;br&gt; 0 の場合、終了日時の指定なし。&lt;br&gt; ●チェック内容   - 数値以外は、エラー。   - null、指定なしは、0として扱う。 |  [optional]
**interval** | **kotlin.Int** | インターバル。単位は、秒。&lt;br&gt; 0 の場合、 繰り返し実行なし。&lt;br&gt; ●チェック内容   - 数値以外は、エラー。   - null、指定なしは、0として扱う。 |  [optional]



