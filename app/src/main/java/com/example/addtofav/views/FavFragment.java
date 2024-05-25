package com.example.addtofav.views;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.addtofav.R;


public class FavFragment extends Fragment {
/*
    public FavFragment() {
        // Required empty public constructor
    }


 */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fav, container, false);
        return view;


        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fav, container, false);
    }
}