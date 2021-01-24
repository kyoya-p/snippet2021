
# RegisterDeviceManuallyReqRegisterTargetList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**targetAddress** | **kotlin.String** | ターゲットアドレス（IPアドレス）&lt;br&gt; ●チェック内容   - null、空文字はエラー   - 以下の文字以外は、エラー     + アルファベット大文字（”A”～”Z”）     + アルファベット小文字（”a”～”z”）     + 数字（”0”～”9”）     + ハイフン（”-”）     + ピリオド（”.”） | 
**port** | **kotlin.Int** | ポート&lt;br&gt; ●チェック内容   - 数値以外は、エラー | 
**userName** | **kotlin.String** | ユーザ名&lt;br&gt; ●チェック内容   - 空文字は、許可   - nullは、エラー   - 以下の文字以外は、エラー     + アルファベット大文字（”A”～”Z”）     + アルファベット小文字（”a”～”z”）     + 数字（”0”～”9”）     + ハイフン（”-”）     + アンダースコア（”_”） | 
**password** | **kotlin.String** | パスワード&lt;br&gt; ●チェック内容   - 空文字は、許可   - nullは、エラー   - 以下の文字以外は、エラー     + アルファベット大文字（”A”～”Z”）     + アルファベット小文字（”a”～”z”）     + 数字（”0”～”9”）     + ハイフン（”-”）     + アンダースコア（”_”） | 
**friendlyName** | **kotlin.String** | 名称&lt;br&gt; ●チェック内容 - 空文字は、許可 - nullは、エラー - マルチバイト文字含め、印刷可能な文字は指定可能 |  [optional]



