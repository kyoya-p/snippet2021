
# GetDeviceLogReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupId** | **kotlin.String** | 対象グループのgroupId&lt;br&gt; ●チェック内容   - null、空文字はエラー | 
**startIndex** | **kotlin.Int** | 開始インデックス&lt;br&gt; ●チェック内容   - 数値以外はエラー |  [optional]
**count** | **kotlin.Int** | 要求件数&lt;br&gt; ●チェック内容   - 数値以外はエラー |  [optional]
**deviceId** | **kotlin.String** | 対象デバイスのdeviceId&lt;br&gt; 特定デバイスのデバイスログを取得する場合に対象となるデバイスのdeviceIdを指定&lt;br&gt; デバイスを特定しない場合は、空文字を設定&lt;br&gt; ●チェック内容   - nullエラー |  [optional]
**simpleFilters** | [**kotlin.collections.List&lt;GetDeviceLogReqSimpleFilters&gt;**](GetDeviceLogReqSimpleFilters.md) | シンプルフィルター |  [optional]
**orderBy** | [**kotlin.collections.List&lt;GetDeviceLogReqOrderBy&gt;**](GetDeviceLogReqOrderBy.md) | ソート指定 |  [optional]



