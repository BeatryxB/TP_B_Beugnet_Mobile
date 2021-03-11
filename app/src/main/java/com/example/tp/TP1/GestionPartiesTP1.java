package com.example.tp.TP1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.tp.R;

import com.example.tp.TP1.Parties.*;
import com.example.tp.TP1.Parties.PartThreeTP1.PartThree1TP1;


public class GestionPartiesTP1 extends TP1Main implements View.OnClickListener{
    private Context Activity;

    public GestionPartiesTP1() {
    }

    public GestionPartiesTP1(Context ctx){
        Activity = ctx;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Partie1TP1:
                Intent par1 = new Intent(v.getContext(), PartOneTP1.class);
                par1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Activity.startActivity(par1);
                break;
            case R.id.Partie2TP1:
                Intent par2 = new Intent(v.getContext(), PartTwoTP1.class);
                par2.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Activity.startActivity(par2);
                break;
            case R.id.Partie3TP1:
                Intent par3 = new Intent(v.getContext(), PartThree1TP1.class);
                par3.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Activity.startActivity(par3);
                break;
            default:
                break;
        }
    }
}
