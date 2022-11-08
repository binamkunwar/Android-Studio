package com.example.fragmentmanager;

import android.app.Fragment;
import android.os.Bundle;
import android.view.ViewGroup;

import android.view.View;
import android.view.LayoutInflater;
public class fragment2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment2,container,false);
        return view;
    }
}
