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
public class Main {
    public static void main(String[] args) {
        ConcesionarioDirector concesionario = new ConcesionarioDirector();
        concesionario.setAutobuilder(new FiatBuilder());
        concesionario.construirAuto();
        Auto auto = concesionario.getAuto();
        
        System.out.println(auto.getMarca());
        System.out.println(auto.getModelo());
        System.out.println(auto.getMotor().getPotencia());
    }
}
