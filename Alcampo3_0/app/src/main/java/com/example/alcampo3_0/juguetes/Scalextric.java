package com.example.alcampo3_0.juguetes;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.alcampo3_0.R;

public class Scalextric extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scalextric_layout);

        getSupportActionBar().hide();


    }
}