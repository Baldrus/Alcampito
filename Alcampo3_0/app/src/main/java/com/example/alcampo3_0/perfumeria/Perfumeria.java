package com.example.alcampo3_0.perfumeria;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.alcampo3_0.R;

public class Perfumeria extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfumeria_layout);

        getSupportActionBar().hide();


    }
}