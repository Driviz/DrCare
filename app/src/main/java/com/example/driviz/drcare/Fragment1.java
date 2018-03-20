package com.example.driviz.drcare;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Driviz on 20-03-2018.
 */

public class Fragment1 extends Fragment{
    public static Fragment1 newInstance(){
        Fragment1 fragment=new Fragment1();
        return fragment;
    }

    public Fragment1() {
    }

    private ImageView imageViewRound;
    private Spinner gender;
    private EditText state;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main_activity__doctor, container, false);
        imageViewRound = rootView.findViewById(R.id.imageView_round);
        List<String> listgender=new ArrayList<>();
        listgender.add("--Gender--");
        listgender.add("Male");
        listgender.add("Female");
        listgender.add("Other");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_dropdown_item,listgender);
        gender = rootView.findViewById(R.id.Gender);
        gender.setAdapter(adapter);


        return rootView;
    }
}
