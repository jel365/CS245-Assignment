import javax.swing.*;
import java.awt.*;

/**
 * file: BSet.java
 * authors: Jacob Kim, James Lee, Jorge Luis Carrera
 * class: CS 245 - Graphical User Interfaces
 * 
 * assignment: Program 1
 * date last modified: 10/29/2017
 * 
 * purpose: This program runs a hangman game with the ability to freely
 * view credits, high scores, or start another game.
 */

public class SudokuBoard extends JFrame{

   int[][] userAnswer = new int[9][9];
   public static int[][][][] sectorUserAnswer = new int[3][3][3][3];
   public static int[][][][] inputAnswers = new int[3][3][3][3];
   JPanel boardPanel = new JPanel();
   JPanel sector0 = new JPanel();
   JPanel sector1 = new JPanel();
   JPanel sector2 = new JPanel();
   JPanel sector3 = new JPanel();
   JPanel sector4 = new JPanel();
   JPanel sector5 = new JPanel();
   JPanel sector6 = new JPanel();
   JPanel sector7 = new JPanel();
   JPanel sector8 = new JPanel();
   JPanel backPanel = new JPanel();
   
   //method: sudokuSetup
   //purpose: Initializes the components that make up the sudoku board.
   public JPanel sudokuSetup(JFrame jf){
        String initText = " ";
        int dime = 35;
        initializeAnswers();
        
        backPanel.setBackground(Color.white);
        boardPanel.setBackground(Color.black);
        boardPanel.setBorder(BorderFactory.createEmptyBorder(3,3,3,3));
        boardPanel.setLayout(new GridLayout(0,3, 3, 3));
        sector0.setLayout(new GridLayout(0,3, 1, 1));
        sector1.setLayout(new GridLayout(0,3, 1, 1));
        sector2.setLayout(new GridLayout(0,3, 1, 1));
        sector3.setLayout(new GridLayout(0,3, 1, 1));
        sector4.setLayout(new GridLayout(0,3, 1, 1));
        sector5.setLayout(new GridLayout(0,3, 1, 1));
        sector6.setLayout(new GridLayout(0,3, 1, 1));
        sector7.setLayout(new GridLayout(0,3, 1, 1));
        sector8.setLayout(new GridLayout(0,3, 1, 1));
        sector0.setBackground(Color.black);
        sector1.setBackground(Color.black);
        sector2.setBackground(Color.black);
        sector3.setBackground(Color.black);
        sector4.setBackground(Color.black);
        sector5.setBackground(Color.black);
        sector6.setBackground(Color.black);
        sector7.setBackground(Color.black);
        sector8.setBackground(Color.black);
        boardPanel.add(sector0);
        boardPanel.add(sector1);
        boardPanel.add(sector2);
        boardPanel.add(sector3);
        boardPanel.add(sector4);
        boardPanel.add(sector5);
        boardPanel.add(sector6);
        boardPanel.add(sector7);
        boardPanel.add(sector8);
        
     for(int i = 0; i < 7; i++){
            BMod ik = new BMod(initText, "sector0", i);
            
            ik.setBackground(Color.white);
            ik.setMargin(new Insets(0, 0, 0, 0));
            ik.setPreferredSize(new Dimension(dime, dime));
            ik.setMinimumSize(new Dimension(dime, dime));
            ik.setMaximumSize(new Dimension(dime, dime));
            sector0.add(ik);
            System.out.println("Added " + (i+1));
            
     }
     for(int k = 0; k < 7; k++){
            BMod ik = new BMod(initText, "sector1", k);
            
            ik.setBackground(Color.white);
            ik.setMargin(new Insets(0, 0, 0, 0));
        ik.setPreferredSize(new Dimension(dime, dime));
        ik.setMinimumSize(new Dimension(dime, dime));
        ik.setMaximumSize(new Dimension(dime, dime));
            sector1.add(ik);
            System.out.println("Added " + (k+1));
     }
     for(int m = 0; m < 5; m++){
            BMod ik = new BMod(initText,"sector2", m);
            
            ik.setBackground(Color.white);
            ik.setMargin(new Insets(0, 0, 0, 0));
        ik.setPreferredSize(new Dimension(dime, dime));
        ik.setMinimumSize(new Dimension(dime, dime));
        ik.setMaximumSize(new Dimension(dime, dime));
            sector2.add(ik);
            System.out.println("Added " + (m+1));
     }
     for(int n = 0; n < 5; n++){
            BMod ik = new BMod(initText, "sector3", n);
            
            ik.setBackground(Color.white);
            ik.setMargin(new Insets(0, 0, 0, 0));
        ik.setPreferredSize(new Dimension(dime, dime));
        ik.setMinimumSize(new Dimension(dime, dime));
        ik.setMaximumSize(new Dimension(dime, dime));
            sector3.add(ik);
            System.out.println("Added " + (n+1));
     }
     for(int p = 0; p < 6; p++){
            BMod ik = new BMod(initText, "sector4", p);
            
            ik.setBackground(Color.white);
            ik.setMargin(new Insets(0, 0, 0, 0));
        ik.setPreferredSize(new Dimension(dime, dime));
        ik.setMinimumSize(new Dimension(dime, dime));
        ik.setMaximumSize(new Dimension(dime, dime));
            sector4.add(ik);
            System.out.println("Added " + (p+1));
     }
     for(int q = 0; q < 5; q++){
            BMod ik = new BMod(initText, "sector5", q);
            
            ik.setBackground(Color.white);
            ik.setMargin(new Insets(0, 0, 0, 0));
        ik.setPreferredSize(new Dimension(dime, dime));
        ik.setMinimumSize(new Dimension(dime, dime));
        ik.setMaximumSize(new Dimension(dime, dime));
            sector5.add(ik);
            System.out.println("Added " + (q+1));
     }
     for(int r = 0; r < 5; r++){
            BMod ik = new BMod(initText, "sector6", r);
            
            ik.setBackground(Color.white);
            ik.setMargin(new Insets(0, 0, 0, 0));
        ik.setPreferredSize(new Dimension(dime, dime));
        ik.setMinimumSize(new Dimension(dime, dime));
        ik.setMaximumSize(new Dimension(dime, dime));
            sector6.add(ik);
            System.out.println("Added " + (r+1));
     }
     for(int s = 0; s < 7; s++){
            BMod ik = new BMod(initText, "sector7", s);
            
            ik.setBackground(Color.white);
            ik.setMargin(new Insets(0, 0, 0, 0));
        ik.setPreferredSize(new Dimension(dime, dime));
        ik.setMinimumSize(new Dimension(dime, dime));
        ik.setMaximumSize(new Dimension(dime, dime));
            sector7.add(ik);
            System.out.println("Added " + (s+1));
     }
     for(int t = 0; t < 7; t++){
            BMod ik = new BMod(initText, "sector8", t);
            
            ik.setBackground(Color.white);
            ik.setMargin(new Insets(0, 0, 0, 0));
        ik.setPreferredSize(new Dimension(dime, dime));
        ik.setMinimumSize(new Dimension(dime, dime));
        ik.setMaximumSize(new Dimension(dime, dime));
            sector8.add(ik);
            System.out.println("Added " + (t+1));
     }
     backPanel.add(boardPanel);
     return backPanel;
     
   }
   
