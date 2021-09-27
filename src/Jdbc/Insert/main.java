package Jdbc.Insert;

import JdbcConnection.DBConnect;

import java.sql.Connection;

public class main {

    public static void main(String[] args) {
        DBConnect dcm = new DBConnect("localhost","oop","root", "");

        try {
            Connection dc = dcm.getConnection();
            System.out.println(dc);

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
