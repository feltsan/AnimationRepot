package com.thinkmobiles.animationrepot.fragments;

import android.app.Fragment;
import android.content.DialogInterface;
import android.graphics.drawable.AnimationDrawable;
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

    private ImageView objectAnimation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rooView = inflater.inflate(R.layout.fragment_drawable, container,false);
        findView(rooView);
        setListener();
        return rooView;
    }

    public void findView(View view){
        objectAnimation = (ImageView) view.findViewById(R.id.object_drawable);
    }

    public void setListener(){
        objectAnimation.setOnClickListener(new DrawableOnClick());
    }

    private class DrawableOnClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            if(view instanceof ImageView){
                if(((ImageView) view).getDrawable() instanceof AnimationDrawable){
                    AnimationDrawable animationDrawable = (AnimationDrawable) ((ImageView) view).getDrawable();

                    if (animationDrawable.isRunning())
                        animationDrawable.stop();
                    else
                        animationDrawable.start();
                }
            }

        }
    }
}
