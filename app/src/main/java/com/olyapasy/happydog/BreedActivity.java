package com.olyapasy.happydog;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BreedActivity extends AppCompatActivity {
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breed);

        Bundle extras = getIntent().getExtras();
        TextView titleTextView = (TextView) findViewById(R.id.detailedBreedTitle);
        TextView detailedTextView = (TextView) findViewById(R.id.detailedBreedDiscription);
        detailedTextView.setMovementMethod(new ScrollingMovementMethod());
        ImageView imageView = (ImageView) findViewById(R.id.gifImage);

        String BreedTitle = "Its nothing here";
        String BreedDescription = "Its nothing here";
        String BreedColor = "Its nothing here";
        int BreedImage = 0;


        if (extras != null) {
            BreedTitle = extras.getString("BreedTitle");
            BreedDescription = extras.getString("BreedDescription");
            BreedImage = extras.getInt("BreedImage");
            BreedColor = extras.getString("BreedColor");

        }
        titleTextView.setText(BreedTitle);
        detailedTextView.setText(BreedDescription);
        imageView.setImageResource(BreedImage);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor(BreedColor)));
        if (getSupportActionBar() != null) {
            actionBar = getSupportActionBar();
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor(BreedColor)));
        }

    }
}
