
package pr;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PR{

    public static void main(String[] args) {
        
        //Frame Creation
        JFrame TFrame = new JFrame("Test Text For Test Frame");
       
        TFrame.setSize(600, 400);
        TFrame.setVisible(true);
        TFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TFrame.setLocationRelativeTo(null);
       
        
        
        //Title
        JLabel Title = new JLabel("CS 245 Quarter Project");
        Title.setForeground(Color.white);
        Title.setFont(new Font("Papyrus", Font.PLAIN, 30));
        JLabel teamName = new JLabel("By: Team Name Pending");
        teamName.setForeground(Color.white);
        JPanel LPanel = new JPanel();
        LPanel.setBackground(Color.black);
        JPanel PPanel = new JPanel();
        PPanel.setBackground(Color.black);
        LPanel.add(Title);
        PPanel.add(teamName);
        TFrame.add(LPanel);
        TFrame.add(PPanel,BorderLayout.SOUTH);
        /*
        Insert Transition here
        
        
        
        
        */
        
        //Next Screen
        
        
        
    }
    public static void HS(JFrame f){
        JLabel Header = new JLabel("HIGHSCORES");
        Header.setFont(new Font("Papyrus", Font.PLAIN, 30));
        
        JPanel ScoreList = new JPanel();
       
    }
    public static void mainMenu(JFrame f){
        JPanel mBackground = new JPanel();
        mBackground.setBackground(Color.black);
        f.add(mBackground);
        JPanel buttonList = new JPanel();
        buttonList.setLayout(new GridLayout(3,0));
        
        
        JButton Play = new JButton("Play");
        Play.setBackground(Color.black);
        Play.setForeground(Color.white);
        
        JButton HighScores = new JButton("Highscores");
        HighScores.setBackground(Color.black);
        HighScores.setForeground(Color.white);
        
        JButton Credits = new JButton("Credits");
        Credits.setBackground(Color.black);
        Credits.setForeground(Color.white);
        
        buttonList.add(Play);
        buttonList.add(HighScores);
        buttonList.add(Credits);
        f.add(buttonList, BorderLayout.SOUTH);
        
        
        
    }
    public static void gameComponents(JFrame f){
        //Panel fill and button creation
        JPanel TPanel = new JPanel();
        JPanel bg = new JPanel();
        bg.setBackground(Color.black);
        
        TPanel.setLayout(new GridLayout(0,4));
       
        JButton TButton1 = new JButton("Z");
        TButton1.setPreferredSize(new Dimension(100,50));
        
        JButton TButton2 = new JButton("S");
        TButton2.setPreferredSize(new Dimension(100,50));
        
        JButton TButton3 = new JButton("T");
        TButton3.setPreferredSize(new Dimension(100,50));
        
        JButton TButton4 = new JButton("R");
        TButton3.setPreferredSize(new Dimension(100,50));
        
        JButton TButton5 = new JButton("E");
        TButton3.setPreferredSize(new Dimension(100,50));
        
        JButton TButton6 = new JButton("T");
        TButton3.setPreferredSize(new Dimension(100,50));
        
        JButton TButton7 = new JButton("A");
        TButton3.setPreferredSize(new Dimension(100,50));
        
        JButton TButton8 = new JButton("F");
        TButton3.setPreferredSize(new Dimension(100,50));
        
        //adding buttons to panel
        TPanel.add(TButton1);
        TPanel.add(TButton2);
        TPanel.add(TButton3);
        TPanel.add(TButton4);
        TPanel.add(TButton5);
        TPanel.add(TButton6);
        TPanel.add(TButton7);
        TPanel.add(TButton8);
       
       TButton1.setEnabled(false);
       TButton4.setEnabled(false);
       TButton7.setEnabled(false);
       TButton8.setEnabled(false);
        //add panel to Window
        f.add(bg);
        f.add(TPanel, BorderLayout.SOUTH);
        
    }
    
    public static void makeButton(String s, JPanel p){
        JButton b = new JButton(s);
        /*
        code for button functionality goes here
        */
        p.add(b);
    }
    
    
    
}
