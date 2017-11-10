/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.awt.Image;

/**
 *
 * @author COMPAQ
 */
public abstract class Personaje {
        private int x;
        private int y;
        private Image imagen;

    public Personaje(int x,int y) {
       this.x=x;
       this.y=y;
       }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImagen() {
        return imagen;
    }
    
    public abstract void mover();
        
        
        
        
        
}
