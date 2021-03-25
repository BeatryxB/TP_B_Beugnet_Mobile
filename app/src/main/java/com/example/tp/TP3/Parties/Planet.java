/*
 * Beatryx Beugnet Copyright (c) 2021. Plagiarism is absolutely Forbidden
 */

package com.example.tp.TP3.Parties;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tp.R;
import com.example.tp.TP3.Parties.Planetes.*;

public class Planet extends AppCompatActivity {
    ListView listview;
    PlaneteAdapter adapter;
    public Context context;

    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planete);
        listview = (ListView) findViewById(R.id.listView);
        adapter = new PlaneteAdapter(this);
        listview.setAdapter(adapter);

        this.context = getApplicationContext();
        b = (Button) findViewById(R.id.verify);
        b.setOnClickListener(Verif);
    }

    private View.OnClickListener Verif = new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        View item;
        int bonneRep = 0;
        for(int i = 0; i < adapter.getCount(); i++){
            item = (View) adapter.getItem(i);
            TextView name = (TextView) item.findViewById(R.id.textView);
            final CheckBox checkBox = (CheckBox) item.findViewById(R.id.checkbox);
            final Spinner spinner = (Spinner) item.findViewById(R.id.spinner);
            if(checkBox.isChecked() && spinner.getSelectedItemPosition() == i){
                bonneRep++;
            }
        }
        Toast.makeText(v.getContext(), "it's okay for "+bonneRep, Toast.LENGTH_LONG).show();

    }

};

}