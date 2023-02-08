package com.example.alcampo3_0.decoracion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.alcampo3_0.MainActivity;
import com.example.alcampo3_0.PopUpConfirmar;
import com.example.alcampo3_0.R;

public class Cuadro extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuadro_layout);

        getSupportActionBar().hide();

        AppCompatButton boton =findViewById(R.id.comprar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent compra = new Intent(Cuadro.this, PopUpConfirmar.class);
                startActivity(compra);
            }
        });

        LinearLayout home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MA = new Intent(Cuadro.this, MainActivity.class);
                startActivity(MA);
            }
        });

    }
}