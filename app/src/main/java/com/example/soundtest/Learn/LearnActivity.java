package com.example.soundtest.Learn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.soundtest.R;

public class LearnActivity extends AppCompatActivity {
    private TextView arabicHorof;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        arabicHorof = findViewById(R.id.arabicHorof);
        arabicHorof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LearnActivity.this,Horof.class));
            }
        });
    }
}
