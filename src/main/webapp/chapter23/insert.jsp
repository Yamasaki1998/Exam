
<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<!-- menu.jspを読み込む -->
<%@include file="menu.jsp" %>

<p>追加する生徒の情報を入力してください。</p>
<form action="insert" method="post">
生徒ID<input type="text" name="id"><br>
<br>
生徒名<input type="text" name="name"><br>
<br>
コース名<input type="text" name="course"><br>
<br>
<input type="submit" value="追加">
</form>

<hr style="border-collapse:separate;border-spacing:10px;">
<%@include file="../footer.html" %>
