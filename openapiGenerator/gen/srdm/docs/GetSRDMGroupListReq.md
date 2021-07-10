
# GetSRDMGroupListReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupId** | **kotlin.String** | 対象グループのgroupId&lt;br&gt; ●チェック内容   - null、空文字はエラー | 
**startIndex** | **kotlin.Int** | 子グループの開始インデックス&lt;br&gt; expand&#x3D;childrenOnlyの場合のみ有効。&lt;br&gt; expand&#x3D;\&quot;no\&quot;の場合は、無効（全件取得）。&lt;br&gt; ●チェック内容   - 数値以外はエラー |  [optional]
**count** | **kotlin.Int** | 子グループの要求件数&lt;br&gt; expand&#x3D;childrenOnlyの場合のみ有効。&lt;br&gt; expand&#x3D;\&quot;no\&quot;の場合は、無効（全件取得）。&lt;br&gt; ●チェック内容   - 数値以外はエラー |  [optional]
**expand** | [**inline**](#ExpandEnum) | 下位グループの展開要求を指定。&lt;br&gt;   - no:要求したグループのみ   - childrenOnly:要求グループの子グループのみ  ●チェック内容   - 指定値以外は、エラー |  [optional]


<a name="ExpandEnum"></a>
## Enum: expand
Name | Value
---- | -----
expand | false, childrenOnly



