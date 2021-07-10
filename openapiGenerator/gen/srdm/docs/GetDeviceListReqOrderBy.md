
# GetDeviceListReqOrderBy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **kotlin.String** | ソートキー&lt;br&gt; 指定可能な項目は、以下の通り。 - ソートキー一覧   &lt;table border&#x3D;\&quot;1\&quot;&gt;     &lt;tr&gt;&lt;th&gt;キー&lt;/th&gt;&lt;th&gt;説明&lt;/th&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;modelName&lt;/td&gt;&lt;td&gt;モデル名&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;serialNumber&lt;/td&gt;&lt;td&gt;シリアル番号&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;ipAddress&lt;/td&gt;&lt;td&gt;IPアドレス&lt;br&gt;IPアドレスを数値化した値でソート&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;friendlyName&lt;/td&gt;&lt;td&gt;名称&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;powerStatus&lt;/td&gt;&lt;td&gt;電源状態(*1)&lt;/td&gt;&lt;/tr&gt;     &lt;tr&gt;&lt;td&gt;communicationStatus&lt;/td&gt;&lt;td&gt;通信状態(*2)&lt;/td&gt;&lt;/tr&gt;   &lt;/table&gt;    *1)電源状態の優先順位は、以下の通りとする。       &lt;table border&#x3D;\&quot;1\&quot;&gt;         &lt;tr&gt;&lt;th&gt;優先順位&lt;/th&gt;&lt;th&gt;値&lt;/th&gt;&lt;/tr&gt;         &lt;tr&gt;&lt;td&gt;1&lt;/td&gt;&lt;td&gt;STANDBY&lt;/td&gt;&lt;/tr&gt;         &lt;tr&gt;&lt;td&gt;2&lt;/td&gt;&lt;td&gt;NORMAL&lt;/td&gt;&lt;/tr&gt;         &lt;tr&gt;&lt;td&gt;3&lt;/td&gt;&lt;td&gt;NOSIGNAL&lt;/td&gt;&lt;/tr&gt;         &lt;tr&gt;&lt;td&gt;4&lt;/td&gt;&lt;td&gt;UNSELECTED&lt;/td&gt;&lt;/tr&gt;         &lt;tr&gt;&lt;td&gt;5&lt;/td&gt;&lt;td&gt;ERR&lt;/td&gt;&lt;/tr&gt;         &lt;tr&gt;&lt;td&gt;6&lt;/td&gt;&lt;td&gt;UNKNOWN&lt;/td&gt;&lt;/tr&gt;       &lt;/table&gt;       「ソート順」に\&quot;ascending\&quot;を指定した場合、優先順位の値が小さいものから順に表示する。&lt;br&gt;    *2)通信状態は、エラーコード順にソートする。&lt;br&gt;  ●チェック内容   - 指定値以外は、エラー | 
**order** | [**inline**](#OrderEnum) | ソート順&lt;br&gt;   - ascending:昇順   - descending:降順  ●チェック内容   - 指定値以外は、エラー | 


<a name="OrderEnum"></a>
## Enum: order
Name | Value
---- | -----
order | ascending, descending



