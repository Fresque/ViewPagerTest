package com.example.marti.viewpagertest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 10/15/2016.
 */

public class MyFragmentPageAdapter extends FragmentPagerAdapter {

    List<Fragment> listaDeFragments;

    public MyFragmentPageAdapter(FragmentManager fm) {
        super(fm);
        this.listaDeFragments = new ArrayList<Fragment>();
    }

    public void addFragment(Fragment fragment){
        this.listaDeFragments.add(fragment);
    }

    @Override
    public Fragment getItem(int position) {
        return listaDeFragments.get(position);
    }

    @Override
    public int getCount() {
        return listaDeFragments.size();
    }
}
