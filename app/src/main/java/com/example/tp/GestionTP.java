/*
 * Beatryx Beugnet Copyright (c) 2021. Plagiarism is absolutely Forbidden
 */

package com.example.tp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.tp.TP1.*;
import com.example.tp.TP2.*;
import com.example.tp.TP3.*;
import com.example.tp.TP4.*;

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
            case R.id.TP3Button:
                Intent TP3 = new Intent(v.getContext(), TP3Main.class);
                TP3.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Activity.startActivity(TP3);
                break;
            case R.id.TP4Button:
                Intent TP4 = new Intent(v.getContext(), TP4Main.class);
                TP4.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Activity.startActivity(TP4);
                break;
            default:
                break;
        }
    }
}
