<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page import="bean.Student,java.util.List" %>
<html>
<head>
	<title>学生一覧</title>
	<link rel="stylesheet" type="text/css" href="styles2.css">
</head>
<body>
<%@include file="../header.html" %>
<%@include file="../chapter25/menu.jsp" %>

<%@page import="bean.Student,java.util.List" %>
<table style="border-collapse:separate;border-spacing:10px;">

<hr style="height: 6px;">
<!-- TODO: 受け取った学生の一覧情報を表示 -->
<table border="1" class="center-table">
	<th>学生番号</th>
	<th>学生名</th>
	<th>入学年度</th>
	<th>クラスID</th>
	<th>在学判定</th>
	<th>学校コード</th>
	<c:forEach var="student" items="${list}">
		<tr>
			<td>${student.no}</td>
			<td>${student.name}</td>
			<td>${student.ent_year}</td>
			<td>${student.class_num}</td>
			<td>${student.isattend}</td>
			<td>${student.school_cd}</td>
		</tr>
	</c:forEach>
	</table>		
</table>


<hr style="border-collapse:separate;border-spacing:10px;">



<br><a href="../chapter25/menu.jsp">メニューに戻る</a><br>
<a href="../chapter23/gakuseikannri.jsp">学生管理トップへ戻る</a>
<%@include file="../footer.html" %>
</body>
</html>
