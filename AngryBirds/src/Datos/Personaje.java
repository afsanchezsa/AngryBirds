/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author COMPAQ
 */
public abstract class Personaje {
        protected int x;
        protected int y;
        protected Image imagen;
        
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

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    //public abstract void mover();
        public static Image loadImage(String ruta){
        ImageIcon im=new ImageIcon(ruta);
        Image imagen=im.getImage();
                return imagen;
        }
        
        
        
        
}
