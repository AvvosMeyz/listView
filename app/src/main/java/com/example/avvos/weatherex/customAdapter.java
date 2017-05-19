package com.example.avvos.weatherex;

import android.content.Context;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by avvos on 19.05.2017.
 */


class customAdapter extends ArrayAdapter<String> {

    customAdapter(Context context, String[] foods) {
        super(context, R.layout.custom_row ,foods);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater hamzasInflater = LayoutInflater.from(getContext());
        View customView = hamzasInflater.inflate(R.layout.custom_row, parent, false);


        String singleFoodItem = getItem(position);
        TextView textView = (TextView) customView.findViewById(R.id.textView);
        ImageView imageView = (ImageView) customView.findViewById(R.id.imageView);

        textView.setText(singleFoodItem);
        imageView.setImageResource(R.drawable.gundogumu);
        return customView;
    }
}