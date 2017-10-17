/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author James
 */
public class L {
public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setPreferredSize(new Dimension(600,400));
        j.setSize(j.getPreferredSize());
        j.setVisible(true);
        j.setLocationRelativeTo(null);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BB i = new BB();
        
        j.add(i);
        
        
       
    }
    
}
