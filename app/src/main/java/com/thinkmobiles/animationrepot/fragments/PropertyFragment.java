package com.thinkmobiles.animationrepot.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.thinkmobiles.animationrepot.R;

/**
 * Created by john on 28.06.15.
 */
public class PropertyFragment extends Fragment {

    private Button alpha, translate, set, scale;
    private ImageView objectAnimation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_property, container,false);
        findView(rootView);
        return rootView;
    }

    public void findView(View view){
        alpha           = (Button) view.findViewById(R.id.alpha_property);
        translate       = (Button) view.findViewById(R.id.translate_property);
        scale           = (Button) view.findViewById(R.id.translate_property);
        set             = (Button) view.findViewById(R.id.set_property);
        objectAnimation = (ImageView) view.findViewById(R.id.object_property);
    }
}
