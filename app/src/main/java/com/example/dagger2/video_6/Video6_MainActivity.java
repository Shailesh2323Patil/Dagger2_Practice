package com.example.dagger2.video_6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2.R;

import com.example.dagger2.video_6.component.DaggerMobileComponent;
import com.example.dagger2.video_6.Model.Mobile;
import com.example.dagger2.video_6.component.MobileComponent;

import javax.inject.Inject;

/*
* Providing interfaces with module in dagger 2
*  */

public class Video6_MainActivity extends AppCompatActivity {

    @Inject
    Mobile mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video5_main);

        MobileComponent component = DaggerMobileComponent.create();
        component.inject(this);
        mobile.run();
    }
}