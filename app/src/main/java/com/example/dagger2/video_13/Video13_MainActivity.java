package com.example.dagger2.video_13;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.dagger2.R;
import com.example.dagger2.video_13.Model.Battery;
import com.example.dagger2.video_13.Model.Camera;
import com.example.dagger2.video_13.component.ActivityComponent;
import com.example.dagger2.video_13.component.ApplicationComponent;
import com.example.dagger2.video_13.component.DaggerActivityComponent;


// Application - Camera
// Activity - Battery
// Fragment - Processor

/*
* Component Dependency in Dagger 2
*
* Information is available on Fragment Component
*
* First You Need to add Video13_MainApplication in AndroidManifest.xml file
* */
public class Video13_MainActivity extends AppCompatActivity {

    private ActivityComponent component;

    private Battery battery_1,battery_2;
    private Camera camera_1,camera_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video12_main);

        replace(new Video13_MainFragment());

        component = DaggerActivityComponent.builder().build();

        battery_1 = component.getBattery();
        battery_2 = component.getBattery();

        Log.e("Video 13","---------- Activity ---------------");

        Log.e("Video 13", "Battery 1 = "+battery_1.toString());
        Log.e("Video 13", "Battery 2 = "+battery_2.toString());

        ApplicationComponent applicationComponent = ((Video13_MainApplication) getApplication()).getComponent();

        camera_1 = applicationComponent.getCamera();
        camera_2 = applicationComponent.getCamera();

        Log.e("Video 13","Camera 1 = "+camera_1.toString());
        Log.e("Video 13", "Camera 2 = "+camera_2.toString());
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