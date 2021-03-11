package com.example.tp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button TP1 = (Button) findViewById(R.id.TP1Button);
        TP1.setOnClickListener(new GestionTP(getApplicationContext()));
    }
}