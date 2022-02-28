/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bulider;

/**
 *
 * @author alvar
 */
public class ConcesionarioDirector {
    
    private AutoBuilder autobuilder;
    
    public void construirAuto(){
        autobuilder.crearAuto();
        autobuilder.buildMarca();
        autobuilder.buildModelo();
        autobuilder.buildMotor();
        autobuilder.buildPuertas();
    }

    public void setAutobuilder(AutoBuilder autobuilder) {
        this.autobuilder = autobuilder;
    }
    
    public Auto getAuto() {
        return autobuilder.getAuto();
    }
    
}
