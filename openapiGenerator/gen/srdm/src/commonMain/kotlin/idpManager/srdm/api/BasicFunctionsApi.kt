/**
* idpManager API Specification
* このドキュメントは、idpManagerのAPI仕様書です。
*
* The version of the OpenAPI document: 2.11.0.18
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package idpManager.srdm.api

import idpManager.srdm.model.ApplyScheduleSetReq
import idpManager.srdm.model.ApplyScheduleSetRsp
import idpManager.srdm.model.CheckProgressReq
import idpManager.srdm.model.CheckProgressRsp
import idpManager.srdm.model.ExecuteChangeInputModeReq
import idpManager.srdm.model.ExecuteChangeInputModeRsp
import idpManager.srdm.model.ExecuteManagePowerReq
import idpManager.srdm.model.ExecuteManagePowerRsp
import idpManager.srdm.model.ExecuteUpdateInformationReq
import idpManager.srdm.model.ExecuteUpdateInformationRsp
import idpManager.srdm.model.GetDeviceDetailReq
import idpManager.srdm.model.GetDeviceDetailRsp
import idpManager.srdm.model.GetDeviceListReq
import idpManager.srdm.model.GetDeviceListRsp
import idpManager.srdm.model.GetDeviceRegistrationInformationReq
import idpManager.srdm.model.GetDeviceRegistrationInformationRsp
import idpManager.srdm.model.GetScheduleReq
import idpManager.srdm.model.GetScheduleRsp
import idpManager.srdm.model.GetUnregisterDeviceResultReq
import idpManager.srdm.model.GetUnregisterDeviceResultRsp
import idpManager.srdm.model.GetWebPageUrlReq
import idpManager.srdm.model.GetWebPageUrlRsp
import idpManager.srdm.model.RegisterDeviceManuallyReq
import idpManager.srdm.model.RegisterDeviceManuallyRsp
import idpManager.srdm.model.UnregisterDeviceReq
import idpManager.srdm.model.UnregisterDeviceRsp
import idpManager.srdm.model.UpdateDeviceRegistrationInformationReq
import idpManager.srdm.model.UpdateDeviceRegistrationInformationRsp
import idpManager.srdm.model.UpdateRelatedGroupReq
import idpManager.srdm.model.UpdateRelatedGroupRsp
import idpManager.srdm.model.UpdateScheduleReq
import idpManager.srdm.model.UpdateScheduleRsp

import idpManager.infrastructure.*
import io.ktor.client.request.forms.formData
import kotlinx.serialization.UnstableDefault
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.features.json.serializer.KotlinxSerializer
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import io.ktor.http.ParametersBuilder
import kotlinx.serialization.*
import kotlinx.serialization.internal.StringDescriptor

class BasicFunctionsApi @UseExperimental(UnstableDefault::class) constructor(
    baseUrl: kotlin.String = "https://<<serviceAddress>>:8086/idpManager",
    httpClientEngine: HttpClientEngine? = null,
    serializer: KotlinxSerializer
) : ApiClient(baseUrl, httpClientEngine, serializer) {

    @UseExperimental(UnstableDefault::class)
    constructor(
        baseUrl: kotlin.String = "https://<<serviceAddress>>:8086/idpManager",
        httpClientEngine: HttpClientEngine? = null,
        jsonConfiguration: JsonConfiguration = JsonConfiguration.Default
    ) : this(baseUrl, httpClientEngine, KotlinxSerializer(Json(jsonConfiguration)))

    /**
     * スケジュールセットの反映
     * 指定されたスケジュールセットの内容をデバイスのスケジュールとして設定する。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。
     * @param applyScheduleSetReq  
     * @return ApplyScheduleSetRsp
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun deviceApplyScheduleSetPost(applyScheduleSetReq: ApplyScheduleSetReq): HttpResponse<ApplyScheduleSetRsp> {

        val localVariableAuthNames = listOf<String>("cookieAuth")

        val localVariableBody = applyScheduleSetReq

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/device/applyScheduleSet",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * 非同期処理の完了チェック
     * 非同期処理の完了をチェックする。&lt;br&gt; 対象は、以下の処理。&lt;br&gt; 「登録済みデバイスの削除」&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。
     * @param checkProgressReq  
     * @return CheckProgressRsp
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun deviceCheckProgressPost(checkProgressReq: CheckProgressReq): HttpResponse<CheckProgressRsp> {

        val localVariableAuthNames = listOf<String>("cookieAuth")

        val localVariableBody = checkProgressReq

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/device/checkProgress",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * 入力モード切り替えコマンドの実行
     * 指定されたデバイスに対して入力モード切替コマンドを実行する。&lt;br&gt; 入力モード切り替えコマンドの実行をキャンセルしたり、進捗を確認するAPIは、ありません。&lt;br&gt; 入力モード切替コマンドの結果は、デバイス毎にWebsocket経由で通知します。[TBD]&lt;br&gt; ただし、現バージョンでは、Websocketの接続を行わないため、&lt;br&gt; 一定時間経過後、情報取得を実行し、デバイスの状態を確認していただく必要があります。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。
     * @param executeChangeInputModeReq  
     * @return ExecuteChangeInputModeRsp
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun deviceExecuteChangeInputModePost(executeChangeInputModeReq: ExecuteChangeInputModeReq): HttpResponse<ExecuteChangeInputModeRsp> {

        val localVariableAuthNames = listOf<String>("cookieAuth")

        val localVariableBody = executeChangeInputModeReq

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/device/executeChangeInputMode",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * 電源管理コマンドの実行
     * 指定されたデバイスに対して電源管理コマンドを実行する。&lt;br&gt; 電源管理コマンドの実行をキャンセルしたり、進捗を確認するAPIは、ありません。&lt;br&gt; 電源管理コマンドの結果は、デバイス毎にWebsocket経由で通知します。[TBD]&lt;br&gt; ただし、現バージョンでは、Websocketの接続を行わないため、&lt;br&gt; 一定時間経過後、情報取得を実行し、デバイスの状態を確認していただく必要があります。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。
     * @param executeManagePowerReq  
     * @return ExecuteManagePowerRsp
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun deviceExecuteManagePowerPost(executeManagePowerReq: ExecuteManagePowerReq): HttpResponse<ExecuteManagePowerRsp> {

        val localVariableAuthNames = listOf<String>("cookieAuth")

        val localVariableBody = executeManagePowerReq

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/device/executeManagePower",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * デバイス情報更新の実行
     * 指定されたデバイスの情報更新を実行する。&lt;br&gt; 情報更新の実行をキャンセルしたり、進捗を確認するAPIは、ありません。&lt;br&gt; ステータス更新の結果は、デバイス毎にWebsocket経由で通知します。&lt;br&gt; ただし、現バージョンでは、Websocketの接続を行わないため、&lt;br&gt; ユーザ操作により、再描画（getDeviceList() API や getDeviceDetail() APIの呼び出し）をしていただく必要があります。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。
     * @param executeUpdateInformationReq  
     * @return ExecuteUpdateInformationRsp
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun deviceExecuteUpdateInformationPost(executeUpdateInformationReq: ExecuteUpdateInformationReq): HttpResponse<ExecuteUpdateInformationRsp> {

        val localVariableAuthNames = listOf<String>("cookieAuth")

        val localVariableBody = executeUpdateInformationReq

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/device/executeUpdateInformation",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * デバイスの詳細情報の取得
     * 指定されたデバイスの詳細情報を返す。
     * @param getDeviceDetailReq  
     * @return GetDeviceDetailRsp
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun deviceGetDeviceDetailPost(getDeviceDetailReq: GetDeviceDetailReq): HttpResponse<GetDeviceDetailRsp> {

        val localVariableAuthNames = listOf<String>("cookieAuth")

        val localVariableBody = getDeviceDetailReq

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/device/getDeviceDetail",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * デバイス一覧の取得
     * 指定されたグループに登録されているデバイスの一覧を返す。
     * @param getDeviceListReq  
     * @return GetDeviceListRsp
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun deviceGetDeviceListPost(getDeviceListReq: GetDeviceListReq): HttpResponse<GetDeviceListRsp> {

        val localVariableAuthNames = listOf<String>("cookieAuth")

        val localVariableBody = getDeviceListReq

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/device/getDeviceList",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * デバイス登録情報の取得
     * 指定されたデバイス登録情報を返す。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。
     * @param getDeviceRegistrationInformationReq  
     * @return GetDeviceRegistrationInformationRsp
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun deviceGetDeviceRegistrationInformationPost(getDeviceRegistrationInformationReq: GetDeviceRegistrationInformationReq): HttpResponse<GetDeviceRegistrationInformationRsp> {

        val localVariableAuthNames = listOf<String>("cookieAuth")

        val localVariableBody = getDeviceRegistrationInformationReq

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/device/getDeviceRegistrationInformation",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * デバイス設定済みスケジュールの取得
     * デバイスに設定されているスケジュールを返す。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。
     * @param getScheduleReq  
     * @return GetScheduleRsp
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun deviceGetSchedulePost(getScheduleReq: GetScheduleReq): HttpResponse<GetScheduleRsp> {

        val localVariableAuthNames = listOf<String>("cookieAuth")

        val localVariableBody = getScheduleReq

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/device/getSchedule",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * 登録済みデバイスの削除結果の取得
     * 登録済みデバイスの削除結果を取得する。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。
     * @param getUnregisterDeviceResultReq  
     * @return GetUnregisterDeviceResultRsp
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun deviceGetUnregisterDeviceResultPost(getUnregisterDeviceResultReq: GetUnregisterDeviceResultReq): HttpResponse<GetUnregisterDeviceResultRsp> {

        val localVariableAuthNames = listOf<String>("cookieAuth")

        val localVariableBody = getUnregisterDeviceResultReq

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/device/getUnregisterDeviceResult",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * Embedded Web PageのURLの取得
     * 指定されたデバイスのEmbedded Web PageのURLを返す。
     * @param getWebPageUrlReq  
     * @return GetWebPageUrlRsp
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun deviceGetWebPageUrlPost(getWebPageUrlReq: GetWebPageUrlReq): HttpResponse<GetWebPageUrlRsp> {

        val localVariableAuthNames = listOf<String>("cookieAuth")

        val localVariableBody = getWebPageUrlReq

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/device/getWebPageUrl",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * デバイスの手動登録
     * IPアドレス、ポート、ユーザ名などを入力し、デバイスを登録する。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。
     * @param registerDeviceManuallyReq  
     * @return RegisterDeviceManuallyRsp
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun deviceRegisterDeviceManuallyPost(registerDeviceManuallyReq: RegisterDeviceManuallyReq): HttpResponse<RegisterDeviceManuallyRsp> {

        val localVariableAuthNames = listOf<String>("cookieAuth")

        val localVariableBody = registerDeviceManuallyReq

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/device/registerDeviceManually",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * 登録済みデバイスの削除
     * 指定された登録済みデバイスを削除する。&lt;br&gt; 削除処理の進捗は、checkProgress() APIで確認する。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。
     * @param unregisterDeviceReq  
     * @return UnregisterDeviceRsp
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun deviceUnregisterDevicePost(unregisterDeviceReq: UnregisterDeviceReq): HttpResponse<UnregisterDeviceRsp> {

        val localVariableAuthNames = listOf<String>("cookieAuth")

        val localVariableBody = unregisterDeviceReq

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/device/unregisterDevice",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * デバイス登録情報の更新
     * 指定されたデバイス登録情報を更新する。&lt;br&gt; デバイス登録情報をリクエストパラメータの内容で更新する。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。
     * @param updateDeviceRegistrationInformationReq  
     * @return UpdateDeviceRegistrationInformationRsp
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun deviceUpdateDeviceRegistrationInformationPost(updateDeviceRegistrationInformationReq: UpdateDeviceRegistrationInformationReq): HttpResponse<UpdateDeviceRegistrationInformationRsp> {

        val localVariableAuthNames = listOf<String>("cookieAuth")

        val localVariableBody = updateDeviceRegistrationInformationReq

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/device/updateDeviceRegistrationInformation",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * 参照グループの変更
     * デバイスを参照しているグループを更新する。&lt;br&gt; グループの移動が行われたときに呼び出される。&lt;br&gt; リクエストパラメータにある targetGroupId を groupList に持つデバイスを対象デバイスとし、&lt;br&gt; deleteGroupIdList に指定されている groupId の情報を groupList から削除し、&lt;br&gt; addGroupIdList に指定されている groupId のグループ情報を groupList に追加する。&lt;br&gt; 追加するグループ情報は、&lt;br&gt;     {&lt;br&gt;         \&quot;groupId\&quot;: &lt;&lt;追加するグループのgroupId&gt;&gt;,&lt;br&gt;         \&quot;attribute\&quot;: \&quot;enable\&quot;,&lt;br&gt;         \&quot;deviceAttr\&quot;: &lt;&lt;targetGroupId の deviceAttr と同じ値&gt;&gt;,&lt;br&gt;         \&quot;detectedBy\&quot;: [&lt;&lt;targetGroupId の detectedBy と同じ値&gt;&gt;]&lt;br&gt;     }&lt;br&gt; とする。&lt;br&gt; addGroupIdList に指定された groupId が既に groupList に存在する場合、deviceAttr と detectedBy を以下のように更新する。&lt;br&gt; addGroupIdList に指定された groupId の deviceAttr が managed の場合、変更なし。trash の場合、targetGroupId の deviceAttr が managed であれば、managed に変更する。&lt;br&gt; addGroupIdList に指定された groupId の detectedBy と targetGroupId の detectedBy をマージする。&lt;br&gt; deleteGroupIdList に指定された groupId の detectedBy が targetGroupId の detectedBy と同じ場合は、groupList から削除する。&lt;br&gt; deleteGroupIdList に指定された groupId の detectedBy が targetGroupId の detectedBy と異なる場合は、指定された groupId の detectedBy から targetGroupId の detectedBy に含まれる groupId を削除する。&lt;br&gt; 現状は、内部からの呼び出しを想定。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。
     * @param updateRelatedGroupReq  
     * @return UpdateRelatedGroupRsp
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun deviceUpdateRelatedGroupPost(updateRelatedGroupReq: UpdateRelatedGroupReq): HttpResponse<UpdateRelatedGroupRsp> {

        val localVariableAuthNames = listOf<String>("cookieAuth")

        val localVariableBody = updateRelatedGroupReq

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/device/updateRelatedGroup",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * デバイス設定済みスケジュールの更新
     * 指定されたデバイスのスケジュールを更新する。&lt;br&gt; 設定済みのスケジュールを削除する場合も本APIを使用する。&lt;br&gt; 本APIの実行には、「グループ管理権限」が必要。
     * @param updateScheduleReq  
     * @return UpdateScheduleRsp
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun deviceUpdateSchedulePost(updateScheduleReq: UpdateScheduleReq): HttpResponse<UpdateScheduleRsp> {

        val localVariableAuthNames = listOf<String>("cookieAuth")

        val localVariableBody = updateScheduleReq

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/device/updateSchedule",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }




    companion object {
        internal fun setMappers(serializer: KotlinxSerializer) {
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
    }
}
