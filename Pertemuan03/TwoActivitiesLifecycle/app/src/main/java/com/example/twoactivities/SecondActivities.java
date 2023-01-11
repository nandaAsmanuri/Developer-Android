package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivities extends AppCompatActivity {
public static final String EXTRA_REPLY =
        "com.example.twoactivities.extra.REPLY";
private EditText mReply;
public static final String LOG_TAG = SecondActivities.class.getSimpleName();

    @Override
    public void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }
    public void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }
    public void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }
    public void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }
    public void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }
    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activities);
        mReply = findViewById(R.id.editTextT_second);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);
    }

    public void returnReply(View view) {
        String reply = mReply.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        Log.d(LOG_TAG, "End SecondActivity");
        finish();
    }

}