/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angrybirds;

import Vista.Panel;
import javax.swing.JFrame;

/**
 *
 * @author COMPAQ
 */
public class AngryBirds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Panel panel=new Panel();
        JFrame marco=new JFrame();
        marco.add(panel);
        marco.setVisible(true);
    }
    
}
