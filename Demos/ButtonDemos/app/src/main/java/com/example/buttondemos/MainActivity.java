package com.example.buttondemos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btOne = findViewById(R.id.button01);
        Button btTwo = findViewById(R.id.button02);
        Button btThree = findViewById(R.id.button03);

        FloatingActionButton fab = findViewById(R.id.fab);
        btOne.setOnClickListener(v -> {
            Toast.makeText(this, "Hello Button 01", Toast.LENGTH_SHORT).show();
        });
        btTwo.setOnClickListener(v -> {
            Toast.makeText(this, "Hello Button 02", Toast.LENGTH_SHORT).show();
        });
        btThree.setOnClickListener(v -> {
            Toast.makeText(this, "Hello Button 03", Toast.LENGTH_SHORT).show();
        });
        fab.setOnClickListener(v -> {
            Toast.makeText(this, "Hello Floating Action Button", Toast.LENGTH_SHORT).show();
        });

    }
}