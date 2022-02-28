/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.singleton;

/**
 *
 * @author alvar
 */
public class InstitutoEducativo {

    private static InstitutoEducativo instacia;

    private InstitutoEducativo() {
    }

    public static InstitutoEducativo getInstance(){
        if (instacia==null) {
            instacia = new InstitutoEducativo();
        }
        return instacia;
    }
    
    public void saludoInstituto(){
        System.out.println("Hola, soy la unica instancia instituto");
    }
}
