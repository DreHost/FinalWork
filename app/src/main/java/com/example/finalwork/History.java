package com.example.finalwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class History extends AppCompatActivity {

    Button but_c1,but_c2,but_c3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        but_c1 = findViewById(R.id.h_but_c1);
        but_c2 = findViewById(R.id.h_but_c2);
        but_c3 = findViewById(R.id.h_but_c3);

        but_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(History.this,MainActivity.class);
                startActivity(intent);
            }
        });

        but_c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(History.this,Science.class);
                startActivity(intent);
            }
        });

        but_c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(History.this,Financial.class);
                startActivity(intent);
            }
        });
    }
}