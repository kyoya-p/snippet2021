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

 - [idpManager.srdm.model.ApplyScheduleSetReq](docs/ApplyScheduleSetReq.md)
 - [idpManager.srdm.model.ApplyScheduleSetRsp](docs/ApplyScheduleSetRsp.md)
 - [idpManager.srdm.model.CheckProgressReq](docs/CheckProgressReq.md)
 - [idpManager.srdm.model.CheckProgressRsp](docs/CheckProgressRsp.md)
 - [idpManager.srdm.model.CommonRsp](docs/CommonRsp.md)
 - [idpManager.srdm.model.CommonRspErrorList](docs/CommonRspErrorList.md)
 - [idpManager.srdm.model.CreateFilterReq](docs/CreateFilterReq.md)
 - [idpManager.srdm.model.CreateFilterReqBlockConditionList](docs/CreateFilterReqBlockConditionList.md)
 - [idpManager.srdm.model.CreateFilterReqDetailConditionList](docs/CreateFilterReqDetailConditionList.md)
 - [idpManager.srdm.model.CreateFilterRsp](docs/CreateFilterRsp.md)
 - [idpManager.srdm.model.CreateGroupReq](docs/CreateGroupReq.md)
 - [idpManager.srdm.model.CreateGroupRsp](docs/CreateGroupRsp.md)
 - [idpManager.srdm.model.CreateScheduleSetReq](docs/CreateScheduleSetReq.md)
 - [idpManager.srdm.model.CreateScheduleSetReqJobList](docs/CreateScheduleSetReqJobList.md)
 - [idpManager.srdm.model.CreateScheduleSetRsp](docs/CreateScheduleSetRsp.md)
 - [idpManager.srdm.model.DeleteDeviceLogReq](docs/DeleteDeviceLogReq.md)
 - [idpManager.srdm.model.DeleteDeviceLogRsp](docs/DeleteDeviceLogRsp.md)
 - [idpManager.srdm.model.DeleteDeviceOperationLogReq](docs/DeleteDeviceOperationLogReq.md)
 - [idpManager.srdm.model.DeleteDeviceOperationLogRsp](docs/DeleteDeviceOperationLogRsp.md)
 - [idpManager.srdm.model.DeleteDomainOperationLogRsp](docs/DeleteDomainOperationLogRsp.md)
 - [idpManager.srdm.model.DeleteFilterReq](docs/DeleteFilterReq.md)
 - [idpManager.srdm.model.DeleteFilterRsp](docs/DeleteFilterRsp.md)
 - [idpManager.srdm.model.DeleteGroupOperationLogReq](docs/DeleteGroupOperationLogReq.md)
 - [idpManager.srdm.model.DeleteGroupOperationLogRsp](docs/DeleteGroupOperationLogRsp.md)
 - [idpManager.srdm.model.DeleteScheduleSetReq](docs/DeleteScheduleSetReq.md)
 - [idpManager.srdm.model.DeleteScheduleSetRsp](docs/DeleteScheduleSetRsp.md)
 - [idpManager.srdm.model.ExecuteChangeInputModeReq](docs/ExecuteChangeInputModeReq.md)
 - [idpManager.srdm.model.ExecuteChangeInputModeRsp](docs/ExecuteChangeInputModeRsp.md)
 - [idpManager.srdm.model.ExecuteManagePowerReq](docs/ExecuteManagePowerReq.md)
 - [idpManager.srdm.model.ExecuteManagePowerRsp](docs/ExecuteManagePowerRsp.md)
 - [idpManager.srdm.model.ExecuteUpdateInformationReq](docs/ExecuteUpdateInformationReq.md)
 - [idpManager.srdm.model.ExecuteUpdateInformationRsp](docs/ExecuteUpdateInformationRsp.md)
 - [idpManager.srdm.model.ExportDeviceDataHistoryReq](docs/ExportDeviceDataHistoryReq.md)
 - [idpManager.srdm.model.ExportDeviceDataHistoryRsp](docs/ExportDeviceDataHistoryRsp.md)
 - [idpManager.srdm.model.GetDeviceDetailReq](docs/GetDeviceDetailReq.md)
 - [idpManager.srdm.model.GetDeviceDetailRsp](docs/GetDeviceDetailRsp.md)
 - [idpManager.srdm.model.GetDeviceListReq](docs/GetDeviceListReq.md)
 - [idpManager.srdm.model.GetDeviceListReqOrderBy](docs/GetDeviceListReqOrderBy.md)
 - [idpManager.srdm.model.GetDeviceListReqSimpleFilters](docs/GetDeviceListReqSimpleFilters.md)
 - [idpManager.srdm.model.GetDeviceListRsp](docs/GetDeviceListRsp.md)
 - [idpManager.srdm.model.GetDeviceListRspDeviceList](docs/GetDeviceListRspDeviceList.md)
 - [idpManager.srdm.model.GetDeviceLogDetailReq](docs/GetDeviceLogDetailReq.md)
 - [idpManager.srdm.model.GetDeviceLogDetailRsp](docs/GetDeviceLogDetailRsp.md)
 - [idpManager.srdm.model.GetDeviceLogDetailRspItemList](docs/GetDeviceLogDetailRspItemList.md)
 - [idpManager.srdm.model.GetDeviceLogReq](docs/GetDeviceLogReq.md)
 - [idpManager.srdm.model.GetDeviceLogReqOrderBy](docs/GetDeviceLogReqOrderBy.md)
 - [idpManager.srdm.model.GetDeviceLogReqSimpleFilters](docs/GetDeviceLogReqSimpleFilters.md)
 - [idpManager.srdm.model.GetDeviceLogRsp](docs/GetDeviceLogRsp.md)
 - [idpManager.srdm.model.GetDeviceLogRspLogList](docs/GetDeviceLogRspLogList.md)
 - [idpManager.srdm.model.GetDeviceOperationLogDetailReq](docs/GetDeviceOperationLogDetailReq.md)
 - [idpManager.srdm.model.GetDeviceOperationLogDetailRsp](docs/GetDeviceOperationLogDetailRsp.md)
 - [idpManager.srdm.model.GetDeviceOperationLogReq](docs/GetDeviceOperationLogReq.md)
 - [idpManager.srdm.model.GetDeviceOperationLogReqOrderBy](docs/GetDeviceOperationLogReqOrderBy.md)
 - [idpManager.srdm.model.GetDeviceOperationLogRsp](docs/GetDeviceOperationLogRsp.md)
 - [idpManager.srdm.model.GetDeviceOperationLogRspLogList](docs/GetDeviceOperationLogRspLogList.md)
 - [idpManager.srdm.model.GetDeviceRegistrationInformationReq](docs/GetDeviceRegistrationInformationReq.md)
 - [idpManager.srdm.model.GetDeviceRegistrationInformationRsp](docs/GetDeviceRegistrationInformationRsp.md)
 - [idpManager.srdm.model.GetDomainOperationLogDetailReq](docs/GetDomainOperationLogDetailReq.md)
 - [idpManager.srdm.model.GetDomainOperationLogDetailRsp](docs/GetDomainOperationLogDetailRsp.md)
 - [idpManager.srdm.model.GetDomainOperationLogReq](docs/GetDomainOperationLogReq.md)
 - [idpManager.srdm.model.GetDomainOperationLogReqOrderBy](docs/GetDomainOperationLogReqOrderBy.md)
 - [idpManager.srdm.model.GetDomainOperationLogRsp](docs/GetDomainOperationLogRsp.md)
 - [idpManager.srdm.model.GetDomainOperationLogRspLogList](docs/GetDomainOperationLogRspLogList.md)
 - [idpManager.srdm.model.GetFilterRsp](docs/GetFilterRsp.md)
 - [idpManager.srdm.model.GetFilterRspFilter](docs/GetFilterRspFilter.md)
 - [idpManager.srdm.model.GetFilterRspFilterBlockConditionList](docs/GetFilterRspFilterBlockConditionList.md)
 - [idpManager.srdm.model.GetFilterRspFilterDetailConditionList](docs/GetFilterRspFilterDetailConditionList.md)
 - [idpManager.srdm.model.GetFilterRspFilterList](docs/GetFilterRspFilterList.md)
 - [idpManager.srdm.model.GetGroupOperationLogDetailReq](docs/GetGroupOperationLogDetailReq.md)
 - [idpManager.srdm.model.GetGroupOperationLogDetailRsp](docs/GetGroupOperationLogDetailRsp.md)
 - [idpManager.srdm.model.GetGroupOperationLogReq](docs/GetGroupOperationLogReq.md)
 - [idpManager.srdm.model.GetGroupOperationLogRsp](docs/GetGroupOperationLogRsp.md)
 - [idpManager.srdm.model.GetGroupOperationLogRspLogList](docs/GetGroupOperationLogRspLogList.md)
 - [idpManager.srdm.model.GetSRDMGroupListReq](docs/GetSRDMGroupListReq.md)
 - [idpManager.srdm.model.GetSRDMGroupListRsp](docs/GetSRDMGroupListRsp.md)
 - [idpManager.srdm.model.GetSRDMGroupListRspGroupList](docs/GetSRDMGroupListRspGroupList.md)
 - [idpManager.srdm.model.GetScheduleItemReq](docs/GetScheduleItemReq.md)
 - [idpManager.srdm.model.GetScheduleItemRsp](docs/GetScheduleItemRsp.md)
 - [idpManager.srdm.model.GetScheduleListReq](docs/GetScheduleListReq.md)
 - [idpManager.srdm.model.GetScheduleListRsp](docs/GetScheduleListRsp.md)
 - [idpManager.srdm.model.GetScheduleListRspScheduleList](docs/GetScheduleListRspScheduleList.md)
 - [idpManager.srdm.model.GetScheduleReq](docs/GetScheduleReq.md)
 - [idpManager.srdm.model.GetScheduleRsp](docs/GetScheduleRsp.md)
 - [idpManager.srdm.model.GetScheduleRspSchedule](docs/GetScheduleRspSchedule.md)
 - [idpManager.srdm.model.GetScheduleRspScheduleJobList](docs/GetScheduleRspScheduleJobList.md)
 - [idpManager.srdm.model.GetScheduleSetListRsp](docs/GetScheduleSetListRsp.md)
 - [idpManager.srdm.model.GetScheduleSetListRspScheduleSetList](docs/GetScheduleSetListRspScheduleSetList.md)
 - [idpManager.srdm.model.GetScheduleSetReq](docs/GetScheduleSetReq.md)
 - [idpManager.srdm.model.GetScheduleSetRsp](docs/GetScheduleSetRsp.md)
 - [idpManager.srdm.model.GetThemeSettingRsp](docs/GetThemeSettingRsp.md)
 - [idpManager.srdm.model.GetUnregisterDeviceResultReq](docs/GetUnregisterDeviceResultReq.md)
 - [idpManager.srdm.model.GetUnregisterDeviceResultRsp](docs/GetUnregisterDeviceResultRsp.md)
 - [idpManager.srdm.model.GetUnregisterDeviceResultRspCount](docs/GetUnregisterDeviceResultRspCount.md)
 - [idpManager.srdm.model.GetUnregisterDeviceResultRspErrorDeviceList](docs/GetUnregisterDeviceResultRspErrorDeviceList.md)
 - [idpManager.srdm.model.GetWebPageUrlReq](docs/GetWebPageUrlReq.md)
 - [idpManager.srdm.model.GetWebPageUrlRsp](docs/GetWebPageUrlRsp.md)
 - [idpManager.srdm.model.RegisterDeviceManuallyReq](docs/RegisterDeviceManuallyReq.md)
 - [idpManager.srdm.model.RegisterDeviceManuallyReqRegisterTargetList](docs/RegisterDeviceManuallyReqRegisterTargetList.md)
 - [idpManager.srdm.model.RegisterDeviceManuallyRsp](docs/RegisterDeviceManuallyRsp.md)
 - [idpManager.srdm.model.RegisterDeviceManuallyRspCount](docs/RegisterDeviceManuallyRspCount.md)
 - [idpManager.srdm.model.RegisterDeviceManuallyRspRegisterErrorList](docs/RegisterDeviceManuallyRspRegisterErrorList.md)
 - [idpManager.srdm.model.RemoveGroupReq](docs/RemoveGroupReq.md)
 - [idpManager.srdm.model.RemoveGroupRsp](docs/RemoveGroupRsp.md)
 - [idpManager.srdm.model.SetFilterReq](docs/SetFilterReq.md)
 - [idpManager.srdm.model.SetFilterRsp](docs/SetFilterRsp.md)
 - [idpManager.srdm.model.SetScheduleReq](docs/SetScheduleReq.md)
 - [idpManager.srdm.model.SetScheduleReqScheduleList](docs/SetScheduleReqScheduleList.md)
 - [idpManager.srdm.model.SetScheduleRsp](docs/SetScheduleRsp.md)
 - [idpManager.srdm.model.SetThemeSettingReq](docs/SetThemeSettingReq.md)
 - [idpManager.srdm.model.SetThemeSettingRsp](docs/SetThemeSettingRsp.md)
 - [idpManager.srdm.model.StartDeleteLogReq](docs/StartDeleteLogReq.md)
 - [idpManager.srdm.model.StartDeleteLogRsp](docs/StartDeleteLogRsp.md)
 - [idpManager.srdm.model.UnregisterDeviceReq](docs/UnregisterDeviceReq.md)
 - [idpManager.srdm.model.UnregisterDeviceRsp](docs/UnregisterDeviceRsp.md)
 - [idpManager.srdm.model.UpdateDeviceRegistrationInformationReq](docs/UpdateDeviceRegistrationInformationReq.md)
 - [idpManager.srdm.model.UpdateDeviceRegistrationInformationRsp](docs/UpdateDeviceRegistrationInformationRsp.md)
 - [idpManager.srdm.model.UpdateRelatedGroupReq](docs/UpdateRelatedGroupReq.md)
 - [idpManager.srdm.model.UpdateRelatedGroupRsp](docs/UpdateRelatedGroupRsp.md)
 - [idpManager.srdm.model.UpdateScheduleItemReq](docs/UpdateScheduleItemReq.md)
 - [idpManager.srdm.model.UpdateScheduleItemRsp](docs/UpdateScheduleItemRsp.md)
 - [idpManager.srdm.model.UpdateScheduleReq](docs/UpdateScheduleReq.md)
 - [idpManager.srdm.model.UpdateScheduleReqSchedule](docs/UpdateScheduleReqSchedule.md)
 - [idpManager.srdm.model.UpdateScheduleReqScheduleJobList](docs/UpdateScheduleReqScheduleJobList.md)
 - [idpManager.srdm.model.UpdateScheduleRsp](docs/UpdateScheduleRsp.md)
 - [idpManager.srdm.model.UpdateScheduleSetReq](docs/UpdateScheduleSetReq.md)
 - [idpManager.srdm.model.UpdateScheduleSetRsp](docs/UpdateScheduleSetRsp.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="cookieAuth"></a>
### cookieAuth

- **Type**: API key
- **API key parameter name**: sid_randomString
- **Location**: 

