package com.example.qwinix.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class third extends AppCompatActivity {
    public Button but;
    Spinner spinner1;


    public void init() {
        but = (Button) findViewById(R.id.but);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(third.this, navigate.class);

                startActivity(toy);

            }
        });
    }

    /*public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        init();
    }*/

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        init();
    }
}
