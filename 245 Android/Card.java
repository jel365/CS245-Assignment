package com.groupnamepending.cs245.myapplication;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class Card extends AppCompatActivity implements View.OnClickListener{
    private Button b;
    private int id;
    private Engine e = Engine.getInstance();

    public Card(Button b, int id){
        this.id = id;
        this.b = b;
        b.setOnClickListener(this);
    }

    Button getButton(){
        return b;
    }

    int getID(){
        return id;
    }


    @Override
    public void onClick(View view) {

        e.getChoices().add(this);
        getButton().setEnabled(false);
        e.fullcheck();
    }
}
