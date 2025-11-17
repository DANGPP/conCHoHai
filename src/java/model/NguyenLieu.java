/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dangt
 */
public class NguyenLieu {
    private int id;
    private String name;
    private LoaiNguyenLieu loainguyenlieu;

    public NguyenLieu(int id, String name, LoaiNguyenLieu loainguyenlieu) {
        this.id = id;
        this.name = name;
        this.loainguyenlieu = loainguyenlieu;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LoaiNguyenLieu getLoainguyenlieu() {
        return loainguyenlieu;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoainguyenlieu(LoaiNguyenLieu loainguyenlieu) {
        this.loainguyenlieu = loainguyenlieu;
    }
    
}
