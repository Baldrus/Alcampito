package com.example.alcampo3_0;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;

import com.example.alcampo3_0.juguetes.Furby;

public class PopUpConfirmar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_confirmar);

        DisplayMetrics medidasVentana = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(medidasVentana);

        int ancho=medidasVentana.widthPixels;
        int alto=medidasVentana.heightPixels;

        getWindow().setLayout((int)(ancho*0.8),(int)(alto*0.4));


        AppCompatButton confirmar =findViewById(R.id.aceptar);

        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent conf = new Intent(PopUpConfirmar.this, PopUpGracias.class);
                startActivity(conf);
            }
        });


        AppCompatButton rechazar =findViewById(R.id.cancelar);

        rechazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}