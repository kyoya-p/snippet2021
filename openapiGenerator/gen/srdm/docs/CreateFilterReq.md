
# CreateFilterReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filterName** | **kotlin.String** | フィルター名&lt;br&gt; ●チェック内容   - null、空文字はエラー   - スペースのみは、エラー   - 64文字を超える場合は、エラー（64 &lt; length）   - 『\\/:*?\&quot;&lt;&gt;|』の文字が含まれる場合は、エラー | 
**blockOperation** | [**inline**](#BlockOperationEnum) | ブロック条件&lt;br&gt; 指定可能な文字は、and, or&lt;br&gt; ●チェック内容   - 指定文字列以外は、エラー | 
**blockConditionList** | [**kotlin.collections.List&lt;CreateFilterReqBlockConditionList&gt;**](CreateFilterReqBlockConditionList.md) |  | 


<a name="BlockOperationEnum"></a>
## Enum: blockOperation
Name | Value
---- | -----
blockOperation | and, or



