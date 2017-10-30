import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * file: main.java
 * authors: Jacob Kim, James Lee, Jorge Luis Carrera
 * class: CS 245 - Graphical User Interfaces
 * 
 * assignment: Program 1
 * date last modified: 10/29/2017
 * 
 * purpose: This program runs a hangman game with the ability to freely
 * view credits, high scores, or start another game.
 */


public class main{
    private static Timer timer;

    //method: main
    //purpose: Starts the program.
    public static void main(String[] args) {
        FrSetup wind = new FrSetup();
        wind.inSet();

        ActionListener timedSwitch = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                timer.stop();
                wind.wipe();
                wind.Menu();
            }
        };
        timer = new Timer(3000, timedSwitch);
        timer.setRepeats(false);
        timer.setInitialDelay(3000);
        wind.titleCard();

        timer.start();
    }
        
    
}
