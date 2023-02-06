package com.example.alcampo3_0.videojuegos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.alcampo3_0.R;

public class Videojuegos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videojuegos_layout);

        getSupportActionBar().hide();

        LinearLayout re2 =findViewById(R.id.revil2);
        re2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent re = new Intent(Videojuegos.this, RE2.class);
                startActivity(re);
            }
        });

        LinearLayout r6 =findViewById(R.id.r6);
        r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r6s = new Intent(Videojuegos.this, Rainbow.class);
                startActivity(r6s);
            }
        });

        LinearLayout f1 =findViewById(R.id.f1);
        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fo1 = new Intent(Videojuegos.this, F1.class);
                startActivity(fo1);
            }
        });

        LinearLayout nsmb =findViewById(R.id.smb);
        nsmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mb = new Intent(Videojuegos.this, MarioBros.class);
                startActivity(mb);
            }
        });

        LinearLayout gow =findViewById(R.id.gow);
        gow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gw = new Intent(Videojuegos.this, GoW.class);
                startActivity(gw);
            }
        });

        LinearLayout halo =findViewById(R.id.halo4);
        halo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h4 = new Intent(Videojuegos.this, Halo4.class);
                startActivity(h4);
            }
        });

    }
}
