package com.example.finalwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button but_c1,but_c2,but_c3;
    Button but_1,but_2,but_3,but_4,but_5,but_6,but_7,but_8,but_9,but_10,but_11,but_12,but_13,but_14,but_15,but_16,but_17,but_18,but_19;
    TextView oup,inp;
    double f=0,s=0;
    int m = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oup = findViewById(R.id.text1);
        inp = findViewById(R.id.intext1);

        but_1 = findViewById(R.id.m_but1);
        but_2 = findViewById(R.id.m_but2);
        but_3 = findViewById(R.id.m_but3);
        but_4 = findViewById(R.id.m_but4);
        but_5 = findViewById(R.id.m_but5);
        but_6 = findViewById(R.id.m_but6);
        but_7 = findViewById(R.id.m_but7);
        but_8 = findViewById(R.id.m_but8);
        but_9 = findViewById(R.id.m_but9);
        but_10 = findViewById(R.id.m_but10);
        but_11 = findViewById(R.id.m_but11);
        but_12 = findViewById(R.id.m_but12);
        but_13 = findViewById(R.id.m_but13);
        but_14 = findViewById(R.id.m_but14);
        but_15 = findViewById(R.id.m_but15);
        but_16 = findViewById(R.id.m_but16);
        but_17 = findViewById(R.id.m_but17);
        but_18 = findViewById(R.id.m_but18);
        but_19 = findViewById(R.id.m_but19);

        but_c1 = findViewById(R.id.m_but_c2);
        but_c2 = findViewById(R.id.m_but_c3);
        but_c3 = findViewById(R.id.m_but_c4);

        but_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Science.class);
                startActivity(intent);
            }
        });

        but_c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Financial.class);
                startActivity(intent);
            }
        });

        but_c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,History.class);
                startActivity(intent);
            }
        });
    }

    public void btn1(View v){
        oup.setText("");
        inp.setText("0");
        m=0;
    }

    public void btn2(View v){
        double a = Double.valueOf(inp.getText().toString());
        a = -a;
        inp.setText(String.valueOf(a));
        m=0;
    }

    public void btn3(View v){
        double a = Double.valueOf(oup.getText().toString());    //
        a = a/100;
        oup.setText(String.valueOf(a));
        m=5;
    }

    public void btn4(View v){
        if(m==0){
            f = Double.valueOf(inp.getText().toString());
            inp.setText("0");
            m = 4;
        }else if(m==1){
            f = f + Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 4;
        }else if(m==2) {
            f = f - Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 4;
        }else if(m==3) {
            f = f * Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 4;
        }
        else if(m==4) {
            if(Double.valueOf(inp.getText().toString())==0){
                oup.setText("Error!");
                m=0;
            }else {
                f = f / Double.valueOf(inp.getText().toString());
                oup.setText(String.valueOf(f));
                inp.setText("0");
                m = 4;
            }
        }else if(m==5){
            f = Double.valueOf(oup.getText().toString());
            inp.setText("0");
            m = 4;
        }
    }

    public void btn5(View v){
        String b=inp.getText().toString();
        if(b.equals("0")){
            inp.setText("7");
        }else{
            inp.setText(b+"7");
        }
    }
    public void btn6(View v){
        String b=inp.getText().toString();
        if(b.equals("0")){
            inp.setText("8");
        }else{
            inp.setText(b+"8");
        }
    }
    public void btn7(View v){
        String b=inp.getText().toString();
        if(b.equals("0")){
            inp.setText("9");
        }else{
            inp.setText(b+"9");
        }
    }
    public void btn8(View v){
        if(m==0){
            f = Double.valueOf(inp.getText().toString());
            inp.setText("0");
            m = 3;
        }else if(m==1){
            f = f + Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 3;
        }else if(m==2) {
            f = f - Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 3;
        }else if(m==3) {
            f = f * Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 3;
        }
        else if(m==4) {
            if(Double.valueOf(inp.getText().toString())==0){
                oup.setText("Error!");
                m=0;
            }else {
                f = f / Double.valueOf(inp.getText().toString());
                oup.setText(String.valueOf(f));
                inp.setText("0");
                m = 3;
            }
        }else if(m==5){
            f = Double.valueOf(oup.getText().toString());
            inp.setText("0");
            m = 3;
        }
    }
    public void btn9(View v){
        String b=inp.getText().toString();
        if(b.equals("0")){
            inp.setText("4");
        }else{
            inp.setText(b+"4");
        }
    }
    public void btn10(View v){
        String b=inp.getText().toString();
        if(b.equals("0")){
            inp.setText("5");
        }else{
            inp.setText(b+"5");
        }
    }
    public void btn11(View v){
        String b=inp.getText().toString();
        if(b.equals("0")){
            inp.setText("6");
        }else{
            inp.setText(b+"6");
        }
    }
    public void btn12(View v){
        if(m==0){
            f = Double.valueOf(inp.getText().toString());
            inp.setText("0");
            m = 2;
        }else if(m==1){
            f = f + Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 2;
        }else if(m==2) {
            f = f - Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 2;
        }else if(m==3) {
            f = f * Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 2;
        }
        else if(m==4) {
            if(Double.valueOf(inp.getText().toString())==0){
                oup.setText("Error!");
                m=0;
            }else {
                f = f / Double.valueOf(inp.getText().toString());
                oup.setText(String.valueOf(f));
                inp.setText("0");
                m = 2;
            }
        }else if(m==5){
            f = Double.valueOf(oup.getText().toString());
            inp.setText("0");
            m = 2;
        }
    }
    public void btn13(View v){
        String b=inp.getText().toString();
        if(b.equals("0")){
            inp.setText("1");
        }else{
            inp.setText(b+"1");
        }
    }
    public void btn14(View v){
        String b=inp.getText().toString();
        if(b.equals("0")){
            inp.setText("2");
        }else{
            inp.setText(b+"2");
        }
    }
    public void btn15(View v){
        String b=inp.getText().toString();
        if(b.equals("0")){
            inp.setText("3");
        }else{
            inp.setText(b+"3");
        }
    }
    public void btn16(View v){
        if(m==0){
            f = Double.valueOf(inp.getText().toString());
            inp.setText("0");
            m = 1;
        }else if(m==1){
            f = f + Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 1;
        }else if(m==2) {
            f = f - Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 1;
        }else if(m==3) {
            f = f * Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 1;
        }
        else if(m==4) {
            if(Double.valueOf(inp.getText().toString())==0){
                oup.setText("Error!");
                m=0;
            }else {
                f = f / Double.valueOf(inp.getText().toString());
                oup.setText(String.valueOf(f));
                inp.setText("0");
                m = 1;
            }
        }else if(m==5){
            f = Double.valueOf(oup.getText().toString());
            inp.setText("0");
            m = 1;
        }
    }
    public void btn17(View v){
        String b=inp.getText().toString();
        if(b.equals("0")){
            inp.setText("0");
        }else{
            inp.setText(b+"0");
        }
    }
    public void btn18(View v){
        String b=inp.getText().toString();
            inp.setText(b+".");

    }
    public void btn19(View v){
        if(m==0){
            f = Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 5;
        }else if(m==1){
            f = f + Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 5;
        }else if(m==2) {
            f = f - Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 5;
        }else if(m==3) {
            f = f * Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 5;
        }else if(m==4) {
            if(Double.valueOf(inp.getText().toString())==0){
                oup.setText("Error!");
                m=0;
            }else {
                f = f / Double.valueOf(inp.getText().toString());
                oup.setText(String.valueOf(f));
                inp.setText("0");
                m = 5;
            }
        }
    }
}