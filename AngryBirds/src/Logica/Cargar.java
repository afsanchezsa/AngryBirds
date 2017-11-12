/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.ImageIcon;

/**
 *
 * @author USUARIO
 */
public class Cargar {
    private ArrayList<String[][] >matrices;
    private HashMap<String,Image> imagenes;
    public Cargar() throws FileNotFoundException{

    String [][]matriz=new String[15][30];
    
 this.matrices=new ArrayList<>();
    this.imagenes=new HashMap<>();
    this.imagenes.put("X", null);
    this.imagenes.put("B",loadImage("bloque.png"));
    this.imagenes.put("C",loadImage("cerdo.png"));
    File archivo=new File("Niveles");
    if(archivo.exists()){
    if(archivo.isDirectory()){
    String archivosinternos[]=archivo.list();
    
    for(String s:archivosinternos){
    System.out.println(s);
    File archivointerno=new File("Niveles/"+s);
        int i=0;
        int fila=0;
       if(archivointerno.exists()){
           System.out.println("existe");
    Scanner entrada=new Scanner(archivointerno);
           entrada.useDelimiter(",");
    while(entrada.hasNext()){
    
    
    String cadena=entrada.next();    
        System.out.println(cadena);
   
        
         
    matriz[fila][i]=cadena;
    if(fila<14&&i<29){
    i++;
    }else if(fila<14&&i==29){
    i=0;
    fila++;
    }else if(fila==14&&i==29){
    
    }
   
      
    
    
    }
   
    this.matrices.add(matriz);
    }
    
       
       
       
    
    }
    
    }
    }
    
    
    } 

    public ArrayList<String[][]> getMatrices() {
        return matrices;
    }
    public static Image loadImage(String ruta){
    ImageIcon im=new ImageIcon(ruta);
    Image imagen=im.getImage();
    return imagen;
    }

    public HashMap<String, Image> getImagenes() {
        return imagenes;
    }
public void ponerEnemigos(){

}
            }

