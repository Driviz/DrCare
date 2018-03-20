package com.example.driviz.drcare;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Driviz on 20-03-2018.
 */

public class Fragment3 extends Fragment {
    public static Fragment3 newInstance(){
        Fragment3 fragment=new Fragment3();
        return fragment;
    }

    public Fragment3() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment3, container, false);
        return rootView;
    }
}
