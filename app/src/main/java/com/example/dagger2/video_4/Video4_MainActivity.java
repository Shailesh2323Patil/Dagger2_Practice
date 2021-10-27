package com.example.dagger2.video_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2.R;
import com.example.dagger2.video_4.component.DaggerMobileComponent;
import com.example.dagger2.video_4.component.MobileComponent;
import com.example.dagger2.video_4.model.Mobile;
import javax.inject.Inject;

/*
* Method Injection
*  */
public class Video4_MainActivity extends AppCompatActivity {

    @Inject
    Mobile mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video4_main);

        MobileComponent component = DaggerMobileComponent.create();
        component.inject(this);

        mobile.run();
    }
}