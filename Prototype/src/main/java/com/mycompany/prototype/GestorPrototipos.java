/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prototype;

import java.util.HashMap;

/**
 *
 * @author alvar
 */
public class GestorPrototipos {
    private HashMap<String,TV> prototipos = new HashMap<String,TV>();

    public GestorPrototipos() {
        Plasma plasma = new Plasma(90, 0.05, "Sony", 21, "Gris", 400);
        LCD lcd = new LCD(200, "Sony", 21, "negro", 400);
        
        prototipos.put("Plasma", plasma);
        prototipos.put("LCD", lcd);
    }
    
    public Object prototipo(String tipo) throws CloneNotSupportedException{
        return prototipos.get(tipo).clonar();
    }
    
}
