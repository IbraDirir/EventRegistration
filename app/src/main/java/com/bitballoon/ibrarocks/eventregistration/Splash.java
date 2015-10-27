package com.bitballoon.ibrarocks.eventregistration;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by dirir on 10/27/2015.
 */
public class Splash extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Thread myThread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent startMainScreen = new Intent(getApplicationContext(),MyActivity.class);
                    startActivity(startMainScreen);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    finish();
                }
            }
        };
        myThread.start();
    }
}
