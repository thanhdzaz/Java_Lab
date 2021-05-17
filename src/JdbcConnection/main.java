package JdbcConnection;

import java.sql.*;

public class main {
    public static void main(String[] args) {
        DBConnect db = new DBConnect("localhost","oop","root","");
        try {

            Connection connection = db.getConnection();

            Statement statement = connection.createStatement();

            String sql = "SELECT * FROM employees";

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                System.out.println(resultSet.getString("last_name")+" - "+resultSet.getString("email"));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // close connections,...
        }
    }
}
