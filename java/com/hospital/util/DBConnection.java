package com.hospital.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hospital_db", "root", "Bhargav@2131");
            System.out.println("DB Connection Success");
        } catch (Exception e) {
            System.out.println("DB Connection Error: " + e.getMessage());
        }
        return con;
    }
}
