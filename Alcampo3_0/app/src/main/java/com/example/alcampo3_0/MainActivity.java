package com.example.alcampo3_0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.alcampo3_0.decoracion.Decoracion;
import com.example.alcampo3_0.juguetes.Juguetes;
import com.example.alcampo3_0.perfumeria.Perfumeria;
import com.example.alcampo3_0.videojuegos.RE2;
import com.example.alcampo3_0.videojuegos.Videojuegos;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        LinearLayout juguetes = findViewById(R.id.juguetes);
        juguetes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jug = new Intent(MainActivity.this, Juguetes.class);
                startActivity(jug);
            }
        });

        LinearLayout videojuegos = findViewById(R.id.videojuegos);
        videojuegos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vid = new Intent(MainActivity.this, Videojuegos.class);
                startActivity(vid);
            }
        });

        LinearLayout decoracion = findViewById(R.id.decoracion);
        decoracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dec = new Intent(MainActivity.this, Decoracion.class);
                startActivity(dec);
            }
        });

        LinearLayout perfumeria = findViewById(R.id.perfumes);
        perfumeria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent per = new Intent(MainActivity.this, Perfumeria.class);
                startActivity(per);
            }
        });

        LinearLayout re2 = findViewById(R.id.destacado);
        re2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent re = new Intent(MainActivity.this, RE2.class);
                startActivity(re);
            }
        });
    }
}