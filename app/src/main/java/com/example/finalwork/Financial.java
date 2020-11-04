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
    double f=0;
    int m = 0, pm = 0, fm = 0,am = 0;
    double pv=0,fv=0,i=0,n=0,a=0;

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
        }else if(m==6){
            f = Math.pow(f,Double.valueOf(inp.getText().toString()));
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 4;
        }else if(m==7){
            f = Math.pow(f,1/Double.valueOf(inp.getText().toString()));
            oup.setText(String.valueOf(f));
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
        }else if(m==6){
            f = Math.pow(f,Double.valueOf(inp.getText().toString()));
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 3;
        }
        else if(m==7){
            f = Math.pow(f,1/Double.valueOf(inp.getText().toString()));
            oup.setText(String.valueOf(f));
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
        }else if(m==6){
            f = Math.pow(f,Double.valueOf(inp.getText().toString()));
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 2;
        }
        else if(m==7){
            f = Math.pow(f,1/Double.valueOf(inp.getText().toString()));
            oup.setText(String.valueOf(f));
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
        }else if(m==6){
            f = Math.pow(f,Double.valueOf(inp.getText().toString()));
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 1;
        }
        else if(m==7){
            f = Math.pow(f,1/Double.valueOf(inp.getText().toString()));
            oup.setText(String.valueOf(f));
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
        }else if(m==6){
            f = Math.pow(f,Double.valueOf(inp.getText().toString()));
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 5;
        }
        else if(m==7){
            f = Math.pow(f,1/Double.valueOf(inp.getText().toString()));
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 5;
        }
    }
    public void btn20(View v) {
        if(m==0){
            f = Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 6;
        }else if(m==1){
            f = f + Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 6;
        }else if(m==2) {
            f = f - Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 6;
        }else if(m==3) {
            f = f * Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 6;
        }else if(m==4) {
            if(Double.valueOf(inp.getText().toString())==0){
                oup.setText("Error!");
                m=0;
            }else {
                f = f / Double.valueOf(inp.getText().toString());
                oup.setText(String.valueOf(f));
                inp.setText("0");
                m = 6;
            }
        }else if(m==6){
            f = Math.pow(f,Double.valueOf(inp.getText().toString()));
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 6;
        }
        else if(m==7){
            f = Math.pow(f,1/Double.valueOf(inp.getText().toString()));
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 6;
        }
    }
    public void btn21(View v) {
        if(Double.valueOf(inp.getText().toString())==0){
            f = Math.pow(10, Double.valueOf(oup.getText().toString()));
            oup.setText(String.valueOf(f));
        }else{
            f = Math.pow(10, Double.valueOf(inp.getText().toString()));
            oup.setText(String.valueOf(f));
            inp.setText("0");
        }
    }
    public void btn22(View v) {
        if(Double.valueOf(inp.getText().toString())==0){
            f = 1 / Double.valueOf(oup.getText().toString());
            oup.setText(String.valueOf(f));
        }else{
            f = 1 / Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
        }
    }
    public void btn23(View v) {
        if(m==0){
            f = Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 7;
        }else if(m==1){
            f = f + Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 7;
        }else if(m==2) {
            f = f - Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 7;
        }else if(m==3) {
            f = f * Double.valueOf(inp.getText().toString());
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 7;
        }else if(m==4) {
            if(Double.valueOf(inp.getText().toString())==0){
                oup.setText("Error!");
                m=0;
            }else {
                f = f / Double.valueOf(inp.getText().toString());
                oup.setText(String.valueOf(f));
                inp.setText("0");
                m = 7;
            }
        }else if(m==6){
            f = Math.pow(f,Double.valueOf(inp.getText().toString()));
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 7;
        }
        else if(m==7){
            f = Math.pow(f,1/Double.valueOf(inp.getText().toString()));
            oup.setText(String.valueOf(f));
            inp.setText("0");
            m = 7;
        }
    }
    public void btn24(View v) {
        inp.setText(String.valueOf(Math.E));
    }
    public void btn25(View v) {
        n = Double.valueOf(inp.getText().toString());
        inp.setText("0");
        oup.setText(String.valueOf(n));
    }
    public void btn26(View v) {
        i = Double.valueOf(inp.getText().toString())/100;
        inp.setText("0");
        oup.setText(String.valueOf(i*100));
    }
    public void btn27(View v) {
        if(fm==0){
            if(am!=0){
                pv = a *((1 - Math.pow((1+i),-n))/ i);
                inp.setText("0");
                oup.setText(String.valueOf(pv));
                pm = 0;
                am = 0;
            }else {
                pv = Double.valueOf(inp.getText().toString());
                inp.setText("0");
                oup.setText(String.valueOf(pv));
                pm = 1;
            }
        }else{
            pv = fv * Math.pow((1+i),-n);
            oup.setText(String.valueOf(pv));
            fm=0;
        }
    }
    public void btn28(View v) {
        if(pm==0){
            if(am!=0){
                fv = a * ((Math.pow((1+i), n) - 1)/ i);
                inp.setText("0");
                oup.setText(String.valueOf(fv));
                fm = 0;
                am = 0;
            }else {
                fv = Double.valueOf(inp.getText().toString());
                inp.setText("0");
                oup.setText(String.valueOf(fv));
                fm = 1;
            }
        }else{
            fv = pv * Math.pow((1+i),n);
            oup.setText(String.valueOf(pv));
            pm=0;
        }
    }
    public void btn29(View v) {
        a = Double.valueOf(inp.getText().toString());
        am = 1;
        inp.setText("0");
        oup.setText(String.valueOf(a));
    }
}
