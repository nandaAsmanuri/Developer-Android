package com.mokshagna.abhiroop.batterylevel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    private int level;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = findViewById(R.id.battery_image);
        level = 0;
    }

    public void increase(View view) {
        if(level<7){
            iv.setImageLevel(++level);
        }
        else{
            level=0;
        }
    }
    public void decrease(View view) {
        if(level>-1){
            iv.setImageLevel(--level);
        }
        else{
            level=0;
        }
    }
}
