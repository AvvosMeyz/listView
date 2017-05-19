package com.example.avvos.weatherex;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by avvos on 19.05.2017.
 */


public class Fragment1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.activity_main, container,false);

        String[] foods = {"Salam", "Sucuk", "patates"};

        ListAdapter foodAdapter = new customAdapter(getActivity(),foods);

        ListView hamzasListView = (ListView) view.findViewById(R.id.hamzasListView);



        hamzasListView.setAdapter(foodAdapter);

        return view;

    }
}
