/*
 * Beatryx Beugnet Copyright (c) 2021. Plagiarism is absolutely Forbidden
 */

package com.example.tp.TP3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.tp.R;
import com.example.tp.TP3.Parties.*;

public class GestionPartiesTP3 extends TP3Main implements View.OnClickListener{
    private Context Activity;

    public GestionPartiesTP3() {
    }

    public GestionPartiesTP3(Context ctx){
        Activity = ctx;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.PlaneteTP3:
                Intent IMC = new Intent(v.getContext(), Planet.class);
                IMC.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Activity.startActivity(IMC);
                break;
            default:
                break;
        }
    }
}