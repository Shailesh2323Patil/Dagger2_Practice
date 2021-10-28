package com.example.dagger2.video_8.part_2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2.R;
import com.example.dagger2.video_8.part_2.Model.Mobile;
import com.example.dagger2.video_8.part_2.component.DaggerMobileComponent;
import com.example.dagger2.video_8.part_2.component.MobileComponent;


import javax.inject.Inject;

/*
* @Component.Builder,
* @BindsInstance &
* @Named in Dagger
*  */

public class Video8_MainActivity_Part_2 extends AppCompatActivity {

    @Inject
    Mobile mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video5_main);

        /*------------------------------------------
        * Here we provide the implementation by using MediaTekModule
        * which is abstract class
        * ------------------------------------------
        * */
        MobileComponent component = DaggerMobileComponent.builder()
                .setClockSpeed(4)
                .setCore(2)
                .build();
        component.inject(this);
        mobile.run();
    }
}