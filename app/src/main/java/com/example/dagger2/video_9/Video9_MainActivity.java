package com.example.dagger2.video_9;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2.R;
import com.example.dagger2.video_9.Model.Mobile;
import com.example.dagger2.video_9.component.DaggerMobileComponent;
import com.example.dagger2.video_9.component.MobileComponent;

import javax.inject.Inject;

/*
* @Component.Factory in Dagger
*  */

public class Video9_MainActivity extends AppCompatActivity {

    @Inject
    Mobile mobile;

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
        mobile.run();
    }
}