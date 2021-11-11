package com.example.dagger2.video_15;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.dagger2.R;
import com.example.dagger2.video_15.Model.Battery;
import com.example.dagger2.video_15.Model.Camera;
import com.example.dagger2.video_15.component.ActivityComponent;
import com.example.dagger2.video_15.component.ApplicationComponent;


// Application - Camera
// Activity - Battery
// Fragment - Processor

/*
* Sub Component Dependency in Dagger 2
* Using Snapdragon Module
* */

/*
* In Side Component We can't create hierarchy of Component Like
* Application Component < Activity Component < Fragment Component
*
* So Using SubComponent we Solve this Problem
* Here We Code in All Three Component Classes as well as
* Activity, Fragment and Application classes
* */
public class Video15_MainActivity extends AppCompatActivity {

    private ActivityComponent component;

    private Battery battery_1,battery_2;
    private Camera camera_1,camera_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video12_main);

        replace(new Video15_MainFragment());

        Log.e("Video 15","---------- Activity ---------------");

        ApplicationComponent applicationComponent = ((Video15_MainApplication) getApplication()).getComponent();

        camera_1 = applicationComponent.getCamera();
        camera_2 = applicationComponent.getCamera();

        Log.e("Video 15","Camera 1 = "+camera_1.toString());
        Log.e("Video 15", "Camera 2 = "+camera_2.toString());

        //-------------------------------------------------------------------------
        // Here We Get Our Component From Application Component
        //-------------------------------------------------------------------------
        component = applicationComponent.getActivityComponent();
        //-------------------------------------------------------------------------

        battery_1 = component.getBattery();
        battery_2 = component.getBattery();

        Log.e("Video 15", "Battery 1 = "+battery_1.toString());
        Log.e("Video 15", "Battery 2 = "+battery_2.toString());
    }

    private void replace(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.layout,fragment);
        ft.commit();
    }

    public ActivityComponent getComponent() {
        return component;
    }
}