/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import model.Staff;

/**
 *
 * @author dangt
 */
public class DAOStaff extends DBConnect{


    public DAOStaff() {
        
    }

    public Staff checkLogin(String username, String password) {
        String sql = "select * from staff where username=? and password=?";
        try {
            PreparedStatement pr = this.conn.prepareStatement(sql);
            pr.setString(1, username);
            pr.setString(2, password);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                String un = rs.getString("username");
                String role = rs.getString("role");
                return new Staff(id, un, role);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
