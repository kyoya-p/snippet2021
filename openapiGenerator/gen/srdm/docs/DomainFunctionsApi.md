# DomainFunctionsApi

All URIs are relative to *https://&lt;&lt;serviceAddress&gt;&gt;:8086/idpManager*

Method | HTTP request | Description
------------- | ------------- | -------------
[**domainGetThemeSettingPost**](DomainFunctionsApi.md#domainGetThemeSettingPost) | **POST** /domain/getThemeSetting | UIテーマ設定の取得
[**domainSetThemeSettingPost**](DomainFunctionsApi.md#domainSetThemeSettingPost) | **POST** /domain/setThemeSetting | UIテーマの設定


<a name="domainGetThemeSettingPost"></a>
# **domainGetThemeSettingPost**
> GetThemeSettingRsp domainGetThemeSettingPost(body)

UIテーマ設定の取得

ログインアカウントが属するドメインに設定されているUIテーマを取得する。&lt;br&gt;

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = DomainFunctionsApi()
val body : kotlin.String = Object // kotlin.String | 
try {
    val result : GetThemeSettingRsp = apiInstance.domainGetThemeSettingPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainFunctionsApi#domainGetThemeSettingPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainFunctionsApi#domainGetThemeSettingPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **kotlin.String**|  |

### Return type

[**GetThemeSettingRsp**](GetThemeSettingRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="domainSetThemeSettingPost"></a>
# **domainSetThemeSettingPost**
> SetThemeSettingRsp domainSetThemeSettingPost(setThemeSettingReq)

UIテーマの設定

ログインアカウントが属するドメインのUIテーマを設定する。&lt;br&gt;

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = DomainFunctionsApi()
val setThemeSettingReq : SetThemeSettingReq =  // SetThemeSettingReq | 
try {
    val result : SetThemeSettingRsp = apiInstance.domainSetThemeSettingPost(setThemeSettingReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DomainFunctionsApi#domainSetThemeSettingPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DomainFunctionsApi#domainSetThemeSettingPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **setThemeSettingReq** | [**SetThemeSettingReq**](SetThemeSettingReq.md)|  |

### Return type

[**SetThemeSettingRsp**](SetThemeSettingRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: aplication/json

