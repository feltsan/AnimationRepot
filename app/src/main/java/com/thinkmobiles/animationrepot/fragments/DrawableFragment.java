package com.thinkmobiles.animationrepot.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.thinkmobiles.animationrepot.R;

/**
 * Created by john on 28.06.15.
 */
public class DrawableFragment extends Fragment {

    private Button start;
    private ImageView objectAnimation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rooView = inflater.inflate(R.layout.fragment_drawable, container,false);
        findView(rooView);
        return rooView;
    }

    public void findView(View view){
        start           = (Button) view.findViewById(R.id.start_drawable);
        objectAnimation = (ImageView) view.findViewById(R.id.object_drawable);
    }
}
