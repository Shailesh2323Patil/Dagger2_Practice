package com.example.dagger2.video_10;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2.R;
import com.example.dagger2.video_10.Model.Mobile;
import com.example.dagger2.video_10.component.DaggerMobileComponent;
import com.example.dagger2.video_10.component.MobileComponent;


import javax.inject.Inject;

/*
* @Singleton in Dagger
*  */

public class Video10_MainActivity extends AppCompatActivity {

    @Inject
    Mobile mobile1,mobile2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video5_main);

        /*------------------------------------------
        * Here we provide the implementation by using MediaTekModule
        * which is abstract class using Factory methode
        * ------------------------------------------
        * */
        MobileComponent component = DaggerMobileComponent
                                    .factory()
                                    .create(4,8,64);
        component.inject(this);

        /*
        * ------------------------------------------
        * This methods implementation for mobile instances for to check they are Singleton or Not
        * ------------------------------------------
        *  */
        mobile1.run();
        mobile2.run();
    }
}