<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../header.html" %>
<%@include file="menu.jsp" %>

<p>検索キーワードを入力してください。</p>
<form action="Student.action" method="post">
<input type="text" name="keyword">
<input type="submit" value="検索">
</form>
<hr>

<table style="border-collapse:separate;border-spacing:10px;">
<c:forEach var="student" students="${list}">
	<tr>
	<td>${student.no}</td>
	<td>${student.name}</td>
	<td>${student.ent_year}</td>
	<td>${student.isattend}</td>
	<td>${student.school_cd}</td>
	</tr>
</c:forEach>
</table>

<%@include file="../footer.html" %>

