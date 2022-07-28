package com.example.trainingsmartpatrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnlink_relative,
            btnlink_linear,
            btnlink_grid,
            btn_scrolling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpView();
        setActions();
        Log.d("MainActivity", "Hello World");
    }

    public void setUpView(){
        btnlink_relative = (Button) findViewById(R.id.btn_relative);
        btnlink_linear = (Button) findViewById(R.id.btn_linear);
        btnlink_grid = (Button) findViewById(R.id.btn_grid);
        btn_scrolling = (Button) findViewById(R.id.btn_scrolling);
    }

    public void setActions(){
        btnlink_relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toRelative(view);
            }
        });
        btnlink_linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toLinear(view);
            }
        });
        btnlink_grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toGridLayout(view);
            }
        });
        btn_scrolling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toScrolling(view);
            }
        });
    }

    public void toRelative(View view) {
        Intent intent = new Intent(this, RelativeLayoutActivity.class);
        intent.putExtra("ok","klo ada");
        startActivity(intent);
    }

    public void toLinear(View view) {
        Intent intent = new Intent(this, LinearLayoutActivity.class);
        intent.putExtra("ok","klo ada");
        startActivity(intent);
    }

    public void toGridLayout(View view) {
        Intent intent = new Intent(this, GridLayoutActivity.class);
        intent.putExtra("ok","klo ada");
        startActivity(intent);
    }

    public void toScrolling(View view){
        Intent intent = new Intent(this, ScrollingActivity.class);
        intent.putExtra("ok","klo ada");
        startActivity(intent);
    }
}