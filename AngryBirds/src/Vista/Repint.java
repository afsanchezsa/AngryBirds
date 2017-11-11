/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class Repint implements Runnable {
private JPanel panel;
    public Repint(JPanel panel){
this.panel=panel;
}
    @Override
    public void run() {
      while(true){
      this.panel.repaint();
      }
    }
    
}
