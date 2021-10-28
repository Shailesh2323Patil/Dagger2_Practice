package com.example.dagger2.video_7;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2.R;
import com.example.dagger2.video_7.Model.Mobile;
import com.example.dagger2.video_7.component.DaggerMobileComponent;
import com.example.dagger2.video_7.component.MobileComponent;
import com.example.dagger2.video_7.module.SnapdragonModule;

import javax.inject.Inject;

/*
* Providing value at run time in dependency graph in dagger 2
*  */

public class Video7_MainActivity extends AppCompatActivity {

    @Inject
    Mobile mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video5_main);

        /*------------------------------------------
        * Before this example we use .create() methode to implement the Component class
        * the .create() is used whenever there is no any instance is available as per
        * run time value.
        * but suppose if there instance need to set at runtime in module class then we need to set
        * .build() method for implementing component class
        * ------------------------------------------
        * */
        MobileComponent component = DaggerMobileComponent.builder()
                .snapdragonModule(new SnapdragonModule(3))
                .build();
        component.inject(this);
        mobile.run();
    }
}