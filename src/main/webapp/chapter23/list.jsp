<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var="p" items="${list}">
	<p>${p.no}：${p.name}：${p.ent_year} :${p.class_num}：${p.is_attend}：${p.school_cd}</p>
</c:forEach>

<%@include file="../footer.html" %>
