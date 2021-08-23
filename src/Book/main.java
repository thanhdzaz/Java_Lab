package Book;

import JdbcConnection.DBConnect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class main {
    private Object b;
    public static void main(String[] args) {
        DBConnect db = new DBConnect("localhost","oop","root","");
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        ArrayList<Book> arrBooks = null;
         Book b = null;
         String loai = null;
         Book c = null;
         SGK sgk = null;
         TT tt = null;
         STK stk = null;
        try {
            arrBooks=new ArrayList<Book>();
            connection = db.getConnection();

            statement = connection.createStatement();

            String sql = "SELECT * FROM book";

            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
               loai = resultSet.getString("loai");

                if(loai.indexOf("SGK")!=-1) {
                    b = new SGK(resultSet.getInt("ms"), resultSet.getString("nxb"), resultSet.getString("ten"), resultSet.getString("tacgia"), resultSet.getInt("soluong"), resultSet.getFloat("gia"), resultSet.getInt("status"),resultSet.getString("loai"));
                }
                if(loai.indexOf("TT")!=-1) {
                    b = new TT(resultSet.getInt("ms"), resultSet.getString("nxb"), resultSet.getString("ten"),resultSet.getFloat("gia"),resultSet.getString("loai"));
                }
                if(loai.indexOf("STK")!=-1) {
                    b = new STK(resultSet.getInt("ms"), resultSet.getString("nxb"), resultSet.getString("ten"), resultSet.getString("tacgia"), resultSet.getInt("soluong"), resultSet.getFloat("gia"), resultSet.getInt("status"),resultSet.getString("loai"));
                }

                arrBooks.add(b);
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

        for(int i =0;i<arrBooks.size();i++){
            b = arrBooks.get(i);
            if(b.loai.indexOf("SGK")!=-1){
                sgk = (SGK) arrBooks.get(i);
                System.out.println(sgk.ten);
            }
            if(b.loai.indexOf("TT")!=-1){
                tt = (TT) arrBooks.get(i);
                System.out.println(tt.ten);
            }
            if(b.loai.indexOf("STK")!=-1){
                stk = (STK) arrBooks.get(i);
                System.out.println(stk.ten);
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






}


