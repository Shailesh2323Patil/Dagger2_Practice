package com.example.dagger2.video_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2.R;
import com.example.dagger2.video_3.component.DaggerMobileComponent;
import com.example.dagger2.video_3.component.MobileComponent;
import com.example.dagger2.video_3.model.Mobile;

import javax.inject.Inject;

/*
* Field Injection
*
* When we can use Provision Method ?
* Answer : When we provide construction injection at that moment if Dagger knows how to create object,
* at this moment we have no need to create the Provision method.
* In Video 2 example the Battery and Processor Object is create by @Inject Method so at that moment no
* need to create provision method for Battery and Processor Class, but For Mobile we need to create
* Provision method because Dagger don't know how to create the Mobile Object.
*
* Field Injection : If we have so many object for creation then at that moment we need to create Provision method
* for all classes so to overcome this we use Field Injection.
* Filed Injection is used when we don't have Constructor for Injection.
* Field Injection generally use to create third party related objects.
* */

public class Video3_MainActivity extends AppCompatActivity {

    @Inject
    Mobile mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video3_main);

        MobileComponent mobileComponent = DaggerMobileComponent.create();
        mobileComponent.inject(this);

        mobile.run();
    }
}