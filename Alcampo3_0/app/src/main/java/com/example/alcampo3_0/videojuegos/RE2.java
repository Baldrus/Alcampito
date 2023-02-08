package com.example.alcampo3_0.videojuegos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.alcampo3_0.MainActivity;
import com.example.alcampo3_0.PopUpConfirmar;
import com.example.alcampo3_0.R;

public class RE2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.re2_layout);

        getSupportActionBar().hide();

        AppCompatButton boton =findViewById(R.id.comprar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent compra = new Intent(RE2.this, PopUpConfirmar.class);
                startActivity(compra);
            }
        });

        LinearLayout home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MA = new Intent(RE2.this, MainActivity.class);
                startActivity(MA);
            }
        });


    }
}