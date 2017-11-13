/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.awt.Rectangle;

/**
 *
 * @author USUARIO
 */
public class Rectangulo extends Rectangle{
    enum Tipo{
    Cerdo,Objeto;
    }
    private Tipo tipo;
    public Rectangulo(int x,int y,int width,int height,Tipo tipo){
    super(x, y, width, height);
    this.tipo=tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }
    
}
