package com.example.driviz.drcare;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChooserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooser);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
    public void docbut(View view){
        startActivity(new Intent(this,MainActivity_Doctor.class));
    }
}
