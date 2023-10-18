package com.neizatheedev.classtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.neizatheedev.classtutorial.Activities.MainActivity;

public class SplashScreenActivity extends AppCompatActivity {

    ImageView imageView;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent x = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(x);
            }
        }, 3000);
    }
}