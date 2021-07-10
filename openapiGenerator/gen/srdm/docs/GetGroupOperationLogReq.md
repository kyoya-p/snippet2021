
# GetGroupOperationLogReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupId** | **kotlin.String** | 対象グループのgroupId&lt;br&gt; ●チェック内容   - null、空文字はエラー | 
**startIndex** | **kotlin.Int** | 開始インデックス&lt;br&gt; ●チェック内容   - 数値以外はエラー |  [optional]
**count** | **kotlin.Int** | 要求件数&lt;br&gt; ●チェック内容   - 数値以外はエラー |  [optional]
**orderBy** | [**kotlin.collections.List&lt;GetDeviceOperationLogReqOrderBy&gt;**](GetDeviceOperationLogReqOrderBy.md) | ソート指定 |  [optional]



