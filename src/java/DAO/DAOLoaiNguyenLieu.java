/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import model.LoaiNguyenLieu;
/**
 *
 * @author dangt
 */
public class DAOLoaiNguyenLieu extends DBConnect{

    public DAOLoaiNguyenLieu() {
    }
    
    public LoaiNguyenLieu getLoaiNguyenLieu( int id){
        String sql = "select * from loainguyenlieu where id = ?";
        try {
            PreparedStatement pr = this.conn.prepareStatement(sql);
            pr.setInt(1, id);
            ResultSet rs = pr.executeQuery();
            if(rs.next()){
                String name = rs.getString("name");
                String donvi = rs.getString("donvi");
                return new LoaiNguyenLieu(id, name, donvi);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
