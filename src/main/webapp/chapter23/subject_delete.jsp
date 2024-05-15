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
		"select * from SUBJECT ;"); 
		ResultSet rs=st.executeQuery();
		
		out.println("<p>削除する科目の名前を選択してください。</p>");
		out.println("<div class=\"mainform\">");
		out.println("<form action=\"SubjectDelete.action\" method=\"post\">");
		out.println("<select name=\"cd\" required>");
		
		while (rs.next()) {
			out.println("<option value="+rs.getString("cd")+">"+rs.getString("name")+"</option>");
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

<%@include file="../footer.html"%>
