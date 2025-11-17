/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dangt
 */
public class LoaiNguyenLieu {
    private int id;
    private String name;
    private String donvi;

    public LoaiNguyenLieu(int id, String name, String donvi) {
        this.id = id;
        this.name = name;
        this.donvi = donvi;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDonvi() {
        return donvi;
    }
    
}
