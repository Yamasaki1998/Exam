<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<%@include file="/chapter25/menu.jsp" %>

<br><br>ログイン成功。こんにちは、<b><%=session.getAttribute("teacher")%></b>さん。

<br><br><a href="../chapter25/menu.jsp">メニューに戻る</a>

<%@include file="../footer.html" %>
