
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Test;

public class TestDAO extends DAO { // DAOクラスを継承(DAOクラスのメソッドが使えるようになる)

	public List<Test> search(String keyword) throws Exception { // searchメソッドを定義
		List<Test> list=new ArrayList<>(); // Student型の配列を作成

		Connection con=getConnection(); // DBに接続(DAOのgetConnectionメソッドを実行)

		// select文を実行
		PreparedStatement st=con.prepareStatement(
			"select * from test where name like ?");
		st.setString(1, "%"+keyword+"%");
		ResultSet rs=st.executeQuery();

		// データを順に取得
		while (rs.next()) {
			Test s=new Test();
			s.setStudent_no(rs.getString("student_no"));
			s.setSubject_cd(rs.getString("subject_cd"));
			s.setSchool_cd(rs.getString("school_cd"));
			s.setNo(rs.getString("no"));
			s.setPoint(rs.getString("point"));
			s.setClass_num(rs.getString("class_num"));
			list.add(s); // データを一件取得するごとにlistに追記する
			
		}

		st.close();
		con.close(); // DB接続を閉じる

		return list; // listの値を返却する
	}
	
	public List<Test> studentsearch(String keyword) throws Exception { // searchメソッドを定義
		List<Test> list=new ArrayList<>(); // Student型の配列を作成

		Connection con=getConnection(); // DBに接続(DAOのgetConnectionメソッドを実行)

		// select文を実行
		PreparedStatement st=con.prepareStatement(
			"select * from test where student_no like ?");
		st.setString(1, "%"+keyword+"%");
		ResultSet rs=st.executeQuery();

		// データを順に取得
		while (rs.next()) {
			Test s=new Test();
			s.setStudent_no(rs.getString("student_no"));
			s.setSubject_cd(rs.getString("subject_cd"));
			s.setSchool_cd(rs.getString("school_cd"));
			s.setNo(rs.getString("no"));
			s.setPoint(rs.getString("point"));
			s.setClass_num(rs.getString("class_num"));
			list.add(s); // データを一件取得するごとにlistに追記する
			
		}

		st.close();
		con.close(); // DB接続を閉じる

		return list; // listの値を返却する
	}
	
	public List<Test> kamokusearch(String ent_year, String class_num, String subject_cd, String no) throws Exception { // searchメソッドを定義
		List<Test> list=new ArrayList<>(); // Student型の配列を作成

		Connection con=getConnection(); // DBに接続(DAOのgetConnectionメソッドを実行)

		// select文を実行
		PreparedStatement st=con.prepareStatement(
			"select * from test where class_num like ? and subject_cd like ? and no like ?");
		st.setString(1, "%"+ class_num +"%");
		st.setString(2, "%"+ subject_cd +"%");
		st.setString(3, "%"+ no +"%");
		ResultSet rs=st.executeQuery();

		// データを順に取得
		while (rs.next()) {
			Test s=new Test();
			s.setStudent_no(rs.getString("student_no"));
			s.setSubject_cd(rs.getString("subject_cd"));
			s.setSchool_cd(rs.getString("school_cd"));
			s.setNo(rs.getString("no"));
			s.setPoint(rs.getString("point"));
			s.setClass_num(rs.getString("class_num"));
			list.add(s); // データを一件取得するごとにlistに追記する
			
		}

		st.close();
		con.close(); // DB接続を閉じる

		return list; // listの値を返却する
	}

	public int insert(Test test) throws Exception {
		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
			"insert into student values(?,?,?,?,?,?)");
		st.setString(1, test.getStudent_no());
		st.setString(2, test.getSubject_cd());
		st.setString(3, test.getSchool_cd());
		st.setString(4, test.getNo());
		st.setString(5, test.getPoint());
		st.setString(6,test.getClass_num());
		int line=st.executeUpdate();

		st.close();
		con.close();
		return line;
	}
	
	public void delete(String Student_no ,String Subject_cd, String no) throws Exception {
	    Connection con = getConnection();

	    try {
	        // DELETE 文を準備
	        PreparedStatement st = con.prepareStatement(
	            "DELETE FROM test WHERE STUDENT_NO = ? AND SUBJECT_CD = ? AND NO = ?");
	        st.setString(1, Student_no);
	        st.setString(2, Subject_cd);
	        st.setString(3, no);

	        // DELETE 文を実行
	        st.executeUpdate();
	    } finally {
	        // リソースを適切にクローズ（例外が発生しても）
	        con.close();
	    }
	}
}
