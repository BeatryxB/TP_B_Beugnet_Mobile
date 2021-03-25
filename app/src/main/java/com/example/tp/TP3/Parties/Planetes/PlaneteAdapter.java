/*
 * Beatryx Beugnet Copyright (c) 2021. Plagiarism is absolutely Forbidden
 */

package com.example.tp.TP3.Parties.Planetes;

import android.content.Context;
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
import com.example.tp.TP3.Parties.Planet;

import java.util.ArrayList;

public class PlaneteAdapter extends BaseAdapter {
    ListView listview;

    private final Planet activity;

    ListePlanetes Lp = new ListePlanetes();

    ArrayList<View> planetevue = new ArrayList<View>();

    public PlaneteAdapter(Planet mainActivity) {
        this.activity = mainActivity;
        Lp.init();
    }

    @Override
    public int getCount() {
        return Lp.getListePlanetes().size();
    }

    @Override
    public Object getItem(int arg0) {
        return planetevue.get(arg0);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater)    activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemView = inflater.inflate(R.layout.listitem, null);
        }
        //element interne
        TextView nomPlanete = (TextView) itemView.findViewById(R.id.textView);
        final CheckBox checkBox = (CheckBox) itemView.findViewById(R.id.checkbox);
        final Spinner spinner = (Spinner) itemView.findViewById(R.id.spinner);

        //affichage
        nomPlanete.setText(Lp.getListePlanetes().get(position).getName());

        final ArrayAdapter<String> spinadapter = new ArrayAdapter<String>(activity, android.R.layout.simple_spinner_item, Lp.getTaillePlanetes());
        spinadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinadapter);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                CheckBox checkBox = (CheckBox) compoundButton.findViewById(R.id.checkbox);
                if (checkBox.isChecked()) {
                    spinner.setEnabled(false);
                    spinadapter.notifyDataSetChanged();
                } else {
                    spinner.setEnabled(true);
                    spinadapter.notifyDataSetChanged();
                }
            }
        });

        planetevue.add(itemView);
        return itemView;
    }

}
