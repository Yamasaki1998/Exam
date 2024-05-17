<%@page contentType="text/html; charset=UTF-8" %>
<link rel="stylesheet" type="text/css" href="../chapter23/styles2.css">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../header.html" %>
<%@include file="../chapter25/menu.jsp" %>


<div class="botton_center">
<br>
<h3>学生名で検索します。</h3>
<h3>検索キーワードを入力してください。</h3>
<form action="Search.action" method="post">
<input type="text" name="keyword">
<input type="submit" value="検索">
</form>
</div>
<br>
<hr style="border-collapse:separate;border-spacing:10px;">
<a href="../chapter25/menu.jsp">メニューに戻る</a>
<br><a href="../chapter23/gakuseikannri.jsp">学生管理トップに戻る</a>
<%@include file="../footer.html"%>
