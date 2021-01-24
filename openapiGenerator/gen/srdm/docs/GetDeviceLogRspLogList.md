
# GetDeviceLogRspLogList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**logId** | **kotlin.String** | デバイスログID |  [optional]
**kind** | **kotlin.String** | 種類&lt;br&gt;information／error |  [optional]
**timestamp** | **kotlin.Long** | 日時 |  [optional]
**modelName** | **kotlin.String** | モデル名&lt;br&gt;登録後、情報取得未実行時は、空文字 |  [optional]
**serialNumber** | **kotlin.String** | シリアル番号&lt;br&gt;登録後、情報取得未実行時は、空文字 |  [optional]
**ipAddress** | **kotlin.String** | IPアドレス |  [optional]
**friendlyName** | **kotlin.String** | 名称 |  [optional]
**command** | **kotlin.String** | コマンド内容&lt;br&gt;コマンド内容は、「SRDM_IDP_Data_Model_Definition.xlsx」を参照。 |  [optional]
**code** | **kotlin.String** | 実行結果コード&lt;br&gt;0000：正常／0000以外：異常&lt;br&gt;異常の場合の結果コードは、「SRDM_IDP_Data_Model_Definition.xlsx」を参照。 |  [optional]



