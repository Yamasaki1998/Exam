<%@page contentType="text/html; charset=UTF-8" %>
<link rel="stylesheet" type="text/css" href="../chapter23/styles2.css">
<%@include file="../header.html" %>

<!-- menu.jspを読み込む -->
<%@include file="../chapter25/menu.jsp" %>
<div class="botton_center">
<h3>成績を変更する学生の情報を入力してください。</h3>
<form action="" method="post">
<br>
<div class="ent-year">入学年度</div>
<input type="test" name="ent_year" required><br>
<br>
<div class="class">クラス</div>
<input type="text" name="class_num" required><br>
<br>
<div class="sub-cd">科目コード</div>
<input type="text" name="subject_cd" required><br>
<br>

<div class="kaisu">回数</div>
<select name="no" class="kaisu-box" required>
<option value="1">1</option>
<option value="2">2</option></select><br>
</select>
<br>
<input type="submit" value="検索">
</form>
</div>

<hr style="border-collapse:separate;border-spacing:10px;">

<br><a href="../chapter25/menu.jsp">メニューに戻る</a>
<br><a href="../chapter23/testkannri.jsp">成績管理トップへ戻る</a>
<%@include file="../footer.html" %>
