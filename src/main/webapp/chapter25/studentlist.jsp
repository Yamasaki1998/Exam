<%@page contentType="text/html; charset=UTF-8" %>
<link rel="stylesheet" type="text/css" href="../chapter23/styles2.css">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../header.html" %>
<%@include file="menu.jsp" %>

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
	<td>${student.is_attend}</td>
	<td>${student.school_cd}</td>
	</tr>
</c:forEach>
</table>		
</table>
<hr style="border-collapse:separate;border-spacing:10px;">

<%@include file="../footer.html" %>
