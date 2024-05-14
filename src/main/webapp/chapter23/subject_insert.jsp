
<%@page contentType="text/html; charset=UTF-8" %>
<link rel="stylesheet" type="text/css" href="../chapter23/styles2.css">
<%@include file="../header.html" %>

<!-- menu.jspを読み込む -->
<%@include file="../chapter25/menu.jsp" %>
<html>
<head>
<title>科目追加</title>
</head>

<body>
<div class="botton_center">
<p>追加する科目の情報を入力してください。</p>
<br>
<div class="group">
	<form action="SubjectInsert.action" method="post"> 
		<div class="k_schoolName">
			学校名
		</div>
	
		<select name="school_cd" required>
		<option value="">学校名を選択してください</option>
		<option value="oom">大宮校</option>
		<option value="tky">東京校</option></select><br>
</div>
<br>
<div class="k_code">科目コード</div>
<input type="text" name="cd"><br>
<br>
<div class="k_name">科目名</div>
<input type="text" name="name"><br>
<br>
<input type="submit" class="add-botton" value="追加">
</form>
</div>
<hr style="border-collapse:separate;border-spacing:10px;">

<br><a href="../chapter25/menu.jsp">メニューに戻る</a>
<br><a href="../chapter23/subjectkannri.jsp">科目管理トップに戻る</a>
<%@include file="../footer.html" %>
</body>
</html>
