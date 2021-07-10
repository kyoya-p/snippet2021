
# GetSRDMGroupListRsp

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**common** | [**CommonRsp**](CommonRsp.md) |  |  [optional]
**startIndex** | **kotlin.Int** | 開始インデックス（リクエストパラメータと同じ） |  [optional]
**count** | **kotlin.Int** | 要求件数（リクエストパラメータと同じ） |  [optional]
**resultCount** | **kotlin.Int** | 今回取得件数 |  [optional]
**totalCount** | **kotlin.Int** | 検索結果総数 |  [optional]
**requestedGroupId** | **kotlin.String** | 指定グループID（リクエストパラメータの\&quot;groupId\&quot;と同じ値） |  [optional]
**expand** | [**inline**](#ExpandEnum) | 下位グループの展開要求&lt;br&gt;   - no:要求したグループのみ   - childrenOnly:要求グループの子グループのみ |  [optional]
**groupList** | [**kotlin.collections.List&lt;GetSRDMGroupListRspGroupList&gt;**](GetSRDMGroupListRspGroupList.md) | グループツリーのリスト |  [optional]


<a name="ExpandEnum"></a>
## Enum: expand
Name | Value
---- | -----
expand | false, childrenOnly



