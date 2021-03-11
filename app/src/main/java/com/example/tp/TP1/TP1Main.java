package com.example.tp.TP1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.tp.GestionTP;
import com.example.tp.R;

public class TP1Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp1_main);
        Button btnP1 = (Button) findViewById(R.id.Partie1TP1);
        Button btnP2 = (Button) findViewById(R.id.Partie2TP1);
        btnP1.setOnClickListener(new GestionPartiesTP1(getApplicationContext()));
        btnP2.setOnClickListener(new GestionPartiesTP1(getApplicationContext()));
    }
}