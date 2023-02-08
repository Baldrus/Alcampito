package com.example.alcampo3_0.perfumeria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.alcampo3_0.R;
import com.example.alcampo3_0.decoracion.Decoracion;
import com.example.alcampo3_0.decoracion.Jarron;

public class Perfumeria extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfumeria_layout);

        getSupportActionBar().hide();

        LinearLayout olvidona =findViewById(R.id.olvidona);
        olvidona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent olv = new Intent(Perfumeria.this, Olvidona.class);
                startActivity(olv);
            }
        });

        LinearLayout hugoboss =findViewById(R.id.hugoboss);
        hugoboss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hb = new Intent(Perfumeria.this, HugoBoss.class);
                startActivity(hb);
            }
        });

        LinearLayout cklein =findViewById(R.id.ck);
        cklein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ck = new Intent(Perfumeria.this, CK.class);
                startActivity(ck);
            }
        });

        LinearLayout playboy =findViewById(R.id.playboy);
        playboy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pb = new Intent(Perfumeria.this, PlayBoy.class);
                startActivity(pb);
            }
        });

        LinearLayout dolce =findViewById(R.id.dolce);
        dolce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dg = new Intent(Perfumeria.this, Dolce.class);
                startActivity(dg);
            }
        });

        LinearLayout chanel =findViewById(R.id.chanel);
        chanel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ch = new Intent(Perfumeria.this, Chanel.class);
                startActivity(ch);
            }
        });

    }
}