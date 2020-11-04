package com.example.finalwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Science extends AppCompatActivity {

    Button but_c1,but_c2,but_c3;
    Button but_1,but_2,but_3,but_4,but_5,but_6,but_7,but_8,but_9,but_10,but_11,but_12,but_13,but_14,but_15,but_16,but_17,but_18,but_19,but_20,but_21,but_22,but_23,but_24,but_25,but_26,but_27,but_28,but_29,but_30,but_31;
    TextView oup,inp;
    double f=0,s=0;
    int m = 0;

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
    public void btn20(View v) {

    }
    public void btn21(View v) {

    }
    public void btn22(View v) {

    }
    public void btn23(View v) {

    }
    public void btn24(View v) {

    }
    public void btn25(View v) {

    }
    public void btn26(View v) {

    }
    public void btn27(View v) {

    }
    public void btn28(View v) {

    }
    public void btn29(View v) {

    }
    public void btn30(View v) {

    }
    public void btn31(View v) {

    }
}
