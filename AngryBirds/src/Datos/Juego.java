/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.ArrayList;

/**
 *
 * @author COMPAQ
 */
public class Juego {
    private ArrayList<Objeto>objetos;
    private ArrayList<Personaje>personajes;
    private Jugador jugador;
    private ArrayList<Rectangulo>rectangulos;
    public Juego() {
    this.objetos=new ArrayList<>();
    this.personajes=new ArrayList<>();
    this.jugador=new Jugador("");
    this.rectangulos=new ArrayList<>();
    }
    
public void addJugador(String nombre){
this.jugador=new Jugador(nombre);
}
public void addCerdo(int x, int y){
this.personajes.add(new Cerdo(x,y));
this.rectangulos.add(new Rectangulo(x,y,Toolkit.getDefaultToolkit().getScreenSize().width/30,
        Toolkit.getDefaultToolkit().getScreenSize().height/15,Rectangulo.Tipo.Cerdo));
}

    public ArrayList<Rectangulo> getRectangulos() {
        return rectangulos;
    }
public void addAve(String tipo){
this.personajes.add(new Ave( tipo));
}
public void addObjeto(int x,int y){
this.objetos.add(new Objeto(x,y));
this.rectangulos.add(new Rectangulo(x,y,Toolkit.getDefaultToolkit().getScreenSize().width/30,
        Toolkit.getDefaultToolkit().getScreenSize().height/15,Rectangulo.Tipo.Objeto));

}

    public ArrayList<Objeto> getObjetos() {
        return objetos;
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }
    public void AumentarPuntaje(){
    this.jugador.AumentarPuntaje();
    }
}
