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
public class Main {
    public static void main(String[] args) {
        InstitutoEducativo instituto = InstitutoEducativo.getInstance();      
        InstitutoEducativo instituto2 = InstitutoEducativo.getInstance();
        
        instituto.saludoInstituto();
        instituto2.saludoInstituto();
      
    }
}
