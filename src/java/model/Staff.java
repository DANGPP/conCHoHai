/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dangt
 */
public class Staff {

    private int id;
    private String username;
    private String password;
    private String role;

    public Staff(int id, String username, String role) {
        this.id = id;
        this.username = username;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "Staff{" + "id=" + id + ", username=" + username + ", password=" + password + ", role=" + role + '}';
    }

}
