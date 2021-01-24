package idpManager.infrastructure

import io.ktor.client.HttpClient
import io.ktor.client.HttpClientConfig
import io.ktor.client.call.call
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.JsonSerializer
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.request.forms.FormDataContent
import io.ktor.client.request.forms.MultiPartFormDataContent
import io.ktor.client.request.header
import io.ktor.client.request.parameter
import io.ktor.client.response.HttpResponse
import io.ktor.client.utils.EmptyContent
import io.ktor.http.*
import io.ktor.http.content.OutgoingContent
import io.ktor.http.content.PartData
import kotlinx.serialization.UnstableDefault
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration

import idpManager.srdm.api.*
import idpManager.srdm.model.*
import idpManager.auth.*

open class ApiClient(
        private val baseUrl: String,
        httpClientEngine: HttpClientEngine?,
        serializer: KotlinxSerializer) {

    @UseExperimental(UnstableDefault::class)
    constructor(
            baseUrl: String,
            httpClientEngine: HttpClientEngine?,
            jsonConfiguration: JsonConfiguration) :
            this(baseUrl, httpClientEngine, KotlinxSerializer(Json(jsonConfiguration)))

    private val serializer: JsonSerializer by lazy {
        serializer.apply { setMappers(this) }.ignoreOutgoingContent()
    }

    private val client: HttpClient by lazy {
        val jsonConfig: JsonFeature.Config.() -> Unit = { this.serializer = this@ApiClient.serializer }
        val clientConfig: (HttpClientConfig<*>) -> Unit = { it.install(JsonFeature, jsonConfig) }
        httpClientEngine?.let { HttpClient(it, clientConfig) } ?: HttpClient(clientConfig)
    }
    private val authentications: kotlin.collections.Map<String, Authentication> by lazy {
        mapOf(
                "cookieAuth" to ApiKeyAuth("query", "sid_randomString"))
    }

    companion object {
        protected val UNSAFE_HEADERS = listOf(HttpHeaders.ContentType)

        private fun setMappers(serializer: KotlinxSerializer) {
            
            BasicFunctionsApi.setMappers(serializer)
            
            CustomFilterFunctionsApi.setMappers(serializer)
            
            DomainFunctionsApi.setMappers(serializer)
            
            ExportFunctionsApi.setMappers(serializer)
            
            GroupFunctionsApi.setMappers(serializer)
            
            LogFunctionsApi.setMappers(serializer)
            
            ScheduleFunctionsApi.setMappers(serializer)
            
            serializer.setMapper(idpManager.srdm.model.ApplyScheduleSetReq::class, idpManager.srdm.model.ApplyScheduleSetReq.serializer())
            serializer.setMapper(idpManager.srdm.model.ApplyScheduleSetRsp::class, idpManager.srdm.model.ApplyScheduleSetRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.CheckProgressReq::class, idpManager.srdm.model.CheckProgressReq.serializer())
            serializer.setMapper(idpManager.srdm.model.CheckProgressRsp::class, idpManager.srdm.model.CheckProgressRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.CommonRsp::class, idpManager.srdm.model.CommonRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.CommonRspErrorList::class, idpManager.srdm.model.CommonRspErrorList.serializer())
            serializer.setMapper(idpManager.srdm.model.CreateFilterReq::class, idpManager.srdm.model.CreateFilterReq.serializer())
            serializer.setMapper(idpManager.srdm.model.CreateFilterReqBlockConditionList::class, idpManager.srdm.model.CreateFilterReqBlockConditionList.serializer())
            serializer.setMapper(idpManager.srdm.model.CreateFilterReqDetailConditionList::class, idpManager.srdm.model.CreateFilterReqDetailConditionList.serializer())
            serializer.setMapper(idpManager.srdm.model.CreateFilterRsp::class, idpManager.srdm.model.CreateFilterRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.CreateGroupReq::class, idpManager.srdm.model.CreateGroupReq.serializer())
            serializer.setMapper(idpManager.srdm.model.CreateGroupRsp::class, idpManager.srdm.model.CreateGroupRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.CreateScheduleSetReq::class, idpManager.srdm.model.CreateScheduleSetReq.serializer())
            serializer.setMapper(idpManager.srdm.model.CreateScheduleSetReqJobList::class, idpManager.srdm.model.CreateScheduleSetReqJobList.serializer())
            serializer.setMapper(idpManager.srdm.model.CreateScheduleSetRsp::class, idpManager.srdm.model.CreateScheduleSetRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.DeleteDeviceLogReq::class, idpManager.srdm.model.DeleteDeviceLogReq.serializer())
            serializer.setMapper(idpManager.srdm.model.DeleteDeviceLogRsp::class, idpManager.srdm.model.DeleteDeviceLogRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.DeleteDeviceOperationLogReq::class, idpManager.srdm.model.DeleteDeviceOperationLogReq.serializer())
            serializer.setMapper(idpManager.srdm.model.DeleteDeviceOperationLogRsp::class, idpManager.srdm.model.DeleteDeviceOperationLogRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.DeleteDomainOperationLogRsp::class, idpManager.srdm.model.DeleteDomainOperationLogRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.DeleteFilterReq::class, idpManager.srdm.model.DeleteFilterReq.serializer())
            serializer.setMapper(idpManager.srdm.model.DeleteFilterRsp::class, idpManager.srdm.model.DeleteFilterRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.DeleteGroupOperationLogReq::class, idpManager.srdm.model.DeleteGroupOperationLogReq.serializer())
            serializer.setMapper(idpManager.srdm.model.DeleteGroupOperationLogRsp::class, idpManager.srdm.model.DeleteGroupOperationLogRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.DeleteScheduleSetReq::class, idpManager.srdm.model.DeleteScheduleSetReq.serializer())
            serializer.setMapper(idpManager.srdm.model.DeleteScheduleSetRsp::class, idpManager.srdm.model.DeleteScheduleSetRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.ExecuteChangeInputModeReq::class, idpManager.srdm.model.ExecuteChangeInputModeReq.serializer())
            serializer.setMapper(idpManager.srdm.model.ExecuteChangeInputModeRsp::class, idpManager.srdm.model.ExecuteChangeInputModeRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.ExecuteManagePowerReq::class, idpManager.srdm.model.ExecuteManagePowerReq.serializer())
            serializer.setMapper(idpManager.srdm.model.ExecuteManagePowerRsp::class, idpManager.srdm.model.ExecuteManagePowerRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.ExecuteUpdateInformationReq::class, idpManager.srdm.model.ExecuteUpdateInformationReq.serializer())
            serializer.setMapper(idpManager.srdm.model.ExecuteUpdateInformationRsp::class, idpManager.srdm.model.ExecuteUpdateInformationRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.ExportDeviceDataHistoryReq::class, idpManager.srdm.model.ExportDeviceDataHistoryReq.serializer())
            serializer.setMapper(idpManager.srdm.model.ExportDeviceDataHistoryRsp::class, idpManager.srdm.model.ExportDeviceDataHistoryRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDeviceDetailReq::class, idpManager.srdm.model.GetDeviceDetailReq.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDeviceDetailRsp::class, idpManager.srdm.model.GetDeviceDetailRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDeviceListReq::class, idpManager.srdm.model.GetDeviceListReq.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDeviceListReqOrderBy::class, idpManager.srdm.model.GetDeviceListReqOrderBy.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDeviceListReqSimpleFilters::class, idpManager.srdm.model.GetDeviceListReqSimpleFilters.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDeviceListRsp::class, idpManager.srdm.model.GetDeviceListRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDeviceListRspDeviceList::class, idpManager.srdm.model.GetDeviceListRspDeviceList.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDeviceLogDetailReq::class, idpManager.srdm.model.GetDeviceLogDetailReq.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDeviceLogDetailRsp::class, idpManager.srdm.model.GetDeviceLogDetailRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDeviceLogDetailRspItemList::class, idpManager.srdm.model.GetDeviceLogDetailRspItemList.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDeviceLogReq::class, idpManager.srdm.model.GetDeviceLogReq.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDeviceLogReqOrderBy::class, idpManager.srdm.model.GetDeviceLogReqOrderBy.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDeviceLogReqSimpleFilters::class, idpManager.srdm.model.GetDeviceLogReqSimpleFilters.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDeviceLogRsp::class, idpManager.srdm.model.GetDeviceLogRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDeviceLogRspLogList::class, idpManager.srdm.model.GetDeviceLogRspLogList.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDeviceOperationLogDetailReq::class, idpManager.srdm.model.GetDeviceOperationLogDetailReq.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDeviceOperationLogDetailRsp::class, idpManager.srdm.model.GetDeviceOperationLogDetailRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDeviceOperationLogReq::class, idpManager.srdm.model.GetDeviceOperationLogReq.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDeviceOperationLogReqOrderBy::class, idpManager.srdm.model.GetDeviceOperationLogReqOrderBy.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDeviceOperationLogRsp::class, idpManager.srdm.model.GetDeviceOperationLogRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDeviceOperationLogRspLogList::class, idpManager.srdm.model.GetDeviceOperationLogRspLogList.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDeviceRegistrationInformationReq::class, idpManager.srdm.model.GetDeviceRegistrationInformationReq.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDeviceRegistrationInformationRsp::class, idpManager.srdm.model.GetDeviceRegistrationInformationRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDomainOperationLogDetailReq::class, idpManager.srdm.model.GetDomainOperationLogDetailReq.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDomainOperationLogDetailRsp::class, idpManager.srdm.model.GetDomainOperationLogDetailRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDomainOperationLogReq::class, idpManager.srdm.model.GetDomainOperationLogReq.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDomainOperationLogReqOrderBy::class, idpManager.srdm.model.GetDomainOperationLogReqOrderBy.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDomainOperationLogRsp::class, idpManager.srdm.model.GetDomainOperationLogRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.GetDomainOperationLogRspLogList::class, idpManager.srdm.model.GetDomainOperationLogRspLogList.serializer())
            serializer.setMapper(idpManager.srdm.model.GetFilterRsp::class, idpManager.srdm.model.GetFilterRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.GetFilterRspFilter::class, idpManager.srdm.model.GetFilterRspFilter.serializer())
            serializer.setMapper(idpManager.srdm.model.GetFilterRspFilterBlockConditionList::class, idpManager.srdm.model.GetFilterRspFilterBlockConditionList.serializer())
            serializer.setMapper(idpManager.srdm.model.GetFilterRspFilterDetailConditionList::class, idpManager.srdm.model.GetFilterRspFilterDetailConditionList.serializer())
            serializer.setMapper(idpManager.srdm.model.GetFilterRspFilterList::class, idpManager.srdm.model.GetFilterRspFilterList.serializer())
            serializer.setMapper(idpManager.srdm.model.GetGroupOperationLogDetailReq::class, idpManager.srdm.model.GetGroupOperationLogDetailReq.serializer())
            serializer.setMapper(idpManager.srdm.model.GetGroupOperationLogDetailRsp::class, idpManager.srdm.model.GetGroupOperationLogDetailRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.GetGroupOperationLogReq::class, idpManager.srdm.model.GetGroupOperationLogReq.serializer())
            serializer.setMapper(idpManager.srdm.model.GetGroupOperationLogRsp::class, idpManager.srdm.model.GetGroupOperationLogRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.GetGroupOperationLogRspLogList::class, idpManager.srdm.model.GetGroupOperationLogRspLogList.serializer())
            serializer.setMapper(idpManager.srdm.model.GetSRDMGroupListReq::class, idpManager.srdm.model.GetSRDMGroupListReq.serializer())
            serializer.setMapper(idpManager.srdm.model.GetSRDMGroupListRsp::class, idpManager.srdm.model.GetSRDMGroupListRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.GetSRDMGroupListRspGroupList::class, idpManager.srdm.model.GetSRDMGroupListRspGroupList.serializer())
            serializer.setMapper(idpManager.srdm.model.GetScheduleItemReq::class, idpManager.srdm.model.GetScheduleItemReq.serializer())
            serializer.setMapper(idpManager.srdm.model.GetScheduleItemRsp::class, idpManager.srdm.model.GetScheduleItemRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.GetScheduleListReq::class, idpManager.srdm.model.GetScheduleListReq.serializer())
            serializer.setMapper(idpManager.srdm.model.GetScheduleListRsp::class, idpManager.srdm.model.GetScheduleListRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.GetScheduleListRspScheduleList::class, idpManager.srdm.model.GetScheduleListRspScheduleList.serializer())
            serializer.setMapper(idpManager.srdm.model.GetScheduleReq::class, idpManager.srdm.model.GetScheduleReq.serializer())
            serializer.setMapper(idpManager.srdm.model.GetScheduleRsp::class, idpManager.srdm.model.GetScheduleRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.GetScheduleRspSchedule::class, idpManager.srdm.model.GetScheduleRspSchedule.serializer())
            serializer.setMapper(idpManager.srdm.model.GetScheduleRspScheduleJobList::class, idpManager.srdm.model.GetScheduleRspScheduleJobList.serializer())
            serializer.setMapper(idpManager.srdm.model.GetScheduleSetListRsp::class, idpManager.srdm.model.GetScheduleSetListRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.GetScheduleSetListRspScheduleSetList::class, idpManager.srdm.model.GetScheduleSetListRspScheduleSetList.serializer())
            serializer.setMapper(idpManager.srdm.model.GetScheduleSetReq::class, idpManager.srdm.model.GetScheduleSetReq.serializer())
            serializer.setMapper(idpManager.srdm.model.GetScheduleSetRsp::class, idpManager.srdm.model.GetScheduleSetRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.GetThemeSettingRsp::class, idpManager.srdm.model.GetThemeSettingRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.GetUnregisterDeviceResultReq::class, idpManager.srdm.model.GetUnregisterDeviceResultReq.serializer())
            serializer.setMapper(idpManager.srdm.model.GetUnregisterDeviceResultRsp::class, idpManager.srdm.model.GetUnregisterDeviceResultRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.GetUnregisterDeviceResultRspCount::class, idpManager.srdm.model.GetUnregisterDeviceResultRspCount.serializer())
            serializer.setMapper(idpManager.srdm.model.GetUnregisterDeviceResultRspErrorDeviceList::class, idpManager.srdm.model.GetUnregisterDeviceResultRspErrorDeviceList.serializer())
            serializer.setMapper(idpManager.srdm.model.GetWebPageUrlReq::class, idpManager.srdm.model.GetWebPageUrlReq.serializer())
            serializer.setMapper(idpManager.srdm.model.GetWebPageUrlRsp::class, idpManager.srdm.model.GetWebPageUrlRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.RegisterDeviceManuallyReq::class, idpManager.srdm.model.RegisterDeviceManuallyReq.serializer())
            serializer.setMapper(idpManager.srdm.model.RegisterDeviceManuallyReqRegisterTargetList::class, idpManager.srdm.model.RegisterDeviceManuallyReqRegisterTargetList.serializer())
            serializer.setMapper(idpManager.srdm.model.RegisterDeviceManuallyRsp::class, idpManager.srdm.model.RegisterDeviceManuallyRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.RegisterDeviceManuallyRspCount::class, idpManager.srdm.model.RegisterDeviceManuallyRspCount.serializer())
            serializer.setMapper(idpManager.srdm.model.RegisterDeviceManuallyRspRegisterErrorList::class, idpManager.srdm.model.RegisterDeviceManuallyRspRegisterErrorList.serializer())
            serializer.setMapper(idpManager.srdm.model.RemoveGroupReq::class, idpManager.srdm.model.RemoveGroupReq.serializer())
            serializer.setMapper(idpManager.srdm.model.RemoveGroupRsp::class, idpManager.srdm.model.RemoveGroupRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.SetFilterReq::class, idpManager.srdm.model.SetFilterReq.serializer())
            serializer.setMapper(idpManager.srdm.model.SetFilterRsp::class, idpManager.srdm.model.SetFilterRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.SetScheduleReq::class, idpManager.srdm.model.SetScheduleReq.serializer())
            serializer.setMapper(idpManager.srdm.model.SetScheduleReqScheduleList::class, idpManager.srdm.model.SetScheduleReqScheduleList.serializer())
            serializer.setMapper(idpManager.srdm.model.SetScheduleRsp::class, idpManager.srdm.model.SetScheduleRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.SetThemeSettingReq::class, idpManager.srdm.model.SetThemeSettingReq.serializer())
            serializer.setMapper(idpManager.srdm.model.SetThemeSettingRsp::class, idpManager.srdm.model.SetThemeSettingRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.StartDeleteLogReq::class, idpManager.srdm.model.StartDeleteLogReq.serializer())
            serializer.setMapper(idpManager.srdm.model.StartDeleteLogRsp::class, idpManager.srdm.model.StartDeleteLogRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.UnregisterDeviceReq::class, idpManager.srdm.model.UnregisterDeviceReq.serializer())
            serializer.setMapper(idpManager.srdm.model.UnregisterDeviceRsp::class, idpManager.srdm.model.UnregisterDeviceRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.UpdateDeviceRegistrationInformationReq::class, idpManager.srdm.model.UpdateDeviceRegistrationInformationReq.serializer())
            serializer.setMapper(idpManager.srdm.model.UpdateDeviceRegistrationInformationRsp::class, idpManager.srdm.model.UpdateDeviceRegistrationInformationRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.UpdateRelatedGroupReq::class, idpManager.srdm.model.UpdateRelatedGroupReq.serializer())
            serializer.setMapper(idpManager.srdm.model.UpdateRelatedGroupRsp::class, idpManager.srdm.model.UpdateRelatedGroupRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.UpdateScheduleItemReq::class, idpManager.srdm.model.UpdateScheduleItemReq.serializer())
            serializer.setMapper(idpManager.srdm.model.UpdateScheduleItemRsp::class, idpManager.srdm.model.UpdateScheduleItemRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.UpdateScheduleReq::class, idpManager.srdm.model.UpdateScheduleReq.serializer())
            serializer.setMapper(idpManager.srdm.model.UpdateScheduleReqSchedule::class, idpManager.srdm.model.UpdateScheduleReqSchedule.serializer())
            serializer.setMapper(idpManager.srdm.model.UpdateScheduleReqScheduleJobList::class, idpManager.srdm.model.UpdateScheduleReqScheduleJobList.serializer())
            serializer.setMapper(idpManager.srdm.model.UpdateScheduleRsp::class, idpManager.srdm.model.UpdateScheduleRsp.serializer())
            serializer.setMapper(idpManager.srdm.model.UpdateScheduleSetReq::class, idpManager.srdm.model.UpdateScheduleSetReq.serializer())
            serializer.setMapper(idpManager.srdm.model.UpdateScheduleSetRsp::class, idpManager.srdm.model.UpdateScheduleSetRsp.serializer())
        }
    }

    /**
     * Set the username for the first HTTP basic authentication.
     *
     * @param username Username
     */
    fun setUsername(username: String) {
        val auth = authentications?.values?.firstOrNull { it is HttpBasicAuth } as HttpBasicAuth?
                ?: throw Exception("No HTTP basic authentication configured")
        auth.username = username
    }

    /**
     * Set the password for the first HTTP basic authentication.
     *
     * @param password Password
     */
    fun setPassword(password: String) {
        val auth = authentications?.values?.firstOrNull { it is HttpBasicAuth } as HttpBasicAuth?
                ?: throw Exception("No HTTP basic authentication configured")
        auth.password = password
    }

    /**
     * Set the API key value for the first API key authentication.
     *
     * @param apiKey API key
     * @param paramName The name of the API key parameter, or null or set the first key.
     */
    fun setApiKey(apiKey: String, paramName: String? = null) {
        val auth = authentications?.values?.firstOrNull { it is ApiKeyAuth && (paramName == null || paramName == it.paramName)} as ApiKeyAuth?
                ?: throw Exception("No API key authentication configured")
        auth.apiKey = apiKey
    }

    /**
     * Set the API key prefix for the first API key authentication.
     *
     * @param apiKeyPrefix API key prefix
     * @param paramName The name of the API key parameter, or null or set the first key.
     */
    fun setApiKeyPrefix(apiKeyPrefix: String, paramName: String? = null) {
        val auth = authentications?.values?.firstOrNull { it is ApiKeyAuth && (paramName == null || paramName == it.paramName) } as ApiKeyAuth?
                ?: throw Exception("No API key authentication configured")
        auth.apiKeyPrefix = apiKeyPrefix
    }

    /**
     * Set the access token for the first OAuth2 authentication.
     *
     * @param accessToken Access token
     */
    fun setAccessToken(accessToken: String) {
        val auth = authentications?.values?.firstOrNull { it is OAuth } as OAuth?
                ?: throw Exception("No OAuth2 authentication configured")
        auth.accessToken = accessToken
    }

    /**
     * Set the access token for the first Bearer authentication.
     *
     * @param bearerToken The bearer token.
     */
    fun setBearerToken(bearerToken: String) {
        val auth = authentications?.values?.firstOrNull { it is HttpBearerAuth } as HttpBearerAuth?
                ?: throw Exception("No Bearer authentication configured")
        auth.bearerToken = bearerToken
    }

    protected suspend fun multipartFormRequest(requestConfig: RequestConfig, body: kotlin.collections.List<PartData>?, authNames: kotlin.collections.List<String>): HttpResponse {
        return request(requestConfig, MultiPartFormDataContent(body ?: listOf()), authNames)
    }

    protected suspend fun urlEncodedFormRequest(requestConfig: RequestConfig, body: Parameters?, authNames: kotlin.collections.List<String>): HttpResponse {
        return request(requestConfig, FormDataContent(body ?: Parameters.Empty), authNames)
    }

    protected suspend fun jsonRequest(requestConfig: RequestConfig, body: Any? = null, authNames: kotlin.collections.List<String>): HttpResponse {
        val contentType = (requestConfig.headers[HttpHeaders.ContentType]?.let { ContentType.parse(it) }
                ?: ContentType.Application.Json)
        return if (body != null) request(requestConfig, serializer.write(body, contentType), authNames)
        else request(requestConfig, authNames = authNames)
    }

    protected suspend fun request(requestConfig: RequestConfig, body: OutgoingContent = EmptyContent, authNames: kotlin.collections.List<String>): HttpResponse {
        requestConfig.updateForAuth(authNames)
        val headers = requestConfig.headers

        return client.call {
            this.url {
                this.takeFrom(URLBuilder(baseUrl))
                appendPath(requestConfig.path.trimStart('/').split('/'))
                requestConfig.query.forEach { query ->
                    query.value.forEach { value ->
                        parameter(query.key, value)
                    }
                }
            }
            this.method = requestConfig.method.httpMethod
            headers.filter { header -> !UNSAFE_HEADERS.contains(header.key) }.forEach { header -> this.header(header.key, header.value) }
            if (requestConfig.method in listOf(RequestMethod.PUT, RequestMethod.POST, RequestMethod.PATCH))
                this.body = body

        }.response
    }

    private fun RequestConfig.updateForAuth(authNames: kotlin.collections.List<String>) {
        for (authName in authNames) {
            val auth = authentications?.get(authName) ?: throw Exception("Authentication undefined: $authName")
            auth.apply(query, headers)
        }
    }

    private fun URLBuilder.appendPath(components: kotlin.collections.List<String>): URLBuilder = apply {
        encodedPath = encodedPath.trimEnd('/') + components.joinToString("/", prefix = "/") { it.encodeURLQueryComponent() }
    }

    private val RequestMethod.httpMethod: HttpMethod
        get() = when (this) {
            RequestMethod.DELETE -> HttpMethod.Delete
            RequestMethod.GET -> HttpMethod.Get
            RequestMethod.HEAD -> HttpMethod.Head
            RequestMethod.PATCH -> HttpMethod.Patch
            RequestMethod.PUT -> HttpMethod.Put
            RequestMethod.POST -> HttpMethod.Post
            RequestMethod.OPTIONS -> HttpMethod.Options
        }
}

// https://github.com/ktorio/ktor/issues/851
private fun JsonSerializer.ignoreOutgoingContent() = IgnoreOutgoingContentJsonSerializer(this)

private class IgnoreOutgoingContentJsonSerializer(private val delegate: JsonSerializer) : JsonSerializer by delegate {
    override fun write(data: Any): OutgoingContent {
        if (data is OutgoingContent) return data
        return delegate.write(data)
    }
}
