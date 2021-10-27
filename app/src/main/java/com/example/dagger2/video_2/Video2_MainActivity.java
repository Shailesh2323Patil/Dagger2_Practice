package com.example.dagger2.video_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2.R;
import com.example.dagger2.video_2.component.DaggerMobileComponent;
import com.example.dagger2.video_2.component.MobileComponent;
import com.example.dagger2.video_2.model.Mobile;

/*
* Component, Provision Method & Construction Injection
*
*  */

public class Video2_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video2_main);

        MobileComponent mobileComponent = DaggerMobileComponent.create();
        Mobile mobile = mobileComponent.getMobile();
        mobile.run();
    }
}