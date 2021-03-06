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
package idpManager.srdm.model

import idpManager.srdm.model.CommonRsp

import kotlinx.serialization.*
import kotlinx.serialization.internal.CommonEnumSerializer

/**
 * getDeviceDetail reponse parameter.
 * @param common 
 * @param deviceId deviceId
 * @param modelName モデル名<br>登録後、情報取得未実行時は、空文字
 * @param serialNumber シリアル番号<br>登録後、情報取得未実行時は、空文字
 * @param friendlyName 名称
 * @param powerStatus モニター電源状態<br>登録後、情報取得未実行時は、空文字
 * @param createTimestamp 登録日時<br>登録日時をtimestampで返す。
 * @param updateTimestamp 更新日時<br>情報取得日時をtimestampで返す。
 * @param imputMode 入力モード<br>登録後、情報取得未実行時は、空文字
 * @param displaySize 画面サイズ<br>登録後、情報取得未実行時は、空文字
 * @param colorMode カラーモード<br>登録後、情報取得未実行時は、空文字
 * @param brightness 明るさ<br>登録後、情報取得未実行時は、-1
 * @param volume 音量
 * @param mute ミュート状態<br>登録後、情報取得未実行時は、空文字
 * @param direction 画面方向<br>登録後、情報取得未実行時は、空文字
 * @param temperatureSensorStatus 温度センサーの状態<br>登録後、情報取得未実行時は、-1
 * @param temperature 温度センサーの値<br>全てのセンサーの値を返す。<br>登録後、情報取得未実行時は、-1
 * @param ipAddress IPアドレス
 * @param communicationStatus 通信状態<br> <table border=\"1\">   <tr><th>コード</th><th>説明</th></tr>   <tr><td>0000</td><td>正常（デバイスと通信でき、正常応答を受信）</td></tr>   <tr><td>0301</td><td>応答なし</td></tr>   <tr><td>0302</td><td>異常（デバイスと通信でき、異常応答を受信）</td></tr>   <tr><td>0303</td><td>デバイスの入れ替わり（IPアドレスを他のディスプレイデバイスで使用中）</td></tr>   <tr><td>0305</td><td>認証エラー（デバイスへのログイン失敗）</td></tr>   <tr><td>0306</td><td>異常（デバイスと通信できたが、ID情報取得失敗）</td></tr>   <tr><td>0310</td><td>通信エラー（プロトコルエラーや通信中の切断など）</td></tr>   <tr><td>0399</td><td>その他エラー</td></tr>   <tr><td>9999</td><td>通信未実行（デバイス登録直後から最初の情報取得結果を受信するまで）</td></tr> </table>
 */
