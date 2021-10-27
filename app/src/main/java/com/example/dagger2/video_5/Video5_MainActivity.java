package com.example.dagger2.video_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2.R;
import com.example.dagger2.video_5.Model.Mobile;
import com.example.dagger2.video_5.component.DaggerMobileComponent;
import com.example.dagger2.video_5.component.MobileComponent;

import javax.inject.Inject;

/*
* Modules and Provides method in Dagger 2
*  */
public class Video5_MainActivity extends AppCompatActivity {

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