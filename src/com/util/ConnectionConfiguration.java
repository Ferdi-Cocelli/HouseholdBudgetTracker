package com.util;
import java.sql.*;

public class ConnectionConfiguration {

    public static Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Housebudget", "root", "ferdi" );

        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;

    }
}
