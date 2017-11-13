/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Datos.Ave;
import Datos.Personaje;

/**
 *
 * @author USUARIO
 */
public class Salto implements Runnable{
    
    private Personaje personaje;
private final double  VELOCIDAD=10;
private  double Angulo;
private double vy,vx;
int  posx;
int posy;
int x;
int y;
   double t;
public Salto(Personaje personaje,double angulo){
this.personaje=personaje;
this.Angulo=angulo;

t=0;
}

    @Override
    public void run() {
        
for(int i=0;i<1000;i++){
        //this.Bola.aumentary(); 
     
           x=personaje.getX();
           y=personaje.getY();
           vx=VELOCIDAD*Math.cos(Math.toRadians(Angulo));
           vy=VELOCIDAD*Math.sin(Math.toRadians(Angulo));
          //vx=10;
          //vy=-30;
          posx=(int)(this.x+vx*t);
           posy=(int)(this.y-vy*t+((3.9)*t*t));
           personaje.setX(posx);
           personaje.setY(posy);
           t+=0.02;
           
           
           try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                System.out.println("eroor");
            }
           if(personaje.getY()>=605){
           break;
           }
    }
    
    
    
}

}
   

