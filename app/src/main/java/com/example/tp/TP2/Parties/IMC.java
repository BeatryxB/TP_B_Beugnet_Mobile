/*
 * Beatryx Beugnet Copyright (c) 2021. Plagiarism is absolutely Forbidden
 */

package com.example.tp.TP2.Parties;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tp.R;

public class IMC extends AppCompatActivity {
    Button envoyer = null;
    Button reset = null;
    EditText taille = null;
    EditText poids = null;
    CheckBox commentaire = null;
    RadioGroup group = null;
    TextView result = null;
    private final String texteInit = R.string.vous_devez_cliquer + "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);
        envoyer = (Button) findViewById(R.id.calcul);
        reset = (Button) findViewById(R.id.reset);
        taille = (EditText) findViewById(R.id.taille);
        poids = (EditText) findViewById(R.id.poids);
        commentaire = (CheckBox) findViewById(R.id.commentaire);
        group = (RadioGroup) findViewById(R.id.group);
        result = (TextView) findViewById(R.id.result);
        envoyer.setOnClickListener(envoyerListener);
        reset.setOnClickListener(resetListener);
        commentaire.setOnClickListener(checkedListener);
        taille.addTextChangedListener(textWatcher);
        poids.addTextChangedListener(textWatcher);

    }

    private View.OnClickListener envoyerListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            if(!taille.getText().toString().trim().isEmpty()&&!poids.getText().toString().trim().isEmpty()){
            //  on récupère la taille
            String t = taille.getText().toString().trim();
            // On récupère le poids
            String p = poids.getText().toString().trim();
            float tValue = Float.valueOf(t);


                // Puis on vérifie que la taille est cohérente
                if (tValue <= 0)
                    Toast.makeText(IMC.this, R.string.La_taille_doit_être_positive, Toast.LENGTH_SHORT).show();
                else {
                    float pValue = Float.valueOf(p);
                    if (pValue <= 0)
                        Toast.makeText(IMC.this, R.string.Le_poids_doit_etre_positif, Toast.LENGTH_SHORT).show();
                    else {
                        // Si l'utilisateur a indiqué que la taille était en centimètres
                        // On vérifie que la Checkbox sélectionnée est la deuxième à l'aide de son identifiant
                        if (group.getCheckedRadioButtonId() == R.id.radio_centimetre)
                            tValue = tValue / 100;
                        float imc = pValue / (tValue * tValue);
                        String resultat = "Votre IMC est " + imc + " . ";
                        if (commentaire.isChecked()) resultat += interpreteIMC(imc);
                        result.setText(resultat);
                    }
            }
            }
        }
    };
    private View.OnClickListener resetListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            poids.getText().clear();
            taille.getText().clear();
            result.setText(texteInit);
        }
    };

    private View.OnClickListener checkedListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            if (((CheckBox) v).isChecked()) {
                result.setText(texteInit);
            }
        }
    };

    private TextWatcher textWatcher = new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            result.setText(texteInit);
            if(s.toString().contains(".")){
                group.check(R.id.radio_metre);
            }
            else
            {
                group.check(R.id.radio_centimetre);
            }
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void afterTextChanged(Editable s) {
        }
    };

    public String interpreteIMC(float imc) {
        if (imc < 16.5) {
            return getString(R.string.famine);
        } else if (imc < 18.5 && imc >= 16.5) {
            return getString(R.string.maigreur);
        } else if (imc < 25 && imc >= 18.5) {
            return getString(R.string.corpulence_normale);
        }else if (imc < 30 && imc >= 25) {
            return getString(R.string.surpoids);
        } else if (imc < 35 && imc >= 30) {
            return getString(R.string.obésité_modérée);
        } else if (imc < 40 && imc >= 35) {
            return getString(R.string.obésité_sévère);
        } else if (imc > 40) {
            return getString(R.string.obésité_morbide_ou_massive);
        } else {
            return "rien";
        }
    }
}