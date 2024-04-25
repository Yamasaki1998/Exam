
<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var="p" subjects="${list}">
	<p>${p.school_cd}：${p.cd}：${p.name}</p>
</c:forEach>

<%@include file="../footer.html" %>
