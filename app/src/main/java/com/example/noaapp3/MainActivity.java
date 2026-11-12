package com.example.noaapp3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.name);
        EditText lastName = findViewById(R.id.lastName);
        EditText address = findViewById(R.id.address);

        Button submit = findViewById(R.id.submit);

        submit.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);

            intent.putExtra("name", name.getText().toString());
            intent.putExtra("lastName", lastName.getText().toString());
            intent.putExtra("address", address.getText().toString());

            startActivity(intent);
        });
    }
}