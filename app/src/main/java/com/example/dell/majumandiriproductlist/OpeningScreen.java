package com.example.dell.majumandiriproductlist;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OpeningScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent mainIntent = new Intent(OpeningScreen.this, LoginScreen.class);
                OpeningScreen.this.startActivity(mainIntent);
                OpeningScreen.this.finish();
            }
        }, 3000);
    }

    @Override
    public void onBackPressed() {
    }
}
