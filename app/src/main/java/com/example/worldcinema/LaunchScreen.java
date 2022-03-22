package com.example.worldcinema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class LaunchScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen);

        Thread logoTimer = new Thread()
        {
            public void run()
            {
                try {
                    int logoTimer = 0;
                    while (logoTimer < 5000)
                    {
                        sleep(100);
                        logoTimer = logoTimer +100;
                    };
                    Intent i = new Intent(LaunchScreen.this, MainActivity.class);
                    startActivity(i);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally {
                    finish();
                }
            }
        };
        logoTimer.start();
    }
}