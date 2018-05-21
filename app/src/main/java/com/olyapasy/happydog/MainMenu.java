package com.olyapasy.happydog;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.preference.PreferenceScreen;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.olyapasy.happydog.adapter.ViewPagerAdapter;
import com.olyapasy.happydog.fragment.CategoryFragment;
import com.olyapasy.happydog.fragment.MainMenuFragment;

public class MainMenu extends AppCompatActivity {
    ActionBar actionBar;
    Fragment categoryFragment;
    Fragment menuFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        if(getSupportActionBar() !=null){
            actionBar  = getSupportActionBar();
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#06A9DB")));
        }

        categoryFragment = getSupportFragmentManager().findFragmentById(R.id.categoryFragment);
        menuFragment = getSupportFragmentManager().findFragmentById(R.id.mainMenuFragment);
        ((CategoryFragment) categoryFragment).setMenuFragment((MainMenuFragment) menuFragment);

    }

}