@Serializable
data class GetDeviceDetailRsp (
    @SerialName(value = "common") val common: CommonRsp? = null,
    /* deviceId */
    @SerialName(value = "deviceId") val deviceId: kotlin.String? = null,
    /* モデル名<br>登録後、情報取得未実行時は、空文字 */
    @SerialName(value = "modelName") val modelName: kotlin.String? = null,
    /* シリアル番号<br>登録後、情報取得未実行時は、空文字 */
    @SerialName(value = "serialNumber") val serialNumber: kotlin.String? = null,
    /* 名称 */
    @SerialName(value = "friendlyName") val friendlyName: kotlin.String? = null,
    /* モニター電源状態<br>登録後、情報取得未実行時は、空文字 */
    @SerialName(value = "powerStatus") val powerStatus: GetDeviceDetailRsp.PowerStatus? = null,
    /* 登録日時<br>登録日時をtimestampで返す。 */
    @SerialName(value = "createTimestamp") val createTimestamp: kotlin.Long? = null,
    /* 更新日時<br>情報取得日時をtimestampで返す。 */
    @SerialName(value = "updateTimestamp") val updateTimestamp: kotlin.Long? = null,
    /* 入力モード<br>登録後、情報取得未実行時は、空文字 */
    @SerialName(value = "imputMode") val imputMode: GetDeviceDetailRsp.ImputMode? = null,
    /* 画面サイズ<br>登録後、情報取得未実行時は、空文字 */
    @SerialName(value = "displaySize") val displaySize: GetDeviceDetailRsp.DisplaySize? = null,
    /* カラーモード<br>登録後、情報取得未実行時は、空文字 */
    @SerialName(value = "colorMode") val colorMode: GetDeviceDetailRsp.ColorMode? = null,
    /* 明るさ<br>登録後、情報取得未実行時は、-1 */
    @SerialName(value = "brightness") val brightness: kotlin.Int? = null,
    /* 音量 */
    @SerialName(value = "volume") val volume: kotlin.Int? = null,
    /* ミュート状態<br>登録後、情報取得未実行時は、空文字 */
    @SerialName(value = "mute") val mute: GetDeviceDetailRsp.Mute? = null,
    /* 画面方向<br>登録後、情報取得未実行時は、空文字 */
    @SerialName(value = "direction") val direction: GetDeviceDetailRsp.Direction? = null,
    /* 温度センサーの状態<br>登録後、情報取得未実行時は、-1 */
    @SerialName(value = "temperatureSensorStatus") val temperatureSensorStatus: kotlin.Int? = null,
    /* 温度センサーの値<br>全てのセンサーの値を返す。<br>登録後、情報取得未実行時は、-1 */
    @SerialName(value = "temperature") val temperature: kotlin.collections.List<kotlin.Int>? = null,
    /* IPアドレス */
    @SerialName(value = "ipAddress") val ipAddress: kotlin.String? = null,
    /* 通信状態<br> <table border=\"1\">   <tr><th>コード</th><th>説明</th></tr>   <tr><td>0000</td><td>正常（デバイスと通信でき、正常応答を受信）</td></tr>   <tr><td>0301</td><td>応答なし</td></tr>   <tr><td>0302</td><td>異常（デバイスと通信でき、異常応答を受信）</td></tr>   <tr><td>0303</td><td>デバイスの入れ替わり（IPアドレスを他のディスプレイデバイスで使用中）</td></tr>   <tr><td>0305</td><td>認証エラー（デバイスへのログイン失敗）</td></tr>   <tr><td>0306</td><td>異常（デバイスと通信できたが、ID情報取得失敗）</td></tr>   <tr><td>0310</td><td>通信エラー（プロトコルエラーや通信中の切断など）</td></tr>   <tr><td>0399</td><td>その他エラー</td></tr>   <tr><td>9999</td><td>通信未実行（デバイス登録直後から最初の情報取得結果を受信するまで）</td></tr> </table> */
    @SerialName(value = "communicationStatus") val communicationStatus: kotlin.String? = null
) {

    /**
    * モニター電源状態<br>登録後、情報取得未実行時は、空文字
    * Values: sTANDBY,nORMAL,nOSIGNAL
    */
    @Serializable(with = PowerStatus.Serializer::class)
    enum class PowerStatus(val value: kotlin.String){
        sTANDBY("STANDBY"),
        nORMAL("NORMAL"),
        nOSIGNAL("NOSIGNAL");

        object Serializer : CommonEnumSerializer<PowerStatus>("PowerStatus", values(), values().map { it.value.toString() }.toTypedArray())
    }
    /**
    * 入力モード<br>登録後、情報取得未実行時は、空文字
    * Values: dVIMinusD,dMinusSUB1,dMinusSUB2,dMinusSUB3,hDMIMinusAV,hDMI1,uSB,hDMI2,dMinusPORT1,hDMI3,oPTION,dMinusPORT2,aPPLICATION,tV
    */
    @Serializable(with = ImputMode.Serializer::class)
    enum class ImputMode(val value: kotlin.String){
        dVIMinusD("DVI-D"),
        dMinusSUB1("D-SUB1"),
        dMinusSUB2("D-SUB2"),
        dMinusSUB3("D-SUB3"),
        hDMIMinusAV("HDMI-AV"),
        hDMI1("HDMI1"),
        uSB("USB"),
        hDMI2("HDMI2"),
        dMinusPORT1("D-PORT1"),
        hDMI3("HDMI3"),
        oPTION("OPTION"),
        dMinusPORT2("D-PORT2"),
        aPPLICATION("APPLICATION"),
        tV("TV");

        object Serializer : CommonEnumSerializer<ImputMode>("ImputMode", values(), values().map { it.value.toString() }.toTypedArray())
    }
    /**
    * 画面サイズ<br>登録後、情報取得未実行時は、空文字
    * Values: wIDE,nORMAL,dOT,zOOM1,zOOM2,nORMAL
    */
    @Serializable(with = DisplaySize.Serializer::class)
    enum class DisplaySize(val value: kotlin.String){
        wIDE("WIDE"),
        nORMAL("NORMAL"),
        dOT("DOT"),
        zOOM1("ZOOM1"),
        zOOM2("ZOOM2"),
        nORMAL("NORMAL");

        object Serializer : CommonEnumSerializer<DisplaySize>("DisplaySize", values(), values().map { it.value.toString() }.toTypedArray())
    }
    /**
    * カラーモード<br>登録後、情報取得未実行時は、空文字
    * Values: sTD,vIVID,sRGB,hIGHMinusILLUM,pC,mOVIE,tHRU,cUSTOM,aV,uSER
    */
    @Serializable(with = ColorMode.Serializer::class)
    enum class ColorMode(val value: kotlin.String){
        sTD("STD"),
        vIVID("VIVID"),
        sRGB("SRGB"),
        hIGHMinusILLUM("HIGH-ILLUM"),
        pC("PC"),
        mOVIE("MOVIE"),
        tHRU("THRU"),
        cUSTOM("CUSTOM"),
        aV("AV"),
        uSER("USER");

        object Serializer : CommonEnumSerializer<ColorMode>("ColorMode", values(), values().map { it.value.toString() }.toTypedArray())
    }
    /**
    * ミュート状態<br>登録後、情報取得未実行時は、空文字
    * Values: `true`,`false`
    */
    @Serializable(with = Mute.Serializer::class)
    enum class Mute(val value: kotlin.String){
        `true`("true"),
        `false`("false");

        object Serializer : CommonEnumSerializer<Mute>("Mute", values(), values().map { it.value.toString() }.toTypedArray())
    }
    /**
    * 画面方向<br>登録後、情報取得未実行時は、空文字
    * Values: lANDSCAPE,pORTRAIT,fACEUP,fACEDOWN
    */
    @Serializable(with = Direction.Serializer::class)
    enum class Direction(val value: kotlin.String){
        lANDSCAPE("LANDSCAPE"),
        pORTRAIT("PORTRAIT"),
        fACEUP("FACEUP"),
        fACEDOWN("FACEDOWN");

        object Serializer : CommonEnumSerializer<Direction>("Direction", values(), values().map { it.value.toString() }.toTypedArray())
    }
}

