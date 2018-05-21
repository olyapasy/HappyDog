package com.olyapasy.happydog.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import com.olyapasy.happydog.R;
import com.olyapasy.happydog.adapter.CategoryAdapter;
import com.olyapasy.happydog.model.Category;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment {
    ArrayList<Category> categories = new ArrayList<Category>();
    CategoryAdapter categoryAdapter;
    MainMenuFragment menuFragment;
    private GridView menuFragmentView;


    public CategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_category, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.categoryViewList);
        fillData();
        final CategoryAdapter categoryAdapter = new CategoryAdapter(categories,getContext());
        listView.setAdapter(categoryAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                MainMenuFragment mainMenuFragment = new MainMenuFragment();
                Bundle bundle = new Bundle();
                bundle.putString("Title",categories.get(i).getTitle());
                mainMenuFragment.setArguments(bundle);
                FragmentManager fragmentManager = getFragmentManager();
                clearView();
                fragmentManager.beginTransaction().replace(R.id.mainMenuFragment,mainMenuFragment).commit();
            }
        });

        return rootView;
    }

    void fillData(){
        categories.add(new Category("Big",R.drawable.haski));
        categories.add(new Category("Middle",R.drawable.chau));
        categories.add(new Category("Little",R.drawable.shtsu));
        categories.add(new Category("All",R.drawable.house));//СОЕДЕНИТЬ КАРТИНКИ ТРИ КАРТИНКИ В ОДНУ
    }

    public void setMenuFragment(MainMenuFragment menuFragment) {
        this.menuFragment = menuFragment;
    }

    public void clearView(){
        GridView view = menuFragment.getGridView();
        view.setAdapter(null);
    }

}
