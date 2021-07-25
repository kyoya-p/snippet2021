import org.w3c.dom.get
import org.w3c.dom.parsing.DOMParser

val bsPrefData = """
<div class="areaListCol">
<h6 class="trgr" style="cursor: default;"><a>北海道・東北</a></h6>
<ul class="none" style="display: block;">
<li><a href="list.php?pref=1">北海道</a></li>
<li><a href="list.php?pref=2">青森県</a></li>
<li><a href="list.php?pref=3">岩手県</a></li>
<li><a href="list.php?pref=4">秋田県</a></li>
<li><a href="list.php?pref=5">宮城県</a></li>
<li><a href="list.php?pref=6">山形県</a></li>
<li><a href="list.php?pref=7">福島県</a></li>
</ul>
<h6 class="trgr" style="cursor: default;"><a>関東・甲信</a></h6>
<ul class="none" style="display: block;">
<li><a href="list.php?pref=8" class="noLink">東京都/23区内</a></li>
<li><a href="list.php?pref=9" class="noLink">東京都/23区外</a></li>
<li><a href="list.php?pref=10">神奈川県</a></li>
<li><a href="list.php?pref=11">埼玉県</a></li>
<li><a href="list.php?pref=12">千葉県</a></li>
<li><a href="list.php?pref=13">茨城県</a></li>
<li><a href="list.php?pref=14">栃木県</a></li>
<li><a href="list.php?pref=15">群馬県</a></li>
<li><a href="list.php?pref=20">山梨県</a></li>
<li><a href="list.php?pref=21">長野県</a></li>
</ul>
<h6 class="trgr"><a>北陸・東海</a></h6>
<ul class="none" style="display: none;">
<li><a href="list.php?pref=16">新潟県</a></li>
<li><a href="list.php?pref=17">富山県</a></li>
<li><a href="list.php?pref=18">石川県</a></li>
<li><a href="list.php?pref=19">福井県</a></li>
<li><a href="list.php?pref=22">岐阜県</a></li>
<li><a href="list.php?pref=23">静岡県</a></li>
<li><a href="list.php?pref=24">愛知県</a></li>
<li><a href="list.php?pref=25">三重県</a></li>
</ul>
<h6 class="trgr"><a>近畿</a></h6>
<ul class="none" style="display: none;">
<li><a href="list.php?pref=26">滋賀県</a></li>
<li><a href="list.php?pref=27">京都府</a></li>
<li><a href="list.php?pref=28">大阪府</a></li>
<li><a href="list.php?pref=29">兵庫県</a></li>
<li><a href="list.php?pref=30">奈良県</a></li>
<li><a href="list.php?pref=31">和歌山県</a></li>
</ul>
<h6 class="trgr"><a>中国・四国</a></h6>
<ul class="none" style="display: none;">
<li><a href="list.php?pref=32">鳥取県</a></li>
<li><a href="list.php?pref=33">島根県</a></li>
<li><a href="list.php?pref=34">岡山県</a></li>
<li><a href="list.php?pref=35">広島県</a></li>
<li><a href="list.php?pref=36">山口県</a></li>
<li><a href="list.php?pref=37">徳島県</a></li>
<li><a href="list.php?pref=38">香川県</a></li>
<li><a href="list.php?pref=39">愛媛県</a></li>
<li><a href="list.php?pref=40">高知県</a></li>
</ul>
<h6 class="trgr"><a>九州・沖縄</a></h6>
<ul class="none" style="display: none;">
<li><a href="list.php?pref=41">福岡県</a></li>
<li><a href="list.php?pref=42">佐賀県</a></li>
<li><a href="list.php?pref=43">長崎県</a></li>
<li><a href="list.php?pref=44">熊本県</a></li>
<li><a href="list.php?pref=45">大分県</a></li>
<li><a href="list.php?pref=46">宮崎県</a></li>
<li><a href="list.php?pref=47">鹿児島県</a></li>
<li><a href="list.php?pref=48" class="noLink">沖縄県</a></li>
</ul>
</div>
"""



