
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Board extends JPanel{

   int [][]userAnswer = new int[9][9];
   JPanel boardPanel = new JPanel();
   
   JFrame Wind = new JFrame("Sudoku");
   
   public void windSet(){
        Wind.setSize(600, 400);
        Wind.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Wind.setLocationRelativeTo(null);
        Wind.setVisible(true);
        
        Wind.setFocusable(true);
        Wind.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                if(ke.getKeyCode() == KeyEvent.VK_ESCAPE)
                {
                    System.exit(0);
                }//To change body of generated methods, choose Tools | Templates.
                if(ke.getKeyCode() == KeyEvent.VK_F1)
                {
                    JOptionPane.showMessageDialog(Wind, "James : BRONCO_ID \n" + "Jorge : BRONCO_ID \n" + "Jacob Kim : 010500230 \n" + "SUDOKU PROJECT -- Fall 2017\n");
                }
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
   }
   
   public void setup(){
      
      
      boardPanel.setLayout(new GridLayout(0,9));
     for(int i = 0; i < 54; i++){
            JButton r = new JButton("+");
            SB k = new SB("+");
            
             boardPanel.add(k);
             System.out.println("Added " + (i+1));
            
         }
     Wind.setMinimumSize(Wind.getSize());
     Wind.add(boardPanel);
     Wind.pack();
    
     
   }
   
   public void presets(){
       boardPanel.add(new JButton("8"),0);
       userAnswer[0][0] = 8;
       boardPanel.getComponent(0).setEnabled(false);
       
       boardPanel.add(new JButton("4"),3);
       userAnswer[0][3] = 4;
       boardPanel.getComponent(3).setEnabled(false);
       
       boardPanel.add(new JButton("6"),5);
       userAnswer[0][5] = 6;
       boardPanel.getComponent(5).setEnabled(false);
       
       boardPanel.add(new JButton("7"),8);
       userAnswer[0][8] = 7;
       boardPanel.getComponent(8).setEnabled(false);
       
       boardPanel.add(new JButton("4"),15);
       userAnswer[1][6] = 4;
       boardPanel.getComponent(15).setEnabled(false);
       
       boardPanel.add(new JButton("1"),19);
       userAnswer[1][1] = 1;
       boardPanel.getComponent(19).setEnabled(false);       
       
       boardPanel.add(new JButton("6"),24);
       userAnswer[2][6] = 6;
       boardPanel.getComponent(24).setEnabled(false);
       
       boardPanel.add(new JButton("5"),25);  
       userAnswer[2][7] = 5;
       boardPanel.getComponent(25).setEnabled(false);
       
       boardPanel.add(new JButton("5"),27);
       userAnswer[2][0] = 5;
       boardPanel.getComponent(27).setEnabled(false);
       
       boardPanel.add(new JButton("9"),29);
       userAnswer[2][2] = 9;
       boardPanel.getComponent(29).setEnabled(false);
          
       boardPanel.add(new JButton("3"),31);
       userAnswer[3][4] = 3;
       boardPanel.getComponent(31).setEnabled(false);
       
       boardPanel.add(new JButton("7"),33);
       userAnswer[3][6] = 7;
       boardPanel.getComponent(33).setEnabled(false);
       
       boardPanel.add(new JButton("8"),34);
       userAnswer[3][7] = 8;
       boardPanel.getComponent(34).setEnabled(false);
       
       boardPanel.add(new JButton("7"),40);
       userAnswer[4][4] = 7;
       boardPanel.getComponent(40).setEnabled(false);
       
       boardPanel.add(new JButton("4"),46);
       userAnswer[4][1] = 4;
       boardPanel.getComponent(46).setEnabled(false);
       
       boardPanel.add(new JButton("8"),47);
       userAnswer[4][2] = 8;
       boardPanel.getComponent(47).setEnabled(false);
       
       boardPanel.add(new JButton("2"),49);
       userAnswer[4][4] = 2;
       boardPanel.getComponent(49).setEnabled(false);
       
       boardPanel.add(new JButton("1"),51);
       userAnswer[5][6] = 1;
       boardPanel.getComponent(51).setEnabled(false);
       
       boardPanel.add(new JButton("3"),53);
       userAnswer[5][8] = 3;
       boardPanel.getComponent(53).setEnabled(false);
       
       boardPanel.add(new JButton("5"),55);
       userAnswer[5][1] = 5;
       boardPanel.getComponent(55).setEnabled(false);
       
       boardPanel.add(new JButton("2"),56);
       userAnswer[5][2] = 2;
       boardPanel.getComponent(56).setEnabled(false);
       
       boardPanel.add(new JButton("9"),61);
       userAnswer[6][7] = 9;
       boardPanel.getComponent(61).setEnabled(false);
       
       boardPanel.add(new JButton("1"),65);
       userAnswer[6][2] = 1;
       boardPanel.getComponent(65).setEnabled(false);
       
       boardPanel.add(new JButton("3"),72);
       userAnswer[7][0] = 3;
       boardPanel.getComponent(72).setEnabled(false);
       
       boardPanel.add(new JButton("9"),75);    
       userAnswer[7][3] = 9;
       boardPanel.getComponent(75).setEnabled(false);
       
       boardPanel.add(new JButton("2"),78);
       userAnswer[7][6] = 2;
       boardPanel.getComponent(78).setEnabled(false);
       
       boardPanel.add(new JButton("5"),80);
       userAnswer[8][8] = 5;
       boardPanel.getComponent(80).setEnabled(false);
       
       Wind.revalidate();
   }
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
