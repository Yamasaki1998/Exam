<%@page contentType="text/html; charset=UTF-8" %>
<link rel="stylesheet" type="text/css" href="../chapter23/styles2.css">
<%@include file="../header.html" %>

<!-- menu.jspを読み込む -->
<%@include file="../chapter25/menu.jsp" %>
<p>成績を追加する学生の情報を入力してください。</p>
<form action="" method="post">
<br>
入学年度<input type="test" name="ent_year" required><br>
<br>
クラス<input type="text" name="class_num" required><br>
<br>
科目コード<input type="text" name="subject_cd" required><br>
<br>

回数<select name="no" required>
<option value="1">1</option>
<option value="2">2</option></select><br>
</select>

<input type="submit" value="検索">
</form>

<hr style="border-collapse:separate;border-spacing:10px;">

<br><a href="../chapter25/menu.jsp">メニューに戻る</a>
<br><a href="../chapter23/testkannri.jsp">成績管理トップへ戻る</a>
<%@include file="../footer.html" %>
