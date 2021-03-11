/*
 * Beatryx Beugnet Copyright (c) 2021. Plagiarism is absolutely Forbidden
 */

package com.example.tp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.tp.TP1.*;
import com.example.tp.TP2.TP2Main;

public class GestionTP extends MainActivity implements View.OnClickListener{

    private Context Activity;

    public GestionTP() {
    }

    public GestionTP(Context ctx){
    Activity = ctx;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.TP1Button:
                Intent TP1 = new Intent(v.getContext(), TP1Main.class);
                TP1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Activity.startActivity(TP1);
                break;
            case R.id.TP2Button:
                Intent TP2 = new Intent(v.getContext(), TP2Main.class);
                TP2.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Activity.startActivity(TP2);
                break;
            default:
                break;
        }
    }
}
