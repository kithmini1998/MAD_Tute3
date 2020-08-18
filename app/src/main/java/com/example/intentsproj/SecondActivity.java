package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    TextView lblSum;

    String number1;
    String number2;

    int n1;
    int n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        num1=findViewById(R.id.editTextNumber);
        num2=findViewById(R.id.editTextNumber2);
        lblSum=findViewById(R.id.lblSum);

        Intent intent=getIntent();
        String number1=intent.getStringExtra("n1");
        String number2=intent.getStringExtra("n2");

        num1.setText(number1);
        num2.setText(number2);

        n1=Integer.parseInt(number1);
        n2=Integer.parseInt(number2);
    }
    public void Add(View view){
        lblSum.setText(n1+" + "+n2+" = "+(n1+n2));

    }
    public void Substract(View view){
        lblSum.setText(number1+" - "+number2+" = "+(n1-n2));

    }
    public void Multiply(View view){
        lblSum.setText(number1+" * "+number2+" = "+(n1*n2));

    }
    public void Divide(View view){
        lblSum.setText(number1+" / "+number2+" = "+(n1/n2));

    }
}