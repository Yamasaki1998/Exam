<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../header.html" %>
<%@include file="menu.jsp" %>

<%@page import="bean.Student,java.util.List" %>


<table style="border-collapse:separate;border-spacing:10px;">

<hr style="height: 6px;">
<!-- TODO: 受け取った学生の一覧情報を表示 -->
<table border="1">
<th>学校コード</th>
<th>科目コード</th>
<th>科目名</th>
<c:forEach var="subject" items="${list}">
	<tr>
	<td>${school.id}</td>
	<td>${subject.id}</td>
	<td>${subject.name}</td>
	</tr>
</c:forEach>
</table>		
</table>
<hr style="border-collapse:separate;border-spacing:10px;">

<%@include file="../footer.html" %>

