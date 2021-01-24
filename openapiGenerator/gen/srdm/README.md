# idpManager - Kotlin client library for idpManager API Specification

## Requires

* Kotlin 1.3.50

## Build

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.


<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://<<serviceAddress>>:8086/idpManager*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BasicFunctionsApi* | [**deviceApplyScheduleSetPost**](docs/BasicFunctionsApi.md#deviceapplyschedulesetpost) | **POST** /device/applyScheduleSet | スケジュールセットの反映
*BasicFunctionsApi* | [**deviceCheckProgressPost**](docs/BasicFunctionsApi.md#devicecheckprogresspost) | **POST** /device/checkProgress | 非同期処理の完了チェック
*BasicFunctionsApi* | [**deviceExecuteChangeInputModePost**](docs/BasicFunctionsApi.md#deviceexecutechangeinputmodepost) | **POST** /device/executeChangeInputMode | 入力モード切り替えコマンドの実行
*BasicFunctionsApi* | [**deviceExecuteManagePowerPost**](docs/BasicFunctionsApi.md#deviceexecutemanagepowerpost) | **POST** /device/executeManagePower | 電源管理コマンドの実行
*BasicFunctionsApi* | [**deviceExecuteUpdateInformationPost**](docs/BasicFunctionsApi.md#deviceexecuteupdateinformationpost) | **POST** /device/executeUpdateInformation | デバイス情報更新の実行
*BasicFunctionsApi* | [**deviceGetDeviceDetailPost**](docs/BasicFunctionsApi.md#devicegetdevicedetailpost) | **POST** /device/getDeviceDetail | デバイスの詳細情報の取得
*BasicFunctionsApi* | [**deviceGetDeviceListPost**](docs/BasicFunctionsApi.md#devicegetdevicelistpost) | **POST** /device/getDeviceList | デバイス一覧の取得
*BasicFunctionsApi* | [**deviceGetDeviceRegistrationInformationPost**](docs/BasicFunctionsApi.md#devicegetdeviceregistrationinformationpost) | **POST** /device/getDeviceRegistrationInformation | デバイス登録情報の取得
*BasicFunctionsApi* | [**deviceGetSchedulePost**](docs/BasicFunctionsApi.md#devicegetschedulepost) | **POST** /device/getSchedule | デバイス設定済みスケジュールの取得
*BasicFunctionsApi* | [**deviceGetUnregisterDeviceResultPost**](docs/BasicFunctionsApi.md#devicegetunregisterdeviceresultpost) | **POST** /device/getUnregisterDeviceResult | 登録済みデバイスの削除結果の取得
*BasicFunctionsApi* | [**deviceGetWebPageUrlPost**](docs/BasicFunctionsApi.md#devicegetwebpageurlpost) | **POST** /device/getWebPageUrl | Embedded Web PageのURLの取得
*BasicFunctionsApi* | [**deviceRegisterDeviceManuallyPost**](docs/BasicFunctionsApi.md#deviceregisterdevicemanuallypost) | **POST** /device/registerDeviceManually | デバイスの手動登録
*BasicFunctionsApi* | [**deviceUnregisterDevicePost**](docs/BasicFunctionsApi.md#deviceunregisterdevicepost) | **POST** /device/unregisterDevice | 登録済みデバイスの削除
*BasicFunctionsApi* | [**deviceUpdateDeviceRegistrationInformationPost**](docs/BasicFunctionsApi.md#deviceupdatedeviceregistrationinformationpost) | **POST** /device/updateDeviceRegistrationInformation | デバイス登録情報の更新
*BasicFunctionsApi* | [**deviceUpdateRelatedGroupPost**](docs/BasicFunctionsApi.md#deviceupdaterelatedgrouppost) | **POST** /device/updateRelatedGroup | 参照グループの変更
*BasicFunctionsApi* | [**deviceUpdateSchedulePost**](docs/BasicFunctionsApi.md#deviceupdateschedulepost) | **POST** /device/updateSchedule | デバイス設定済みスケジュールの更新
*CustomFilterFunctionsApi* | [**filterCreateFilterPost**](docs/CustomFilterFunctionsApi.md#filtercreatefilterpost) | **POST** /filter/createFilter | ユーザ定義フィルターの作成
*CustomFilterFunctionsApi* | [**filterDeleteFilterPost**](docs/CustomFilterFunctionsApi.md#filterdeletefilterpost) | **POST** /filter/deleteFilter | ユーザ定義フィルターの削除
*CustomFilterFunctionsApi* | [**filterGetFilterPost**](docs/CustomFilterFunctionsApi.md#filtergetfilterpost) | **POST** /filter/getFilter | ユーザ定義フィルター一覧の取得
*CustomFilterFunctionsApi* | [**filterSetFilterPost**](docs/CustomFilterFunctionsApi.md#filtersetfilterpost) | **POST** /filter/setFilter | ユーザ定義フィルターの更新
*DomainFunctionsApi* | [**domainGetThemeSettingPost**](docs/DomainFunctionsApi.md#domaingetthemesettingpost) | **POST** /domain/getThemeSetting | UIテーマ設定の取得
*DomainFunctionsApi* | [**domainSetThemeSettingPost**](docs/DomainFunctionsApi.md#domainsetthemesettingpost) | **POST** /domain/setThemeSetting | UIテーマの設定
*ExportFunctionsApi* | [**exportDownloadExportDataGet**](docs/ExportFunctionsApi.md#exportdownloadexportdataget) | **GET** /export/downloadExportData | エクスポートデータの取得
*ExportFunctionsApi* | [**exportExportDeviceDataHistoryPost**](docs/ExportFunctionsApi.md#exportexportdevicedatahistorypost) | **POST** /export/exportDeviceDataHistory | デバイス情報履歴のエクスポート
*GroupFunctionsApi* | [**groupCreateGroupPost**](docs/GroupFunctionsApi.md#groupcreategrouppost) | **POST** /group/createGroup | グループ作成
*GroupFunctionsApi* | [**groupGetSRDMGroupListPost**](docs/GroupFunctionsApi.md#groupgetsrdmgrouplistpost) | **POST** /group/getSRDMGroupList | SRDM グループリストの取得
*GroupFunctionsApi* | [**groupRemoveGroupPost**](docs/GroupFunctionsApi.md#groupremovegrouppost) | **POST** /group/removeGroup | グループ削除
*LogFunctionsApi* | [**logDeleteDeviceLogPost**](docs/LogFunctionsApi.md#logdeletedevicelogpost) | **POST** /log/deleteDeviceLog | デバイスログの削除
*LogFunctionsApi* | [**logDeleteDeviceOperationLogPost**](docs/LogFunctionsApi.md#logdeletedeviceoperationlogpost) | **POST** /log/deleteDeviceOperationLog | デバイス操作ログの削除
*LogFunctionsApi* | [**logDeleteDomainOperationLogPost**](docs/LogFunctionsApi.md#logdeletedomainoperationlogpost) | **POST** /log/deleteDomainOperationLog | ドメイン操作ログの削除
*LogFunctionsApi* | [**logDeleteGroupOperationLogPost**](docs/LogFunctionsApi.md#logdeletegroupoperationlogpost) | **POST** /log/deleteGroupOperationLog | グループ操作ログの削除
*LogFunctionsApi* | [**logGetDeviceLogDetailPost**](docs/LogFunctionsApi.md#loggetdevicelogdetailpost) | **POST** /log/getDeviceLogDetail | デバイスログ詳細の取得
*LogFunctionsApi* | [**logGetDeviceLogPost**](docs/LogFunctionsApi.md#loggetdevicelogpost) | **POST** /log/getDeviceLog | デバイスログ一覧の取得
*LogFunctionsApi* | [**logGetDeviceOperationLogDetailPost**](docs/LogFunctionsApi.md#loggetdeviceoperationlogdetailpost) | **POST** /log/getDeviceOperationLogDetail | デバイス操作ログ詳細の取得
*LogFunctionsApi* | [**logGetDeviceOperationLogPost**](docs/LogFunctionsApi.md#loggetdeviceoperationlogpost) | **POST** /log/getDeviceOperationLog | デバイス操作ログ一覧の取得
*LogFunctionsApi* | [**logGetDomainOperationLogDetailPost**](docs/LogFunctionsApi.md#loggetdomainoperationlogdetailpost) | **POST** /log/getDomainOperationLogDetail | ドメイン操作ログ詳細の取得
*LogFunctionsApi* | [**logGetDomainOperationLogPost**](docs/LogFunctionsApi.md#loggetdomainoperationlogpost) | **POST** /log/getDomainOperationLog | ドメイン操作ログ一覧の取得
*LogFunctionsApi* | [**logGetGroupOperationLogDetailPost**](docs/LogFunctionsApi.md#loggetgroupoperationlogdetailpost) | **POST** /log/getGroupOperationLogDetail | グループ操作ログ詳細の取得
*LogFunctionsApi* | [**logGetGroupOperationLogPost**](docs/LogFunctionsApi.md#loggetgroupoperationlogpost) | **POST** /log/getGroupOperationLog | グループ操作ログ一覧の取得
*LogFunctionsApi* | [**logStartDeleteLogPost**](docs/LogFunctionsApi.md#logstartdeletelogpost) | **POST** /log/startDeleteLog | IDP関連の全ログ削除
*ScheduleFunctionsApi* | [**scheduleCreateScheduleSetPost**](docs/ScheduleFunctionsApi.md#schedulecreateschedulesetpost) | **POST** /schedule/createScheduleSet | スケジュールセットの作成
*ScheduleFunctionsApi* | [**scheduleDeleteScheduleSetPost**](docs/ScheduleFunctionsApi.md#scheduledeleteschedulesetpost) | **POST** /schedule/deleteScheduleSet | スケジュールセットの削除
*ScheduleFunctionsApi* | [**scheduleGetScheduleItemPost**](docs/ScheduleFunctionsApi.md#schedulegetscheduleitempost) | **POST** /schedule/getScheduleItem | スケジュール項目の取得
*ScheduleFunctionsApi* | [**scheduleGetScheduleListPost**](docs/ScheduleFunctionsApi.md#schedulegetschedulelistpost) | **POST** /schedule/getScheduleList | スケジュール一覧を取得する
*ScheduleFunctionsApi* | [**scheduleGetScheduleSetListPost**](docs/ScheduleFunctionsApi.md#schedulegetschedulesetlistpost) | **POST** /schedule/getScheduleSetList | スケジュールセット一覧の取得
*ScheduleFunctionsApi* | [**scheduleGetScheduleSetPost**](docs/ScheduleFunctionsApi.md#schedulegetschedulesetpost) | **POST** /schedule/getScheduleSet | スケジュールセットの取得
*ScheduleFunctionsApi* | [**scheduleSetSchedulePost**](docs/ScheduleFunctionsApi.md#schedulesetschedulepost) | **POST** /schedule/setSchedule | スケジュールの有効／無効設定
*ScheduleFunctionsApi* | [**scheduleUpdateScheduleItemPost**](docs/ScheduleFunctionsApi.md#scheduleupdatescheduleitempost) | **POST** /schedule/updateScheduleItem | スケジュール項目の更新
*ScheduleFunctionsApi* | [**scheduleUpdateScheduleSetPost**](docs/ScheduleFunctionsApi.md#scheduleupdateschedulesetpost) | **POST** /schedule/updateScheduleSet | スケジュールセットの更新


<a name="documentation-for-models"></a>
## Documentation for Models

 - [ApplyScheduleSetReq](docs/ApplyScheduleSetReq.md)
 - [ApplyScheduleSetRsp](docs/ApplyScheduleSetRsp.md)
 - [CheckProgressReq](docs/CheckProgressReq.md)
 - [CheckProgressRsp](docs/CheckProgressRsp.md)
 - [CommonRsp](docs/CommonRsp.md)
 - [CommonRspErrorList](docs/CommonRspErrorList.md)
 - [CreateFilterReq](docs/CreateFilterReq.md)
 - [CreateFilterReqBlockConditionList](docs/CreateFilterReqBlockConditionList.md)
 - [CreateFilterReqDetailConditionList](docs/CreateFilterReqDetailConditionList.md)
 - [CreateFilterRsp](docs/CreateFilterRsp.md)
 - [CreateGroupReq](docs/CreateGroupReq.md)
 - [CreateGroupRsp](docs/CreateGroupRsp.md)
 - [CreateScheduleSetReq](docs/CreateScheduleSetReq.md)
 - [CreateScheduleSetReqJobList](docs/CreateScheduleSetReqJobList.md)
 - [CreateScheduleSetRsp](docs/CreateScheduleSetRsp.md)
 - [DeleteDeviceLogReq](docs/DeleteDeviceLogReq.md)
 - [DeleteDeviceLogRsp](docs/DeleteDeviceLogRsp.md)
 - [DeleteDeviceOperationLogReq](docs/DeleteDeviceOperationLogReq.md)
 - [DeleteDeviceOperationLogRsp](docs/DeleteDeviceOperationLogRsp.md)
 - [DeleteDomainOperationLogRsp](docs/DeleteDomainOperationLogRsp.md)
 - [DeleteFilterReq](docs/DeleteFilterReq.md)
 - [DeleteFilterRsp](docs/DeleteFilterRsp.md)
 - [DeleteGroupOperationLogReq](docs/DeleteGroupOperationLogReq.md)
 - [DeleteGroupOperationLogRsp](docs/DeleteGroupOperationLogRsp.md)
 - [DeleteScheduleSetReq](docs/DeleteScheduleSetReq.md)
 - [DeleteScheduleSetRsp](docs/DeleteScheduleSetRsp.md)
 - [ExecuteChangeInputModeReq](docs/ExecuteChangeInputModeReq.md)
 - [ExecuteChangeInputModeRsp](docs/ExecuteChangeInputModeRsp.md)
 - [ExecuteManagePowerReq](docs/ExecuteManagePowerReq.md)
 - [ExecuteManagePowerRsp](docs/ExecuteManagePowerRsp.md)
 - [ExecuteUpdateInformationReq](docs/ExecuteUpdateInformationReq.md)
 - [ExecuteUpdateInformationRsp](docs/ExecuteUpdateInformationRsp.md)
 - [ExportDeviceDataHistoryReq](docs/ExportDeviceDataHistoryReq.md)
 - [ExportDeviceDataHistoryRsp](docs/ExportDeviceDataHistoryRsp.md)
 - [GetDeviceDetailReq](docs/GetDeviceDetailReq.md)
 - [GetDeviceDetailRsp](docs/GetDeviceDetailRsp.md)
 - [GetDeviceListReq](docs/GetDeviceListReq.md)
 - [GetDeviceListReqOrderBy](docs/GetDeviceListReqOrderBy.md)
 - [GetDeviceListReqSimpleFilters](docs/GetDeviceListReqSimpleFilters.md)
 - [GetDeviceListRsp](docs/GetDeviceListRsp.md)
 - [GetDeviceListRspDeviceList](docs/GetDeviceListRspDeviceList.md)
 - [GetDeviceLogDetailReq](docs/GetDeviceLogDetailReq.md)
 - [GetDeviceLogDetailRsp](docs/GetDeviceLogDetailRsp.md)
 - [GetDeviceLogDetailRspItemList](docs/GetDeviceLogDetailRspItemList.md)
 - [GetDeviceLogReq](docs/GetDeviceLogReq.md)
 - [GetDeviceLogReqOrderBy](docs/GetDeviceLogReqOrderBy.md)
 - [GetDeviceLogReqSimpleFilters](docs/GetDeviceLogReqSimpleFilters.md)
 - [GetDeviceLogRsp](docs/GetDeviceLogRsp.md)
 - [GetDeviceLogRspLogList](docs/GetDeviceLogRspLogList.md)
 - [GetDeviceOperationLogDetailReq](docs/GetDeviceOperationLogDetailReq.md)
 - [GetDeviceOperationLogDetailRsp](docs/GetDeviceOperationLogDetailRsp.md)
 - [GetDeviceOperationLogReq](docs/GetDeviceOperationLogReq.md)
 - [GetDeviceOperationLogReqOrderBy](docs/GetDeviceOperationLogReqOrderBy.md)
 - [GetDeviceOperationLogRsp](docs/GetDeviceOperationLogRsp.md)
 - [GetDeviceOperationLogRspLogList](docs/GetDeviceOperationLogRspLogList.md)
 - [GetDeviceRegistrationInformationReq](docs/GetDeviceRegistrationInformationReq.md)
 - [GetDeviceRegistrationInformationRsp](docs/GetDeviceRegistrationInformationRsp.md)
 - [GetDomainOperationLogDetailReq](docs/GetDomainOperationLogDetailReq.md)
 - [GetDomainOperationLogDetailRsp](docs/GetDomainOperationLogDetailRsp.md)
 - [GetDomainOperationLogReq](docs/GetDomainOperationLogReq.md)
 - [GetDomainOperationLogReqOrderBy](docs/GetDomainOperationLogReqOrderBy.md)
 - [GetDomainOperationLogRsp](docs/GetDomainOperationLogRsp.md)
 - [GetDomainOperationLogRspLogList](docs/GetDomainOperationLogRspLogList.md)
 - [GetFilterRsp](docs/GetFilterRsp.md)
 - [GetFilterRspFilter](docs/GetFilterRspFilter.md)
 - [GetFilterRspFilterBlockConditionList](docs/GetFilterRspFilterBlockConditionList.md)
 - [GetFilterRspFilterDetailConditionList](docs/GetFilterRspFilterDetailConditionList.md)
 - [GetFilterRspFilterList](docs/GetFilterRspFilterList.md)
 - [GetGroupOperationLogDetailReq](docs/GetGroupOperationLogDetailReq.md)
 - [GetGroupOperationLogDetailRsp](docs/GetGroupOperationLogDetailRsp.md)
 - [GetGroupOperationLogReq](docs/GetGroupOperationLogReq.md)
 - [GetGroupOperationLogRsp](docs/GetGroupOperationLogRsp.md)
 - [GetGroupOperationLogRspLogList](docs/GetGroupOperationLogRspLogList.md)
 - [GetSRDMGroupListReq](docs/GetSRDMGroupListReq.md)
 - [GetSRDMGroupListRsp](docs/GetSRDMGroupListRsp.md)
 - [GetSRDMGroupListRspGroupList](docs/GetSRDMGroupListRspGroupList.md)
 - [GetScheduleItemReq](docs/GetScheduleItemReq.md)
 - [GetScheduleItemRsp](docs/GetScheduleItemRsp.md)
 - [GetScheduleListReq](docs/GetScheduleListReq.md)
 - [GetScheduleListRsp](docs/GetScheduleListRsp.md)
 - [GetScheduleListRspScheduleList](docs/GetScheduleListRspScheduleList.md)
 - [GetScheduleReq](docs/GetScheduleReq.md)
 - [GetScheduleRsp](docs/GetScheduleRsp.md)
 - [GetScheduleRspSchedule](docs/GetScheduleRspSchedule.md)
 - [GetScheduleRspScheduleJobList](docs/GetScheduleRspScheduleJobList.md)
 - [GetScheduleSetListRsp](docs/GetScheduleSetListRsp.md)
 - [GetScheduleSetListRspScheduleSetList](docs/GetScheduleSetListRspScheduleSetList.md)
 - [GetScheduleSetReq](docs/GetScheduleSetReq.md)
 - [GetScheduleSetRsp](docs/GetScheduleSetRsp.md)
 - [GetThemeSettingRsp](docs/GetThemeSettingRsp.md)
 - [GetUnregisterDeviceResultReq](docs/GetUnregisterDeviceResultReq.md)
 - [GetUnregisterDeviceResultRsp](docs/GetUnregisterDeviceResultRsp.md)
 - [GetUnregisterDeviceResultRspCount](docs/GetUnregisterDeviceResultRspCount.md)
 - [GetUnregisterDeviceResultRspErrorDeviceList](docs/GetUnregisterDeviceResultRspErrorDeviceList.md)
 - [GetWebPageUrlReq](docs/GetWebPageUrlReq.md)
 - [GetWebPageUrlRsp](docs/GetWebPageUrlRsp.md)
 - [RegisterDeviceManuallyReq](docs/RegisterDeviceManuallyReq.md)
 - [RegisterDeviceManuallyReqRegisterTargetList](docs/RegisterDeviceManuallyReqRegisterTargetList.md)
 - [RegisterDeviceManuallyRsp](docs/RegisterDeviceManuallyRsp.md)
 - [RegisterDeviceManuallyRspCount](docs/RegisterDeviceManuallyRspCount.md)
 - [RegisterDeviceManuallyRspRegisterErrorList](docs/RegisterDeviceManuallyRspRegisterErrorList.md)
 - [RemoveGroupReq](docs/RemoveGroupReq.md)
 - [RemoveGroupRsp](docs/RemoveGroupRsp.md)
 - [SetFilterReq](docs/SetFilterReq.md)
 - [SetFilterRsp](docs/SetFilterRsp.md)
 - [SetScheduleReq](docs/SetScheduleReq.md)
 - [SetScheduleReqScheduleList](docs/SetScheduleReqScheduleList.md)
 - [SetScheduleRsp](docs/SetScheduleRsp.md)
 - [SetThemeSettingReq](docs/SetThemeSettingReq.md)
 - [SetThemeSettingRsp](docs/SetThemeSettingRsp.md)
 - [StartDeleteLogReq](docs/StartDeleteLogReq.md)
 - [StartDeleteLogRsp](docs/StartDeleteLogRsp.md)
 - [UnregisterDeviceReq](docs/UnregisterDeviceReq.md)
 - [UnregisterDeviceRsp](docs/UnregisterDeviceRsp.md)
 - [UpdateDeviceRegistrationInformationReq](docs/UpdateDeviceRegistrationInformationReq.md)
 - [UpdateDeviceRegistrationInformationRsp](docs/UpdateDeviceRegistrationInformationRsp.md)
 - [UpdateRelatedGroupReq](docs/UpdateRelatedGroupReq.md)
 - [UpdateRelatedGroupRsp](docs/UpdateRelatedGroupRsp.md)
 - [UpdateScheduleItemReq](docs/UpdateScheduleItemReq.md)
 - [UpdateScheduleItemRsp](docs/UpdateScheduleItemRsp.md)
 - [UpdateScheduleReq](docs/UpdateScheduleReq.md)
 - [UpdateScheduleReqSchedule](docs/UpdateScheduleReqSchedule.md)
 - [UpdateScheduleReqScheduleJobList](docs/UpdateScheduleReqScheduleJobList.md)
 - [UpdateScheduleRsp](docs/UpdateScheduleRsp.md)
 - [UpdateScheduleSetReq](docs/UpdateScheduleSetReq.md)
 - [UpdateScheduleSetRsp](docs/UpdateScheduleSetRsp.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="cookieAuth"></a>
### cookieAuth

- **Type**: API key
- **API key parameter name**: sid_randomString
- **Location**: 

