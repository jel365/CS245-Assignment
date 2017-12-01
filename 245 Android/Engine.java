package com.groupnamepending.cs245.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by James on 11/27/2017.
 */

public class Engine extends AppCompatActivity {

    private static Engine e;
    ArrayList<Card> choices = new ArrayList<Card>();
    private int matchCount = 0;
    private Context context;
    private Engine(){

    }

    public static Engine getInstance()
    {
        if (e == null){
            e = new Engine();
        }
        return e;
    }

    public void fullcheck(){
        if(choices.size() == 2){
            matchCheck();
        }
    }

    public void matchCheck(){
        if(choices.get(0).getID() == choices.get(1).getID()){

            matchCount++;
        }else{

            choices.get(0).getButton().setEnabled(true);
            choices.get(1).getButton().setEnabled(true);
        }
        choices.clear();

        victoryCheck();

    }

    public ArrayList<Card> getChoices(){
        return choices;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void victoryCheck(){
        boolean victory = false;
        if(matchCount == 2){

                    Toast.makeText(context,R.string.win,
                            Toast.LENGTH_SHORT).show();

            }
        }


}
