/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Celia
 */
public class AdminDao {
    private String dbUrl="jdbc:mysql://localhost:3306/tutoring_management_system_db";
    private String username="root";
    private String passwd="";

    public AdminDao() {
    }
    
    public String loginAdmin(String email, String password) {
    try {
        Connection con = DriverManager.getConnection(dbUrl, username, passwd);

        String sql = "SELECT * FROM admin WHERE email = ? AND password = ?";
        PreparedStatement pst = con.prepareStatement(sql);

        pst.setString(1, email);
        pst.setString(2, password);

        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            // If a matching record is found, return "Login Successful"
            con.close();
            return "Admin login Successful";
        } else {
            // If no matching record is found, return "Login Failed"
            con.close();
            return "Login Failed";
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "Server Error!!";
}
    
}
