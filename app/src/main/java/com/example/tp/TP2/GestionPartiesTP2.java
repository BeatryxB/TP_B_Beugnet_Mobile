/*
 * Beatryx Beugnet Copyright (c) 2021. Plagiarism is absolutely Forbidden
 */

package com.example.tp.TP2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.tp.R;
import com.example.tp.TP2.Parties.*;

public class GestionPartiesTP2 extends TP2Main implements View.OnClickListener{
    private Context Activity;

    public GestionPartiesTP2() {
    }

    public GestionPartiesTP2(Context ctx){
        Activity = ctx;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.IMCTP2:
                Intent IMC = new Intent(v.getContext(), IMC.class);
                IMC.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Activity.startActivity(IMC);
                break;
            default:
                break;
        }
    }
}