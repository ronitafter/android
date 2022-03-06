package com.ronit.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual;
    EditText myEditText;

    float num1, num2;

    boolean Addition, Subtract, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        buttonAdd = findViewById(R.id.buttonadd);
        buttonSub = findViewById(R.id.buttonsub);
        buttonMul = findViewById(R.id.buttonmul);
        buttonDivision = findViewById(R.id.buttondiv);
        buttonC = findViewById(R.id.buttonC);
        buttonEqual = findViewById(R.id.buttonEqual);
        myEditText = findViewById(R.id.screen);


        button1.setOnClickListener(v -> myEditText.setText(myEditText.getText() + "1"));

        button2.setOnClickListener(v -> myEditText.setText(myEditText.getText() + "2"));

        button3.setOnClickListener(v -> myEditText.setText(myEditText.getText() + "3"));

        button4.setOnClickListener(v -> myEditText.setText(myEditText.getText() + "4"));

        button5.setOnClickListener(v -> myEditText.setText(myEditText.getText() + "5"));

        button6.setOnClickListener(v -> myEditText.setText(myEditText.getText() + "6"));

        button7.setOnClickListener(v -> myEditText.setText(myEditText.getText() + "7"));

        button8.setOnClickListener(v -> myEditText.setText(myEditText.getText() + "8"));

        button9.setOnClickListener(v -> myEditText.setText(myEditText.getText() + "9"));

        button0.setOnClickListener(v -> myEditText.setText(myEditText.getText() + "0"));

        buttonAdd.setOnClickListener(v -> {

            if (myEditText == null) {
                assert false;
                myEditText.setText("");
            } else {
                num1 = Float.parseFloat(myEditText.getText() + "");
                Addition = true;
                myEditText.setText(null);
            }
        });

        buttonSub.setOnClickListener(v -> {
            num1 = Float.parseFloat(myEditText.getText() + "");
            Subtract = true;
            myEditText.setText(null);
        });

        buttonMul.setOnClickListener(v -> {
            num1 = Float.parseFloat(myEditText.getText() + "");
            Multiplication = true;
            myEditText.setText(null);
        });

        buttonDivision.setOnClickListener(v -> {
            num1 = Float.parseFloat(myEditText.getText() + "");
            Division = true;
            myEditText.setText(null);
        });

        buttonEqual.setOnClickListener(v -> {
            num2 = Float.parseFloat(myEditText.getText() + "");

            if (Addition == true) {
                myEditText.setText(num1 + num2 + "");
                Addition = false;
            }

            if (Subtract == true) {
                myEditText.setText(num1 - num2 + "");
                Subtract = false;
            }

            if (Multiplication == true) {
                myEditText.setText(num1 * num2 + "");
                Multiplication = false;
            }

            if (Division == true) {
                myEditText.setText(num1 / num2 + "");
                Division = false;
            }
        });

        buttonC.setOnClickListener(v -> myEditText.setText(""));

        button10.setOnClickListener(v -> myEditText.setText(myEditText.getText() + "."));
    }
}
