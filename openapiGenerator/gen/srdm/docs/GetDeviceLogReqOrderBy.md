
# GetDeviceLogReqOrderBy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **kotlin.String** | ソートキー&lt;br&gt; 指定可能な項目は、以下の通り。 - ソートキー一覧   &lt;table border&#x3D;\&quot;1\&quot;&gt;     &lt;tr&gt;&lt;th&gt;キー&lt;/th&gt;&lt;th&gt;説明&lt;/th&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;kind&lt;/td&gt;&lt;td&gt;種類(*1)&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;modelName&lt;/td&gt;&lt;td&gt;モデル名&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;serialNumber&lt;/td&gt;&lt;td&gt;シリアル番号&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;ipAddress&lt;/td&gt;&lt;td&gt;IPアドレス&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;friendlyName&lt;/td&gt;&lt;td&gt;名称&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;timestamp&lt;/td&gt;&lt;td&gt;日時&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;command&lt;/td&gt;&lt;td&gt;コマンド内容 (*2)&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;code&lt;/td&gt;&lt;td&gt;コマンド結果コード&lt;/td&gt;&lt;/tr&gt;   &lt;/table&gt;  *1)「種類」のソートは、値を文字コードでソートする&lt;br&gt; *2)「操作内容」のソートは、「SRDM_IDP_Data_Model_Definition.xlsx」に記載されている操作内容の値を文字コードでソートする&lt;br&gt; ●チェック内容   - 指定値以外は、エラー | 
**order** | [**inline**](#OrderEnum) | ソート順&lt;br&gt;   - ascending:昇順   - descending:降順  ●チェック内容   - 指定値以外は、エラー | 


<a name="OrderEnum"></a>
## Enum: order
Name | Value
---- | -----
order | ascending, descending



