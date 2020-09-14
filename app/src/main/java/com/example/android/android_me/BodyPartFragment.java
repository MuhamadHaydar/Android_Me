package com.example.android.android_me;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.data.AndroidImageAssets;

public class BodyPartFragment extends Fragment {

    // We have to create an empty constructor in order to instantiate an object.
    public BodyPartFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Get the layout of the fragment.
        View view = inflater.inflate(R.layout.fragment_body_part,container,false);
        // Get the image view.
        ImageView mIvBodyPart = (ImageView) view.findViewById(R.id.iv_fragment_body_part);
        // Set the image to the image view.
        mIvBodyPart.setImageResource(AndroidImageAssets.getBodies().get(0));
        // return the view.
        return view;
    }
}
