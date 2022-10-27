/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.televentas;

/**
 *
 * @author XPG
 */
public class CalidadProducto {


    
    private String nombre;
    private String queja;
    private int num;
    
        public CalidadProducto(String nombre, String queja, int num) {
        this.nombre = nombre;
        this.queja = queja;
        this.num = num;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the queja
     */
    public String getQueja() {
        return queja;
    }

    /**
     * @param queja the queja to set
     */
    public void setQueja(String queja) {
        this.queja = queja;
    }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }
        
        
}
