# LogFunctionsApi

All URIs are relative to *https://&lt;&lt;serviceAddress&gt;&gt;:8086/idpManager*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logDeleteDeviceLogPost**](LogFunctionsApi.md#logDeleteDeviceLogPost) | **POST** /log/deleteDeviceLog | デバイスログの削除
[**logDeleteDeviceOperationLogPost**](LogFunctionsApi.md#logDeleteDeviceOperationLogPost) | **POST** /log/deleteDeviceOperationLog | デバイス操作ログの削除
[**logDeleteDomainOperationLogPost**](LogFunctionsApi.md#logDeleteDomainOperationLogPost) | **POST** /log/deleteDomainOperationLog | ドメイン操作ログの削除
[**logDeleteGroupOperationLogPost**](LogFunctionsApi.md#logDeleteGroupOperationLogPost) | **POST** /log/deleteGroupOperationLog | グループ操作ログの削除
[**logGetDeviceLogDetailPost**](LogFunctionsApi.md#logGetDeviceLogDetailPost) | **POST** /log/getDeviceLogDetail | デバイスログ詳細の取得
[**logGetDeviceLogPost**](LogFunctionsApi.md#logGetDeviceLogPost) | **POST** /log/getDeviceLog | デバイスログ一覧の取得
[**logGetDeviceOperationLogDetailPost**](LogFunctionsApi.md#logGetDeviceOperationLogDetailPost) | **POST** /log/getDeviceOperationLogDetail | デバイス操作ログ詳細の取得
[**logGetDeviceOperationLogPost**](LogFunctionsApi.md#logGetDeviceOperationLogPost) | **POST** /log/getDeviceOperationLog | デバイス操作ログ一覧の取得
[**logGetDomainOperationLogDetailPost**](LogFunctionsApi.md#logGetDomainOperationLogDetailPost) | **POST** /log/getDomainOperationLogDetail | ドメイン操作ログ詳細の取得
[**logGetDomainOperationLogPost**](LogFunctionsApi.md#logGetDomainOperationLogPost) | **POST** /log/getDomainOperationLog | ドメイン操作ログ一覧の取得
[**logGetGroupOperationLogDetailPost**](LogFunctionsApi.md#logGetGroupOperationLogDetailPost) | **POST** /log/getGroupOperationLogDetail | グループ操作ログ詳細の取得
[**logGetGroupOperationLogPost**](LogFunctionsApi.md#logGetGroupOperationLogPost) | **POST** /log/getGroupOperationLog | グループ操作ログ一覧の取得
[**logStartDeleteLogPost**](LogFunctionsApi.md#logStartDeleteLogPost) | **POST** /log/startDeleteLog | IDP関連の全ログ削除


<a name="logDeleteDeviceLogPost"></a>
# **logDeleteDeviceLogPost**
> DeleteDeviceLogRsp logDeleteDeviceLogPost(deleteDeviceLogReq)

デバイスログの削除

指定されたデバイスのデバイスログを削除する。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = LogFunctionsApi()
val deleteDeviceLogReq : DeleteDeviceLogReq =  // DeleteDeviceLogReq | 
try {
    val result : DeleteDeviceLogRsp = apiInstance.logDeleteDeviceLogPost(deleteDeviceLogReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LogFunctionsApi#logDeleteDeviceLogPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LogFunctionsApi#logDeleteDeviceLogPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteDeviceLogReq** | [**DeleteDeviceLogReq**](DeleteDeviceLogReq.md)|  |

### Return type

[**DeleteDeviceLogRsp**](DeleteDeviceLogRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logDeleteDeviceOperationLogPost"></a>
# **logDeleteDeviceOperationLogPost**
> DeleteDeviceOperationLogRsp logDeleteDeviceOperationLogPost(deleteDeviceOperationLogReq)

デバイス操作ログの削除

指定されたデバイスの操作ログを削除する。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = LogFunctionsApi()
val deleteDeviceOperationLogReq : DeleteDeviceOperationLogReq =  // DeleteDeviceOperationLogReq | 
try {
    val result : DeleteDeviceOperationLogRsp = apiInstance.logDeleteDeviceOperationLogPost(deleteDeviceOperationLogReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LogFunctionsApi#logDeleteDeviceOperationLogPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LogFunctionsApi#logDeleteDeviceOperationLogPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteDeviceOperationLogReq** | [**DeleteDeviceOperationLogReq**](DeleteDeviceOperationLogReq.md)|  |

### Return type

[**DeleteDeviceOperationLogRsp**](DeleteDeviceOperationLogRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logDeleteDomainOperationLogPost"></a>
# **logDeleteDomainOperationLogPost**
> DeleteDomainOperationLogRsp logDeleteDomainOperationLogPost(body)

ドメイン操作ログの削除

ログインアカウントが属するドメインの操作ログを削除する。&lt;br&gt; 配下のドメインの操作ログは削除しない。 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = LogFunctionsApi()
val body : kotlin.String = Object // kotlin.String | 
try {
    val result : DeleteDomainOperationLogRsp = apiInstance.logDeleteDomainOperationLogPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LogFunctionsApi#logDeleteDomainOperationLogPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LogFunctionsApi#logDeleteDomainOperationLogPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **kotlin.String**|  |

### Return type

[**DeleteDomainOperationLogRsp**](DeleteDomainOperationLogRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logDeleteGroupOperationLogPost"></a>
# **logDeleteGroupOperationLogPost**
> DeleteGroupOperationLogRsp logDeleteGroupOperationLogPost(deleteGroupOperationLogReq)

グループ操作ログの削除

指定されたグループの操作ログを削除する。&lt;br&gt; 配下のグループの操作ログは削除しない。 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = LogFunctionsApi()
val deleteGroupOperationLogReq : DeleteGroupOperationLogReq =  // DeleteGroupOperationLogReq | 
try {
    val result : DeleteGroupOperationLogRsp = apiInstance.logDeleteGroupOperationLogPost(deleteGroupOperationLogReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LogFunctionsApi#logDeleteGroupOperationLogPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LogFunctionsApi#logDeleteGroupOperationLogPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteGroupOperationLogReq** | [**DeleteGroupOperationLogReq**](DeleteGroupOperationLogReq.md)|  |

### Return type

[**DeleteGroupOperationLogRsp**](DeleteGroupOperationLogRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logGetDeviceLogDetailPost"></a>
# **logGetDeviceLogDetailPost**
> GetDeviceLogDetailRsp logGetDeviceLogDetailPost(getDeviceLogDetailReq)

デバイスログ詳細の取得

指定されたデバイスログの詳細を返す。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = LogFunctionsApi()
val getDeviceLogDetailReq : GetDeviceLogDetailReq =  // GetDeviceLogDetailReq | 
try {
    val result : GetDeviceLogDetailRsp = apiInstance.logGetDeviceLogDetailPost(getDeviceLogDetailReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LogFunctionsApi#logGetDeviceLogDetailPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LogFunctionsApi#logGetDeviceLogDetailPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getDeviceLogDetailReq** | [**GetDeviceLogDetailReq**](GetDeviceLogDetailReq.md)|  |

### Return type

[**GetDeviceLogDetailRsp**](GetDeviceLogDetailRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logGetDeviceLogPost"></a>
# **logGetDeviceLogPost**
> GetDeviceLogRsp logGetDeviceLogPost(getDeviceLogReq)

デバイスログ一覧の取得

指定されたデバイスのデバイスログ一覧を返す。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = LogFunctionsApi()
val getDeviceLogReq : GetDeviceLogReq =  // GetDeviceLogReq | 
try {
    val result : GetDeviceLogRsp = apiInstance.logGetDeviceLogPost(getDeviceLogReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LogFunctionsApi#logGetDeviceLogPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LogFunctionsApi#logGetDeviceLogPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getDeviceLogReq** | [**GetDeviceLogReq**](GetDeviceLogReq.md)|  |

### Return type

[**GetDeviceLogRsp**](GetDeviceLogRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logGetDeviceOperationLogDetailPost"></a>
# **logGetDeviceOperationLogDetailPost**
> GetDeviceOperationLogDetailRsp logGetDeviceOperationLogDetailPost(getDeviceOperationLogDetailReq)

デバイス操作ログ詳細の取得

指定されたデバイス操作ログの詳細を返す。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = LogFunctionsApi()
val getDeviceOperationLogDetailReq : GetDeviceOperationLogDetailReq =  // GetDeviceOperationLogDetailReq | 
try {
    val result : GetDeviceOperationLogDetailRsp = apiInstance.logGetDeviceOperationLogDetailPost(getDeviceOperationLogDetailReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LogFunctionsApi#logGetDeviceOperationLogDetailPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LogFunctionsApi#logGetDeviceOperationLogDetailPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getDeviceOperationLogDetailReq** | [**GetDeviceOperationLogDetailReq**](GetDeviceOperationLogDetailReq.md)|  |

### Return type

[**GetDeviceOperationLogDetailRsp**](GetDeviceOperationLogDetailRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logGetDeviceOperationLogPost"></a>
# **logGetDeviceOperationLogPost**
> GetDeviceOperationLogRsp logGetDeviceOperationLogPost(getDeviceOperationLogReq)

デバイス操作ログ一覧の取得

指定されたデバイスの操作ログ一覧を返す。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = LogFunctionsApi()
val getDeviceOperationLogReq : GetDeviceOperationLogReq =  // GetDeviceOperationLogReq | 
try {
    val result : GetDeviceOperationLogRsp = apiInstance.logGetDeviceOperationLogPost(getDeviceOperationLogReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LogFunctionsApi#logGetDeviceOperationLogPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LogFunctionsApi#logGetDeviceOperationLogPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getDeviceOperationLogReq** | [**GetDeviceOperationLogReq**](GetDeviceOperationLogReq.md)|  |

### Return type

[**GetDeviceOperationLogRsp**](GetDeviceOperationLogRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logGetDomainOperationLogDetailPost"></a>
# **logGetDomainOperationLogDetailPost**
> GetDomainOperationLogDetailRsp logGetDomainOperationLogDetailPost(getDomainOperationLogDetailReq)

ドメイン操作ログ詳細の取得

指定されたドメイン操作ログの詳細を返す。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = LogFunctionsApi()
val getDomainOperationLogDetailReq : GetDomainOperationLogDetailReq =  // GetDomainOperationLogDetailReq | 
try {
    val result : GetDomainOperationLogDetailRsp = apiInstance.logGetDomainOperationLogDetailPost(getDomainOperationLogDetailReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LogFunctionsApi#logGetDomainOperationLogDetailPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LogFunctionsApi#logGetDomainOperationLogDetailPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getDomainOperationLogDetailReq** | [**GetDomainOperationLogDetailReq**](GetDomainOperationLogDetailReq.md)|  |

### Return type

[**GetDomainOperationLogDetailRsp**](GetDomainOperationLogDetailRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logGetDomainOperationLogPost"></a>
# **logGetDomainOperationLogPost**
> GetDomainOperationLogRsp logGetDomainOperationLogPost(getDomainOperationLogReq)

ドメイン操作ログ一覧の取得

ログインアカウントが属するドメインの操作ログ一覧を返す。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = LogFunctionsApi()
val getDomainOperationLogReq : GetDomainOperationLogReq =  // GetDomainOperationLogReq | 
try {
    val result : GetDomainOperationLogRsp = apiInstance.logGetDomainOperationLogPost(getDomainOperationLogReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LogFunctionsApi#logGetDomainOperationLogPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LogFunctionsApi#logGetDomainOperationLogPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getDomainOperationLogReq** | [**GetDomainOperationLogReq**](GetDomainOperationLogReq.md)|  |

### Return type

[**GetDomainOperationLogRsp**](GetDomainOperationLogRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logGetGroupOperationLogDetailPost"></a>
# **logGetGroupOperationLogDetailPost**
> GetGroupOperationLogDetailRsp logGetGroupOperationLogDetailPost(getGroupOperationLogDetailReq)

グループ操作ログ詳細の取得

指定されたグループ操作ログの詳細を返す。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = LogFunctionsApi()
val getGroupOperationLogDetailReq : GetGroupOperationLogDetailReq =  // GetGroupOperationLogDetailReq | 
try {
    val result : GetGroupOperationLogDetailRsp = apiInstance.logGetGroupOperationLogDetailPost(getGroupOperationLogDetailReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LogFunctionsApi#logGetGroupOperationLogDetailPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LogFunctionsApi#logGetGroupOperationLogDetailPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getGroupOperationLogDetailReq** | [**GetGroupOperationLogDetailReq**](GetGroupOperationLogDetailReq.md)|  |

### Return type

[**GetGroupOperationLogDetailRsp**](GetGroupOperationLogDetailRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logGetGroupOperationLogPost"></a>
# **logGetGroupOperationLogPost**
> GetGroupOperationLogRsp logGetGroupOperationLogPost(getGroupOperationLogReq)

グループ操作ログ一覧の取得

指定されたグループの操作ログ一覧を返す。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = LogFunctionsApi()
val getGroupOperationLogReq : GetGroupOperationLogReq =  // GetGroupOperationLogReq | 
try {
    val result : GetGroupOperationLogRsp = apiInstance.logGetGroupOperationLogPost(getGroupOperationLogReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LogFunctionsApi#logGetGroupOperationLogPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LogFunctionsApi#logGetGroupOperationLogPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getGroupOperationLogReq** | [**GetGroupOperationLogReq**](GetGroupOperationLogReq.md)|  |

### Return type

[**GetGroupOperationLogRsp**](GetGroupOperationLogRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logStartDeleteLogPost"></a>
# **logStartDeleteLogPost**
> StartDeleteLogRsp logStartDeleteLogPost(startDeleteLogReq)

IDP関連の全ログ削除

IDP関連で記録する操作ログ、および履歴データの削除を行う。 指定された「ログを残す期間」よりも前のデータを削除する。&lt;br&gt; スケジュールサービスから呼び出すことて定期的に実行する。 （スケジュールサービスからの呼び出しを想定。）&lt;br&gt; カスタム設定ファイル\&quot;srdmConf/deleteLog_custom.properties\&quot;[TBD]が存在し、\&quot;period.idp\&quot;が指定されている場合は、 この値を使用する。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = LogFunctionsApi()
val startDeleteLogReq : StartDeleteLogReq =  // StartDeleteLogReq | 
try {
    val result : StartDeleteLogRsp = apiInstance.logStartDeleteLogPost(startDeleteLogReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LogFunctionsApi#logStartDeleteLogPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LogFunctionsApi#logStartDeleteLogPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDeleteLogReq** | [**StartDeleteLogReq**](StartDeleteLogReq.md)|  |

### Return type

[**StartDeleteLogRsp**](StartDeleteLogRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

