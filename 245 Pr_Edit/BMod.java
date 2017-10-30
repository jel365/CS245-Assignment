import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

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

public class BMod extends JButton implements ActionListener {
    int[] bMap = new int[4];
    
    
    //method: BMod
    //purpose: Constructor for the BMod object, creates a button with given
    // text, sector, and place in the board, then calculates its true position.
    public BMod(String string, String sector, int buttonLocale){
        addActionListener(this);
        setText(string);
        setActionCommand(sector);
        assignCoord(sector, buttonLocale);
        setToolTipText("Input Answer");
        
    }

    //method: assignCoord
    //purpose: Checks what sector a button is in, and what it's ID was at time
    // of creation to determine its coordinates with respect to the score grid.
    public void assignCoord(String sect, int buttonLocale){
        if(sect.contentEquals("sector0"))
            sector0Assignment(buttonLocale);
        if(sect.contentEquals("sector1"))
            sector1Assignment(buttonLocale);
        if(sect.contentEquals("sector2"))
            sector2Assignment(buttonLocale);
        if(sect.contentEquals("sector3"))
            sector3Assignment(buttonLocale);
        if(sect.contentEquals("sector4"))
            sector4Assignment(buttonLocale);
        if(sect.contentEquals("sector5"))
            sector5Assignment(buttonLocale);
        if(sect.contentEquals("sector6"))
            sector6Assignment(buttonLocale);
        if(sect.contentEquals("sector7"))
            sector7Assignment(buttonLocale);
        if(sect.contentEquals("sector8"))
            sector8Assignment(buttonLocale);
    }
    
