# ScheduleFunctionsApi

All URIs are relative to *https://&lt;&lt;serviceAddress&gt;&gt;:8086/idpManager*

Method | HTTP request | Description
------------- | ------------- | -------------
[**scheduleCreateScheduleSetPost**](ScheduleFunctionsApi.md#scheduleCreateScheduleSetPost) | **POST** /schedule/createScheduleSet | スケジュールセットの作成
[**scheduleDeleteScheduleSetPost**](ScheduleFunctionsApi.md#scheduleDeleteScheduleSetPost) | **POST** /schedule/deleteScheduleSet | スケジュールセットの削除
[**scheduleGetScheduleItemPost**](ScheduleFunctionsApi.md#scheduleGetScheduleItemPost) | **POST** /schedule/getScheduleItem | スケジュール項目の取得
[**scheduleGetScheduleListPost**](ScheduleFunctionsApi.md#scheduleGetScheduleListPost) | **POST** /schedule/getScheduleList | スケジュール一覧を取得する
[**scheduleGetScheduleSetListPost**](ScheduleFunctionsApi.md#scheduleGetScheduleSetListPost) | **POST** /schedule/getScheduleSetList | スケジュールセット一覧の取得
[**scheduleGetScheduleSetPost**](ScheduleFunctionsApi.md#scheduleGetScheduleSetPost) | **POST** /schedule/getScheduleSet | スケジュールセットの取得
[**scheduleSetSchedulePost**](ScheduleFunctionsApi.md#scheduleSetSchedulePost) | **POST** /schedule/setSchedule | スケジュールの有効／無効設定
[**scheduleUpdateScheduleItemPost**](ScheduleFunctionsApi.md#scheduleUpdateScheduleItemPost) | **POST** /schedule/updateScheduleItem | スケジュール項目の更新
[**scheduleUpdateScheduleSetPost**](ScheduleFunctionsApi.md#scheduleUpdateScheduleSetPost) | **POST** /schedule/updateScheduleSet | スケジュールセットの更新


<a name="scheduleCreateScheduleSetPost"></a>
# **scheduleCreateScheduleSetPost**
> CreateScheduleSetRsp scheduleCreateScheduleSetPost(createScheduleSetReq)

スケジュールセットの作成

ログインアカウントのドメインに紐づくスケジュールセットを作成する。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = ScheduleFunctionsApi()
val createScheduleSetReq : CreateScheduleSetReq =  // CreateScheduleSetReq | 
try {
    val result : CreateScheduleSetRsp = apiInstance.scheduleCreateScheduleSetPost(createScheduleSetReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScheduleFunctionsApi#scheduleCreateScheduleSetPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScheduleFunctionsApi#scheduleCreateScheduleSetPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createScheduleSetReq** | [**CreateScheduleSetReq**](CreateScheduleSetReq.md)|  |

### Return type

[**CreateScheduleSetRsp**](CreateScheduleSetRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="scheduleDeleteScheduleSetPost"></a>
# **scheduleDeleteScheduleSetPost**
> DeleteScheduleSetRsp scheduleDeleteScheduleSetPost(deleteScheduleSetReq)

スケジュールセットの削除

ログインアカウントのドメインに紐づくスケジュールセットから指定されたスケジュールセットを削除する。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = ScheduleFunctionsApi()
val deleteScheduleSetReq : DeleteScheduleSetReq =  // DeleteScheduleSetReq | 
try {
    val result : DeleteScheduleSetRsp = apiInstance.scheduleDeleteScheduleSetPost(deleteScheduleSetReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScheduleFunctionsApi#scheduleDeleteScheduleSetPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScheduleFunctionsApi#scheduleDeleteScheduleSetPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteScheduleSetReq** | [**DeleteScheduleSetReq**](DeleteScheduleSetReq.md)|  |

### Return type

[**DeleteScheduleSetRsp**](DeleteScheduleSetRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="scheduleGetScheduleItemPost"></a>
# **scheduleGetScheduleItemPost**
> GetScheduleItemRsp scheduleGetScheduleItemPost(getScheduleItemReq)

スケジュール項目の取得

指定されたスケジュールの各項目の値を返す。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = ScheduleFunctionsApi()
val getScheduleItemReq : GetScheduleItemReq =  // GetScheduleItemReq | 
try {
    val result : GetScheduleItemRsp = apiInstance.scheduleGetScheduleItemPost(getScheduleItemReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScheduleFunctionsApi#scheduleGetScheduleItemPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScheduleFunctionsApi#scheduleGetScheduleItemPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getScheduleItemReq** | [**GetScheduleItemReq**](GetScheduleItemReq.md)|  |

### Return type

[**GetScheduleItemRsp**](GetScheduleItemRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="scheduleGetScheduleListPost"></a>
# **scheduleGetScheduleListPost**
> GetScheduleListRsp scheduleGetScheduleListPost(getScheduleListReq)

スケジュール一覧を取得する

指定されたグループに登録されているスケジュールを返す。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = ScheduleFunctionsApi()
val getScheduleListReq : GetScheduleListReq =  // GetScheduleListReq | 
try {
    val result : GetScheduleListRsp = apiInstance.scheduleGetScheduleListPost(getScheduleListReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScheduleFunctionsApi#scheduleGetScheduleListPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScheduleFunctionsApi#scheduleGetScheduleListPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getScheduleListReq** | [**GetScheduleListReq**](GetScheduleListReq.md)|  |

### Return type

[**GetScheduleListRsp**](GetScheduleListRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="scheduleGetScheduleSetListPost"></a>
# **scheduleGetScheduleSetListPost**
> GetScheduleSetListRsp scheduleGetScheduleSetListPost(body)

スケジュールセット一覧の取得

ログインアカウントのドメインに紐づくスケジュールセットを返す。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = ScheduleFunctionsApi()
val body : kotlin.String = Object // kotlin.String | 
try {
    val result : GetScheduleSetListRsp = apiInstance.scheduleGetScheduleSetListPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScheduleFunctionsApi#scheduleGetScheduleSetListPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScheduleFunctionsApi#scheduleGetScheduleSetListPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **kotlin.String**|  |

### Return type

[**GetScheduleSetListRsp**](GetScheduleSetListRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="scheduleGetScheduleSetPost"></a>
# **scheduleGetScheduleSetPost**
> GetScheduleSetRsp scheduleGetScheduleSetPost(getScheduleSetReq)

スケジュールセットの取得

ログインアカウントのドメインに紐づくスケジュールセットのから指定されたスケジュールセットを返す。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = ScheduleFunctionsApi()
val getScheduleSetReq : GetScheduleSetReq =  // GetScheduleSetReq | 
try {
    val result : GetScheduleSetRsp = apiInstance.scheduleGetScheduleSetPost(getScheduleSetReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScheduleFunctionsApi#scheduleGetScheduleSetPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScheduleFunctionsApi#scheduleGetScheduleSetPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getScheduleSetReq** | [**GetScheduleSetReq**](GetScheduleSetReq.md)|  |

### Return type

[**GetScheduleSetRsp**](GetScheduleSetRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="scheduleSetSchedulePost"></a>
# **scheduleSetSchedulePost**
> SetScheduleRsp scheduleSetSchedulePost(setScheduleReq)

スケジュールの有効／無効設定

指定されたグループに登録されているスケジュールの有効／無効を設定する&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = ScheduleFunctionsApi()
val setScheduleReq : SetScheduleReq =  // SetScheduleReq | 
try {
    val result : SetScheduleRsp = apiInstance.scheduleSetSchedulePost(setScheduleReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScheduleFunctionsApi#scheduleSetSchedulePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScheduleFunctionsApi#scheduleSetSchedulePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **setScheduleReq** | [**SetScheduleReq**](SetScheduleReq.md)|  |

### Return type

[**SetScheduleRsp**](SetScheduleRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="scheduleUpdateScheduleItemPost"></a>
# **scheduleUpdateScheduleItemPost**
> UpdateScheduleItemRsp scheduleUpdateScheduleItemPost(updateScheduleItemReq)

スケジュール項目の更新

指定されたスケジュールの各項目を更新する。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = ScheduleFunctionsApi()
val updateScheduleItemReq : UpdateScheduleItemReq =  // UpdateScheduleItemReq | 
try {
    val result : UpdateScheduleItemRsp = apiInstance.scheduleUpdateScheduleItemPost(updateScheduleItemReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScheduleFunctionsApi#scheduleUpdateScheduleItemPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScheduleFunctionsApi#scheduleUpdateScheduleItemPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateScheduleItemReq** | [**UpdateScheduleItemReq**](UpdateScheduleItemReq.md)|  |

### Return type

[**UpdateScheduleItemRsp**](UpdateScheduleItemRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="scheduleUpdateScheduleSetPost"></a>
# **scheduleUpdateScheduleSetPost**
> UpdateScheduleSetRsp scheduleUpdateScheduleSetPost(updateScheduleSetReq)

スケジュールセットの更新

指定されたスケジュールセットを更新する。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = ScheduleFunctionsApi()
val updateScheduleSetReq : UpdateScheduleSetReq =  // UpdateScheduleSetReq | 
try {
    val result : UpdateScheduleSetRsp = apiInstance.scheduleUpdateScheduleSetPost(updateScheduleSetReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScheduleFunctionsApi#scheduleUpdateScheduleSetPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScheduleFunctionsApi#scheduleUpdateScheduleSetPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateScheduleSetReq** | [**UpdateScheduleSetReq**](UpdateScheduleSetReq.md)|  |

### Return type

[**UpdateScheduleSetRsp**](UpdateScheduleSetRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

