package sample.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        String user = "sa";
        String password = "Tung@123456789";
        Connection connection = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://TUNG\\VANTUNG:1433;databaseName=UserManagement";
        connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
}           
