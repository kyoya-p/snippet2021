import idpManager.srdm.api.BasicFunctionsApi

fun main() {
    val registerDeviceManuallyReq = idpManager.srdm.model.RegisterDeviceManuallyReq()
    val basicAPi = BasicFunctionsApi()
    basicAPi.deviceRegisterDeviceManuallyPost()
}