   //method: presets
   //purpose: Sets the disabled buttons into their respective sections on the
   // sudoku board.
   public void presets(){
       sector0.add(new JButton("8"),0);
       sector0.getComponent(0).setEnabled(false);
       
       sector0.add(new JButton("1"),7);
       sector0.getComponent(7).setEnabled(false);  
       
       sector1.add(new JButton("4"),0);
       sector1.getComponent(0).setEnabled(false);
       
       sector1.add(new JButton("6"),2);
       sector1.getComponent(2).setEnabled(false);
       
       sector2.add(new JButton("7"),2);
       sector2.getComponent(2).setEnabled(false);
       
       sector2.add(new JButton("4"),3);
       sector2.getComponent(3).setEnabled(false);
       
       sector2.add(new JButton("6"),6);
       sector2.getComponent(6).setEnabled(false);
       
       sector2.add(new JButton("5"),7);  
       sector2.getComponent(7).setEnabled(false);
       
       sector3.add(new JButton("5"),0);
       sector3.getComponent(0).setEnabled(false);
       
       sector3.add(new JButton("9"),2);
       sector3.getComponent(2).setEnabled(false);
          
       sector3.add(new JButton("4"),7);
       sector3.getComponent(7).setEnabled(false);
       
       sector3.add(new JButton("8"),8);
       sector3.getComponent(8).setEnabled(false);
       
       sector4.add(new JButton("3"),1);
       sector4.getComponent(1).setEnabled(false);
       
       sector4.add(new JButton("7"),4);
       sector4.getComponent(4).setEnabled(false);
       
       sector4.add(new JButton("2"),7);
       sector4.getComponent(7).setEnabled(false);
       
       sector5.add(new JButton("7"),0);
       sector5.getComponent(0).setEnabled(false);
       
       sector5.add(new JButton("8"),1);
       sector5.getComponent(1).setEnabled(false);
       
       sector5.add(new JButton("1"),6);
       sector5.getComponent(6).setEnabled(false);
       
       sector5.add(new JButton("3"),8);
       sector5.getComponent(8).setEnabled(false);
       
       sector6.add(new JButton("5"),1);
       sector6.getComponent(1).setEnabled(false);
       
       sector6.add(new JButton("2"),2);
       sector6.getComponent(2).setEnabled(false);
       
       sector6.add(new JButton("1"),5);
       sector6.getComponent(5).setEnabled(false);
       
       sector6.add(new JButton("3"),6);
       sector6.getComponent(6).setEnabled(false);
       
       sector7.add(new JButton("9"),6);    
       sector7.getComponent(6).setEnabled(false);
       
       sector7.add(new JButton("2"),8);
       sector7.getComponent(8).setEnabled(false);
       
       sector8.add(new JButton("9"),1);
       sector8.getComponent(1).setEnabled(false);
       
       sector8.add(new JButton("5"),8);
       sector8.getComponent(8).setEnabled(false);
       
       revalidate();
   }
   
