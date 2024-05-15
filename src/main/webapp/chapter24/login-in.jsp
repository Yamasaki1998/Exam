<%@page contentType="text/html; charset=UTF-8" %>
<link rel="stylesheet" type="text/css" href="../chapter23/styles2.css">
<%@include file="../header.html" %>
<%@include file="/chapter25/menu.jsp" %>

<br>
<br>
<div class="botton_center">
<form action="Login.action" method="post">
<div  class="login-id">ログインID</div>
<input name="id" type="text" value="" placeholder="idを入力" required />
<br>
<br>
<div class="login-password">パスワード</div>
<input name="password" type="text"  value="" placeholder="passwordを入力" required/>
<br>
<br>
<input type="submit" value="ログインする" class="login_bot"/>
</form>
</div>

<br><a href="../chapter25/menu.jsp">メニューに戻る</a>
  
<%@include file="../footer.html" %>
