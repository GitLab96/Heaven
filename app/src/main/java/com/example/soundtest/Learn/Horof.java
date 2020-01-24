package com.example.soundtest.Learn;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.example.soundtest.R;

import java.util.ArrayList;

public class Horof extends AppCompatActivity {

    private Button previousBtn,nextBtn,playBtn,pauseBtn,stopBtn,micBtn;
    int pausecurrentpossition;
    MediaPlayer mediaPlayer;
    ImageSwitcher imageSwitcher;
    TextSwitcher textSwitcher;


    int[] horof = {
            R.drawable.alif,
            R.drawable.ba,
            R.drawable.taa,
            R.drawable.sa,
            R.drawable.kha,
            R.drawable.ha,
            R.drawable.zim,
            R.drawable.dal,
            R.drawable.jal,
            R.drawable.ra,
            R.drawable.ja,
            R.drawable.seen,
            R.drawable.sheen,
            R.drawable.soad,
            R.drawable.doad,
            R.drawable.toa,
            R.drawable.jowa,
            R.drawable.ain,
            R.drawable.gain,
            R.drawable.fa,
            R.drawable.kof,
            R.drawable.kaf,
            R.drawable.laaam,
            R.drawable.meem,
            R.drawable.nun,
            R.drawable.wao,
            R.drawable.hha,
            R.drawable.hamjah,
            R.drawable.ya,
    };

    int position = -1;

    String[] makhraz = {
            "হলকের শুরু হইতে উচ্চারিত হয়। ",
            "দুই ঠোঁট হইতে উচ্চারিত হয়। ",
            "জিহ্বার আগা সামনে উপরের দুই দাঁতের গোঁড়ার সাথে লাগাইয়া। ",
            "জিহ্বার আগা সামনে উপরে দুই দাঁতের আগার সাথে লাগাইয়া। ",
            "জিহ্বার মধ্যখান হইতে উচ্চারিত হয়। ",
            "হলকের মধ্যখান হইতে উচ্চারিত হয়। ",
            "হলকের শেষ হইতে উচ্চারিত হয়।",
            "জিহ্বার আগা সামনে উপরের দুই দাঁতের গোঁড়ার সাথে লাগাইয়া।",
            "জিহ্বার আগা সামনে উপরের দুই দাঁতের আগার সাথে লাগাইয়া।",
            "জিহ্বার আগার উল্টাপীঠ তারবরাবর উপরে তালুর সংগে লাগাইয়া ",
            "জিহ্বার আগা সামনে নিচের দুই দাঁতের আগার সাথে লাগাইয়া।",
            "জিহ্বার আগা সামনে নিচের দুই দাঁতের আগার সাথে লাগাইয়া।",
            "হলকের মধ্যখান হইতে উচ্চারিত হয়।",
            "িহ্বার আগা সামনে নিচের দুই দাঁতের আগার সাথে লাগাইয়া।",
            "জিহ্বার আগার কিনারা উপরে মাড়ির দাঁতের গোঁড়ার সংগে লাগাইয়া",
            "িহ্বার আগা সামনে উপরের দুই দাঁতের গোঁড়ার সাথে লাগাইয়া। ",
            "জিহ্বার আগা সামনে উপরে দুই দাঁতের আগার সাথে লাগাইয়া।",
            "হলকের মধ্যখান হইতে উচ্চারিত হয়।",
            "হলকের শেষ হইতে উচ্চারিত হয়।",
            "নিচের ঠোঁটের পেট,সামনের উপরের দুই দাঁতের আগার সঙ্গে লাগাইয়া",
            "জিহ্বার গোঁড়া তারবরাবর উপরে তালুর সংগে লাগাইয়া ",
            "জিহ্বার গোঁড়া থেকে একটু আগে বাড়াইয়া তারবরাবর উপরে তালুর সংগে লাগাইয়া",
            "জিহ্বার আগা সামনের উপরের দুই দাঁতের গোঁড়ার সংগে লাগাইয়া",
            "দুই ঠোঁট হইতে উচ্চারিত হয়।",
            "জিহ্বার আগা সামনের উপরের দুই দাঁতের গোঁড়ার সংগে লাগাইয়া",
            "দুই ঠোঁট হইতে উচ্চারিত হয়।",
            "হলকের শুরু হইতে উচ্চারিত হয়",
            "হলকের শুরু হইতে উচ্চারিত হয়",
            "জিহ্বার মধ্যখান হইতে উচ্চারিত হয়।",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horof);

        init();

        buttonclick();

        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView textView = new TextView(getApplicationContext());
                textView.setTextSize(20);
                textView.setTextColor(getResources().getColor(R.color.colorAccent));
                textView.setGravity(Gravity.CENTER);
                return textView;
            }
        });

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT,ActionBar.LayoutParams.WRAP_CONTENT));

                return imageView;
            }
        });



    }

    private void buttonclick() {

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((position<horof.length-1)&& (position<makhraz.length-1)){

                    position = position+1;
                    imageSwitcher.setBackgroundResource(horof[position]);
                    textSwitcher.setText(makhraz[position]);

                }
            }
        });

        previousBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position>0){

                    position = position-1;
                    textSwitcher.setText(makhraz[position]);
                    imageSwitcher.setBackgroundResource(horof[position]);

                }
            }
        });
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer==null) {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.soundtest);
                    mediaPlayer.start();
                }
                else if(!mediaPlayer.isPlaying()){
                    mediaPlayer.seekTo(pausecurrentpossition);
                    mediaPlayer.start();
                }
            }
        });

        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mediaPlayer!=null){
                    mediaPlayer.pause();
                    pausecurrentpossition = mediaPlayer.getCurrentPosition();
                }
            }
        });

        stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mediaPlayer!=null) {
                    mediaPlayer.stop();
                    mediaPlayer=null;
                }
            }
        });

    }

    private void init() {

        previousBtn = findViewById(R.id.previousBtn);
        nextBtn = findViewById(R.id.nextBtn);
        playBtn = findViewById(R.id.playBtn);
        pauseBtn = findViewById(R.id.pauseBtn);
        stopBtn = findViewById(R.id.stopBtn);
        micBtn = findViewById(R.id.micBtn);
        imageSwitcher = findViewById(R.id.imageSwither);
        textSwitcher = findViewById(R.id.textSwitcher);
    }
}
