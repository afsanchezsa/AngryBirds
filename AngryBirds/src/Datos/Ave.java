/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Vista.Salto;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.ArrayList;

/**
 *
 * @author COMPAQ
 */
public class Ave extends Personaje {
private String Tipo;
private Thread Salto;
    public Ave(String Tipo) {
        super(0, Toolkit.getDefaultToolkit().getScreenSize().height-200);
        this.Tipo=Tipo;
        this.imagen=loadImage(Tipo+".png");
        Salto=null;
    }
    
    
    


    public void mover(double angulo) {
       Salto=new Thread(new Salto(this,angulo));
       Salto.start();
    }
    public boolean verificarColisionObjeto(ArrayList<Rectangulo>rectangulos){
    boolean colisiono=false;
        for(Rectangulo r:rectangulos){
    if(r.contains(this.x,this.y)&&r.getTipo().equals(Rectangulo.Tipo.Objeto)){
    colisiono=true;
    break;
    }
    }
    return colisiono;
    }
    public void parar(){
    this.Salto.suspend();
    this.Salto=null;
    this.Salto=new Thread(new Salto(this,0));
    this.x=0;
    this.y= Toolkit.getDefaultToolkit().getScreenSize().height-200;
    }
    public boolean verificarColisionCerdo(ArrayList<Rectangulo>rectangulos){
    boolean colisiono=false;
    for(Rectangulo r:rectangulos){
    if(r.contains(this.x,this.y)&&r.getTipo().equals(Rectangulo.Tipo.Cerdo)){
     colisiono=true;
     break;
    }
    }  
    
    return colisiono;
    }
}
