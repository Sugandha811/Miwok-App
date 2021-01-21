package com.example.android.miwok;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // NumbersClickListener clickListener = new NumbersClickListener();
        //TextView numbers = (TextView) findViewById(R.id.numbers);
        //numbers.setOnClickListener(clickListener);

    }
    public void onNumbersList(View view) {
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }

    public void onFamilyList(View view) {
        Intent i = new Intent(this, FamilyActivity.class);
        startActivity(i);
    }

    public void onColorsList(View view) {
        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);
    }

    public void onPhrasesList(View view) {
        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);
    }
}



