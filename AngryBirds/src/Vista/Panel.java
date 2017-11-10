/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Datos.Juego;
import Datos.Personaje;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author COMPAQ
 */
public class Panel extends JPanel  {
private Juego juego;
    public Panel(/*Juego juego*/) {
     this.juego=   juego;
        this.setSize(600, 500);
        this.setVisible(true);
    }

   

    @Override
    public void paintComponent(Graphics g){
super.paintComponent(g);
ArrayList<Personaje>personajes=this.juego.getPersonajes();




for(Personaje personaje:personajes){

g.drawImage(personaje.getImagen(), personaje.getImagen().getHeight(this), personaje.getImagen().getWidth(this), this);
}


}

    
    
    
    

    
}
