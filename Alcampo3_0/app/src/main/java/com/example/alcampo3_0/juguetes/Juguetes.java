package com.example.alcampo3_0.juguetes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.alcampo3_0.MainActivity;
import com.example.alcampo3_0.R;

public class Juguetes extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juguetes_layout);

        getSupportActionBar().hide();

        LinearLayout furby =findViewById(R.id.furby);
        furby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fur = new Intent(Juguetes.this, Furby.class);
                startActivity(fur);
            }
        });

        LinearLayout dino =findViewById(R.id.dino);
        dino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent din = new Intent(Juguetes.this, Dinosaurio.class);
                startActivity(din);
            }
        });

        LinearLayout rubik =findViewById(R.id.rubik);
        rubik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rub = new Intent(Juguetes.this, Rubik.class);
                startActivity(rub);
            }
        });

        LinearLayout halcon =findViewById(R.id.halcon);
        halcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hal = new Intent(Juguetes.this, Halcon.class);
                startActivity(hal);
            }
        });

        LinearLayout scar =findViewById(R.id.fusil);
        scar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sca = new Intent(Juguetes.this, Scar.class);
                startActivity(sca);
            }
        });

        LinearLayout scalextric =findViewById(R.id.scalextric);
        scalextric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent scal = new Intent(Juguetes.this, Scalextric.class);
                startActivity(scal);
            }
        });

        LinearLayout home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MA = new Intent(Juguetes.this, MainActivity.class);
                startActivity(MA);
            }
        });


    }
}
