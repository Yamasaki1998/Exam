
<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<!-- menu.jspを読み込む -->
<%@include file="../chapter25/menu.jsp" %>

<p>追加する科目の情報を入力してください。</p>
<form action="SubjectInsert.action" method="post">
学校コード<input type="text" name="shool_cd"><br>
<br>
科目コード<input type="text" name="cd"><br>
<br>
科目名<input type="text" name="name"><br>
<br>
<input type="submit" value="追加">
</form>

<hr style="border-collapse:separate;border-spacing:10px;">

<br><a href="../chapter25/menu.jsp">メニューに戻る</a>

<%@include file="../footer.html" %>
