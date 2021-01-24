
# GetDeviceDetailRsp

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**common** | [**CommonRsp**](CommonRsp.md) |  |  [optional]
**deviceId** | **kotlin.String** | deviceId |  [optional]
**modelName** | **kotlin.String** | モデル名&lt;br&gt;登録後、情報取得未実行時は、空文字 |  [optional]
**serialNumber** | **kotlin.String** | シリアル番号&lt;br&gt;登録後、情報取得未実行時は、空文字 |  [optional]
**friendlyName** | **kotlin.String** | 名称 |  [optional]
**powerStatus** | [**inline**](#PowerStatusEnum) | モニター電源状態&lt;br&gt;登録後、情報取得未実行時は、空文字 |  [optional]
**createTimestamp** | **kotlin.Long** | 登録日時&lt;br&gt;登録日時をtimestampで返す。 |  [optional]
**updateTimestamp** | **kotlin.Long** | 更新日時&lt;br&gt;情報取得日時をtimestampで返す。 |  [optional]
**imputMode** | [**inline**](#ImputModeEnum) | 入力モード&lt;br&gt;登録後、情報取得未実行時は、空文字 |  [optional]
**displaySize** | [**inline**](#DisplaySizeEnum) | 画面サイズ&lt;br&gt;登録後、情報取得未実行時は、空文字 |  [optional]
**colorMode** | [**inline**](#ColorModeEnum) | カラーモード&lt;br&gt;登録後、情報取得未実行時は、空文字 |  [optional]
**brightness** | **kotlin.Int** | 明るさ&lt;br&gt;登録後、情報取得未実行時は、-1 |  [optional]
**volume** | **kotlin.Int** | 音量 |  [optional]
**mute** | [**inline**](#MuteEnum) | ミュート状態&lt;br&gt;登録後、情報取得未実行時は、空文字 |  [optional]
**direction** | [**inline**](#DirectionEnum) | 画面方向&lt;br&gt;登録後、情報取得未実行時は、空文字 |  [optional]
**temperatureSensorStatus** | **kotlin.Int** | 温度センサーの状態&lt;br&gt;登録後、情報取得未実行時は、-1 |  [optional]
**temperature** | **kotlin.collections.List&lt;kotlin.Int&gt;** | 温度センサーの値&lt;br&gt;全てのセンサーの値を返す。&lt;br&gt;登録後、情報取得未実行時は、-1 |  [optional]
**ipAddress** | **kotlin.String** | IPアドレス |  [optional]
**communicationStatus** | **kotlin.String** | 通信状態&lt;br&gt; &lt;table border&#x3D;\&quot;1\&quot;&gt;   &lt;tr&gt;&lt;th&gt;コード&lt;/th&gt;&lt;th&gt;説明&lt;/th&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;0000&lt;/td&gt;&lt;td&gt;正常（デバイスと通信でき、正常応答を受信）&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;0301&lt;/td&gt;&lt;td&gt;応答なし&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;0302&lt;/td&gt;&lt;td&gt;異常（デバイスと通信でき、異常応答を受信）&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;0303&lt;/td&gt;&lt;td&gt;デバイスの入れ替わり（IPアドレスを他のディスプレイデバイスで使用中）&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;0305&lt;/td&gt;&lt;td&gt;認証エラー（デバイスへのログイン失敗）&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;0306&lt;/td&gt;&lt;td&gt;異常（デバイスと通信できたが、ID情報取得失敗）&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;0310&lt;/td&gt;&lt;td&gt;通信エラー（プロトコルエラーや通信中の切断など）&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;0399&lt;/td&gt;&lt;td&gt;その他エラー&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;9999&lt;/td&gt;&lt;td&gt;通信未実行（デバイス登録直後から最初の情報取得結果を受信するまで）&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; |  [optional]


<a name="PowerStatusEnum"></a>
## Enum: powerStatus
Name | Value
---- | -----
powerStatus | STANDBY, NORMAL, NOSIGNAL


<a name="ImputModeEnum"></a>
## Enum: imputMode
Name | Value
---- | -----
imputMode | DVI-D, D-SUB1, D-SUB2, D-SUB3, HDMI-AV, HDMI1, USB, HDMI2, D-PORT1, HDMI3, OPTION, D-PORT2, APPLICATION, TV


<a name="DisplaySizeEnum"></a>
## Enum: displaySize
Name | Value
---- | -----
displaySize | WIDE, NORMAL, DOT, ZOOM1, ZOOM2, NORMAL


<a name="ColorModeEnum"></a>
## Enum: colorMode
Name | Value
---- | -----
colorMode | STD, VIVID, SRGB, HIGH-ILLUM, PC, MOVIE, THRU, CUSTOM, AV, USER


<a name="MuteEnum"></a>
## Enum: mute
Name | Value
---- | -----
mute | true, false


<a name="DirectionEnum"></a>
## Enum: direction
Name | Value
---- | -----
direction | LANDSCAPE, PORTRAIT, FACEUP, FACEDOWN



