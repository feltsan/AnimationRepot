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
public class ViewFragment extends Fragment {

    private Button alpha, translate, rotate, scale, set;
    private ImageView objectAnimation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_view, container,false);
        findView(rootView);
        return rootView;
    }

    public void findView(View view){
        alpha           = (Button) view.findViewById(R.id.alpha_property);
        rotate          = (Button) view.findViewById(R.id.rotate_view);
        translate       = (Button) view.findViewById(R.id.translate_view);
        objectAnimation = (ImageView) view.findViewById(R.id.object_view);
        set             = (Button) view.findViewById(R.id.set_view);
    }

}
