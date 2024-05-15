package chapter23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDelete {
    public static void main(String[] args) {
        // データベース接続情報
    	String dbUrl = "jdbc:h2:~/Seiseki";
        String dbUser = "sa";
        String dbPassword = ""; // DBに接続(DAOのgetConnectionメソッドを実行)

        // 削除対象の学生番号
        int studentIdToDelete = 1001; // 例として学生番号1001を指定

        try {
            // データベースに接続
            Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            // SQL文を準備
            String deleteQuery = "DELETE FROM student WHERE NO = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setInt(1, studentIdToDelete);

            // 学生情報を削除
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("学生情報が正常に削除されました。");
            } else {
                System.out.println("学生情報の削除に失敗しました。");
            }

            // 接続を閉じる
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
