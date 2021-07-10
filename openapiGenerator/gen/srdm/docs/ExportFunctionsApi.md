# ExportFunctionsApi

All URIs are relative to *https://&lt;&lt;serviceAddress&gt;&gt;:8086/idpManager*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exportDownloadExportDataGet**](ExportFunctionsApi.md#exportDownloadExportDataGet) | **GET** /export/downloadExportData | エクスポートデータの取得
[**exportExportDeviceDataHistoryPost**](ExportFunctionsApi.md#exportExportDeviceDataHistoryPost) | **POST** /export/exportDeviceDataHistory | デバイス情報履歴のエクスポート


<a name="exportDownloadExportDataGet"></a>
# **exportDownloadExportDataGet**
> kotlin.String exportDownloadExportDataGet(requestId)

エクスポートデータの取得

/export/exportDeviceDataHistory を呼び出して取得したリクエストIDをパラメータに指定し、エクスポートデータを取得する。&lt;br&gt;

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = ExportFunctionsApi()
val requestId : kotlin.String = requestId_example // kotlin.String | リクエストID
try {
    val result : kotlin.String = apiInstance.exportDownloadExportDataGet(requestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportFunctionsApi#exportDownloadExportDataGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportFunctionsApi#exportDownloadExportDataGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **kotlin.String**| リクエストID |

### Return type

**kotlin.String**

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="exportExportDeviceDataHistoryPost"></a>
# **exportExportDeviceDataHistoryPost**
> ExportDeviceDataHistoryRsp exportExportDeviceDataHistoryPost(exportDeviceDataHistoryReq)

デバイス情報履歴のエクスポート

指定デバイスのデバイス情報履歴のエクスポートをリクエストする。&lt;br&gt; エクスポートデータは、/export/downloadExportData を使用して取得する。&lt;br&gt; ファイルフォーマットは「SRDM_IDP_FileFormat.xlsx」を参照。[TBD]

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = ExportFunctionsApi()
val exportDeviceDataHistoryReq : ExportDeviceDataHistoryReq =  // ExportDeviceDataHistoryReq | 
try {
    val result : ExportDeviceDataHistoryRsp = apiInstance.exportExportDeviceDataHistoryPost(exportDeviceDataHistoryReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExportFunctionsApi#exportExportDeviceDataHistoryPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportFunctionsApi#exportExportDeviceDataHistoryPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exportDeviceDataHistoryReq** | [**ExportDeviceDataHistoryReq**](ExportDeviceDataHistoryReq.md)|  |

### Return type

[**ExportDeviceDataHistoryRsp**](ExportDeviceDataHistoryRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

