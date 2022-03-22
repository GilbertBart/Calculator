package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //private EditText display;
    TextView text;
    boolean suma=false;
    boolean resta=false;
    boolean div=false;
    boolean mult=false;
    double num1;
    double num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("GILBERT", "ON_CREATE!!!!");




        //display=findViewById(R.id.textView2);

        text= findViewById(R.id.textView2);



    }

    public void onBtclick(android.view.View v){

    }
    public void BT0(View view){
        text.setText(text.getText() +"0");

    }
    public void BT1(View view){
        text.setText(text.getText() +"1");
    }

    public void BT2(View view){
        text.setText(text.getText() +"2");
    }
    public void BT3(View view){
        text.setText(text.getText() +"3");
    }
    public void BT4(View view){
        text.setText(text.getText() +"4");
    }

    public void BT5(View view){
        text.setText(text.getText() +"5");
    }
    public void BT6(View view){
        text.setText(text.getText() +"6");
    }
    public void BT7(View view){
        text.setText(text.getText() +"7");
    }
    public void BT8(View view){
        text.setText(text.getText() +"8");
    }
    public void BT9(View view){
        text.setText(text.getText() +"9");
    }
    public void BTC(View view){
        text.setText("");
    }
    public void BTMULT(View view){
        num1= Double.parseDouble(text.getText().toString());
        mult = true;
        text.setText("");
    }
    public void BTDIV(View view){
        num1= Double.parseDouble(text.getText().toString());
        div = true;
        text.setText("");
    }
    public void BTIGUAL(View view){
        num2= Double.parseDouble(text.getText().toString());
        text.setText("");
        if (suma==true)
        {
            double resultado= num1+num2;
            String res = Double.toString(resultado);
            text.setText(res);
            suma=false;
        }
        if (resta==true)
        {
            double resultado= num1-num2;
            String res = Double.toString(resultado);
            text.setText(res);
            resta=false;
        }
        if (mult==true)
        {
            double resultado= num1*num2;
            String res = Double.toString(resultado);
            text.setText(res);
            mult=false;
        }
        if (div==true)
        {
            double resultado= num1/num2;
            String res = Double.toString(resultado);
            text.setText(res);
            div=false;
        }

    }
    public void BTRESTA(View view){
        num1= Double.parseDouble(text.getText().toString());
        resta = true;
        text.setText("");
    }
    public void BTSUMA(View view){
        num1= Double.parseDouble(text.getText().toString());
        suma = true;
        text.setText("");
    }
    public void BTSIN(View view){

    }
}