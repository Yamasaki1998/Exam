package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.Class;

public class ClassDAO extends DAO {
	public Class search(String school_cd, String class_num)
		throws Exception {
		Class classInstance=null;

		Connection con=getConnection();

		PreparedStatement st;
		st=con.prepareStatement(
			"select * from class_num where school_cd=? and class_num=?");
		st.setString(1, school_cd);
		st.setString(2, class_num);
		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			classInstance=new Class();
			classInstance.setSchool_cd(rs.getString("school_cd"));
			classInstance.setClass_num(rs.getString("class_num"));
		}

		st.close();
		con.close();
		return classInstance;
	}
}
