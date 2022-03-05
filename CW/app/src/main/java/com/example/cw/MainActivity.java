package com.example.cw;

import androidx.appcompat.app.AppCompatActivity;

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

        EditText firstNumber = findViewById(R.id.firstNum);
        EditText secondNumber = findViewById(R.id.secondNum);
        Button calculateButton = findViewById(R.id.calculate);
        TextView totalText = findViewById(R.id.total);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNumberInt = Integer.parseInt(firstNumber.getText().toString());
                int secondNumberInt = Integer.parseInt(secondNumber.getText().toString());
                int totalNumber = firstNumberInt + secondNumberInt;
                totalText.setText("" + totalNumber);
            }
        });

    }
}