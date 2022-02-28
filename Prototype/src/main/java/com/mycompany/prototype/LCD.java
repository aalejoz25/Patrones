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
public class LCD extends TV{
    
    private double costoFabricacion;

    public LCD(double costoFabricacion, String marca, int pulgadas, String color, double precio) {
        super(marca, pulgadas, color, precio);
        this.costoFabricacion = costoFabricacion;
    }

    public double getCostoFabricacion() {
        return costoFabricacion;
    }
    
    
    
}
