import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;
public class BSet extends JButton{
    
    public void back(){
        setText("Back");
        setActionCommand("MM");
        setFont(new Font("Papyrus", Font.BOLD, 12));
        setBackground(Color.WHITE);
        
    }
    
    public void Score(){
        setText("Highscores");
        setActionCommand("Scores");
        setFont(new Font("Comic Sans", Font.BOLD, 12));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setPreferredSize(new Dimension(100,50));
    }
    
    public void Cred(){
        setText("Credits");
        setActionCommand("Cred");
        setFont(new Font("Comic Sans", Font.BOLD, 12));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setPreferredSize(new Dimension(100,50));
        
    }
    
    public void Play(){
        setText("Play");
        setActionCommand("Play");
        setFont(new Font("Comic Sans", Font.BOLD, 12));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setPreferredSize(new Dimension(100,50));
    }
}
