/*
 * Beatryx Beugnet Copyright (c) 2021. Plagiarism is absolutely Forbidden
 */

package com.example.tp.TP4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.tp.R;
import com.example.tp.TP3.GestionPartiesTP3;

public class TP4Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp4_main);
        Button PArt1 = (Button) findViewById(R.id.Partie1TP4);
        PArt1.setOnClickListener(new GestionPartiesTP4(getApplicationContext()));
    }
}