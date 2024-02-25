package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int counter=0;
    EditText et;
    TextView tv;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=findViewById(R.id.editText);
        tv=findViewById(R.id.textView);
        bt=findViewById(R.id.button);

        bt.setOnClickListener(view -> tv.setText(""+calc(Double.parseDouble(et.getText().toString()))));

    }
    public double calc(double kg){
        return kg*2.20462;
    }
}