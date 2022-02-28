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
public class Plasma extends TV{
    
    private double anguloVision;
    private double tiempoRespuesta;

    public Plasma(double anguloVision, double tiempoRespuesta, String marca, int pulgadas, String color, double precio) {
        super(marca, pulgadas, color, precio);
        this.anguloVision = anguloVision;
        this.tiempoRespuesta = tiempoRespuesta;
    }

    public double getAnguloVision() {
        return anguloVision;
    }

    public double getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    
    
    
    
  
    
}
