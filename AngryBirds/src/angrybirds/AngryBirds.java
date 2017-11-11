/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angrybirds;

import Controlador.Controlador;
import Datos.Juego;
import Logica.Logica;
import Vista.Marco;
import Vista.Panel;
import javax.swing.JFrame;

/**
 *
 * @author COMPAQ
 */
public class AngryBirds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Juego juego=new Juego();
        juego.addAve( "rojo");
        
        Panel panel=new Panel(juego);
        
       panel.setControlador(new Controlador(juego,panel));
       Logica logica=new Logica(juego); 
       Marco marco=new Marco();
     
        marco.add(panel);
        logica.moverAve(2);
        marco.repaint();
        marco.setVisible(true);
    }
    
}
