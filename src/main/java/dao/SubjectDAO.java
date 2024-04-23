package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Subject;

public class SubjectDAO extends DAO { // DAOクラスを継承(DAOクラスのメソッドが使えるようになる)

	public List<Subject> search(String keyword) throws Exception { // searchメソッドを定義
		List<Subject> list=new ArrayList<>(); // 配列を作成

		Connection con=getConnection(); // DBに接続(DAOのgetConnectionメソッドを実行)

		// select文を実行
		PreparedStatement st=con.prepareStatement(
			"select * from subject where school_cd like ?");
		st.setString(1, "%"+keyword+"%");
		ResultSet rs=st.executeQuery();

		// データを順に取得
		while (rs.next()) {
			Subject p=new Subject();
			p.setSchool_Cd(rs.getString("school_cd"));
			p.setCd(rs.getString("cd"));
			p.setName(rs.getString("name"));
			list.add(p); // データを一件取得するごとにlistに追記する
			
			
		}

		st.close();
		con.close(); // DB接続を閉じる

		return list; // listの値を返却する
	}

	public int insert(Subject subject) throws Exception {
		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
			"insert into subject values(?, ?, ?)");
		st.setString(1, subject.getSchool_Cd());
		st.setString(2, subject.getCd());
		st.setString(3, subject.getName());
		int line=st.executeUpdate();

		st.close();
		con.close();
		return line;
	}
}
