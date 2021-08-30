package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);   // Construct a TextView UI component
        textView.setText("Hello, from my Java code!"); // Set the text message for TextView
        setContentView(textView);  // this Activity sets its content to the TextView
    }
}