package com.olyapasy.happydog;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import com.olyapasy.happydog.model.DetailedItem;

import java.util.ArrayList;

public class MakeHappyDetailedActivity extends AppCompatActivity {
    ActionBar actionBar;
    ArrayList<DetailedItem> detailedItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_happy_detailed);

        if (getSupportActionBar() != null) {
            actionBar = getSupportActionBar();
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#06A9DB")));
        }

        Bundle extras = getIntent().getExtras();
        TextView titleTextView = (TextView) findViewById(R.id.detailedBreedTitle);
        TextView detailedTextView = (TextView) findViewById(R.id.detailedDisp);
        detailedTextView.setMovementMethod(new ScrollingMovementMethod());
        ImageView imageView = (ImageView) findViewById(R.id.detailedImage);

        String itemTitle = "Its nothing here";
        String itemDescription = "Its nothing here";
        int itemImage = 0;

        if (extras != null) {
            itemTitle = extras.getString("itemTitle");
            itemDescription = extras.getString("itemDescription");
            itemImage = extras.getInt("itemImage");
        }

        titleTextView.setText(itemTitle);
        detailedTextView.setText(itemDescription);
        imageView.setImageResource(itemImage);
    }
}
