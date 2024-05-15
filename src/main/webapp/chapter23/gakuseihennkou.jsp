<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="java.sql.*" %>
<%@page import="javax.naming.InitialContext" %>
<%@page import="javax.sql.DataSource" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../chapter25/menu.jsp" %>
<link rel="stylesheet" type="text/css" href="../css/style.css">


<%@include file="../header.html"%>

<div class="main">
<div class="botton_center">
<%
	try { 
		
		InitialContext ic=new InitialContext();
		DataSource ds=(DataSource)ic.lookup(
			"java:/comp/env/jdbc/Seiseki");
		Connection con=ds.getConnection(); 
	
		PreparedStatement st=con.prepareStatement(
		"select * from STUDENT INNER JOIN CLASS_NUM ON STUDENT.CLASS_NUM = CLASS_NUM.CLASS_NUM;"); 
		ResultSet rs=st.executeQuery();
		
		out.println("<br><h3>更新する学生とその学生のコースを選択してください。</h3>");
		out.println("<div class=\"henkou-name\">学生名</div>");
		out.println("<div class=\"mainform\">");
		out.println("<form action=\"update\" method=\"post\">");
		out.println("<select name=\"stname\">");
		
		while (rs.next()) {
			out.println("<option value="+rs.getString("name")+">"+rs.getString("name")+"</option>");
		}
		out.println("</select><br><br>");
		out.println("<div class=\"henkou-course\">コース名</div>");
		out.println("<select name=\"course\">");
		out.println("<option value=\"1\">システム開発</option>");
		out.println("<option value=\"2\">AIシステム・データサイエンス</option>");
		out.println("</select>");
		out.println("</div><br>");
		out.println("<input type=\"submit\" value=\"更新\" class=\"button\">");
		out.println("</form>");
		
		
		st.close();
		con.close();
		
	
	} catch (Exception e) {
		out.println(e);
	}
%>
</div>
</div>


<%@include file="../footer.html"%>
