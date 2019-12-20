package com.example.overwatchherofragmentmenufinal.ui.gallery;

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

public class DamageFragment extends Fragment {

    private DamageViewModel damageViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_damage, container, false);

        String[] damageItems = {"Ashe",
                "Bastion",
                "Doofist",
                "Genji",
                "Hanzo",
                "Junkrat",
                "McCree",
                "Mei",
                "Phara",
                "Reaper",
                "Soldier:76",
                "Sombra",
                "Symmetra",
                "Torbjörn",
                "Tracer",
                "Widowmaker",};

        ListView listview = (ListView) view.findViewById(R.id.listview_damagefragment);
        ArrayAdapter<String> damageAdapter = new ArrayAdapter<String>(
              getActivity(),
              android.R.layout.simple_list_item_1,
              damageItems
        );

        listview.setAdapter(damageAdapter);

        return view;
    }

}