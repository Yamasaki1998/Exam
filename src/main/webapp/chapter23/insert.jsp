
<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<!-- menu.jspを読み込む -->
<%@include file="../chapter25/menu.jsp" %>

<p>追加する生徒の情報を入力してください。</p>
<form action="insert" method="post">
学生番号<input type="text" name="no"><br>
<br>
名前<input type="text" name="name"><br>
<br>
入学年度<input type="text" name="ent_year"><br>
<br>
クラス<input type="text" name="class_num"><br>
<br>
<input type="submit" value="追加">
</form>

<hr style="border-collapse:separate;border-spacing:10px;">
<%@include file="../footer.html" %>
