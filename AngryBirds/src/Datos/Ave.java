/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Vista.Salto;
import java.awt.Toolkit;

/**
 *
 * @author COMPAQ
 */
public class Ave extends Personaje {
private String Tipo;
private Thread Salto;
    public Ave(String Tipo) {
        super(0, Toolkit.getDefaultToolkit().getScreenSize().height-200);
        this.Tipo=Tipo;
        this.imagen=loadImage(Tipo+".png");
        Salto=null;
    }
    
    
    


    public void mover(double angulo) {
       Salto=new Thread(new Salto(this,angulo));
       Salto.start();
    }
    
}
