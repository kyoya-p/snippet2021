
# GetDeviceListRspDeviceList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deviceId** | **kotlin.String** | deviceId |  [optional]
**modelName** | **kotlin.String** | モデル名&lt;br&gt;登録後、情報取得未実行時は、空文字 |  [optional]
**serialNumber** | **kotlin.String** | シリアル番号&lt;br&gt;登録後、情報取得未実行時は、空文字 |  [optional]
**ipAddress** | **kotlin.String** | IPアドレス |  [optional]
**friendlyName** | **kotlin.String** | 名称 |  [optional]
**communicationStatus** | **kotlin.String** | 通信状態&lt;br&gt; &lt;table border&#x3D;\&quot;1\&quot;&gt;   &lt;tr&gt;&lt;th&gt;コード&lt;/th&gt;&lt;th&gt;説明&lt;/th&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;0000&lt;/td&gt;&lt;td&gt;正常（デバイスと通信でき、正常応答を受信）&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;0301&lt;/td&gt;&lt;td&gt;応答なし&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;0302&lt;/td&gt;&lt;td&gt;異常（デバイスと通信でき、異常応答を受信）&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;0303&lt;/td&gt;&lt;td&gt;デバイスの入れ替わり（IPアドレスを他のディスプレイデバイスで使用中）&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;0305&lt;/td&gt;&lt;td&gt;認証エラー（デバイスへのログイン失敗）&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;0306&lt;/td&gt;&lt;td&gt;異常（デバイスと通信できたが、ID情報取得失敗）&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;0310&lt;/td&gt;&lt;td&gt;通信エラー（プロトコルエラーや通信中の切断など）&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;0399&lt;/td&gt;&lt;td&gt;その他エラー&lt;/td&gt;&lt;/tr&gt;   &lt;tr&gt;&lt;td&gt;9999&lt;/td&gt;&lt;td&gt;通信未実行（デバイス登録直後から最初の情報取得結果を受信するまで）&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; |  [optional]
**powerStatus** | [**inline**](#PowerStatusEnum) | モニター電源状態&lt;br&gt;登録後、情報取得未実行時は、空文字 |  [optional]


<a name="PowerStatusEnum"></a>
## Enum: powerStatus
Name | Value
---- | -----
powerStatus | STANDBY, NORMAL, NOSIGNAL



