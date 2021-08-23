package Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DBConnect {
    private final String url;
    private final Properties properties;

    public DBConnect(String host, String DB, String user, String Password) {
        this.url = "jdbc:mysql://"+host+"/"+DB;
        this.properties = new Properties();
        properties.setProperty("user",user);
        properties.setProperty("password",Password);
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.url, this.properties);
    }

}
