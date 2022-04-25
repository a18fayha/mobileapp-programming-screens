package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView myName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        myName = findViewById(R.id.data);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String name = extras.getString("name");
            myName.setText(name);
        }

    }
}