/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import model.Manager;
/**
 *
 * @author dangt
 */
public class DAOManager {
    private Connection conn ;

    public DAOManager() {
        this.conn = DBConnect.getConnection();
    }
    public Manager getInfo(int id){
        String sql = "select * from manager where manager_id=?";
        try {
            PreparedStatement pr = this.conn.prepareStatement(sql);
            pr.setInt(1, id);
            ResultSet rs = pr.executeQuery();
            if(rs.next()){
                return new Manager(id, rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
        
    }
    
}
