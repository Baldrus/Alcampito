package com.example.alcampo3_0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Comentario prueba
        getSupportActionBar().hide();

        LinearLayout ln1 = findViewById(R.id.juguetes);
        ln1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jug = new Intent(MainActivity.this, Juguetes.class);
                startActivity(jug);
            }
        });

        LinearLayout ln2 = findViewById(R.id.videojuegos);
        ln2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vid = new Intent(MainActivity.this, Videojuegos.class);
                startActivity(vid);
            }
        });
    }
}