   //method: initializeAnswers
   //purpose: Initializes the answer grids for score checking.
    public void initializeAnswers() {
        int[][] sector0A = {{8, 3, 5},
                            {2, 9, 6},
                            {4, 1, 7}};
        int[][] sector1A = {{4, 1, 6},
                            {8, 5, 7},
                            {2, 9, 3}};
        int[][] sector2A = {{9, 2, 7},
                            {4, 3, 1},
                            {6, 5, 8}};
        int[][] sector3A = {{5, 6, 9},
                            {1, 2, 3},
                            {7, 4, 8}};
        int[][] sector4A = {{1, 3, 4},
                            {6, 7, 8},
                            {5, 2, 9}};
        int[][] sector5A = {{7, 8, 2},
                            {5, 4, 9},
                            {1, 6, 3}};
        int[][] sector6A = {{6, 5, 2},
                            {9, 8, 1},
                            {3, 7, 4}};
        int[][] sector7A = {{7, 8, 1},
                            {3, 4, 5},
                            {9, 6, 2}};
        int[][] sector8A = {{3, 9, 4},
                            {2, 7, 6},
                            {8, 1, 5}};
        sectorUserAnswer[0][0] = sector0A;
        sectorUserAnswer[0][1] = sector1A;
        sectorUserAnswer[0][2] = sector2A;
        sectorUserAnswer[1][0] = sector3A;
        sectorUserAnswer[1][1] = sector4A;
        sectorUserAnswer[1][2] = sector5A;
        sectorUserAnswer[2][0] = sector6A;
        sectorUserAnswer[2][1] = sector7A;
        sectorUserAnswer[2][2] = sector8A;
        inputAnswers[0][0][0][0] = 8;
        inputAnswers[0][0][2][1] = 1;
        inputAnswers[0][1][0][0] = 4;
        inputAnswers[0][1][0][2] = 6;
        inputAnswers[0][2][0][2] = 7;
        inputAnswers[0][2][1][0] = 4;
        inputAnswers[0][2][2][0] = 6;
        inputAnswers[0][2][2][1] = 5;
        inputAnswers[1][0][0][0] = 5;
        inputAnswers[1][0][0][2] = 9;
        inputAnswers[1][0][2][1] = 4;
        inputAnswers[1][0][2][2] = 8;
        inputAnswers[1][1][0][1] = 3;
        inputAnswers[1][1][1][1] = 7;
        inputAnswers[1][1][2][1] = 2;
        inputAnswers[1][2][0][0] = 7;
        inputAnswers[1][2][0][1] = 8;
        inputAnswers[1][2][2][0] = 1;
        inputAnswers[1][2][2][2] = 3;
        inputAnswers[2][0][0][1] = 5;
        inputAnswers[2][0][0][2] = 2;
        inputAnswers[2][0][1][2] = 1;
        inputAnswers[2][0][2][0] = 3;
        inputAnswers[2][1][2][0] = 9;
        inputAnswers[2][1][2][2] = 2;
        inputAnswers[2][2][0][1] = 9;
        inputAnswers[2][2][2][2] = 5;
    }
}