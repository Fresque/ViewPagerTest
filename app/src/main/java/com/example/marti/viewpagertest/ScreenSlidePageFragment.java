package com.example.marti.viewpagertest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by marti on 10/15/2016.
 */

public class ScreenSlidePageFragment extends Fragment {

    private static final String BACKGROUD_COLOR = "color";
    private static final String INDEX = "index";

    private int color;
    private int index;

    /*Este metodo instancia el fragment
    con todos los parametros necesarios
    pero no lo utiliza todavia.
    Para ello esta el metodo posterior
     */
    public static ScreenSlidePageFragment newInstance(int color, int index) {

        ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();

        Bundle bundle = new Bundle();
        bundle.putInt(BACKGROUD_COLOR, color);
        bundle.putInt(INDEX, index);
        fragment.setArguments(bundle);
        fragment.setRetainInstance(true);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        this.color = (getArguments() != null) ? getArguments().getInt(BACKGROUD_COLOR) : Color.GRAY;
        this.index = (getArguments() != null) ? getArguments().getInt(INDEX) : -1;
    }

    /*Este metodo es el que utiliza
    el fragment que armamos anteriormente*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.layout_fragmet_viewpager, container, false);

        TextView index = (TextView) rootView.findViewById(R.id.tvIndex);
        index.setText(String.valueOf(this.index));
        rootView.setBackgroundColor(this.color);

        return rootView;
    }

    }
