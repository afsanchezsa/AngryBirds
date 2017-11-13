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
public class Cerdo extends Personaje{
    private boolean EstadoVivo;

    public Cerdo( int x, int y) {
        super(x, y);
        this.EstadoVivo = true;
        this.imagen=loadImage("cerdo.png");
    }

  
  /*  public void mover() {
        
    }*/

    public boolean getEstadoVivo() {
        return this.EstadoVivo;
    }
    public void SetImage(Image imagen){
    this.imagen=imagen;
    }
    
}
