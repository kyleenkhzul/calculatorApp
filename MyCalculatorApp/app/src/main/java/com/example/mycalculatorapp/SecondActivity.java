package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gpacalculator);
        Intent intent = getIntent();
    }
    public void findGPA(View view) {
        EditText numberFirstClass = findViewById(R.id.firstClass);
        EditText numberSecondClass = findViewById(R.id.secondClass);
        EditText numberThirdClass = findViewById(R.id.thirdClass);
        EditText numberFourthClass = findViewById(R.id.fourthClass);
        EditText numberFifthClass = findViewById(R.id.fifthClass);
        EditText numberSixthClass = findViewById(R.id.sixthClass);
        EditText numberSeventhClass = findViewById(R.id.seventhClass);
        TextView numberSumTV = findViewById(R.id.resultGPA);

        Context context = getApplicationContext();
        CharSequence text = "Please enter a GPA in the boxes";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);


         int num1 = Integer.parseInt((numberFirstClass.getText().toString()));
         int num2 = Integer.parseInt(numberSecondClass.getText().toString());
         int num3 = Integer.parseInt((numberThirdClass.getText().toString()));
         int num4 = Integer.parseInt(numberFourthClass.getText().toString());
         int num5 = Integer.parseInt((numberFifthClass.getText().toString()));
         int num6 = Integer.parseInt(numberSixthClass.getText().toString());
         int num7 = Integer.parseInt(numberSeventhClass.getText().toString());


        if(numberFirstClass.getText().toString() == "" ||
                numberSecondClass.getText().toString() == "" ||
                numberThirdClass.getText().toString() == "" ||
                numberFourthClass.getText().toString() == "" ||
                numberFifthClass.getText().toString() == "" ||
                numberSixthClass.getText().toString() == "" ||
                numberSeventhClass.getText().toString() == "") {
            toast.show();
        }

         double sum = (num1 + num2 + num3 + num4 + num5 + num6 + num7);
         double temp = sum / 7;
         double quotient = (Math.round(temp * 100.0) / 100.00);
        numberSumTV.setText("" + quotient);
    }
}