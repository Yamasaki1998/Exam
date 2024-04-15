package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.Teacher;

public class TeacherDAO extends DAO {
	public Teacher search(String password, String name)
		throws Exception {
		Teacher teacher=null;

		Connection con=getConnection();

		PreparedStatement st;
		st=con.prepareStatement(
			"select * from teacher where password=? and name=?");
		st.setString(1, password);
		st.setString(2, name);
		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			teacher=new Teacher();
			teacher.setId(rs.getString("id"));
			teacher.setPassword(rs.getString("password"));
			teacher.setName(rs.getString("name"));
		}

		st.close();
		con.close();
		return teacher;
	}
}
