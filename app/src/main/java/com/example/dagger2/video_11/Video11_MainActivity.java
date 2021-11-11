package com.example.dagger2.video_11;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2.R;

import com.example.dagger2.video_11.Model.Mobile;
import com.example.dagger2.video_11.component.MobileComponent;

/*
* More about @singleton in Dagger 2
*  */

/*
* First Set Video11_MyApplication as name in AndroidManifest.xml File
* */
public class Video11_MainActivity extends AppCompatActivity {

    Mobile mobile1,mobile2,mobile3,mobile4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video5_main);

        //----------------------------------- Part 1 -----------------------------------------

        /*------------------------------------------------------------------------------------
        * Here the mobile1,mobile2,mobile3,mobile4 are differently created
        * component1 is create mobile1,mobile2, same object of battery and same object of processor
        * component2 is create mobile3,mobile4, same object of battery and same object of processor
        *
        * Here, component create there own singleton object and different
        * component create there own singleton object
        * ------------------------------------------------------------------------------------
        * */
//        MobileComponent component1 = DaggerMobileComponent
//                                    .factory()
//                                    .create(4,8,64);
//
//        MobileComponent component2 = DaggerMobileComponent
//                .factory()
//                .create(4,8,64);
//
//        mobile1 = component1.getMobile();
//        mobile2 = component1.getMobile();
//
//        mobile3 = component2.getMobile();
//        mobile4 = component2.getMobile();

        //----------------------------------- Part 2 -----------------------------------------
        /*
        * ------------------------------------------------------------------------------------
        * Here we create the object in Application Class and same object we provide in
        * Every Activity and which gives Singleton Object
        * ------------------------------------------------------------------------------------
        * */
        MobileComponent component = ((Video11_MyApplication) getApplication()).getComponent();

        mobile1 = component.getMobile();
        mobile2 = component.getMobile();
        mobile3 = component.getMobile();
        mobile4 = component.getMobile();
    }
}