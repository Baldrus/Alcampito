package com.example.alcampo3_0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Videojuegos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videojuegos_layout);

        getSupportActionBar().hide();

        LinearLayout re2 =findViewById(R.id.revil2);
        re2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent re = new Intent(Videojuegos.this, RE2.class);
                startActivity(re);
            }
        });
    }
}
