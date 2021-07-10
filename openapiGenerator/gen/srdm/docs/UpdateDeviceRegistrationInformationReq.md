
# UpdateDeviceRegistrationInformationReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deviceId** | **kotlin.String** | 対象のdeviceId&lt;br&gt; ●チェック内容   - null、空文字はエラー | 
**targetAddress** | **kotlin.String** | ターゲットアドレス（IPアドレス）&lt;br&gt; ●チェック内容   - null、空文字はエラー   - 以下の文字以外は、エラー     + アルファベット大文字（”A”～”Z”）     + アルファベット小文字（”a”～”z”）     + 数字（”0”～”9”）     + ハイフン（”-”）     + ピリオド（”.”） | 
**port** | **kotlin.Int** | ポート&lt;br&gt; ●チェック内容   - 数値以外は、エラー | 
**userName** | **kotlin.String** | ユーザ名&lt;br&gt; ●チェック内容   - 空文字は、許可   - nullは、エラー   - 以下の文字以外は、エラー     + アルファベット大文字（”A”～”Z”）     + アルファベット小文字（”a”～”z”）     + 数字（”0”～”9”）     + ハイフン（”-”）     + アンダースコア（”_”） | 
**changePassword** | [**inline**](#ChangePasswordEnum) | パスワードの変更有無を指定。   - true：パスワード変更有   - false：パスワード変更なし  ●チェック内容   - true/false以外は、エラー | 
**friendlyName** | **kotlin.String** | 名称&lt;br&gt; ●チェック内容   - 空文字は、許可   - nullは、エラー   - マルチバイト文字含め、印刷可能な文字は指定可能 | 
**groupId** | **kotlin.String** | 操作実施グループのgroupId&lt;br&gt; groupIdを指定した場合、指定されたgroupIdのグループ操作ログに記録する。&lt;br&gt; null、空文字の場合、groupIdが指定されていないものとし、グループ操作ログの記録は行わない。&lt;br&gt; |  [optional]
**password** | **kotlin.String** | パスワード&lt;br&gt; changePasswordが\&quot;false\&quot;の場合、本パラメータの内容チェックを行わず、参照もしない。&lt;br&gt; changePasswordが\&quot;true\&quot;の場合、「●チェック内容」に記載のチェックを実施する。&lt;br&gt; ●チェック内容   - 空文字は、許可   - nullは、エラー   - 以下の文字以外は、エラー     + アルファベット大文字（”A”～”Z”）     + アルファベット小文字（”a”～”z”）     + 数字（”0”～”9”）     + ハイフン（”-”）     + アンダースコア（”_”） |  [optional]


<a name="ChangePasswordEnum"></a>
## Enum: changePassword
Name | Value
---- | -----
changePassword | true, false



