package com.example.driviz.drcare;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Driviz on 20-03-2018.
 */

public class Fragment2 extends Fragment {
    public static Fragment2 newInstance(){
        Fragment2 fragment=new Fragment2();
        return fragment;
    }

    public Fragment2() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment2, container, false);
        return rootView;
    }
}
