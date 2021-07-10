
# GetDeviceListReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupId** | **kotlin.String** | 対象グループのgroupId&lt;br&gt; ●チェック内容   - null、空文字はエラー | 
**attribute** | [**inline**](#AttributeEnum) | 取得対象の属性   - managed：管理デバイス   - trash：削除済み（ゴミ箱内）のデバイス  ●チェック内容   - 指定値以外は、エラー | 
**startIndex** | **kotlin.Int** | 開始インデックス&lt;br&gt; ●チェック内容   - 数値以外はエラー |  [optional]
**count** | **kotlin.Int** | 要求件数&lt;br&gt; ●チェック内容   - 数値以外はエラー |  [optional]
**filterId** | **kotlin.String** | ユーザフィルターのfilterId |  [optional]
**simpleFilters** | [**kotlin.collections.List&lt;GetDeviceListReqSimpleFilters&gt;**](GetDeviceListReqSimpleFilters.md) | シンプルフィルター |  [optional]
**orderBy** | [**kotlin.collections.List&lt;GetDeviceListReqOrderBy&gt;**](GetDeviceListReqOrderBy.md) | ソート指定 |  [optional]


<a name="AttributeEnum"></a>
## Enum: attribute
Name | Value
---- | -----
attribute | managed, trash



