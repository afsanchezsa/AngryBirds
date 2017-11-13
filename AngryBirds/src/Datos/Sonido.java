/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.HeadlessException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JApplet;

/**
 *
 * @author USUARIO
 */
public class Sonido  {
    private AudioClip sonido;
    private URL url;
enum Tipo{
GANAR,PERDER;
}
private Tipo tipo;
    public Sonido(Tipo tipo) throws HeadlessException {
        this.tipo=tipo;
        try {
            if(this.tipo.equals(Tipo.GANAR)){
            this.url=new URL("file:coin.wav");
            }else{
            this.url=new URL("file:block-hit.wav");
            }
            
            this.sonido=Applet.newAudioClip(url);
            
        } catch (MalformedURLException ex) {
            
        }
    }
    public void play(){
    this.sonido.play();
    }
}
