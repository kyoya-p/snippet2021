# BasicFunctionsApi

All URIs are relative to *https://&lt;&lt;serviceAddress&gt;&gt;:8086/idpManager*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deviceApplyScheduleSetPost**](BasicFunctionsApi.md#deviceApplyScheduleSetPost) | **POST** /device/applyScheduleSet | スケジュールセットの反映
[**deviceCheckProgressPost**](BasicFunctionsApi.md#deviceCheckProgressPost) | **POST** /device/checkProgress | 非同期処理の完了チェック
[**deviceExecuteChangeInputModePost**](BasicFunctionsApi.md#deviceExecuteChangeInputModePost) | **POST** /device/executeChangeInputMode | 入力モード切り替えコマンドの実行
[**deviceExecuteManagePowerPost**](BasicFunctionsApi.md#deviceExecuteManagePowerPost) | **POST** /device/executeManagePower | 電源管理コマンドの実行
[**deviceExecuteUpdateInformationPost**](BasicFunctionsApi.md#deviceExecuteUpdateInformationPost) | **POST** /device/executeUpdateInformation | デバイス情報更新の実行
[**deviceGetDeviceDetailPost**](BasicFunctionsApi.md#deviceGetDeviceDetailPost) | **POST** /device/getDeviceDetail | デバイスの詳細情報の取得
[**deviceGetDeviceListPost**](BasicFunctionsApi.md#deviceGetDeviceListPost) | **POST** /device/getDeviceList | デバイス一覧の取得
[**deviceGetDeviceRegistrationInformationPost**](BasicFunctionsApi.md#deviceGetDeviceRegistrationInformationPost) | **POST** /device/getDeviceRegistrationInformation | デバイス登録情報の取得
[**deviceGetSchedulePost**](BasicFunctionsApi.md#deviceGetSchedulePost) | **POST** /device/getSchedule | デバイス設定済みスケジュールの取得
[**deviceGetUnregisterDeviceResultPost**](BasicFunctionsApi.md#deviceGetUnregisterDeviceResultPost) | **POST** /device/getUnregisterDeviceResult | 登録済みデバイスの削除結果の取得
[**deviceGetWebPageUrlPost**](BasicFunctionsApi.md#deviceGetWebPageUrlPost) | **POST** /device/getWebPageUrl | Embedded Web PageのURLの取得
[**deviceRegisterDeviceManuallyPost**](BasicFunctionsApi.md#deviceRegisterDeviceManuallyPost) | **POST** /device/registerDeviceManually | デバイスの手動登録
[**deviceUnregisterDevicePost**](BasicFunctionsApi.md#deviceUnregisterDevicePost) | **POST** /device/unregisterDevice | 登録済みデバイスの削除
[**deviceUpdateDeviceRegistrationInformationPost**](BasicFunctionsApi.md#deviceUpdateDeviceRegistrationInformationPost) | **POST** /device/updateDeviceRegistrationInformation | デバイス登録情報の更新
[**deviceUpdateRelatedGroupPost**](BasicFunctionsApi.md#deviceUpdateRelatedGroupPost) | **POST** /device/updateRelatedGroup | 参照グループの変更
[**deviceUpdateSchedulePost**](BasicFunctionsApi.md#deviceUpdateSchedulePost) | **POST** /device/updateSchedule | デバイス設定済みスケジュールの更新


<a name="deviceApplyScheduleSetPost"></a>
# **deviceApplyScheduleSetPost**
> ApplyScheduleSetRsp deviceApplyScheduleSetPost(applyScheduleSetReq)

スケジュールセットの反映

指定されたスケジュールセットの内容をデバイスのスケジュールとして設定する。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = BasicFunctionsApi()
val applyScheduleSetReq : ApplyScheduleSetReq =  // ApplyScheduleSetReq | 
try {
    val result : ApplyScheduleSetRsp = apiInstance.deviceApplyScheduleSetPost(applyScheduleSetReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BasicFunctionsApi#deviceApplyScheduleSetPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BasicFunctionsApi#deviceApplyScheduleSetPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applyScheduleSetReq** | [**ApplyScheduleSetReq**](ApplyScheduleSetReq.md)|  |

### Return type

[**ApplyScheduleSetRsp**](ApplyScheduleSetRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deviceCheckProgressPost"></a>
# **deviceCheckProgressPost**
> CheckProgressRsp deviceCheckProgressPost(checkProgressReq)

非同期処理の完了チェック

非同期処理の完了をチェックする。&lt;br&gt; 対象は、以下の処理。&lt;br&gt; 「登録済みデバイスの削除」&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = BasicFunctionsApi()
val checkProgressReq : CheckProgressReq =  // CheckProgressReq | 
try {
    val result : CheckProgressRsp = apiInstance.deviceCheckProgressPost(checkProgressReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BasicFunctionsApi#deviceCheckProgressPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BasicFunctionsApi#deviceCheckProgressPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkProgressReq** | [**CheckProgressReq**](CheckProgressReq.md)|  |

### Return type

[**CheckProgressRsp**](CheckProgressRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deviceExecuteChangeInputModePost"></a>
# **deviceExecuteChangeInputModePost**
> ExecuteChangeInputModeRsp deviceExecuteChangeInputModePost(executeChangeInputModeReq)

入力モード切り替えコマンドの実行

指定されたデバイスに対して入力モード切替コマンドを実行する。&lt;br&gt; 入力モード切り替えコマンドの実行をキャンセルしたり、進捗を確認するAPIは、ありません。&lt;br&gt; 入力モード切替コマンドの結果は、デバイス毎にWebsocket経由で通知します。[TBD]&lt;br&gt; ただし、現バージョンでは、Websocketの接続を行わないため、&lt;br&gt; 一定時間経過後、情報取得を実行し、デバイスの状態を確認していただく必要があります。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = BasicFunctionsApi()
val executeChangeInputModeReq : ExecuteChangeInputModeReq =  // ExecuteChangeInputModeReq | 
try {
    val result : ExecuteChangeInputModeRsp = apiInstance.deviceExecuteChangeInputModePost(executeChangeInputModeReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BasicFunctionsApi#deviceExecuteChangeInputModePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BasicFunctionsApi#deviceExecuteChangeInputModePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **executeChangeInputModeReq** | [**ExecuteChangeInputModeReq**](ExecuteChangeInputModeReq.md)|  |

### Return type

[**ExecuteChangeInputModeRsp**](ExecuteChangeInputModeRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deviceExecuteManagePowerPost"></a>
# **deviceExecuteManagePowerPost**
> ExecuteManagePowerRsp deviceExecuteManagePowerPost(executeManagePowerReq)

電源管理コマンドの実行

指定されたデバイスに対して電源管理コマンドを実行する。&lt;br&gt; 電源管理コマンドの実行をキャンセルしたり、進捗を確認するAPIは、ありません。&lt;br&gt; 電源管理コマンドの結果は、デバイス毎にWebsocket経由で通知します。[TBD]&lt;br&gt; ただし、現バージョンでは、Websocketの接続を行わないため、&lt;br&gt; 一定時間経過後、情報取得を実行し、デバイスの状態を確認していただく必要があります。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = BasicFunctionsApi()
val executeManagePowerReq : ExecuteManagePowerReq =  // ExecuteManagePowerReq | 
try {
    val result : ExecuteManagePowerRsp = apiInstance.deviceExecuteManagePowerPost(executeManagePowerReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BasicFunctionsApi#deviceExecuteManagePowerPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BasicFunctionsApi#deviceExecuteManagePowerPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **executeManagePowerReq** | [**ExecuteManagePowerReq**](ExecuteManagePowerReq.md)|  |

### Return type

[**ExecuteManagePowerRsp**](ExecuteManagePowerRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deviceExecuteUpdateInformationPost"></a>
# **deviceExecuteUpdateInformationPost**
> ExecuteUpdateInformationRsp deviceExecuteUpdateInformationPost(executeUpdateInformationReq)

デバイス情報更新の実行

指定されたデバイスの情報更新を実行する。&lt;br&gt; 情報更新の実行をキャンセルしたり、進捗を確認するAPIは、ありません。&lt;br&gt; ステータス更新の結果は、デバイス毎にWebsocket経由で通知します。&lt;br&gt; ただし、現バージョンでは、Websocketの接続を行わないため、&lt;br&gt; ユーザ操作により、再描画（getDeviceList() API や getDeviceDetail() APIの呼び出し）をしていただく必要があります。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = BasicFunctionsApi()
val executeUpdateInformationReq : ExecuteUpdateInformationReq =  // ExecuteUpdateInformationReq | 
try {
    val result : ExecuteUpdateInformationRsp = apiInstance.deviceExecuteUpdateInformationPost(executeUpdateInformationReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BasicFunctionsApi#deviceExecuteUpdateInformationPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BasicFunctionsApi#deviceExecuteUpdateInformationPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **executeUpdateInformationReq** | [**ExecuteUpdateInformationReq**](ExecuteUpdateInformationReq.md)|  |

### Return type

[**ExecuteUpdateInformationRsp**](ExecuteUpdateInformationRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deviceGetDeviceDetailPost"></a>
# **deviceGetDeviceDetailPost**
> GetDeviceDetailRsp deviceGetDeviceDetailPost(getDeviceDetailReq)

デバイスの詳細情報の取得

指定されたデバイスの詳細情報を返す。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = BasicFunctionsApi()
val getDeviceDetailReq : GetDeviceDetailReq =  // GetDeviceDetailReq | 
try {
    val result : GetDeviceDetailRsp = apiInstance.deviceGetDeviceDetailPost(getDeviceDetailReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BasicFunctionsApi#deviceGetDeviceDetailPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BasicFunctionsApi#deviceGetDeviceDetailPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getDeviceDetailReq** | [**GetDeviceDetailReq**](GetDeviceDetailReq.md)|  |

### Return type

[**GetDeviceDetailRsp**](GetDeviceDetailRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deviceGetDeviceListPost"></a>
# **deviceGetDeviceListPost**
> GetDeviceListRsp deviceGetDeviceListPost(getDeviceListReq)

デバイス一覧の取得

指定されたグループに登録されているデバイスの一覧を返す。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = BasicFunctionsApi()
val getDeviceListReq : GetDeviceListReq =  // GetDeviceListReq | 
try {
    val result : GetDeviceListRsp = apiInstance.deviceGetDeviceListPost(getDeviceListReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BasicFunctionsApi#deviceGetDeviceListPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BasicFunctionsApi#deviceGetDeviceListPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getDeviceListReq** | [**GetDeviceListReq**](GetDeviceListReq.md)|  |

### Return type

[**GetDeviceListRsp**](GetDeviceListRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: aplication/json
 - **Accept**: application/json

<a name="deviceGetDeviceRegistrationInformationPost"></a>
# **deviceGetDeviceRegistrationInformationPost**
> GetDeviceRegistrationInformationRsp deviceGetDeviceRegistrationInformationPost(getDeviceRegistrationInformationReq)

デバイス登録情報の取得

指定されたデバイス登録情報を返す。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = BasicFunctionsApi()
val getDeviceRegistrationInformationReq : GetDeviceRegistrationInformationReq =  // GetDeviceRegistrationInformationReq | 
try {
    val result : GetDeviceRegistrationInformationRsp = apiInstance.deviceGetDeviceRegistrationInformationPost(getDeviceRegistrationInformationReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BasicFunctionsApi#deviceGetDeviceRegistrationInformationPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BasicFunctionsApi#deviceGetDeviceRegistrationInformationPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getDeviceRegistrationInformationReq** | [**GetDeviceRegistrationInformationReq**](GetDeviceRegistrationInformationReq.md)|  |

### Return type

[**GetDeviceRegistrationInformationRsp**](GetDeviceRegistrationInformationRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deviceGetSchedulePost"></a>
# **deviceGetSchedulePost**
> GetScheduleRsp deviceGetSchedulePost(getScheduleReq)

デバイス設定済みスケジュールの取得

デバイスに設定されているスケジュールを返す。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = BasicFunctionsApi()
val getScheduleReq : GetScheduleReq =  // GetScheduleReq | 
try {
    val result : GetScheduleRsp = apiInstance.deviceGetSchedulePost(getScheduleReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BasicFunctionsApi#deviceGetSchedulePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BasicFunctionsApi#deviceGetSchedulePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getScheduleReq** | [**GetScheduleReq**](GetScheduleReq.md)|  |

### Return type

[**GetScheduleRsp**](GetScheduleRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deviceGetUnregisterDeviceResultPost"></a>
# **deviceGetUnregisterDeviceResultPost**
> GetUnregisterDeviceResultRsp deviceGetUnregisterDeviceResultPost(getUnregisterDeviceResultReq)

登録済みデバイスの削除結果の取得

登録済みデバイスの削除結果を取得する。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = BasicFunctionsApi()
val getUnregisterDeviceResultReq : GetUnregisterDeviceResultReq =  // GetUnregisterDeviceResultReq | 
try {
    val result : GetUnregisterDeviceResultRsp = apiInstance.deviceGetUnregisterDeviceResultPost(getUnregisterDeviceResultReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BasicFunctionsApi#deviceGetUnregisterDeviceResultPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BasicFunctionsApi#deviceGetUnregisterDeviceResultPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getUnregisterDeviceResultReq** | [**GetUnregisterDeviceResultReq**](GetUnregisterDeviceResultReq.md)|  |

### Return type

[**GetUnregisterDeviceResultRsp**](GetUnregisterDeviceResultRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deviceGetWebPageUrlPost"></a>
# **deviceGetWebPageUrlPost**
> GetWebPageUrlRsp deviceGetWebPageUrlPost(getWebPageUrlReq)

Embedded Web PageのURLの取得

指定されたデバイスのEmbedded Web PageのURLを返す。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = BasicFunctionsApi()
val getWebPageUrlReq : GetWebPageUrlReq =  // GetWebPageUrlReq | 
try {
    val result : GetWebPageUrlRsp = apiInstance.deviceGetWebPageUrlPost(getWebPageUrlReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BasicFunctionsApi#deviceGetWebPageUrlPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BasicFunctionsApi#deviceGetWebPageUrlPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getWebPageUrlReq** | [**GetWebPageUrlReq**](GetWebPageUrlReq.md)|  |

### Return type

[**GetWebPageUrlRsp**](GetWebPageUrlRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deviceRegisterDeviceManuallyPost"></a>
# **deviceRegisterDeviceManuallyPost**
> RegisterDeviceManuallyRsp deviceRegisterDeviceManuallyPost(registerDeviceManuallyReq)

デバイスの手動登録

IPアドレス、ポート、ユーザ名などを入力し、デバイスを登録する。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = BasicFunctionsApi()
val registerDeviceManuallyReq : RegisterDeviceManuallyReq =  // RegisterDeviceManuallyReq | 
try {
    val result : RegisterDeviceManuallyRsp = apiInstance.deviceRegisterDeviceManuallyPost(registerDeviceManuallyReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BasicFunctionsApi#deviceRegisterDeviceManuallyPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BasicFunctionsApi#deviceRegisterDeviceManuallyPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registerDeviceManuallyReq** | [**RegisterDeviceManuallyReq**](RegisterDeviceManuallyReq.md)|  |

### Return type

[**RegisterDeviceManuallyRsp**](RegisterDeviceManuallyRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deviceUnregisterDevicePost"></a>
# **deviceUnregisterDevicePost**
> UnregisterDeviceRsp deviceUnregisterDevicePost(unregisterDeviceReq)

登録済みデバイスの削除

指定された登録済みデバイスを削除する。&lt;br&gt; 削除処理の進捗は、checkProgress() APIで確認する。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = BasicFunctionsApi()
val unregisterDeviceReq : UnregisterDeviceReq =  // UnregisterDeviceReq | 
try {
    val result : UnregisterDeviceRsp = apiInstance.deviceUnregisterDevicePost(unregisterDeviceReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BasicFunctionsApi#deviceUnregisterDevicePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BasicFunctionsApi#deviceUnregisterDevicePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unregisterDeviceReq** | [**UnregisterDeviceReq**](UnregisterDeviceReq.md)|  |

### Return type

[**UnregisterDeviceRsp**](UnregisterDeviceRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deviceUpdateDeviceRegistrationInformationPost"></a>
# **deviceUpdateDeviceRegistrationInformationPost**
> UpdateDeviceRegistrationInformationRsp deviceUpdateDeviceRegistrationInformationPost(updateDeviceRegistrationInformationReq)

デバイス登録情報の更新

指定されたデバイス登録情報を更新する。&lt;br&gt; デバイス登録情報をリクエストパラメータの内容で更新する。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = BasicFunctionsApi()
val updateDeviceRegistrationInformationReq : UpdateDeviceRegistrationInformationReq =  // UpdateDeviceRegistrationInformationReq | 
try {
    val result : UpdateDeviceRegistrationInformationRsp = apiInstance.deviceUpdateDeviceRegistrationInformationPost(updateDeviceRegistrationInformationReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BasicFunctionsApi#deviceUpdateDeviceRegistrationInformationPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BasicFunctionsApi#deviceUpdateDeviceRegistrationInformationPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateDeviceRegistrationInformationReq** | [**UpdateDeviceRegistrationInformationReq**](UpdateDeviceRegistrationInformationReq.md)|  |

### Return type

[**UpdateDeviceRegistrationInformationRsp**](UpdateDeviceRegistrationInformationRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deviceUpdateRelatedGroupPost"></a>
# **deviceUpdateRelatedGroupPost**
> UpdateRelatedGroupRsp deviceUpdateRelatedGroupPost(updateRelatedGroupReq)

参照グループの変更

デバイスを参照しているグループを更新する。&lt;br&gt; グループの移動が行われたときに呼び出される。&lt;br&gt; リクエストパラメータにある targetGroupId を groupList に持つデバイスを対象デバイスとし、&lt;br&gt; deleteGroupIdList に指定されている groupId の情報を groupList から削除し、&lt;br&gt; addGroupIdList に指定されている groupId のグループ情報を groupList に追加する。&lt;br&gt; 追加するグループ情報は、&lt;br&gt;     {&lt;br&gt;         \&quot;groupId\&quot;: &lt;&lt;追加するグループのgroupId&gt;&gt;,&lt;br&gt;         \&quot;attribute\&quot;: \&quot;enable\&quot;,&lt;br&gt;         \&quot;deviceAttr\&quot;: &lt;&lt;targetGroupId の deviceAttr と同じ値&gt;&gt;,&lt;br&gt;         \&quot;detectedBy\&quot;: [&lt;&lt;targetGroupId の detectedBy と同じ値&gt;&gt;]&lt;br&gt;     }&lt;br&gt; とする。&lt;br&gt; addGroupIdList に指定された groupId が既に groupList に存在する場合、deviceAttr と detectedBy を以下のように更新する。&lt;br&gt; addGroupIdList に指定された groupId の deviceAttr が managed の場合、変更なし。trash の場合、targetGroupId の deviceAttr が managed であれば、managed に変更する。&lt;br&gt; addGroupIdList に指定された groupId の detectedBy と targetGroupId の detectedBy をマージする。&lt;br&gt; deleteGroupIdList に指定された groupId の detectedBy が targetGroupId の detectedBy と同じ場合は、groupList から削除する。&lt;br&gt; deleteGroupIdList に指定された groupId の detectedBy が targetGroupId の detectedBy と異なる場合は、指定された groupId の detectedBy から targetGroupId の detectedBy に含まれる groupId を削除する。&lt;br&gt; 現状は、内部からの呼び出しを想定。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = BasicFunctionsApi()
val updateRelatedGroupReq : UpdateRelatedGroupReq =  // UpdateRelatedGroupReq | 
try {
    val result : UpdateRelatedGroupRsp = apiInstance.deviceUpdateRelatedGroupPost(updateRelatedGroupReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BasicFunctionsApi#deviceUpdateRelatedGroupPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BasicFunctionsApi#deviceUpdateRelatedGroupPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateRelatedGroupReq** | [**UpdateRelatedGroupReq**](UpdateRelatedGroupReq.md)|  |

### Return type

[**UpdateRelatedGroupRsp**](UpdateRelatedGroupRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deviceUpdateSchedulePost"></a>
# **deviceUpdateSchedulePost**
> UpdateScheduleRsp deviceUpdateSchedulePost(updateScheduleReq)

デバイス設定済みスケジュールの更新

指定されたデバイスのスケジュールを更新する。&lt;br&gt; 設定済みのスケジュールを削除する場合も本APIを使用する。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = BasicFunctionsApi()
val updateScheduleReq : UpdateScheduleReq =  // UpdateScheduleReq | 
try {
    val result : UpdateScheduleRsp = apiInstance.deviceUpdateSchedulePost(updateScheduleReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BasicFunctionsApi#deviceUpdateSchedulePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BasicFunctionsApi#deviceUpdateSchedulePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateScheduleReq** | [**UpdateScheduleReq**](UpdateScheduleReq.md)|  |

### Return type

[**UpdateScheduleRsp**](UpdateScheduleRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

