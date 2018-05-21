package com.olyapasy.happydog.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.olyapasy.happydog.fragment.MainMenuFragment;
import com.olyapasy.happydog.fragment.MainMenuFragment2;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position ==0 ){
            return new MainMenuFragment();
        }
        else{
            return new MainMenuFragment2();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
