package com.example.swapcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class message extends AppCompatActivity {
    TextView t;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        Intent secondActivity = getIntent();
        t = (TextView) findViewById(R.id.msg_text_view);
        String result = secondActivity.getStringExtra("same");
        t.setText(result);

    }
}