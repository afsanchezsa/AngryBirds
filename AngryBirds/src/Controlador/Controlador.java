/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.Juego;
import Logica.Logica;
import Vista.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class Controlador implements MouseListener {
     
    private Juego juego;
    private JPanel vista;
private Logica logica;
    public Controlador(Juego juego,JPanel vista) {
       
    this.juego=juego;
        this.logica=new Logica(this.juego,vista);
        this.vista=vista;
        
    
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        double angulo=Math.atan(Math.abs(600-e.getPoint().y)/Math.abs(e.getPoint().x));
        double hipotenusa=Math.hypot(600-e.getPoint().y, e.getPoint().x);
        double angulo2=Math.acos(e.getPoint().x/hipotenusa);
        //Math.a 
        System.out.println(Math.toDegrees(angulo2));
        this.logica.moverAve(Math.toDegrees(angulo2));
        this.vista.repaint();
     
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }
    
}
