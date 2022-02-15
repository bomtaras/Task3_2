package com.example.task3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        TextView textView_first_name = findViewById(R.id.textView_first_name);
        TextView textView_last_name = findViewById(R.id.textView_last_name);
        TextView textView_email = findViewById(R.id.textView_email);
        TextView textView_password = findViewById(R.id.textView_password);

        String first_name = getIntent().getExtras().getString("first_name");
        String last_name = getIntent().getExtras().getString("last_name");
        String email = getIntent().getExtras().getString("email");
        String password = getIntent().getExtras().getString("password");

        textView_first_name.setText(first_name);
        textView_last_name.setText(last_name);
        textView_email.setText(email);
        textView_password.setText(password);
    }
}