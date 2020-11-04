package com.example.finalwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Financial extends AppCompatActivity {

    Button but_c1,but_c2,but_c3;
    Button but_1,but_2,but_3,but_4,but_5,but_6,but_7,but_8,but_9,but_10,but_11,but_12,but_13,but_14,but_15,but_16,but_17,but_18,but_19,but_20,but_21,but_22,but_23,but_24,but_25,but_26,but_27,but_28,but_29;
    TextView oup,inp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financial);

        oup = findViewById(R.id.text3);
        inp = findViewById(R.id.intext3);

        but_1 = findViewById(R.id.e_but1);
        but_2 = findViewById(R.id.e_but2);
        but_3 = findViewById(R.id.e_but3);
        but_4 = findViewById(R.id.e_but4);
        but_5 = findViewById(R.id.e_but5);
        but_6 = findViewById(R.id.e_but6);
        but_7 = findViewById(R.id.e_but7);
        but_8 = findViewById(R.id.e_but8);
        but_9 = findViewById(R.id.e_but9);
        but_10 = findViewById(R.id.e_but10);
        but_11 = findViewById(R.id.e_but11);
        but_12 = findViewById(R.id.e_but12);
        but_13 = findViewById(R.id.e_but13);
        but_14 = findViewById(R.id.e_but14);
        but_15 = findViewById(R.id.e_but15);
        but_16 = findViewById(R.id.e_but16);
        but_17 = findViewById(R.id.e_but17);
        but_18 = findViewById(R.id.e_but18);
        but_19 = findViewById(R.id.e_but19);
        but_20 = findViewById(R.id.e_but20);
        but_21 = findViewById(R.id.e_but21);
        but_22 = findViewById(R.id.e_but22);
        but_23 = findViewById(R.id.e_but23);
        but_24 = findViewById(R.id.e_but24);
        but_25 = findViewById(R.id.e_but25);
        but_26 = findViewById(R.id.e_but26);
        but_27 = findViewById(R.id.e_but27);
        but_28 = findViewById(R.id.e_but28);
        but_29 = findViewById(R.id.e_but29);

        but_c1 = findViewById(R.id.f_but_c1);
        but_c2 = findViewById(R.id.f_but_c2);
        but_c3 = findViewById(R.id.f_but_c4);

        but_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Financial.this,MainActivity.class);
                startActivity(intent);
            }
        });

        but_c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Financial.this,Science.class);
                startActivity(intent);
            }
        });

        but_c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Financial.this,History.class);
                startActivity(intent);
            }
        });
    }
}