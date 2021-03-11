package com.example.tp;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.tp.TP1.*;

public class GestionTP extends MainActivity implements View.OnClickListener{

    private Context Activity;

    public GestionTP() {
    }

    public GestionTP(Context ctx){
    Activity = ctx;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.TP1Button:
                Intent TP1 = new Intent(v.getContext(), TP1Main.class);
                TP1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Activity.startActivity(TP1);
                break;

            default:
                break;
        }
    }
}
