package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

public class MasterListFragment extends Fragment {

    // An empty constructor to create object.
    public MasterListFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // The root view is layout.
        View rootView = inflater.inflate(R.layout.fragment_master_list,container,false);
        // The grid view to display whole images.
        GridView gridView = (GridView) rootView.findViewById(R.id.gv_master_list);
        // Create an adapter to get the whole of images.
        MasterListAdapter masterListAdapter = new MasterListAdapter(getActivity(), AndroidImageAssets.getAll());
        // Set the adapter to the grid view.
        gridView.setAdapter(masterListAdapter);
        //return the layout view.
        return rootView;
    }
}
