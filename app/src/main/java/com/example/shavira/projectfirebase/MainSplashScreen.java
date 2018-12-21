package com.example.shavira.projectfirebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainSplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_splash_screen);

        // METHOD 1

        /****** Create Thread that will sleep for 5 seconds *************/
        Thread background = new Thread() {
            public void run() {

                try {
                    // halaman akan menghilang setelah 3 detik
                    sleep(3*1000);

                    //setelah 5 detikmengarahkan ke halaman yang lain
                    Intent i=new Intent(getBaseContext(),LoginActivity.class);
                    startActivity(i);

                    //menghapus activity
                    finish();

                } catch (Exception e) {

                }
            }
        };

        // start thread
        background.start();

//METHOD 2

		/*
		new Handler().postDelayed(new Runnable() {

            // Using handler with postDelayed called runnable run method

            @Override
            public void run() {
                Intent i = new Intent(MainSplashScreen.this, FirstScreen.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, 5*1000); // wait for 5 seconds
		*/
    }
    @Override
    protected void onDestroy() {

        super.onDestroy();

    }
}
