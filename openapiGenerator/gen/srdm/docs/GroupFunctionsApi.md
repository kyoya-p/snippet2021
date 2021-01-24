# GroupFunctionsApi

All URIs are relative to *https://&lt;&lt;serviceAddress&gt;&gt;:8086/idpManager*

Method | HTTP request | Description
------------- | ------------- | -------------
[**groupCreateGroupPost**](GroupFunctionsApi.md#groupCreateGroupPost) | **POST** /group/createGroup | グループ作成
[**groupGetSRDMGroupListPost**](GroupFunctionsApi.md#groupGetSRDMGroupListPost) | **POST** /group/getSRDMGroupList | SRDM グループリストの取得
[**groupRemoveGroupPost**](GroupFunctionsApi.md#groupRemoveGroupPost) | **POST** /group/removeGroup | グループ削除


<a name="groupCreateGroupPost"></a>
# **groupCreateGroupPost**
> CreateGroupRsp groupCreateGroupPost(createGroupReq)

グループ作成

IDP関連のグループ情報を作成する。&lt;br&gt; データベースの「IDP用グループ情報」に新たなグループ情報を作成し、デフォルトのスケジュールを設定する。&lt;br&gt; 現状は、内部からの呼び出しを想定。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = GroupFunctionsApi()
val createGroupReq : CreateGroupReq =  // CreateGroupReq | 
try {
    val result : CreateGroupRsp = apiInstance.groupCreateGroupPost(createGroupReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupFunctionsApi#groupCreateGroupPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupFunctionsApi#groupCreateGroupPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createGroupReq** | [**CreateGroupReq**](CreateGroupReq.md)|  |

### Return type

[**CreateGroupRsp**](CreateGroupRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="groupGetSRDMGroupListPost"></a>
# **groupGetSRDMGroupListPost**
> GetSRDMGroupListRsp groupGetSRDMGroupListPost(getSRDMGroupListReq)

SRDM グループリストの取得

SRDMのグループリスト（グループ情報）を返す。&lt;br&gt; 対象となるグループタイプは、通常グループのみとする。（外部参照グループは、含まれない）&lt;br&gt;

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = GroupFunctionsApi()
val getSRDMGroupListReq : GetSRDMGroupListReq =  // GetSRDMGroupListReq | 
try {
    val result : GetSRDMGroupListRsp = apiInstance.groupGetSRDMGroupListPost(getSRDMGroupListReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupFunctionsApi#groupGetSRDMGroupListPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupFunctionsApi#groupGetSRDMGroupListPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getSRDMGroupListReq** | [**GetSRDMGroupListReq**](GetSRDMGroupListReq.md)|  |

### Return type

[**GetSRDMGroupListRsp**](GetSRDMGroupListRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="groupRemoveGroupPost"></a>
# **groupRemoveGroupPost**
> RemoveGroupRsp groupRemoveGroupPost(removeGroupReq)

グループ削除

IDP関連のグループ情報を削除する。&lt;br&gt; グループの削除に関する操作（ゴミ箱へ移動／元に戻す／ゴミ箱から削除）が行われたとき呼び出される。&lt;br&gt; 削除操作で実施する処理は、以下の通り。   - グループの属性を変更し、スケジュールの有効／無効を切り替える。&lt;br&gt;   - 指定グループから参照されているデバイスのグループ状態を変更する。&lt;br&gt;     リクエストパラメータにあるgroupIdListに指定されたgroupIdを持つデバイスのgroupListを更新する。&lt;br&gt;  現状は、内部からの呼び出しを想定。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。

### Example
```kotlin
// Import classes:
//import idpManager.infrastructure.*
//import idpManager.srdm.model.*

val apiInstance = GroupFunctionsApi()
val removeGroupReq : RemoveGroupReq =  // RemoveGroupReq | 
try {
    val result : RemoveGroupRsp = apiInstance.groupRemoveGroupPost(removeGroupReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupFunctionsApi#groupRemoveGroupPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupFunctionsApi#groupRemoveGroupPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **removeGroupReq** | [**RemoveGroupReq**](RemoveGroupReq.md)|  |

### Return type

[**RemoveGroupRsp**](RemoveGroupRsp.md)

### Authorization


Configure cookieAuth:
    ApiClient.apiKey["sid_randomString"] = ""
    ApiClient.apiKeyPrefix["sid_randomString"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

