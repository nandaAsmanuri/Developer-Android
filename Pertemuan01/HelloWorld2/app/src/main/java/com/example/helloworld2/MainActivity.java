package com.example.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buat object button
        Button btOk = findViewById(R.id.bt_ok);
        btOk.setOnClickListener(view -> btOk.setBackgroundColor(Color.RED));

        Button btCancel = findViewById(R.id.bt_cancel);
        btCancel.setOnClickListener(view -> btCancel.setBackgroundColor(Color.MAGENTA));
    }
}