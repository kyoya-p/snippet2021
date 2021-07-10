
# CommonRspErrorList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errorCode** | **kotlin.String** | エラーコード   - エラーコード一覧     &lt;table border&#x3D;\&quot;1\&quot;&gt;       &lt;tr&gt;&lt;th&gt;エラーコード&lt;/th&gt;&lt;th&gt;説明&lt;/th&gt;&lt;/tr&gt;       &lt;tr&gt;&lt;td&gt;E0001&lt;/td&gt;&lt;td&gt;DBアクセスエラー&lt;/td&gt;&lt;/tr&gt;       &lt;tr&gt;&lt;td&gt;E0004&lt;/td&gt;&lt;td&gt;JSONパースエラー&lt;/td&gt;&lt;/tr&gt;       &lt;tr&gt;&lt;td&gt;E0011&lt;/td&gt;&lt;td&gt;パラメータの必須チェックエラー&lt;/td&gt;&lt;/tr&gt;       &lt;tr&gt;&lt;td&gt;E0014&lt;/td&gt;&lt;td&gt;パラメータの書式チェックエラー&lt;/td&gt;&lt;/tr&gt;       &lt;tr&gt;&lt;td&gt;E0019&lt;/td&gt;&lt;td&gt;対象のインスタンス（groupやdeviceなど）が存在しない場合&lt;/td&gt;&lt;/tr&gt;       &lt;tr&gt;&lt;td&gt;E0021&lt;/td&gt;&lt;td&gt;無効なsessionId&lt;/td&gt;&lt;/tr&gt;       &lt;tr&gt;&lt;td&gt;E0024&lt;/td&gt;&lt;td&gt;権限なしエラー&lt;/td&gt;&lt;/tr&gt;       &lt;tr&gt;&lt;td&gt;E0026&lt;/td&gt;&lt;td&gt;セッションタイムアウトエラー又はディスク容量不足エラー&lt;/td&gt;&lt;/tr&gt;       &lt;tr&gt;&lt;td&gt;E0050&lt;/td&gt;&lt;td&gt;指定グループ管理外エラー&lt;/td&gt;&lt;/tr&gt;     &lt;/table&gt; |  [optional]
**errorField** | **kotlin.String** | エラーが発生したパラメータフィールド |  [optional]
**errorValue** | **kotlin.String** | エラーとなった値 |  [optional]
**errorMessage** | **kotlin.String** | エラーメッセージ（人間が理解可能なテキスト） |  [optional]



