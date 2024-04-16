package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.School;

public class SchoolDAO extends DAO {
	public School search(String cd, String name)
		throws Exception {
		School school=null;

		Connection con=getConnection();

		PreparedStatement st;
		st=con.prepareStatement(
			"select * from school where cd=? and name=?");
		st.setString(1, cd);
		st.setString(2, name);
		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			school=new School();
			school.setCd(rs.getString("cd"));
			school.setName(rs.getString("name"));
		}

		st.close();
		con.close();
		return school;
	}
}
