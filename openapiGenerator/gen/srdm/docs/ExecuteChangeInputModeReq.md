
# ExecuteChangeInputModeReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**command** | **kotlin.String** | 実行コマンド   - 実行コマンド一覧     &lt;table border&#x3D;\&quot;1\&quot;&gt;       &lt;tr&gt;&lt;th&gt;コマンド&lt;/th&gt;&lt;th&gt;説明&lt;/th&gt;&lt;/tr&gt;       &lt;tr&gt;&lt;td&gt;toggleChange&lt;/td&gt;&lt;td&gt;トグルで入力切替&lt;/td&gt;&lt;/tr&gt;       &lt;tr&gt;&lt;td&gt;DVI-D&lt;/td&gt;&lt;td&gt;DVI-D&lt;/td&gt;&lt;/tr&gt;       &lt;tr&gt;&lt;td&gt;D-SUB1&lt;/td&gt;&lt;td&gt;D-SUB[RGB]&lt;/td&gt;&lt;/tr&gt;       &lt;tr&gt;&lt;td&gt;D-SUB2&lt;/td&gt;&lt;td&gt;D-SUB[COMPONENT]&lt;/td&gt;&lt;/tr&gt;       &lt;tr&gt;&lt;td&gt;D-SUB3&lt;/td&gt;&lt;td&gt;D-SUB[VIDEO]&lt;/td&gt;&lt;/tr&gt;       &lt;tr&gt;&lt;td&gt;HDMI-AV&lt;/td&gt;&lt;td&gt;HDMI[AV]&lt;/td&gt;&lt;/tr&gt;       &lt;tr&gt;&lt;td&gt;HDMI1&lt;/td&gt;&lt;td&gt;HDMI1 (or HDMI[PC])&lt;/td&gt;&lt;/tr&gt;       &lt;tr&gt;&lt;td&gt;USB&lt;/td&gt;&lt;td&gt;USB (or Media Player)&lt;/td&gt;&lt;/tr&gt;       &lt;tr&gt;&lt;td&gt;HDMI2&lt;/td&gt;&lt;td&gt;HDMI2&lt;/td&gt;&lt;/tr&gt;       &lt;tr&gt;&lt;td&gt;D-PORT1&lt;/td&gt;&lt;td&gt;DisplayPort1&lt;/td&gt;&lt;/tr&gt;       &lt;tr&gt;&lt;td&gt;HDMI3&lt;/td&gt;&lt;td&gt;HDMI3&lt;/td&gt;&lt;/tr&gt;       &lt;tr&gt;&lt;td&gt;OPTION&lt;/td&gt;&lt;td&gt;OPTION&lt;/td&gt;&lt;/tr&gt;       &lt;tr&gt;&lt;td&gt;D-PORT2&lt;/td&gt;&lt;td&gt;DisplayPort2&lt;/td&gt;&lt;/tr&gt;       &lt;tr&gt;&lt;td&gt;APPLICATION&lt;/td&gt;&lt;td&gt;APPLICATION&lt;/td&gt;&lt;/tr&gt;       &lt;tr&gt;&lt;td&gt;TV&lt;/td&gt;&lt;td&gt;TV&lt;/td&gt;&lt;/tr&gt;     &lt;/table&gt;  ●チェック内容   - 指定文字列以外は、エラー | 
**deviceIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | 対象deviceIdのリスト&lt;br&gt; ●チェック内容   - nullは、エラー   - 空のリストは、許可 | 
**isExclude** | [**inline**](#IsExcludeEnum) | deviceIdsの内容指定。   - true：deviceIdsは、非選択デバイス   - false：deviceIdsは、選択デバイス  ●チェック内容   - true/false以外は、エラー | 
**groupId** | **kotlin.String** | 対象のgroupId&lt;br&gt; null、空文字の場合、groupIdが指定されていないものとする。&lt;br&gt; groupIdが指定されている場合、指定されたgroupIdのグループで登録されたデバイスを対象とする。&lt;br&gt; 下位のグループが存在する場合、下位のグループに登録されたデバイスに対しても実行する。&lt;br&gt; （結果、操作を実行したグループで参照しているデバイス全てが更新される）&lt;br&gt; groupIdが指定されている場合、指定されたgroupIdのグループ操作ログを記録する。&lt;br&gt; groupIdが指定されていない場合、グループ操作ログの記録は行わない。 |  [optional]


<a name="IsExcludeEnum"></a>
## Enum: isExclude
Name | Value
---- | -----
isExclude | true, false



