/*
 * Beatryx Beugnet Copyright (c) 2021. Plagiarism is absolutely Forbidden
 */

package com.example.tp.TP3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.tp.R;

public class TP3Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp3_main);
        Button btnP = (Button) findViewById(R.id.PlaneteTP3);
        btnP.setOnClickListener(new GestionPartiesTP3(getApplicationContext()));
    }
}