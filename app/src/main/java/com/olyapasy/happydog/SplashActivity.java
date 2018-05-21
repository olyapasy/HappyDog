package com.olyapasy.happydog;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.olyapasy.happydog.fragment.MainMenuFragment;

public class SplashActivity extends AppCompatActivity {

    ActionBar actionBar;
    MainMenuFragment mainMenuFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        if(getSupportActionBar() !=null){
            actionBar  = getSupportActionBar();
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#06A9DB")));
        }
        final Button startNewActivityButton = (Button) findViewById(R.id.breedsButton);
        startNewActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(SplashActivity.this,MainMenu.class);
                startActivity(i);
            }
        });
        final Button makeYourDogHappy = (Button) findViewById(R.id.happyButton);
        makeYourDogHappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SplashActivity.this,MakeHappyActivity.class);
                startActivity(i);
            }
        });

    }
}
