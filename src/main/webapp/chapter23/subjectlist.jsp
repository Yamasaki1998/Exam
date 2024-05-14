<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>科目一覧</title>
    <link rel="stylesheet" type="text/css" href="styles2.css">
</head>
<body>
    <%@include file="../header.html" %>
    <%@include file="../chapter25/menu.jsp" %>

    <%@page import="bean.Subject,java.util.List" %>


    <table style="border-collapse:separate;border-spacing:10px;">

    <hr style="height: 6px;">
    <!-- TODO: 受け取った学生の一覧情報を表示 -->
    <table border="1" class="center-table">
        <th>学校コード</th>
        <th>科目コード</th>
        <th>科目名</th>
    <c:forEach var="subject" items="${list}">
        <tr>
        <td>${subject.school_cd}</td>
        <td>${subject.cd}</td>
        <td>${subject.name}</td>
        </tr>
    </c:forEach>
    </table>		
    </table>
    <hr style="border-collapse:separate;border-spacing:10px;">
	<br><a href="../chapter23/subjectkannri.jsp">科目管理トップに戻る</a>
    <%@include file="../footer.html" %>
</body>
</html>
