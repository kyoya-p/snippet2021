
# RemoveGroupReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupIdList** | **kotlin.collections.List&lt;kotlin.String&gt;** | 対象のgroupIdのリスト&lt;br&gt; ●チェック内容   - null、空のリストは、エラー | 
**operation** | [**inline**](#OperationEnum) | 操作&lt;br&gt; IDP関連のグループに関する情報を変更する。   - moveTrash：ゴミ箱へ移動（指定グループを削除状態にする）   - restore：ゴミ箱から戻す（指定グループを通常状態にする）   - delete：ゴミ箱から削除（指定グループに関する情報を削除する）  ●チェック内容   - 指定文字列以外は、エラー | 


<a name="OperationEnum"></a>
## Enum: operation
Name | Value
---- | -----
operation | moveTrash, restore, delete



