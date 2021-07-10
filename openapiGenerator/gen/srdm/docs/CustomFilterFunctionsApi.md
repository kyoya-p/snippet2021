# CustomFilterFunctionsApi

All URIs are relative to *https://&lt;&lt;serviceAddress&gt;&gt;:8086/idpManager*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filterCreateFilterPost**](CustomFilterFunctionsApi.md#filterCreateFilterPost) | **POST** /filter/createFilter | ユーザ定義フィルターの作成
[**filterDeleteFilterPost**](CustomFilterFunctionsApi.md#filterDeleteFilterPost) | **POST** /filter/deleteFilter | ユーザ定義フィルターの削除
[**filterGetFilterPost**](CustomFilterFunctionsApi.md#filterGetFilterPost) | **POST** /filter/getFilter | ユーザ定義フィルター一覧の取得
[**filterSetFilterPost**](CustomFilterFunctionsApi.md#filterSetFilterPost) | **POST** /filter/setFilter | ユーザ定義フィルターの更新


<a name="filterCreateFilterPost"></a>
# **filterCreateFilterPost**
> CreateFilterRsp filterCreateFilterPost(createFilterReq)

ユーザ定義フィルターの作成

ユーザ定義フィルターを作成する。&lt;br&gt; 一度に作成できるフィルターは、１件。&lt;br&gt; 作成したフィルターは、ログインアカウントが属するドメインに作成される。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = CustomFilterFunctionsApi()
val createFilterReq : CreateFilterReq =  // CreateFilterReq | 
try {
    val result : CreateFilterRsp = apiInstance.filterCreateFilterPost(createFilterReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomFilterFunctionsApi#filterCreateFilterPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomFilterFunctionsApi#filterCreateFilterPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createFilterReq** | [**CreateFilterReq**](CreateFilterReq.md)|  |

### Return type

[**CreateFilterRsp**](CreateFilterRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filterDeleteFilterPost"></a>
# **filterDeleteFilterPost**
> DeleteFilterRsp filterDeleteFilterPost(deleteFilterReq)

ユーザ定義フィルターの削除

指定されたユーザ定義フィルターを削除する。&lt;br&gt; 削除可能なフィルターは、ログインアカウントが属するドメインに存在するフィルターのみ。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = CustomFilterFunctionsApi()
val deleteFilterReq : DeleteFilterReq =  // DeleteFilterReq | 
try {
    val result : DeleteFilterRsp = apiInstance.filterDeleteFilterPost(deleteFilterReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomFilterFunctionsApi#filterDeleteFilterPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomFilterFunctionsApi#filterDeleteFilterPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteFilterReq** | [**DeleteFilterReq**](DeleteFilterReq.md)|  |

### Return type

[**DeleteFilterRsp**](DeleteFilterRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filterGetFilterPost"></a>
# **filterGetFilterPost**
> GetFilterRsp filterGetFilterPost(body)

ユーザ定義フィルター一覧の取得

ログインアカウントが属するドメインに紐づくフィルターの一覧を返す。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = CustomFilterFunctionsApi()
val body : kotlin.String = Object // kotlin.String | 
try {
    val result : GetFilterRsp = apiInstance.filterGetFilterPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomFilterFunctionsApi#filterGetFilterPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomFilterFunctionsApi#filterGetFilterPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **kotlin.String**|  |

### Return type

[**GetFilterRsp**](GetFilterRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filterSetFilterPost"></a>
# **filterSetFilterPost**
> SetFilterRsp filterSetFilterPost(setFilterReq)

ユーザ定義フィルターの更新

ユーザ定義フィルターを更新する。&lt;br&gt; 更新可能なフィルターは、ログインアカウントが属するドメインに存在するフィルターのみ。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = CustomFilterFunctionsApi()
val setFilterReq : SetFilterReq =  // SetFilterReq | 
try {
    val result : SetFilterRsp = apiInstance.filterSetFilterPost(setFilterReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomFilterFunctionsApi#filterSetFilterPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomFilterFunctionsApi#filterSetFilterPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **setFilterReq** | [**SetFilterReq**](SetFilterReq.md)|  |

### Return type

[**SetFilterRsp**](SetFilterRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

