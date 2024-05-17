<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="java.sql.*" %>
<%@page import="javax.naming.InitialContext" %>
<%@page import="javax.sql.DataSource" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../chapter25/menu.jsp" %>
<link rel="stylesheet" type="text/css" href="../css/style.css">

<%@include file="../header.html"%>

<div class="main">
   <p>学生番号→科目コード→回数の順で削除したいデータを選択してください。</p>
   <form action="TestDelete.action" method="post">
       <div class="mainform">
           <select name="student_no">
               <%
                   try {
                       InitialContext ic = new InitialContext();
                       DataSource ds = (DataSource) ic.lookup("java:/comp/env/jdbc/Seiseki");
                       Connection con = ds.getConnection();
                       PreparedStatement st = con.prepareStatement(
                           "SELECT * FROM TEST INNER JOIN CLASS_NUM ON TEST.CLASS_NUM = CLASS_NUM.CLASS_NUM;");
                       ResultSet rs = st.executeQuery();
                       while (rs.next()) {
                           out.println("<option value=\"" + rs.getString("student_no") + "\">" + rs.getString("student_no") + "</option>");
                       }
                       st.close();
                       con.close();
                   } catch (Exception e) {
                       out.println(e);
                   }
               %>
           </select>
       </div>
       <div class="mainform">
           <select name="subject_cd">
               <%
                   try {
                       InitialContext ic = new InitialContext();
                       DataSource ds = (DataSource) ic.lookup("java:/comp/env/jdbc/Seiseki");
                       Connection con = ds.getConnection();
                       PreparedStatement st = con.prepareStatement(
                           "SELECT DISTINCT subject_cd FROM TEST;");
                       ResultSet rs = st.executeQuery();
                       while (rs.next()) {
                           out.println("<option value=\"" + rs.getString("subject_cd") + "\">" + rs.getString("subject_cd") + "</option>");
                       }
                       st.close();
                       con.close();
                   } catch (Exception e) {
                       out.println(e);
                   }
               %>
           </select>
       </div>
       <select name="no" required>
           <option value="1">1回目</option>
           <option value="2">2回目</option>
       </select>
       <br><br>
       <input type="submit" value="削除" class="button">
   </form>
</div>

<hr style="border-collapse:separate;border-spacing:10px;">

<br><a href="../chapter25/menu.jsp">メニューに戻る</a><br><a href="../chapter23/testkannri.jsp">成績管理トップへ戻る</a>
<%@include file="../footer.html"%>
