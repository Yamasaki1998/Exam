package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Product;

public class StudentDAO extends DAO { // DAOクラスを継承(DAOクラスのメソッドが使えるようになる)

	public List<Student> search(String keyword) throws Exception { // searchメソッドを定義
		List<Student> list=new ArrayList<>(); // Product型の配列を作成

		Connection con=getConnection(); // DBに接続(DAOのgetConnectionメソッドを実行)

		// select文を実行
		PreparedStatement st=con.prepareStatement(
			"select * from student where name like ?");
		st.setString(1, "%"+keyword+"%");
		ResultSet rs=st.executeQuery();

		// データを順に取得
		while (rs.next()) {
			Student p=new Student();
			p.setId(rs.getString("id"));
			p.setName(rs.getString("name"));
			p.setEnt_year(rs.getInt("ent_year"));
			list.add(p); // データを一件取得するごとにlistに追記する
			
			/* listの中身配下のように変化します
			 * 
			 * １個目のデータ取得時
			 * 	 ------------------------
			 *  |           0            |
			 *   ------------------------
			 *  |  --------------------  |
			 *  | | i d | name | price | |
			 *  |  --------------------  |
			 *  | |  1  |まぐろ|  100  | |
			 *  |  --------------------  |
			 *   ------------------------
			 *   
			 * ２個目のデータ取得時
			 *   ------------------------------------------------- 
			 *  |           0            |            1           |
			 *   -------------------------------------------------|
			 *  |  --------------------  |  --------------------  |
			 *  | | i d | name | price | | | i d | name | price | |
			 *  |  --------------------  |  --------------------  |
			 *  | |  1  |まぐろ|  100  | | |  1  |ハマチ|  100  | |
			 *  |  --------------------  |  --------------------  |
			 *   -------------------------------------------------|
			*/
		}

		st.close();
		con.close(); // DB接続を閉じる

		return list; // listの値を返却する
	}

	public int insert(Student student) throws Exception {
		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
			"insert into student values(null, ?, ?)");
		st.setString(1, student.getName());
		st.setInt(2, student.getEnt_year());
		int line=st.executeUpdate();

		st.close();
		con.close();
		return line;
	}
}