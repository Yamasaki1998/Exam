<%@page contentType="text/html; charset=UTF-8" %>
<link rel="stylesheet" type="text/css" href="../chapter23/styles2.css">
<%@include file="../header.html" %>

<!-- menu.jspを読み込む -->
<%@include file="../chapter25/menu.jsp" %>

<p>追加する学生の情報を入力してください。</p>
<form action="insert" method="post">
学生番号<input type="text" name="no"><br>
<br>
名前<input type="text" name="name"><br>
<br>
入学年度<input type="text" name="ent_year"><br>
<br>
クラス<input type="text" name="class_num"><br>
<br>
在籍状況<select name="isattend" required>
<option value="TRUE">在籍</option>
</select><br>
<br>
学校コード<select name="school_cd" required>
<option value="oom">大宮(oom)</option>
<option value="tky">東京(tky)</option></select><br>
<br>
<input type="submit" value="追加">
</form>

<hr style="border-collapse:separate;border-spacing:10px;">

<br><a href="../chapter25/menu.jsp">メニューに戻る</a>

<%@include file="../footer.html" %>
