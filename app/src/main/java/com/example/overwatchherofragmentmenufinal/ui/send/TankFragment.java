package com.example.overwatchherofragmentmenufinal.ui.send;

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

public class TankFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tank, container, false);

        String[] tankItems = {"D.VA",
                "Orisa",
                "Reinhardt",
                "Roadhog",
                "Sigma",
                "Winston",
                "Wrecking Ball",
                "Zarya",};

        ListView listview = (ListView) view.findViewById(R.id.listview_tankfragment);
        ArrayAdapter<String> tankAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                tankItems
        );

        listview.setAdapter(tankAdapter);

        return view;
    }

}