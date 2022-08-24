package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt(number2ET.getText().toString());
        int sum = num1 + num2;

        numberSumTV.setText("" + sum);
    }

    public void findDifference(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt(number2ET.getText().toString());
        int difference = num1 - num2;

        numberSumTV.setText("" + difference);
    }

    public void findMultiple(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt(number2ET.getText().toString());
        int multiple = num1 * num2;

        numberSumTV.setText("" + multiple);
    }

    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        double num1 = Integer.parseInt((number1ET.getText().toString()));
        double num2 = Integer.parseInt(number2ET.getText().toString());
        double temp = num1 / num2;
        double quotient = (double)(Math.round(temp * 100.0) / 100.00);
        numberSumTV.setText("" + quotient);
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

        double num1 = Integer.parseInt((numberFirstClass.getText().toString()));
        double num2 = Integer.parseInt(numberSecondClass.getText().toString());
        double num3 = Integer.parseInt((numberThirdClass.getText().toString()));
        double num4 = Integer.parseInt(numberFourthClass.getText().toString());
        double num5 = Integer.parseInt((numberFifthClass.getText().toString()));
        double num6 = Integer.parseInt(numberSixthClass.getText().toString());
        double num7 = Integer.parseInt(numberSeventhClass.getText().toString());

        double sum = num1 + num2 + num3 + num4 + num5 + num6 + num7;
        double temp = sum / 7;
        double quotient = (double)(Math.round(temp * 100.0) / 100.00);
        numberSumTV.setText("" + quotient);
    }

    public void switchScreens(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}