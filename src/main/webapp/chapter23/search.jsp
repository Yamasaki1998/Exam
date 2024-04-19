<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<p>検索キーワードを入力してください。</p>
<form action="Search.action" method="post">
<input type="text" name="keyword">
<input type="submit" value="検索">
</form>

<br><a href="../chapter25/menu.jsp">メニューに戻る</a>

<%@include file="../footer.html" %>
