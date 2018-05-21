package com.olyapasy.happydog.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.olyapasy.happydog.model.Item;
import com.olyapasy.happydog.R;

import java.util.ArrayList;


public class FirstAdapter extends BaseAdapter {
    ArrayList<Item> items;
    Context context;
    LayoutInflater inflater;

    public FirstAdapter(ArrayList<Item> items, Context context) {
        this.items = items;
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null){
            view = inflater.inflate(R.layout.list_item,parent,false);
        }
        Item i  = (Item) getItem(position);
        ((ImageView) view.findViewById(R.id.listImage1)).setImageResource(i.getImage());
        ((TextView) view.findViewById(R.id.item_text_title)).setText(i.getTitle());
        ((TextView) view.findViewById(R.id.item_text_description)).setText(i.getDescription());

        return view;
    }

    Item getObject(int position){
        return ((Item) getItem(position));
    }


}
