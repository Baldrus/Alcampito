package com.example.alcampo3_0.decoracion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.alcampo3_0.R;
import com.example.alcampo3_0.juguetes.Furby;
import com.example.alcampo3_0.juguetes.Juguetes;

public class Decoracion extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.decoracion_layout);

        getSupportActionBar().hide();


        LinearLayout jarron =findViewById(R.id.jarron);
        jarron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jar = new Intent(Decoracion.this, Jarron.class);
                startActivity(jar);
            }
        });

        LinearLayout cuadro =findViewById(R.id.cuadro);
        cuadro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cu = new Intent(Decoracion.this, Cuadro.class);
                startActivity(cu);
            }
        });

        LinearLayout tapiz =findViewById(R.id.tapiz);
        tapiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tap = new Intent(Decoracion.this, Tapiz.class);
                startActivity(tap);
            }
        });

        LinearLayout alfombra =findViewById(R.id.alfombra);
        alfombra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent al = new Intent(Decoracion.this, Alfombra.class);
                startActivity(al);
            }
        });

        LinearLayout figura =findViewById(R.id.figura);
        figura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fig = new Intent(Decoracion.this, Figura.class);
                startActivity(fig);
            }
        });

        LinearLayout espejo =findViewById(R.id.espejo);
        espejo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent esp = new Intent(Decoracion.this, Espejo.class);
                startActivity(esp);
            }
        });

    }
}