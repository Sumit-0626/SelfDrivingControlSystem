package com.sdcs.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {

    private static final String URL = "jdbc:mysql://localhost:3306/self_driving";
    private static final String USER = "root";
    private static final String PASS = "sumit@2602i";

    // THIS is the method all servlets need!
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
