package com.groupnamepending.cs245.myapplication;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    ArrayList<Card> choices = new ArrayList<Card>();
    private int matchCount = 0;
    private Engine e = Engine.getInstance();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e.setContext(getApplicationContext());

        Button mTrueButton = findViewById(R.id.true_button);
        Button mFalseButton = findViewById(R.id.false_button);
        Button mTrueButton2 = findViewById(R.id.true_button2);
        Button mFalseButton2 = findViewById(R.id.false_button2);

        final Card c1 = new Card(mTrueButton, 42);
        final Card c2 = new Card(mFalseButton, 28);
        final Card c3 = new Card(mTrueButton2, 42);
        final Card c4 = new Card(mFalseButton2, 28);
        boolean game = true;



    }







}
