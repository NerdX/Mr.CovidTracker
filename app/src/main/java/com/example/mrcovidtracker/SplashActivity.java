package com.example.mrcovidtracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.content.Intent;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));

        Timer timer = new Timer ();

        timer.schedule(new TimerTask () {
            @Override
            public void run() {

                Intent intent = new Intent (getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();

            }
        },2000);
    }

}