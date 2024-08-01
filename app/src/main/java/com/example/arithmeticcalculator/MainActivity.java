package com.example.arithmeticcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.arithmeticcalculator.R;

public class MainActivity extends AppCompatActivity {
    private EditText etn1;
    private  EditText etn2;
    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etn1 = (EditText) findViewById(R.id.etn1);
        etn2 = (EditText) findViewById(R.id.etn2);
        tvResult = (TextView) findViewById(R.id.tvResult);
        Button closeButton = findViewById(R.id.close);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Close this activity
            }
        });
    }


    public void btnsum(View view) {
        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(etn2.getText().toString());
        int sum = n1 + n2;
        tvResult.setText(String.valueOf(sum));
    }

    public void btnsub(View view) {
        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(etn2.getText().toString());
        int sum = n1 - n2;
        tvResult.setText(String.valueOf(sum));
    }

    public void btnmulti(View view) {
        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(etn2.getText().toString());
        int sum = n1 * n2;
        tvResult.setText(String.valueOf(sum));
    }

    public void btndiv(View view) {
        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(etn2.getText().toString());
        int sum = n1 / n2;
        tvResult.setText(String.valueOf(sum));
    }
}