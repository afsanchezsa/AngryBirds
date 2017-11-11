/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.awt.Toolkit;

/**
 *
 * @author COMPAQ
 */
public class Ave extends Personaje {
private String Tipo;
    public Ave(String Tipo) {
        super(0, Toolkit.getDefaultToolkit().getScreenSize().height-200);
        this.Tipo=Tipo;
        this.imagen=loadImage(Tipo+".png");
    }
    
    
    

    @Override
    public void mover() {
       
    }
    
}
