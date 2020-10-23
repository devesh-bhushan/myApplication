package com.example.explictindents;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    TextView tvWelcome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        tvWelcome = findViewById(R.id.tvWelcome);
        String name = getIntent().getStringExtra("name");
        String text = name + " , Welcome TO The Activity 2";
        tvWelcome.setText(text);
    }
}