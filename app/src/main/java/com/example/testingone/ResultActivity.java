package com.example.testingone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        txtResult = findViewById(R.id.result);
        Bundle extras = getIntent().getExtras();
        if (!extras.isEmpty()){
            float str = extras.getFloat("result");
            txtResult.setText(Float.toString(str));
        }
        else {
            Toast.makeText(this, "No data", Toast.LENGTH_SHORT).show();
        }

    }
}
