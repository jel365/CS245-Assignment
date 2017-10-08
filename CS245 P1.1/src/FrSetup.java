import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class FrSetup extends JFrame implements ActionListener{
    
    public static void main(String[]args){
        FrSetup w = new FrSetup();
        w.inSet();
        w.Menu();
    }
    public void inSet(){
        setTitle("Test");
        setPreferredSize(new Dimension(600,400));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }
    
    
    public void titleCard(){
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
        add(LPanel);
        add(PPanel,BorderLayout.SOUTH);
    }
    
    public void Menu(){
        JPanel mBackground = new JPanel();
        mBackground.setBackground(Color.black);
        add(mBackground);
        JPanel buttonList = new JPanel();
        buttonList.setLayout(new GridLayout(3,0));
        BSet P = new BSet();
        P.Play();
        BSet H = new BSet();
        H.Score();
        H.addActionListener(this);
        BSet C = new BSet();
        C.Cred();
        C.addActionListener(this);
        
        buttonList.add(P);
        buttonList.add(H);
        buttonList.add(C);
        
        add(buttonList, BorderLayout.SOUTH);
        
    }
   
    public void Credits(){
        BSet b = new BSet();
        b.back();
        JPanel backPanel = new JPanel();
        backPanel.setLayout(new GridLayout(0,8));
        backPanel.setBackground(Color.orange);
        backPanel.add(b);
        b.addActionListener(this);
        
        
        JLabel Header = new JLabel("Credits");
        Header.setFont(new Font("Papyrus", Font.PLAIN, 30));
        Header.setHorizontalAlignment(JLabel.CENTER);
        JPanel CredList = new JPanel();
        CredList.setBackground(Color.orange);
        JLabel Score1 = new JLabel("name");
        Score1.setHorizontalAlignment(JLabel.CENTER);
        JLabel Score2 = new JLabel("name");
        Score2.setHorizontalAlignment(JLabel.CENTER);
        JLabel Score3 = new JLabel("name");
        Score3.setHorizontalAlignment(JLabel.CENTER);
        
        
        
        CredList.setLayout(new GridLayout(4,0));
        CredList.add(Header);
        CredList.add(Score1);
        CredList.add(Score2);
        CredList.add(Score3);
        
        add(CredList);
        
        add(backPanel,BorderLayout.SOUTH);
    }

    public void ScoreBoard(){
        
        BSet b = new BSet();
        b.back();
        JPanel backPanel = new JPanel();
        backPanel.setLayout(new GridLayout(0,8));
        backPanel.setBackground(Color.orange);
        backPanel.add(b);
        b.addActionListener(this);
        
        
        int [] s = new int[5];
        JLabel Header = new JLabel("HIGHSCORES");
        Header.setFont(new Font("Papyrus", Font.PLAIN, 30));
        Header.setHorizontalAlignment(JLabel.CENTER);
        JPanel ScoreList = new JPanel();
        ScoreList.setBackground(Color.orange);
        JLabel Score1 = new JLabel(String.valueOf(s[0]));
        Score1.setHorizontalAlignment(JLabel.CENTER);
        JLabel Score2 = new JLabel(String.valueOf(s[1]));
        Score2.setHorizontalAlignment(JLabel.CENTER);
        JLabel Score3 = new JLabel(String.valueOf(s[2]));
        Score3.setHorizontalAlignment(JLabel.CENTER);
        JLabel Score4 = new JLabel(String.valueOf(s[3]));
        Score4.setHorizontalAlignment(JLabel.CENTER);
        JLabel Score5 = new JLabel(String.valueOf(s[4]));
        Score5.setHorizontalAlignment(JLabel.CENTER);
        
        
        ScoreList.setLayout(new GridLayout(6,0));
        ScoreList.add(Header);
        ScoreList.add(Score1);
        ScoreList.add(Score2);
        ScoreList.add(Score3);
        ScoreList.add(Score4);
        ScoreList.add(Score5);
        add(ScoreList);
        add(backPanel,BorderLayout.SOUTH);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Cred")){
            
            
            getContentPane().removeAll();
            Credits();
            revalidate();
           
                    }
        
        if(e.getActionCommand().equals("MM")){
            
            
            getContentPane().removeAll();
            Menu();
            revalidate();
           
                    }
        
        if(e.getActionCommand().equals("Scores")){
            
            
            getContentPane().removeAll();
            ScoreBoard();
            revalidate();
           
                    }
       
        
    }
}
