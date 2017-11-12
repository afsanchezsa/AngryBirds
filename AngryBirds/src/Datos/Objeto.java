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
public class Objeto {
private Image imagen;
private int x;
private int y;
enum Tipo{
Vertical,Horizontal;

}
private Tipo tipo;
    public Objeto(int x, int y,Tipo tipo) {
        this.x = x;
        this.y = y;
        this.tipo=tipo;
        if(this.tipo.equals(tipo.Horizontal)){
        
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    private static  Image loadImage(String ruta ){
    ImageIcon im=new ImageIcon(ruta);
    Image imagen=im.getImage();
    
    return imagen;
    }

}
