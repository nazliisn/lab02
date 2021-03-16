package com.nazlisen.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        Intent intent=getIntent();
        String name = intent.getStringExtra("customer");

        TextView textView=findViewById(R.id.textWelcome);
        textView.setText("Welcome " +name);
    }
}