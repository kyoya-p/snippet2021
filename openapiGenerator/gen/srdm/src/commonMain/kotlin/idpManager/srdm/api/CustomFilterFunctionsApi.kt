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

import idpManager.srdm.model.CreateFilterReq
import idpManager.srdm.model.CreateFilterRsp
import idpManager.srdm.model.DeleteFilterReq
import idpManager.srdm.model.DeleteFilterRsp
import idpManager.srdm.model.GetFilterRsp
import idpManager.srdm.model.SetFilterReq
import idpManager.srdm.model.SetFilterRsp

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

class CustomFilterFunctionsApi @UseExperimental(UnstableDefault::class) constructor(
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
     * ユーザ定義フィルターの作成
     * ユーザ定義フィルターを作成する。&lt;br&gt; 一度に作成できるフィルターは、１件。&lt;br&gt; 作成したフィルターは、ログインアカウントが属するドメインに作成される。
     * @param createFilterReq  
     * @return CreateFilterRsp
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun filterCreateFilterPost(createFilterReq: CreateFilterReq): HttpResponse<CreateFilterRsp> {

        val localVariableAuthNames = listOf<String>("cookieAuth")

        val localVariableBody = createFilterReq

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/filter/createFilter",
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
     * ユーザ定義フィルターの削除
     * 指定されたユーザ定義フィルターを削除する。&lt;br&gt; 削除可能なフィルターは、ログインアカウントが属するドメインに存在するフィルターのみ。
     * @param deleteFilterReq  
     * @return DeleteFilterRsp
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun filterDeleteFilterPost(deleteFilterReq: DeleteFilterReq): HttpResponse<DeleteFilterRsp> {

        val localVariableAuthNames = listOf<String>("cookieAuth")

        val localVariableBody = deleteFilterReq

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/filter/deleteFilter",
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
     * ユーザ定義フィルター一覧の取得
     * ログインアカウントが属するドメインに紐づくフィルターの一覧を返す。
     * @param body  
     * @return GetFilterRsp
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun filterGetFilterPost(body: kotlin.String): HttpResponse<GetFilterRsp> {

        val localVariableAuthNames = listOf<String>("cookieAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/filter/getFilter",
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
     * ユーザ定義フィルターの更新
     * ユーザ定義フィルターを更新する。&lt;br&gt; 更新可能なフィルターは、ログインアカウントが属するドメインに存在するフィルターのみ。
     * @param setFilterReq  
     * @return SetFilterRsp
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun filterSetFilterPost(setFilterReq: SetFilterReq): HttpResponse<SetFilterRsp> {

        val localVariableAuthNames = listOf<String>("cookieAuth")

        val localVariableBody = setFilterReq

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/filter/setFilter",
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