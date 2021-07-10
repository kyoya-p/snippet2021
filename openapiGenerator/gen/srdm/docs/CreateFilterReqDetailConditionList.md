
# CreateFilterReqDetailConditionList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**column** | **kotlin.String** | カラム名（キー）&lt;br&gt; 指定可能文字は、SRDM_IDP_DeviceList_Filter.xlsx 参照。&lt;br&gt; ●チェック内容   - 指定可能文字以外は、エラー | 
**operationId** | **kotlin.String** | 条件区分（演算子）&lt;br&gt; 指定可能文字は、SRDM_IDP_DeviceList_Filter.xlsx 参照。&lt;br&gt; ●チェック内容   - 指定可能文字以外は、エラー | 
**valueString** | **kotlin.String** | 入力値   - 条件区分が\&quot;isNull\&quot;, \&quot;isNotNull\&quot;の場合はnullを指定。   - 条件区分が\&quot;between\&quot;の場合は、2つの入力値を\&quot;/\&quot;で結合。  ●チェック内容   - nullは、エラー  | 



