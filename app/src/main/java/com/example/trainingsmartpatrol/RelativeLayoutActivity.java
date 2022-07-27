package com.example.trainingsmartpatrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RelativeLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

    }

    @Override
    public void onBackPressed() {
        // Add the Back key handler here.
        return;
    }
}