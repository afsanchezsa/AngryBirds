/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Ave;
import Datos.Juego;
import Datos.Personaje;
import Logica.Cargar;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class Logica{
        private Juego juego;
        private JPanel panel;
      public Logica(Juego juego,JPanel panel){
      this.juego=juego;
      this.panel=panel;
      }
    
    public void moverAve(double angulo){
        for(Personaje personaje:this.juego.getPersonajes()){
        if(personaje instanceof Ave){
        Ave ave=(Ave)personaje;
        ave.mover(angulo);
        }
        }
        /*;
        int posy=personaje.getY();
        int y=(int) ((int)posy+vx*t-(4.9*t*t));
        int x=(int)((int)posx+vx*t);
        personaje.setX((int) x);
        personaje.setY((int) y);
        t+=000.1;
             
                this.panel.repaint();
                   try {
                  Thread.sleep(30);
                  } catch (InterruptedException ex) {
                  System.out.println(ex.getMessage());
                  }
                
              }
          }
            
        
        }*/
       
        }
        public void cambiarNivel() throws FileNotFoundException{
            Cargar cargar = new Cargar();
            
        }
        
  public void AumentarPuntaje(){
  this.juego.AumentarPuntaje();
  }
   } 

