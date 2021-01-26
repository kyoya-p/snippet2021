import idpManager.srdm.api.BasicFunctionsApi
import idpManager.srdm.model.RegisterDeviceManuallyReqRegisterTargetList
fun main() {
    val basicApi = BasicFunctionsApi()

    val dev1 = RegisterDeviceManuallyReqRegisterTargetList(
        "10.36.102.184",
        8086,
        "",
        "",
    )


    val registerDeviceManuallyReq = idpManager.srdm.model.RegisterDeviceManuallyReq
    //basicApi.deviceRegisterDeviceManuallyPost()
}
