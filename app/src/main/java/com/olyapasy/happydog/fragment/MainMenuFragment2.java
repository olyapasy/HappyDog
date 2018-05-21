package com.olyapasy.happydog.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.olyapasy.happydog.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainMenuFragment2 extends Fragment {


    public MainMenuFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.main_menu_fragment2, container, false);
        return rootView;
    }

}
