
# GetDeviceLogReqSimpleFilters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **kotlin.String** | フィルターキー&lt;br&gt; 指定可能な項目は、以下の通り。 - フィルターキー一覧   &lt;table border&#x3D;\&quot;1\&quot;&gt;     &lt;tr&gt;&lt;th&gt;キー&lt;/th&gt;&lt;th&gt;説明&lt;/th&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;kind&lt;/td&gt;&lt;td&gt;種類&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;modelName&lt;/td&gt;&lt;td&gt;モデル名&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;serialNumber&lt;/td&gt;&lt;td&gt;シリアル番号&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;ipAddress&lt;/td&gt;&lt;td&gt;IPアドレス&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;friendlyName&lt;/td&gt;&lt;td&gt;名称&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;command&lt;/td&gt;&lt;td&gt;コマンド内容&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;code&lt;/td&gt;&lt;td&gt;コマンド結果コード&lt;/td&gt;&lt;/tr&gt;   &lt;/table&gt;  ●チェック内容   - 指定値以外は、エラー | 
**value** | **kotlin.String** | フィルタリング対象文字列&lt;br&gt; 各フィルターキーで指定可能な文字列は、以下の通り。 - フィルタリング対象文字列   &lt;table border&#x3D;\&quot;1\&quot;&gt;     &lt;tr&gt;&lt;th&gt;キー&lt;/th&gt;&lt;th&gt;対象文字列&lt;/th&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;kind&lt;/td&gt;&lt;td&gt;次のいずれかの値を指定&lt;br&gt;information, error&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;modelName&lt;/td&gt;&lt;td&gt;入力値を設定&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;serialNumber&lt;/td&gt;&lt;td&gt;入力値を設定&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;ipAddress&lt;/td&gt;&lt;td&gt;入力値を設定&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;friendlyName&lt;/td&gt;&lt;td&gt;入力値を設定&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;command&lt;/td&gt;&lt;td&gt;「SRDM_IDP_Data_Model_Definition.xlsx」に記載されている操作内容のいずれかを指定&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;code&lt;/td&gt;&lt;td&gt;入力値を設定&lt;/td&gt;&lt;/tr&gt;   &lt;/table&gt;  ●チェック内容   - modelName, serialNumber, ipAddress, friendlyName, code     + null、空文字は、エラー     + マルチバイト文字含め、印刷可能な文字は指定可能     + 空白のみは、許可   - kind, command     + 指定値以外は、エラー | 



