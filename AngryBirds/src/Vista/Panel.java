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
import Logica.Cargar;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author COMPAQ
 */
public class Panel extends JPanel implements ActionListener {
private int nivel;
 private   ArrayList<Personaje>personajes;
 private ArrayList<Rectangle>rectangulos;
    private Juego juego;
private Image piso1;
private Image fondo;
private Timer timer;
private Controlador controlador;
private Thread repintar;
private Thread  salto;
private Cargar cargar;
    public Panel(Juego juego) {
     this.juego=   juego;
        this.setSize(600, 500);
        this.rectangulos=new ArrayList<>();
this.personajes=new ArrayList<>();
this.piso1=loadImage("ground_loop.png");
    this.fondo=loadImage("blue_background.png");
    this.timer=new Timer(10,this);
    this.timer.start();
    this.nivel=0;
    try {
        this.cargar=new Cargar();
    } catch (FileNotFoundException ex) {
        System.out.println(ex.getMessage());
    }
    
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






ArrayList<String[][]>matrices=this.cargar.getMatrices();
String [][]nivel=new String[15][30];


nivel=matrices.get(this.nivel);



for(int i=0;i<15;i++){
for(int j=0;j<30;j++){

if( "C".equals(nivel[i][j])){

    this.juego.addCerdo((Toolkit.getDefaultToolkit().getScreenSize().width/30)*j, (Toolkit.getDefaultToolkit().getScreenSize().height)*i);  
    
}
g.drawImage(cargar.getImagenes().get(nivel[i][j]),(Toolkit.getDefaultToolkit().getScreenSize().width/30)*j ,( Toolkit.getDefaultToolkit().getScreenSize().height/15)*i, Toolkit.getDefaultToolkit().getScreenSize().width/30, Toolkit.getDefaultToolkit().getScreenSize().height/15, this);

}
}


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
    public void cambiarNivel(){
    this.nivel++;
    }
    
}
