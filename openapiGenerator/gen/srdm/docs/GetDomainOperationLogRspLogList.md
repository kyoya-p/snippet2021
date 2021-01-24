
# GetDomainOperationLogRspLogList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**logId** | **kotlin.String** | ドメイン操作ログID |  [optional]
**kind** | **kotlin.String** | 種類&lt;br&gt;information／error |  [optional]
**timestamp** | **kotlin.Long** | 操作日時 |  [optional]
**accountId** | **kotlin.String** | 操作実施者のアカウントID |  [optional]
**accountName** | **kotlin.String** | 操作実施者のアカウント名 |  [optional]
**accountStatus** | **kotlin.String** | 操作実施者のアカウントの状態&lt;br&gt;active／locked／deleted／manualLocked |  [optional]
**operation** | **kotlin.String** | 操作内容&lt;br&gt;操作内容は、「SRDM_IDP_Data_Model_Definition.xlsx」を参照。 |  [optional]
**code** | **kotlin.String** | 操作結果コード&lt;br&gt;0000：正常／0000以外：異常&lt;br&gt;異常の場合の結果コードは、「SRDM_IDP_Data_Model_Definition.xlsx」を参照。 |  [optional]



