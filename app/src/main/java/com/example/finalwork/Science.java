package com.example.finalwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Science extends AppCompatActivity {

    Button but_c1,but_c2,but_c3;
    Button but_1,but_2,but_3,but_4,but_5,but_6,but_7,but_8,but_9,but_10,but_11,but_12,but_13,but_14,but_15,but_16,but_17,but_18,but_19,but_20,but_21,but_22,but_23,but_24,but_25,but_26,but_27,but_28,but_29,but_30,but_31,but_32,but_33;
    TextView oup,inp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);

        oup = findViewById(R.id.text2);
        inp = findViewById(R.id.intext2);

        but_1 = findViewById(R.id.s_but1);
        but_2 = findViewById(R.id.s_but2);
        but_3 = findViewById(R.id.s_but3);
        but_4 = findViewById(R.id.s_but4);
        but_5 = findViewById(R.id.s_but5);
        but_6 = findViewById(R.id.s_but6);
        but_7 = findViewById(R.id.s_but7);
        but_8 = findViewById(R.id.s_but8);
        but_9 = findViewById(R.id.s_but9);
        but_10 = findViewById(R.id.s_but10);
        but_11 = findViewById(R.id.s_but11);
        but_12 = findViewById(R.id.s_but12);
        but_13 = findViewById(R.id.s_but13);
        but_14 = findViewById(R.id.s_but14);
        but_15 = findViewById(R.id.s_but15);
        but_16 = findViewById(R.id.s_but16);
        but_17 = findViewById(R.id.s_but17);
        but_18 = findViewById(R.id.s_but18);
        but_19 = findViewById(R.id.s_but19);
        but_20 = findViewById(R.id.s_but20);
        but_21 = findViewById(R.id.s_but21);
        but_22 = findViewById(R.id.s_but22);
        but_23 = findViewById(R.id.s_but23);
        but_24 = findViewById(R.id.s_but24);
        but_25 = findViewById(R.id.s_but25);
        but_26 = findViewById(R.id.s_but26);
        but_27 = findViewById(R.id.s_but27);
        but_28 = findViewById(R.id.s_but28);
        but_29 = findViewById(R.id.s_but29);
        but_30 = findViewById(R.id.s_but30);
        but_31 = findViewById(R.id.s_but31);
        but_32 = findViewById(R.id.s_but32);
        but_33 = findViewById(R.id.s_but33);

        but_c1 = findViewById(R.id.s_but_c1);
        but_c2 = findViewById(R.id.s_but_c3);
        but_c3 = findViewById(R.id.s_but_c4);

        but_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Science.this,MainActivity.class);
                startActivity(intent);
            }
        });

        but_c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Science.this,Financial.class);
                startActivity(intent);
            }
        });

        but_c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Science.this,History.class);
                startActivity(intent);
            }
        });
    }
}