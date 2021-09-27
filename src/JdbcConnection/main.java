package JdbcConnection;

import java.sql.*;

public class main {
    public static void main(String[] args){
         DBConnect db = new DBConnect("localhost","oop","root","");
         Connection connection = null;
         Statement statement = null;
         ResultSet resultSet = null;
         try {

             connection = db.getConnection();

             statement = connection.createStatement();

             String sql = "SELECT * FROM employees";

             resultSet = statement.executeQuery(sql);

             while (resultSet.next()) {
                 System.out.println(resultSet.getString("last_name")+" - "+resultSet.getString("email"));
             }


         } catch (SQLException e) {
             e.printStackTrace();
         } finally {
             try {
                 tat(connection,resultSet,statement);
             } catch (SQLException throwables) {
                 throwables.printStackTrace();
             }
         }
     }

     private static void tat(Connection connection, ResultSet resultSet, Statement statement)
         throws SQLException{
             try{
                 if(resultSet != null){
                     resultSet.close();
                 }
                 if(connection != null){
                     connection.close();
                 }
                 if(statement != null){
                     statement.close();
                 }
             }catch (Exception e){

             }

     }



// int x =6;
// Double d = 7.7;
// System.out.println((x>d) ? 99.9 : 9);

}



