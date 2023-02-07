package com.example.alcampo3_0.juguetes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.alcampo3_0.PopUpConfirmar;
import com.example.alcampo3_0.R;
import com.example.alcampo3_0.videojuegos.RE2;

public class Halcon extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halcon_layout);

        getSupportActionBar().hide();

        AppCompatButton boton =findViewById(R.id.comprar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent compra = new Intent(Halcon.this, PopUpConfirmar.class);
                startActivity(compra);
            }
        });

    }
}