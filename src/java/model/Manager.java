/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dangt
 */
public class Manager {
    private int id;
    private String name;
    public Manager() {
    }

    public Manager(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String Name() {
        return name;
    }

    @Override
    public String toString() {
        return "Manager{" + "id=" + id + ", name=" + name + '}';
    }

       
    
}
