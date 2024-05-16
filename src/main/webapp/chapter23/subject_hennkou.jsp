<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="java.sql.*" %>
<%@page import="javax.naming.InitialContext" %>
<%@page import="javax.sql.DataSource" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../chapter25/menu.jsp" %>
<link rel="stylesheet" type="text/css" href="../css/style.css">


<%@include file="../header.html"%>
	<form action="" method="post"> 
<div class="main">
<%
try { 
    InitialContext ic = new InitialContext();
    DataSource ds = (DataSource) ic.lookup("java:/comp/env/jdbc/Seiseki");
    Connection con = ds.getConnection(); 

    PreparedStatement st = con.prepareStatement(
    	"SELECT * FROM SUBJECT ORDER BY SUBJECT.CD ASC;"); 
    ResultSet rs = st.executeQuery();

    out.println("<div class=\"mainform\">");
    out.println("科目コード<select name=\"cd\" required>");
    out.println("<option value=\"\">科目コードを選択</option>");

    while (rs.next()) {
        out.println("<option value=" + rs.getString("CD") + ">" + rs.getString("CD") + "</option>");
    }
    out.println("</select><br>");

    out.println("</div>");
	out.println("<input type=\"submit\" value=\"選ぶ\" class=\"button\">");
    out.println("</form>");

    st.close();
    con.close();
} catch (Exception e) {
    out.println(e);
}
%>


</div>

<hr style="border-collapse:separate;border-spacing:10px;">
<br><a href="../chapter25/menu.jsp">メニューに戻る</a>
<br><a href="../chapter23/subjectkannri.jsp">科目管理トップに戻る</a>
<%@include file="../footer.html" %>
</body>
</html>
