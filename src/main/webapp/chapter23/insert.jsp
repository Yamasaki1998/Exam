<%@page contentType="text/html; charset=UTF-8" %>
<link rel="stylesheet" type="text/css" href="../chapter23/styles2.css">
<%@include file="../header.html" %>

<!-- menu.jspを読み込む -->
<%@include file="../chapter25/menu.jsp" %>
<div class="botton_center">
	<p>追加する学生の情報を入力してください。</p>
	<form action="insert" method="post">
	<div class="stu-num">学生番号</div>
	<input type="text" name="no" required><br>
	
	<br>
	
	<div class="stu-name">名前</div>
	<input type="text" name="name" required><br>
	
	<br>
	
	<div class="stu-year">入学年度</div>
	<input type="text" name="ent_year" required><br>

	<br>

	<div class="stu-clsCd">クラスコード</div>
	<select name="class_num" class="stu-clsCDBox" required >
		<option value="">クラスコードを選択</option>
		<option value="131">101</option>
		<option value="131">131</option>
		<option value="201">201</option>
	</select><br>
	
	<br>
	
	<div class="stu-zaiseki">在籍状況</div>
	<select name="isattend" class="stu-zaisekiBox" required>
		<option value="">在籍状況を選択</option>
		<option value="TRUE">在籍</option>
	</select><br>
	
	<br>
	
	<div class="stu-schoolCd">学校コード</div>
	<select name="school_cd" class="stu-schoolCdBox" required>
		<option value="">学校コードを選択</option>
		<option value="oom">大宮(oom)</option>
		<option value="tky">東京(tky)</option>
	</select><br>
	<br>
	<input type="submit" class="add-botton" value="追加">
	</form>
</div>
<hr style="border-collapse:separate;border-spacing:10px;">

<br><a href="../chapter25/menu.jsp">メニューに戻る</a>

<%@include file="../footer.html" %>
