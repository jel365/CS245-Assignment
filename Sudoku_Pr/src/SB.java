
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James
 */
public class SB extends JButton implements ActionListener{

    public SB(String string){
        addActionListener(this);
        setText(string);
    }

    
    
    public void actionPerformed(ActionEvent e) {
        setText("P");
      System.out.println("pressed");
      revalidate();
    }
    
}
