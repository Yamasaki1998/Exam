<%@page contentType="text/html; charset=UTF-8" %>
<link rel="stylesheet" type="text/css" href="../chapter23/styles2.css">
<%@include file="../header.html" %>

<!-- menu.jspを読み込む -->
<%@include file="../chapter25/menu.jsp" %>
<div class="botton_center">
<h3>成績を追加する学生の情報を入力してください。</h3>
<form action="TestInsert.action" method="post">
<div class="result-stNo">学生番号</div>
<input type="text" name="student_no" required><br>
<br>
<div class="result-subCd">科目コード</div>
<input type="text" name="subject_cd" required><br>
<br>
<div class="result-scCd">学校コード</div>
<select name="school_cd" class="result-scCd" required>
<option value="oom">大宮(oom)</option>
<option value="tky">東京(tky)</option></select><br>
<br>
<div class="result-no">No</div>
<select name="no" class="result-nobox" required>
<option value="1">1</option>
<option value="2">2</option></select><br>
<br>
<div class="result-point">得点</div>
<input type="text" name="point" required><br>
<br>
<div class="result-class">クラス</div>
<input type="text" name="class_num" required><br>
</select><br>

<input type="submit" value="追加">
</form>
</div>
<hr style="border-collapse:separate;border-spacing:10px;">

<br><a href="../chapter25/menu.jsp">メニューに戻る</a>
<br><a href="../chapter23/testkannri.jsp">成績管理トップへ戻る</a>
<%@include file="../footer.html" %>
