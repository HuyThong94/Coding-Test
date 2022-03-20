/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MyConnect {
    public static Connection conn = null;
    public static void main(String[] args) {
        try {
            // connnect to database 'testdb'
            conn = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/?user=root&password=");
            Statement s = conn.createStatement();
            int result = s.executeUpdate("CREATE DATABASE sinhvien "
                    + "character set UTF8 collate utf8_vietnamese_ci;");
            if (result == 1) {
                System.out.println("Database 'sinhvien' được tạo thành công!");
            }
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
