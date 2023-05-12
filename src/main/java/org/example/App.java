package org.example;

import java.util.TimeZone;
import java.sql.*;

public class App {

    public static final String JDBC_Driver_MySQL = "com.mysql.cj.jdbc.Driver";
    public static final String JDBC_URL_MySQL = "jdbc:mysql://localhost:3306/Telemetry?user=root&password" +
            "=Telemetry1!" + "&serverTimezone=" + TimeZone.getDefault().getID();
    
    public static void main(String[] args) {

        try {
            Class.forName(JDBC_Driver_MySQL);
            Connection connection = DriverManager.getConnection(JDBC_URL_MySQL);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        
    }



}