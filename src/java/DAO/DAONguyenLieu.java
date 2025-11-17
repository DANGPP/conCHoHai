/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import model.LoaiNguyenLieu;
import model.NguyenLieu;
/**
 *
 * @author dangt
 */
public class DAONguyenLieu extends DBConnect{
    private final DAOLoaiNguyenLieu daoLNL = new DAOLoaiNguyenLieu();

    public DAONguyenLieu() {
    
    }
    
    public List<NguyenLieu> getNguyenLieu(String tennguyenlieu){
        String sql = "select * from nguyenlieu where name like ?";
        List<NguyenLieu> lstNL = new ArrayList<>();
        try {
            PreparedStatement pr = this.conn.prepareStatement(sql);
            pr.setString(1, "%"+tennguyenlieu+"%");
            ResultSet rs = pr.executeQuery();
            while (rs.next()){
                int idNL = rs.getInt("id");
                String name = rs.getString("name");
                int idLNL = rs.getInt("loaiNguyenLieuId");
                LoaiNguyenLieu lnl = daoLNL.getLoaiNguyenLieu(idLNL);
                lstNL.add(new NguyenLieu(idNL, name, lnl));
            }
            return lstNL;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
