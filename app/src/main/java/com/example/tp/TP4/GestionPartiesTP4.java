/*
 * Beatryx Beugnet Copyright (c) 2021. Plagiarism is absolutely Forbidden
 */

package com.example.tp.TP4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.tp.R;
import com.example.tp.TP4.*;
import com.example.tp.TP4.Parties.GuideeTP4.guidedTP4;

public class GestionPartiesTP4 extends TP4Main implements View.OnClickListener{
    private Context Activity;

    public GestionPartiesTP4() {
    }

    public GestionPartiesTP4(Context ctx){
        Activity = ctx;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Partie1TP4:
                Intent Part1 = new Intent(v.getContext(), guidedTP4.class);
                Part1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Activity.startActivity(Part1);
                break;
            default:
                break;
        }
    }
}
