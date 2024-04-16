package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.Class_num;

public class Class_numDAO extends DAO {
	public Class_num search(String school_cd, String class_num)
		throws Exception {
		Class_num class_num=null;

		Connection con=getConnection();

		PreparedStatement st;
		st=con.prepareStatement(
			"select * from class_num where school_cd=? and class_num=?");
		st.setString(1, school_cd);
		st.setString(2, class_num);
		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			class_num=new Class_num();
			class_num.setSchool_cd(rs.getString("school_cd"));
			class_num.setClass_num(rs.getString("class_num"));
		}

		st.close();
		con.close();
		return class_num;
	}
}
