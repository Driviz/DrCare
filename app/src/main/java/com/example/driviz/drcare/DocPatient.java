package com.example.driviz.drcare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DocPatient extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_patient);

    }

    public void click(View view)
    {
        Intent intent=new Intent(this,MainActivity_Doctor.class);
        startActivity(intent);
    }

}
