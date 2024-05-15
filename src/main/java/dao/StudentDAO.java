
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Student;

public class StudentDAO extends DAO { // DAOクラスを継承(DAOクラスのメソッドが使えるようになる)

	public List<Student> search(String keyword) throws Exception { // searchメソッドを定義
		List<Student> list=new ArrayList<>(); // Student型の配列を作成

		Connection con=getConnection(); // DBに接続(DAOのgetConnectionメソッドを実行)

		// select文を実行
		PreparedStatement st=con.prepareStatement(
			"select * from student where name like ?");
		st.setString(1, "%"+keyword+"%");
		ResultSet rs=st.executeQuery();

		// データを順に取得
		while (rs.next()) {
			Student s=new Student();
			s.setNo(rs.getString("no"));
			s.setName(rs.getString("name"));
			s.setEnt_year(rs.getString("ent_year"));
			s.setClass_num(rs.getString("class_num"));
			s.setIsattend(rs.getBoolean("is_attend"));
			s.setSchool_cd(rs.getString("school_cd"));
			list.add(s); // データを一件取得するごとにlistに追記する
			
		}

		st.close();
		con.close(); // DB接続を閉じる

		return list; // listの値を返却する
	}

	public int insert(Student student) throws Exception {
		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
			"insert into student values(?,?,?,?,?,?)");
		st.setString(1, student.getNo());
		st.setString(2, student.getName());
		st.setString(3, student.getEnt_year());
		st.setString(4, student.getClass_num());
		st.setBoolean(5, student.getIs_attend());
		st.setString(6,student.getSchool_cd());
		int line=st.executeUpdate();

		st.close();
		con.close();
		return line;
	}
	
	public void delete(String No) throws Exception {
	    Connection con = getConnection();

	    try {
	        // DELETE 文を準備
	        PreparedStatement st = con.prepareStatement(
	            "DELETE FROM student WHERE NO = ?");
	        st.setString(1, No);

	        // DELETE 文を実行
	        st.executeUpdate();
	    } finally {
	        // リソースを適切にクローズ（例外が発生しても）
	        con.close();
	    }
	}
}
