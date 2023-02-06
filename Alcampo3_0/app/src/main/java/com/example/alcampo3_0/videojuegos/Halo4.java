package com.example.alcampo3_0.videojuegos;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.alcampo3_0.R;

public class Halo4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halo_layout);

        getSupportActionBar().hide();


    }
}