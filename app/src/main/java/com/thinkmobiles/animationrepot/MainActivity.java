package com.thinkmobiles.animationrepot;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;


import com.thinkmobiles.animationrepot.fragments.DrawableFragment;
import com.thinkmobiles.animationrepot.fragments.PropertyFragment;
import com.thinkmobiles.animationrepot.fragments.ViewFragment;


public class MainActivity extends Activity {

    public final String LOG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getActionBar();

        ActionBar.Tab tabV = actionBar.newTab();
        tabV.setText(R.string.view);
        tabV.setTabListener(new AnimationTabListener(new ViewFragment()));
        actionBar.addTab(tabV);
        actionBar.selectTab(tabV    );

        ActionBar.Tab tabP = actionBar.newTab();
        tabP.setText(R.string.property);
        tabP.setTabListener(new AnimationTabListener(new PropertyFragment()));
        actionBar.addTab(tabP);

        ActionBar.Tab tabD = getActionBar().newTab();
        tabD.setText(R.string.drawable);
        tabD.setTabListener(new AnimationTabListener( new DrawableFragment()));
        actionBar.addTab(tabD);
        actionBar.show();

    }

    private class AnimationTabListener implements ActionBar.TabListener{
        Fragment fragment;

        public AnimationTabListener(Fragment fragment){
            this.fragment = fragment;
        }

        @Override
        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
            fragmentTransaction.replace(R.id.container,fragment);
        }

        @Override
        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
            fragmentTransaction.remove(fragment);
        }

        @Override
        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

        }
    }

}
