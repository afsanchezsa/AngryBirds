/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

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
    
    }
    
public void addJugador(String nombre){
this.jugador=new Jugador(nombre);
}
public void addCerdo(int x, int y){
this.personajes.add(new Cerdo(x,y));

}
public void addAve(int x, int y,String tipo){
this.personajes.add(new Ave(x, y, tipo));
}
public void addObjeto(int x,int y){
this.objetos.add(new Objeto(x,y));

}

    public ArrayList<Objeto> getObjetos() {
        return objetos;
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

}
