package com.example.alcampo3_0.juguetes;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.alcampo3_0.R;

public class Furby extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.furby_layout);

        getSupportActionBar().hide();


    }
}