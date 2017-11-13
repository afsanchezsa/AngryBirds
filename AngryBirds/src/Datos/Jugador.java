/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author COMPAQ
 */
public class Jugador {
    private int Puntaje;
    private String Nombre;
    int intentos;

    public Jugador(String Nombre) {
        this.Nombre = Nombre;
        this.Puntaje=0;
        this.intentos=0;
    }
public void AumentarPuntaje(){
this.Puntaje+=100;
}

    public int getPuntaje() {
        return Puntaje;
    }

    public int getIntentos() {
        return intentos;
    }
    public void AumentarIntento(){
    this.intentos++;
    }
}
