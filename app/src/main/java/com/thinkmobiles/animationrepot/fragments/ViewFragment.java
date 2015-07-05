package com.thinkmobiles.animationrepot.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.thinkmobiles.animationrepot.R;

/**
 * Created by john on 28.06.15.
 */
public class ViewFragment extends Fragment {

    private Button alpha, translate, rotate, scale, set;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_view, container,false);
        findView(rootView);
        setListener();
        return rootView;
    }

    public void findView(View view){
        alpha           = (Button) view.findViewById(R.id.alpha_view);
        rotate          = (Button) view.findViewById(R.id.rotate_view);
        scale           = (Button) view.findViewById(R.id.scale_view);
        translate       = (Button) view.findViewById(R.id.translate_view);
        set             = (Button) view.findViewById(R.id.set_view);
    }

    public void setListener(){
        alpha.setOnClickListener(new ViewClick(R.anim.alpha_animation));
        rotate.setOnClickListener(new ViewClick(R.anim.rotate_animation));
        scale.setOnClickListener(new ViewClick(R.anim.scale_animation));
        translate.setOnClickListener(new ViewClick(R.anim.translate_animation));
        set.setOnClickListener(new ViewClick(R.anim.set_animation));
    }

    private class ViewClick implements View.OnClickListener{
        private Animation mAnimation;

        public ViewClick(int animResID){
            mAnimation = AnimationUtils.loadAnimation(getActivity(),animResID);
            mAnimation.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {
                    Toast.makeText(getActivity(), "Start", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    Toast.makeText(getActivity(),"End", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onAnimationRepeat(Animation animation) {
                    Toast.makeText(getActivity(),"Repeat", Toast.LENGTH_SHORT).show();
                }
            });

        }

        @Override
        public void onClick(View view) {
            view.startAnimation(mAnimation);
        }
    }

}
