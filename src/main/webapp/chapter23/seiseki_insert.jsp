<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<!-- menu.jspを読み込む -->
<%@include file="../chapter25/menu.jsp" %>

<p>成績を追加する学生の情報を入力してください。</p>
<form action="insert" method="post">
学生番号<input type="text" name="no"><br>
<br>
科目コード<input type="text" name="subjct_cd"><br>
<br>
学校コード<select name="school_cd" required>
<option value="oom">大宮(oom)</option>
<option value="tky">東京(tky)</option></select><br>
<br>
NO<select name="no" required>
<option value="1">1</option>
<option value="2">2</option></select><br>
<br>
得点<input type="text" name="point"><br>
<br>
クラス<input type="text" name="class_num"><br>
</select><br>

<input type="submit" value="追加">
</form>

<hr style="border-collapse:separate;border-spacing:10px;">

<br><a href="../chapter25/menu.jsp">メニューに戻る</a>

<%@include file="../footer.html" %>
