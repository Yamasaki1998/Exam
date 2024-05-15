<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="java.sql.*" %>
<%@page import="javax.naming.InitialContext" %>
<%@page import="javax.sql.DataSource" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@include file="../chapter25/menu.jsp" %>
<link rel="stylesheet" type="text/css" href="../css/style.css">

<%@include file="../header.html"%>

<div class="main">

<%
	try { 
		
		InitialContext ic=new InitialContext();
		DataSource ds=(DataSource)ic.lookup(
			"java:/comp/env/jdbc/Seiseki");
		Connection con=ds.getConnection(); 
	
		PreparedStatement st=con.prepareStatement(
		"select * from STUDENT INNER JOIN CLASS_NUM ON STUDENT.CLASS_NUM = CLASS_NUM.CLASS_NUM;"); 
		ResultSet rs=st.executeQuery();
		
		out.println("<p>削除する学生の名前を選択してください。</p>");
		out.println("<div class=\"mainform\">");
		out.println("<form action=\"StudentDelete.action\" method=\"post\">");
		out.println("<select name=\"no\">");
		
		while (rs.next()) {
			out.println("<option value="+rs.getString("no")+">"+rs.getString("name")+"</option>");
		}
		out.println("</select>");
		out.println("</div>");
		out.println("<input type=\"submit\" value=\"削除\" class=\"button\">");
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
