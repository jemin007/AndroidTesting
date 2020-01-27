package com.example.testingone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etFirst, etSecond;
    Button btnSum, btnSub, btnDivide;
    Float num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirst = findViewById(R.id.firstNum);
        etSecond = findViewById(R.id.secondNum);
        btnSum = findViewById(R.id.btnSum);
        btnSub = findViewById(R.id.btnSub);
        btnDivide = findViewById(R.id.btnDivide);
        final Arthimetic arthimetic = new Arthimetic();

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Float.parseFloat(etFirst.getText().toString());
                num2 = Float.parseFloat(etSecond.getText().toString());
                Float sum = arthimetic.add(num1,num2);

                Intent intent = new Intent(MainActivity.this,ResultActivity.class);
                intent.putExtra("result", sum);
                startActivity(intent);


            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(etFirst.getText().toString());
                num2 = Float.parseFloat(etSecond.getText().toString());
                Float sub = arthimetic.subtract(num1,num2);

                Intent intent = new Intent(MainActivity.this,ResultActivity.class);
                intent.putExtra("result", sub);
                startActivity(intent);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(etFirst.getText().toString());
                num2 = Float.parseFloat(etSecond.getText().toString());
                Float div = arthimetic.divide(num1,num2);

                Intent intent = new Intent(MainActivity.this,ResultActivity.class);
                intent.putExtra("result", div);
                startActivity(intent);
            }
        });
    }
}