    //method: actionPerformed
    //purpose: Overrides actionPerformed method for action events,
    //  handles button logic.
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("sector0")){

            popOutPane();
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    System.out.print(SudokuBoard.inputAnswers[0][0][i][j]);
                }
                System.out.println();
            }
        }
        if(e.getActionCommand().equals("sector1")){
            popOutPane();
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    System.out.print(SudokuBoard.inputAnswers[0][1][i][j]);
                }
                System.out.println();
            }
        }
        if(e.getActionCommand().equals("sector2")){
            popOutPane();
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    System.out.print(SudokuBoard.inputAnswers[0][2][i][j]);
                }
                System.out.println();
            }
        }
        if(e.getActionCommand().equals("sector3")){
            popOutPane();
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    System.out.print(SudokuBoard.inputAnswers[1][0][i][j]);
                }
                System.out.println();
            }
        }
        if(e.getActionCommand().equals("sector4")){
            popOutPane();
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    System.out.print(SudokuBoard.inputAnswers[1][1][i][j]);
                }
                System.out.println();
            }
        }
        if(e.getActionCommand().equals("sector5")){
            popOutPane();
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    System.out.print(SudokuBoard.inputAnswers[1][2][i][j]);
                }
                System.out.println();
            }
        }
        if(e.getActionCommand().equals("sector6")){
            popOutPane();
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    System.out.print(SudokuBoard.inputAnswers[2][0][i][j]);
                }
                System.out.println();
            }
        }
        if(e.getActionCommand().equals("sector7")){
            popOutPane();
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    System.out.print(SudokuBoard.inputAnswers[2][1][i][j]);
                }
                System.out.println();
            }
        }
        if(e.getActionCommand().equals("sector8")){
            popOutPane();
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    System.out.print(SudokuBoard.inputAnswers[2][2][i][j]);
                }
                System.out.println();
            }
        }
        
      revalidate();
    }
    
    //method: popOutPane
    //purpose: Interactive input getter for the buttons on the sudoku board.
    private void popOutPane() {
        String temp = "A";

        try {
            temp = JOptionPane.showInputDialog("What number? (1-9)");
            if (withinBounds(temp)) {
                setText(temp.substring(0, 1));
                inputAnswer(bMap, temp);
            } else {
                JOptionPane.showMessageDialog(null, "Error! You must input a single number between 1 and 9!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Input not saved!");
        }
    }
    
    //method: inputAnswer
    //purpose: Sets the recieved int between 1-9 to the appropriate coords on
    //the score grid.
    private void inputAnswer(int[] coordinates, String answer){
         SudokuBoard.inputAnswers[coordinates[0]][coordinates[1]][coordinates[2]][coordinates[3]] = Integer.parseInt(answer);
    }
    
    //method: withinBounds
    //purpose: Returns true if the string can be parsed to an int between 1-9.
    private boolean withinBounds(String string){

        String input = string.substring(0, 1);

        if(input.equals("1")||input.equals("2")||input.equals("3")||
                input.equals("4")||input.equals("5")||input.equals("6")||
                input.equals("7")||input.equals("8")||input.equals("9")){
            return true;
        }else{
            return false;
        }
    }
    
    //method: sector0Assignment
    //purpose: Adjusts buttons in sector0 that can recieve player input around 
    //the disabled buttons in terms of score grid coordinates.
    private void sector0Assignment(int buttonLocale){
        int buffer = 0;
        int temp = buttonLocale + 1;
        if(temp == 7)
            temp++;
        if( temp >= 6){
            temp = temp - 6;
            buffer = 2;
        }
        if( temp >= 3){
            temp = temp - 3;
            buffer = 1;
        }
        bMap[0] = 0;
        bMap[1] = 0;
        bMap[2] = buffer;
        bMap[3] = temp;
    }
    //method: sector1Assignment
    //purpose: Adjusts buttons in sector1 that can recieve player input around 
    //the disabled buttons in terms of score grid coordinates.
    private void sector1Assignment(int buttonLocale){
        int buffer = 0;
        int temp = buttonLocale + 1;
        
        if(temp >= 2)
            temp++;
        
        if( temp >= 6){
            temp = temp - 6;
            buffer = 2;
        }
        if( temp >= 3){
            temp = temp - 3;
            buffer = 1;
        }
        bMap[0] = 0;
        bMap[1] = 1;
        bMap[2] = buffer;
        bMap[3] = temp;
    }
    //method: sector2Assignment
    //purpose: Adjusts buttons in sector2 that can recieve player input around 
    //the disabled buttons in terms of score grid coordinates.
    private void sector2Assignment(int buttonLocale){
        int buffer = 0;
        int temp = buttonLocale;
        
        if(temp >= 2)
            temp++;
        if(temp >= 3)
            temp++;
        if(temp >= 6)
            temp++;
        if(temp >= 7)
            temp++;
        
        if( temp >= 6){
            temp = temp - 6;
            buffer = 2;
        }
        if( temp >= 3){
            temp = temp - 3;
            buffer = 1;
        }
        bMap[0] = 0;
        bMap[1] = 2;
        bMap[2] = buffer;
        bMap[3] = temp;
    }
    //method: sector3Assignment
    //purpose: Adjusts buttons in sector3 that can recieve player input around 
    //the disabled buttons in terms of score grid coordinates.
    private void sector3Assignment(int buttonLocale){
        int buffer = 0;
        int temp = buttonLocale+1;
        
        if(temp >= 2)
            temp++;

        
        if( temp >= 6){
            temp = temp - 6;
            buffer = 2;
        }
        if( temp >= 3){
            temp = temp - 3;
            buffer = 1;
        }
        bMap[0] = 1;
        bMap[1] = 0;
        bMap[2] = buffer;
        bMap[3] = temp;
    }
    //method: sector4Assignment
    //purpose: Adjusts buttons in sector4 that can recieve player input around 
    //the disabled buttons in terms of score grid coordinates.
    private void sector4Assignment(int buttonLocale){
        int buffer = 0;
        int temp = buttonLocale;
        
        if(temp >= 1)
            temp++;
        if(temp >= 4)
            temp++;
        if(temp >= 7)
            temp++;
        
        if( temp >= 6){
            temp = temp - 6;
            buffer = 2;
        }
        if( temp >= 3){
            temp = temp - 3;
            buffer = 1;
        }
        bMap[0] = 1;
        bMap[1] = 1;
        bMap[2] = buffer;
        bMap[3] = temp;
    }
    //method: sector5Assignment
    //purpose: Adjusts buttons in sector5 that can recieve player input around 
    //the disabled buttons in terms of score grid coordinates.
    private void sector5Assignment(int buttonLocale){
        int buffer = 0;
        int temp = buttonLocale+1;
        
        if(temp >= 1)
            temp++;
        if(temp >= 6)
            temp++;
        
        if( temp >= 6){
            temp = temp - 6;
            buffer = 2;
        }
        if( temp >= 3){
            temp = temp - 3;
            buffer = 1;
        }
        bMap[0] = 1;
        bMap[1] = 2;
        bMap[2] = buffer;
        bMap[3] = temp;
    }
    //method: sector6Assignment
    //purpose: Adjusts buttons in sector6 that can recieve player input around 
    //the disabled buttons in terms of score grid coordinates.
    private void sector6Assignment(int buttonLocale){
        int buffer = 0;
        int temp = buttonLocale;
        
        if(temp >= 1)
            temp++;
        if(temp >= 2)
            temp++;
        if(temp >= 5)
            temp++;
        if(temp >= 6)
            temp++;
        
        if( temp >= 6){
            temp = temp - 6;
            buffer = 2;
        }
        if( temp >= 3){
            temp = temp - 3;
            buffer = 1;
        }
        bMap[0] = 2;
        bMap[1] = 0;
        bMap[2] = buffer;
        bMap[3] = temp;
    }
    //method: sector7Assignment
    //purpose: Adjusts buttons in sector7 that can recieve player input around 
    //the disabled buttons in terms of score grid coordinates.
    private void sector7Assignment(int buttonLocale){
        int buffer = 0;
        int temp = buttonLocale;
        
        if(temp >= 6)
            temp++;
        
        if( temp >= 6){
            temp = temp - 6;
            buffer = 2;
        }
        if( temp >= 3){
            temp = temp - 3;
            buffer = 1;
        }
        bMap[0] = 2;
        bMap[1] = 1;
        bMap[2] = buffer;
        bMap[3] = temp;
    }
    //method: sector8Assignment
    //purpose: Adjusts buttons in sector8 that can recieve player input around 
    //the disabled buttons in terms of score grid coordinates.
    private void sector8Assignment(int buttonLocale){
        int buffer = 0;
        int temp = buttonLocale;
        
        if(temp >= 1)
            temp++;
        
        if( temp >= 6){
            temp = temp - 6;
            buffer = 2;
        }
        if( temp >= 3){
            temp = temp - 3;
            buffer = 1;
        }
        bMap[0] = 2;
        bMap[1] = 2;
        bMap[2] = buffer;
        bMap[3] = temp;
    }
}
