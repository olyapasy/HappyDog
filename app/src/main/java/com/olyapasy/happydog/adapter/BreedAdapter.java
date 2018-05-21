package com.olyapasy.happydog.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.olyapasy.happydog.model.Breed;
import com.olyapasy.happydog.R;

import java.util.ArrayList;

public class BreedAdapter extends BaseAdapter {
    ArrayList<Breed> dogs;
    Context context;
    LayoutInflater inflater;

    public BreedAdapter(ArrayList<Breed> dogs, Context context) {
        this.dogs = dogs;
        this.context = context;
        inflater =  (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return dogs.size();
    }

    @Override
    public Object getItem(int i) {
        return dogs.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null){
            view = inflater.inflate(R.layout.menu_item,parent,false);
        }
        Breed dog = (Breed) getItem(i);
        ((ImageView) view.findViewById(R.id.menuItemImage)).setImageResource(dog.getImage());
        return view;
    }
}
