/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author USUARIO
 */
public class Marco extends JFrame{
    public Marco(){
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
