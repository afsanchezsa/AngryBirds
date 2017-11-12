/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Datos.Objeto.Tipo;
import java.util.ArrayList;

/**
 *
 * @author COMPAQ
 */
public class Juego {
    private ArrayList<Objeto>objetos;
    private ArrayList<Personaje>personajes;
    private Jugador jugador;

    public Juego() {
    this.objetos=new ArrayList<>();
    this.personajes=new ArrayList<>();
    this.jugador=new Jugador("");
    }
    
public void addJugador(String nombre){
this.jugador=new Jugador(nombre);
}
public void addCerdo(int x, int y){
this.personajes.add(new Cerdo(x,y));

}
public void addAve(String tipo){
this.personajes.add(new Ave( tipo));
}
public void addObjeto(int x,int y,Tipo tipo){
this.objetos.add(new Objeto(x,y,tipo));

}

    public ArrayList<Objeto> getObjetos() {
        return objetos;
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

}
