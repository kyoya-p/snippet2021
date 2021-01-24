
# GetDeviceOperationLogRsp

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**common** | [**CommonRsp**](CommonRsp.md) |  |  [optional]
**startIndex** | **kotlin.Int** | 開始インデックス（リクエストパラメータと同じ） |  [optional]
**count** | **kotlin.Int** | 要求件数（リクエストパラメータと同じ） |  [optional]
**resultCount** | **kotlin.Int** | 今回取得件数 |  [optional]
**totalCount** | **kotlin.Int** | 検索結果総数 |  [optional]
**logList** | [**kotlin.collections.List&lt;GetDeviceOperationLogRspLogList&gt;**](GetDeviceOperationLogRspLogList.md) | ログリスト&lt;br&gt; ログが存在しない場合は、空のリストを返す。 |  [optional]



