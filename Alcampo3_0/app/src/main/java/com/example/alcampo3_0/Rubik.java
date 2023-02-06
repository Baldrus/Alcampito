package com.example.alcampo3_0;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Rubik extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rubik_layout);

        getSupportActionBar().hide();


    }
}