package com.alicolak.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1;
    EditText number2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1=findViewById(R.id.number1);
        number2=findViewById(R.id.number2);
        result=findViewById(R.id.result);
    }

    public void sum (View view) {

        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){

            result.setText("Enter Number!");

        }
        else {
            int x=Integer.parseInt(number1.getText().toString());
            int y=Integer.parseInt(number2.getText().toString());
            int sum=x+y;
            result.setText("Result : "+sum);
        }
    }

    public void subtract (View view) {
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){

            result.setText("Enter Number!");

        }
        else {
            int x = Integer.parseInt(number1.getText().toString());
            int y = Integer.parseInt(number2.getText().toString());
            int subtract = x - y;
            result.setText("Result : " + subtract);
        }
    }

    public void multiply (View view) {
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){

            result.setText("Enter Number!");

        }
        else {
            int x = Integer.parseInt(number1.getText().toString());
            int y = Integer.parseInt(number2.getText().toString());
            int multiply = x * y;
            result.setText("Result : " + multiply);
        }
    }

    public void divide (View view) {
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){

            result.setText("Enter Number!");

        }
        else {
            int x = Integer.parseInt(number1.getText().toString());
            int y = Integer.parseInt(number2.getText().toString());
            if (y==0){
                result.setText("Bölünen sayı 0 olamaz");
            }else {
                double divide = (double) x / (double) y;
                result.setText("Result : " + divide);
            }

        }
    }


}