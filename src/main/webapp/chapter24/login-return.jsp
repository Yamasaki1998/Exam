<%@page contentType="text/html; charset=UTF-8" %>
<link rel="stylesheet" type="text/css" href="../chapter23/styles2.css">
<%@include file="../header.html" %>
<%@include file="/chapter25/menu.jsp" %>


<br>
<br>IDまたはパスワードが確認できませんでした<br>
<p>  </p>
<form action="Login.action" method="post">
<input name="id" type="text" value="${param.id}" placeholder="idを入力" required/>
<input name="password" type="text" value="${param.password}" placeholder="passwordを入力" required/>
<input type="submit" value="ログインする" />
</form>

<br><a href="../chapter25/menu.jsp">メニューに戻る</a>
  
<%@include file="../footer.html" %>