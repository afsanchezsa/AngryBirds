/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Ave;
import Datos.Juego;
import Datos.Personaje;

/**
 *
 * @author USUARIO
 */
public class Logica{
        private Juego juego;
      public Logica(Juego juego){
      this.juego=juego;
      }
    
    public void moverAve(double angulo){
        for(Personaje personaje:juego.getPersonajes()){
        if(personaje instanceof Ave){
            for(int i=0;i<20;i++){
            int x=personaje.getX();
            int y=personaje.getY();
            personaje.setX(x+1);
        personaje.setY(x+1);
            }
        
        break;
        }
        }
   
   
   } 
}
