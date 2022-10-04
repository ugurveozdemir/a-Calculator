package com.ugurozdemir.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numberOne;
    EditText numberTwo;
    TextView resultTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         numberOne = findViewById(R.id.numberOne);
         numberTwo = findViewById(R.id.numberTwo);
         resultTotal = findViewById(R.id.result);
    }

    public void add(View view){
        if(numberOne.getText().toString().matches("") || numberTwo.getText().toString().matches("")){
            resultTotal.setText("Please enter a number!");
        }else{
            int number1 = Integer.parseInt(numberOne.getText().toString());
            int number2= Integer.parseInt(numberTwo.getText().toString());
            int result = number1+number2;
            resultTotal.setText("Result ="+result);
        }


    }
    public void divide(View view){
        if(numberOne.getText().toString().matches("") || numberTwo.getText().toString().matches("")){
            resultTotal.setText("Please enter a number!");
        }else{
            int number1 = Integer.parseInt(numberOne.getText().toString());
            int number2= Integer.parseInt(numberTwo.getText().toString());
            int result = number1/number2;
            resultTotal.setText("Result ="+result);
        }
    }
    public void multiply(View view){
        if(numberOne.getText().toString().matches("") || numberTwo.getText().toString().matches("")){
            resultTotal.setText("Please enter a number!");
        }else{
            int number1 = Integer.parseInt(numberOne.getText().toString());
            int number2= Integer.parseInt(numberTwo.getText().toString());
            int result = number1*number2;
            resultTotal.setText("Result ="+result);
        }
    }
    public void subtract(View view){
        if(numberOne.getText().toString().matches("") || numberTwo.getText().toString().matches("")){
            resultTotal.setText("Please enter a number!");
        }else{
            int number1 = Integer.parseInt(numberOne.getText().toString());
            int number2= Integer.parseInt(numberTwo.getText().toString());
            int result = number1-number2;
            resultTotal.setText("Result ="+result);
        }
    }




}