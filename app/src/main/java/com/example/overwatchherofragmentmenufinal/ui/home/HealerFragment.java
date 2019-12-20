package com.example.overwatchherofragmentmenufinal.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.overwatchherofragmentmenufinal.R;

public class HealerFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_healer, container, false);

        String[] healerItems = {"Ana",
                "Baptiste",
                "Brigitte",
                "Lucio",
                "Mercy",
                "Moira (Should be in Damage Class)",
                "Zenyatta"};

        ListView listview = (ListView) view.findViewById(R.id.listview_healerfragment);
        ArrayAdapter<String> healerAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                healerItems
        );

        listview.setAdapter(healerAdapter);

        return view;
    }

}