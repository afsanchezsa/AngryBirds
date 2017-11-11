/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Datos.Ave;
import Datos.Juego;
import Datos.Personaje;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author COMPAQ
 */
public class Panel extends JPanel implements ActionListener {
ArrayList<Personaje>personajes;
    private Juego juego;
private Image piso1;
private Image fondo;
private Timer timer;
private Controlador controlador;
private Thread repintar;
private Thread  salto;
    public Panel(Juego juego) {
     this.juego=   juego;
        this.setSize(600, 500);
        
this.personajes=new ArrayList<>();
this.piso1=loadImage("ground_loop.png");
    this.fondo=loadImage("blue_background.png");
    this.timer=new Timer(10,this);
    this.timer.start();
    /*this.repintar=new Thread(new Repint(this));
    this.repintar.run();
    for(Personaje p:this.personajes){
    if(p instanceof Ave){
    Personaje ave=p;
    salto=new Thread(new Salto(p,0));
    break;
    }
    
    }*/
    this.setVisible(true);
    
    
    }

   

    @Override
    public void paintComponent(Graphics g){
super.paintComponent(g);

 personajes=personajes=this.juego.getPersonajes();
for(int i=0;i<(Toolkit.getDefaultToolkit().getScreenSize().width/80)+1;i++){

g.drawImage(fondo, i*80,0, 121, this.fondo.getHeight(this), this);
}
for(int i=0;i<(Toolkit.getDefaultToolkit().getScreenSize().width/121)+1;i++){

g.drawImage(piso1, i*121, /*500*/ Toolkit.getDefaultToolkit().getScreenSize().height-120, 121, piso1.getHeight(this), this);
}
for(Personaje personaje:this.juego.getPersonajes()){
g.drawImage(personaje.getImagen(),personaje.getX(),personaje.getY() /*Toolkit.getDefaultToolkit().getScreenSize().height-200*/, 40, 40, this);

}


/*for(Personaje personaje:personajes){

g.drawImage(personaje.getImagen(), personaje.getImagen().getHeight(this), personaje.getImagen().getWidth(this), this);
}*/


}
public void setControlador(Controlador controlador){
this.controlador=controlador;
this.addMouseListener(controlador);
}
    
    
    
    

 public static Image loadImage(String ruta){
 ImageIcon im=new ImageIcon(ruta);
 Image imagen=im.getImage();
 return imagen;
 }   

    @Override
    public void actionPerformed(ActionEvent e) {
       this.repaint();
    }
}
