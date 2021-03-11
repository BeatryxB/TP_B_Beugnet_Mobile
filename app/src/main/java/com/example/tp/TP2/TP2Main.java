/*
 * Beatryx Beugnet Copyright (c) 2021. Plagiarism is absolutely Forbidden
 */

package com.example.tp.TP2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.tp.R;

public class TP2Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp2_main);
        Button btnIMC = (Button) findViewById(R.id.IMCTP2);
        btnIMC.setOnClickListener(new GestionPartiesTP2(getApplicationContext()));
    }
}