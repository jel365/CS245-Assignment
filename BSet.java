import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;

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

public class BSet extends JButton{
    
    //method: back
    //purpose: Sets a button to be a back button.
    public void back(){
        setText("Back");
        setActionCommand("MM");
        setFont(new Font("Papyrus", Font.BOLD, 12));
        setBackground(Color.WHITE);
        setToolTipText("Press to return to Main Menu");
    }
    //method: end
    //purpose: Sets a button to be an end button.
    public void end(){
        setText("End");
        setActionCommand("MM");
        setFont(new Font("Papyrus", Font.BOLD, 12));
        setBackground(Color.WHITE);
        setToolTipText("Press to return to Main Menu");
    }
    //method: skip
    //purpose: Sets a button to be a skip button.
    public void skip(){
        setText("Skip");
        setActionCommand("Skip");
        setFont(new Font("Papyrus", Font.BOLD, 12));
        setBackground(Color.WHITE);
        setToolTipText("Press to skip game");
        
    }
    //method: submit
    //purpose: Sets a button to be a submit button.
    public void submit(){
        setText("Submit");
        setActionCommand("Submit");
        setFont(new Font("Papyrus", Font.BOLD, 12));
        setBackground(Color.WHITE);
        setToolTipText("Press to submit answer");
        
    }
    //method: endSudoku
    //purpose: Sets a button to be an endSudoku button.
    public void endSudoku(){
        setText("End");
        setActionCommand("ES");
        setFont(new Font("Papyrus", Font.BOLD, 12));
        setBackground(Color.WHITE);
        setToolTipText("Press to end game");
    }
    //method: Score
    //purpose: Sets a button to be a Score button.
    public void Score(){
        setText("Highscores");
        setActionCommand("Scores");
        setFont(new Font("Comic Sans", Font.BOLD, 12));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setPreferredSize(new Dimension(100,50));
        setToolTipText("Press to enter scoreboard");
    }
    //method: Cred
    //purpose: Sets a button to be a Credits button.
    public void Cred(){
        setText("Credits");
        setActionCommand("Cred");
        setFont(new Font("Comic Sans", Font.BOLD, 12));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setPreferredSize(new Dimension(100,50));
        setToolTipText("Press to view Credits");
        
    }
    //method: Play
    //purpose: Sets a button to be a Play button.
    public void Play(){
        setText("Play");
        setActionCommand("Play");
        setFont(new Font("Comic Sans", Font.BOLD, 12));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setPreferredSize(new Dimension(100,50));
        setToolTipText("Press to start game");
    }
    
    
    //method: A
    //purpose: Sets a button to be an A button.
    public void A()
    {
        setText("A");
        setActionCommand("A");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: B
    //purpose: Sets a button to be a B button.
    public void B()
    {
        setText("B");
        setActionCommand("B");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: C
    //purpose: Sets a button to be a C button.
    public void C()
    {
        setText("C");
        setActionCommand("C");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: D
    //purpose: Sets a button to be a D button.
    public void D()
    {
        setText("D");
        setActionCommand("D");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: E
    //purpose: Sets a button to be an E button.
    public void E()
    {

        setText("E");
        setActionCommand("E");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: F
    //purpose: Sets a button to be an F button.
    public void F()
    {
        setText("F");
        setActionCommand("F");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: G
    //purpose: Sets a button to be a G button.
    public void G()
    {
        setText("G");
        setActionCommand("G");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: H
    //purpose: Sets a button to be an H button.
    public void H()
    {
        setText("H");
        setActionCommand("H");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: I
    //purpose: Sets a button to be an I button.
    public void I()
    {
        setText("I");
        setActionCommand("I");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: J
    //purpose: Sets a button to be a J button.
    public void J()
    {
        setText("J");
        setActionCommand("J");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: K
    //purpose: Sets a button to be a K button.
    public void K()
    {
        setText("K");
        setActionCommand("K");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: L
    //purpose: Sets a button to be a L button.
    public void L()
    {
        setText("L");
        setActionCommand("L");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: M
    //purpose: Sets a button to be an M button.
    public void M()
    {
        setText("M");
        setActionCommand("M");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: N
    //purpose: Sets a button to be an N button.
    public void N()
    {
        setText("N");
        setActionCommand("N");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: O
    //purpose: Sets a button to be an O button.
    public void O()
    {
        setText("O");
        setActionCommand("O");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: P
    //purpose: Sets a button to be a P button.
    public void P()
    {
        setText("P");
        setActionCommand("P");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: Q
    //purpose: Sets a button to be a Q button.
    public void Q()
    {
        setText("Q");
        setActionCommand("Q");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: R
    //purpose: Sets a button to be an R button.
    public void R()
    {
        setText("R");
        setActionCommand("R");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: S
    //purpose: Sets a button to be an S button.
    public void S()
    {
        setText("S");
        setActionCommand("S");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: T
    //purpose: Sets a button to be a T button.
    public void T()
    {
        setText("T");
        setActionCommand("T");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: U
    //purpose: Sets a button to be a U button.
    public void U()
    {
        setText("U");
        setActionCommand("U");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: V
    //purpose: Sets a button to be a V button.
    public void V()
    {
        setText("V");
        setActionCommand("V");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: W
    //purpose: Sets a button to be a W button.
    public void W()
    {
        setText("W");
        setActionCommand("W");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: X
    //purpose: Sets a button to be an X button.
    public void X()
    {
        setText("X");
        setActionCommand("X");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: Y
    //purpose: Sets a button to be a Y button.
    public void Y()
    {
        setText("Y");
        setActionCommand("Y");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
    //method: Z
    //purpose: Sets a button to be a Z button.
    public void Z()
    {
        setText("Z");
        setActionCommand("Z");
        setFont(new Font("Papyrus", Font.PLAIN, 10));
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setToolTipText("Select letter");
    }
}
