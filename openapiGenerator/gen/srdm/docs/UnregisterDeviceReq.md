
# UnregisterDeviceReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupId** | **kotlin.String** | 対象のgroupId&lt;br&gt; ●チェック内容   - null、空文字はエラー | 
**operation** | [**inline**](#OperationEnum) | 操作   - moveTrash：ゴミ箱へ移動   - restore：ゴミ箱から戻す   - delete：ゴミ箱から削除  ●チェック内容   - 指定文字列以外は、エラー | 
**deviceIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | 対象deviceIdのリスト&lt;br&gt; ●チェック内容   - nullは、エラー   - 空のリストは、許可 | 
**isExclude** | [**inline**](#IsExcludeEnum) | deviceIdsの内容指定。   - true：deviceIdsは、非選択デバイス   - false：deviceIdsは、選択デバイス  ●チェック内容   - true/false以外は、エラー | 


<a name="OperationEnum"></a>
## Enum: operation
Name | Value
---- | -----
operation | moveTrash, restore, delete


<a name="IsExcludeEnum"></a>
## Enum: isExclude
Name | Value
---- | -----
isExclude | true, false



