/*
 * Beatryx Beugnet Copyright (c) 2021. Plagiarism is absolutely Forbidden
 */

package com.example.tp.TP3.Parties;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.tp.R;
import com.example.tp.TP3.Parties.Planetes.*;

public class Planete extends AppCompatActivity {
    ListView listview;
    PlaneteAdapter adapter;

    ListePlanetes Lp = new ListePlanetes();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planete);
        Lp.setNewPlanetes("Mercure");
        Lp.setNewPlanetes("Venus");
        Lp.setNewPlanetes("Terre");
        Lp.setNewPlanetes("Mars");
        Lp.setNewPlanetes("Jupiter");
        Lp.setNewPlanetes("Saturne");
        Lp.setNewPlanetes("Uranus");
        Lp.setNewPlanetes("Neptune");

        listview = (ListView) findViewById(R.id.listView);
        adapter = new PlaneteAdapter();
        listview.setAdapter(adapter);

    }

    class PlaneteAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return Lp.getListePlanetes().size();
        }

        @Override
        public Object getItem(int arg0) {
            return Lp.getListePlanetes().get(arg0);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemView = convertView;
            if (convertView == null) {
                LayoutInflater inflater = (LayoutInflater)    Planete.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                itemView = inflater.inflate(R.layout.listitem, null);
            }
            TextView nomPlanete = (TextView) itemView.findViewById(R.id.textView);
            final CheckBox checkBox = (CheckBox) itemView.findViewById(R.id.checkbox);
            final Spinner spinner = (Spinner) itemView.findViewById(R.id.spinner);
            nomPlanete.setText(Lp.getListePlanetes().get(position).getName());
            //  installer l'adaptateur pour la liste déroulante (spinner)
            String[] taillePlanetes = {"4900", "12000", "12800", "6800", "144000", "120000", "52000", "50000", "2300"};
            final ArrayAdapter<String> spinadapter = new ArrayAdapter<String>(Planete.this, android.R.layout.simple_spinner_item, taillePlanetes);
            spinadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(spinadapter);

            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    CheckBox checkBox = (CheckBox) compoundButton.findViewById(R.id.checkbox);
                    spinner.setEnabled(!checkBox.isChecked());
                    spinadapter.notifyDataSetChanged();
                }
            });
            return itemView;
        }
    }

}