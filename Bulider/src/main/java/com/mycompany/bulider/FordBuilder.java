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
public class FordBuilder extends AutoBuilder {

    @Override
    public void buildMotor() {
        Motor motor = new Motor();
        motor.setNumero(1235446);
        motor.setPotencia("20 HP");
        auto.setMotor(motor);
    }

    @Override
    public void buildModelo() {
        auto.setModelo("Focus");
    }

    @Override
    public void buildMarca() {
        auto.setMarca("Ford");
    }

    @Override
    public void buildPuertas() {
        auto.setCantidadDePuertas(4);
    }

}
