<%@page contentType="text/html; charset=UTF-8" %>
<link rel="stylesheet" type="text/css" href="../chapter23/styles2.css">
<%@include file="../header.html" %>

<!-- menu.jspを読み込む -->
<%@include file="../chapter25/menu.jsp" %>
<p>成績を参照する情報を入力してください。</p>
<form action="StudentSearch.action" method="post">
<br>
学生番号<input type="test" name="student_no" required><br>
<br>

</select>

<input type="submit" value="検索">
</form>

<hr style="border-collapse:separate;border-spacing:10px;">

<br><a href="../chapter25/menu.jsp">メニューに戻る</a>
<br><a href="../chapter23/testkannri.jsp">成績管理トップへ戻る</a>
<%@include file="../footer.html" %>
