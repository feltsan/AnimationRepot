package com.thinkmobiles.animationrepot.fragments;

import android.animation.Animator;
import android.animation.AnimatorInflater;
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
public class PropertyFragment extends Fragment {

    private Button alpha, translate, set, scale;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_property, container, false);
        findView(rootView);
        setListener();
        return rootView;
    }

    public void findView(View view) {
        alpha = (Button) view.findViewById(R.id.alpha_property);
        translate = (Button) view.findViewById(R.id.translate_property);
        scale = (Button) view.findViewById(R.id.scale_property);
        set = (Button) view.findViewById(R.id.set_property);
    }

    public void setListener() {
        alpha.setOnClickListener(new ViewClick(R.animator.alpha_animator));
        translate.setOnClickListener(new ViewClick(R.animator.translate_animator));
        scale.setOnClickListener(new ViewClick(R.animator.scale_animator));
        set.setOnClickListener(new ViewClick(R.animator.set_animator));
    }

    private class ViewClick implements View.OnClickListener {
        private Animator mAnimator;

        public ViewClick(int animResID) {
            mAnimator = AnimatorInflater.loadAnimator(getActivity(), animResID);
            mAnimator.addListener(new Animator.AnimatorListener() {
                @Override
                public void onAnimationStart(Animator animator) {
                    Toast.makeText(getActivity(), "Start", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    Toast.makeText(getActivity(), "End", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    Toast.makeText(getActivity(), "Cancel", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onAnimationRepeat(Animator animator) {
                    Toast.makeText(getActivity(), "Repeat", Toast.LENGTH_SHORT).show();
                }
            });


        }

        @Override
        public void onClick(View view) {
            mAnimator.setTarget(view);
            mAnimator.start();
        }
    }
}