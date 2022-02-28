/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prototype;

/**
 *
 * @author alvar
 */
public abstract class TV implements Cloneable{
    private String marca;
    private int pulgadas;
    private String color;
    private double precio;

    public TV(String marca, int pulgadas, String color, double precio) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.color = color;
        this.precio = precio;
    }
    
    public Object clonar() throws CloneNotSupportedException{
        return super.clone();
    }

    public String getMarca() {
        return marca;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }
    
    
    
}
