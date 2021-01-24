
# UpdateRelatedGroupReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**targetGroupId** | **kotlin.String** | 移動するグループのgroupId&lt;br&gt; ●チェック内容   - null、空文字はエラー |  [optional]
**deleteGroupIdList** | **kotlin.collections.List&lt;kotlin.String&gt;** | 移動前の上流グループのgroupIdのリスト&lt;br&gt; ●チェック内容   - null、空リストは、エラー |  [optional]
**addGroupIdList** | **kotlin.collections.List&lt;kotlin.String&gt;** | 移動後の上流グループのgroupIdのリスト&lt;br&gt; ●チェック内容   - null、空リストは、エラー |  [optional]



