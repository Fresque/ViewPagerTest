package com.example.marti.viewpagertest;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {

    ViewPager pager = null;

    MyFragmentPageAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_main);

        pager = (ViewPager)findViewById(R.id.pager);

        MyFragmentPageAdapter adapter = new MyFragmentPageAdapter(getSupportFragmentManager());
        adapter.addFragment(ScreenSlidePageFragment.newInstance(0xFFFF0000, 0));
        adapter.addFragment(ScreenSlidePageFragment.newInstance(0xFFFF00FF, 1));
        adapter.addFragment(ScreenSlidePageFragment.newInstance(0xFF00FFFF, 2));
        adapter.addFragment(ScreenSlidePageFragment.newInstance(0xFF0000FF, 3));
        adapter.addFragment(ScreenSlidePageFragment.newInstance(0xFFFFFF00, 4));
        this.pager.setAdapter(adapter);

    }
}
