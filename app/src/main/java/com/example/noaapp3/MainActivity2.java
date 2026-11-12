package com.example.noaapp3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView showName = findViewById(R.id.showName);
        TextView showLastName = findViewById(R.id.showLastName);
        TextView showAddress = findViewById(R.id.showAddress);

        String name = getIntent().getStringExtra("name");
        String lastName = getIntent().getStringExtra("lastName");
        String address = getIntent().getStringExtra("address");

        showName.setText("שם: " + name);
        showLastName.setText("שם משפחה: " + lastName);
        showAddress.setText("כתובת: " + address);
    }
}