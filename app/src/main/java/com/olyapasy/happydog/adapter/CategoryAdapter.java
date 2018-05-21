package com.olyapasy.happydog.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.olyapasy.happydog.model.Category;
import com.olyapasy.happydog.R;

import java.util.ArrayList;

public class CategoryAdapter extends BaseAdapter {
    ArrayList<Category> categories;
    Context context;
    LayoutInflater inflater;

    public CategoryAdapter(ArrayList<Category> categories, Context context) {
        this.categories = categories;
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return categories.size();
    }

    @Override
    public Object getItem(int i) {
        return categories.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        View view = convertView;
        if(view == null){
            view = inflater.inflate(R.layout.category_list_item,viewGroup,false);
        }
        Category category = (Category) getItem(i);
        ((ImageView) view.findViewById(R.id.categoryImage)).setImageResource(category.getImageId());
        ((TextView) view.findViewById(R.id.categoryTitle)).setText(category.getTitle());
        return view;
    }
}
