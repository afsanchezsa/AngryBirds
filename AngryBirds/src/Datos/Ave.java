/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author COMPAQ
 */
public class Ave extends Personaje {
private String Tipo;
    public Ave(int x, int y,String Tipo) {
        super(x, y);
        this.Tipo=Tipo;
    }
    
    
    

    @Override
    public void mover() {
       
    }
    
}
