
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James
 */
public class Driver {
    public static void main(String[]args){
        
        Board b = new Board();
        b.windSet();
        b.setup();
        b.presets();
    }
}
