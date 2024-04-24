package chapter24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentListAction {
    public static void main(String[] args) {
        // H2データベースへの接続URL
        String jdbcURL = "jdbc:h2:~/Seiseki"; // データベースのパスを適宜変更してください
        String user = "sa"; // ユーザー名
        String password = ""; // パスワード

        try {
            // H2 JDBCドライバをロード
            Class.forName("org.h2.Driver");

            // コネクションを確立
            Connection connection = DriverManager.getConnection(jdbcURL, user, password);

            // ステートメントを作成
            Statement statement = connection.createStatement();

            // SQLクエリを実行し、結果を取得
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Student");

            // 結果を1行ずつ処理
            while (resultSet.next()) {
                String no = resultSet.getString("no");
                String name = resultSet.getString("name");
                String ent_year = resultSet.getString("ent_year");
                String class_num = resultSet.getString("class_num");
                Boolean isattend = resultSet.getBoolean("isattend");
                String school_cd = resultSet.getString("shool_cd");


                // 学生情報を表示
                System.out.println("No: " + no + ", Name: " + name + ", Ent_year: " + ent_year + ", Class_num: " + class_num + ", Isattend: " + isattend+ ", School_cd: " + school_cd);
            }

            // リソースを閉じる
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
