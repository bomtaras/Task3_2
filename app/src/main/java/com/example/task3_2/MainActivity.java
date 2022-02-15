package com.example.task3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         EditText editText_first_name = findViewById(R.id.editText_first_name);
         EditText editText_last_name = findViewById(R.id.editText_last_name);
         EditText editText_email = findViewById(R.id.editText_email);
         EditText editText_password = findViewById(R.id.editText_password);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first_name = editText_first_name.getText().toString();
                String last_name = editText_last_name.getText().toString();
                String email = editText_email.getText().toString();
                String password = editText_password.getText().toString();

                Intent intent = new Intent(MainActivity.this,SecondActivity2.class);
                intent.putExtra("first_name",first_name);
                intent.putExtra("last_name",last_name);
                intent.putExtra("email",email);
                intent.putExtra("password",password);

                startActivity(intent);
            }
        });
    }
}