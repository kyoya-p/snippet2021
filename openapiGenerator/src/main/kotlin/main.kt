import idpManager.srdm.api.BasicFunctionsApi

fun main() {
    val basicApi = BasicFunctionsApi()

    val dev1 = idpManager.srdm.model.RegisterDeviceManuallyReqRegisterTargetList
    (
        target = "10.36.102.184",
        port = 8086,
        user = "",
        password = ""
    )


    val registerDeviceManuallyReq = idpManager.srdm.model.RegisterDeviceManuallyReq
    //basicApi.deviceRegisterDeviceManuallyPost()
}
