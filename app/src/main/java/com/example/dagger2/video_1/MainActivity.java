package com.example.dagger2.video_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2.R;

/*
* Here Mobile is Dependent On Processor and Battery Object
* and the Battery and Processor object are given by MainActivity Class
* to the Mobile Class
* */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Battery battery = new Battery();
        Processor processor = new Processor();

        Mobile mobile = new Mobile(battery,processor);
    }
}