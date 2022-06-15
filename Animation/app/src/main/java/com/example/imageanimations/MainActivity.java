package com.example.imageanimations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgPicture;
    private Button btnRotateClock;
    private Button btnRotateAntiClock;
    private Button btnFadeIn;
    private Button btnFadeOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRotateClock = findViewById(R.id.btnRotateClock);
        btnRotateAntiClock = findViewById(R.id.btnRotateAntiClock);
        btnFadeIn = findViewById(R.id.btnFadeIn);
        btnFadeOut = findViewById(R.id.btnFadeOut);
        imgPicture = findViewById(R.id.imgPicture);

        btnRotateClock.setOnClickListener(v -> {
            Animation aniRotateClock = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_clockwise);
            imgPicture.startAnimation(aniRotateClock);
        });
        btnRotateAntiClock.setOnClickListener(v -> {
            Animation animRotateAntiClock = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_anticlockwise);
            imgPicture.startAnimation(animRotateAntiClock);
        });
        btnFadeIn.setOnClickListener(v -> {
            Animation animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
            imgPicture.startAnimation(animFadeIn);
        });
        btnFadeOut.setOnClickListener(v -> {
            Animation animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
            imgPicture.startAnimation(animFadeOut);
        });
    }
}