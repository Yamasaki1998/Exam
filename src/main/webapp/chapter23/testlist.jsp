<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var="p" items="${list}">
	<p>${p.student_no}：${p.subject_cd}：${p.school_cd} :${p.no}：${p.point}：${p.class_num}</p>
</c:forEach>

<%@include file="../footer.html" %>
