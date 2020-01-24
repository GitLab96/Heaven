package com.example.soundtest;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.soundtest.Learn.LearnActivity;

public class MainActivity extends AppCompatActivity {
     Button learnBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        learnBtn = findViewById(R.id.learnBttn);
        learnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, LearnActivity.class));


            }
        });
    }
}
