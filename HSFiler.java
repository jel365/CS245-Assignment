
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

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

public class HSFiler {
    private String fileName = "highscore.txt";
    private String defaultFill = "ABC...000000";
    private File file = new File(fileName);
    
    //method: HSFiler
    //purpose: Constructor checks to see if the file exists first, if not it
    //makes a new one and fills it with default values.
    public HSFiler(){
        if(file.exists()){
        }else{
            try{
            file.createNewFile();
            defaultFill();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    //method: defaultFill
    //purpose: Fills the score files with the default string.
    private void defaultFill(){
        String[] hsf = new String[5];
        for(int i = 0; i < hsf.length; i++){
            hsf[i] = defaultFill;
        }
        setHS(hsf);
    }
    
    //method: getHS
    //purpose: Reads the score file to get the current high scores.
    public String[] getHS() {
        String[] hs = new String[5];
        String temp;
        int placeHolder = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (( temp = br.readLine()) != null) {
                hs[placeHolder] = temp;
                placeHolder++;
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return hs;
    }
    
    //method: setHS
    //purpose: Writes to the score files the current high score table.
    public void setHS(String[] hs) {
        String temp;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, false))){
            
            for (int i = 0; i < hs.length; i++) {
                temp = hs[i];
                bw.write(temp + "\r\n");
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    //method: addNewHS
    //purpose: Inserts a new highscore where applicable.
    public void addNewHS(String name, int score, int position){
        String[] toAdd = getHS();
        String[] temp = getHS();
        
        for(int j = position; j < toAdd.length; j++){
            if(j == position){
                name = name + "..." + ("000000" + Integer.toString(score)).substring(Integer.toString(score).length());
                toAdd[j] = name;
            }else{
                toAdd[j] = temp[(j - 1)];
            }
        }
        setHS(toAdd);
    }
    
    //method: returnScores
    //purpose: Returns the scores from the currently buffered high score array.
    public int[] returnScores(){
        String[] scores = getHS();
        int[] score = new int[scores.length];

        for(int k = 0; k < scores.length; k++){
            score[k] = Integer.parseInt(scores[k].substring((scores[k].length()-6),scores[k].length()));
        }
        return score;
    }

}
