package com.example.dagger2.video_12;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.dagger2.R;
import com.example.dagger2.video_12.Model.Battery;
import com.example.dagger2.video_12.Model.Camera;
import com.example.dagger2.video_12.Model.Mobile;
import com.example.dagger2.video_12.component.ActivityComponent;
import com.example.dagger2.video_12.component.ApplicationComponent;
import com.example.dagger2.video_12.component.DaggerActivityComponent;


// Application - Camera
// Activity - Battery
// Fragment - Processor

/*
* Set Video12_MainApplication Class as name field in AndroidManifest.xml
*  */

/*
* Custom Scope
* Here We Create Custom Scope Like Application,Activity and Fragment Scope
* All Scope are like Singleton Scope and Created for the separate Module
* Application Scope is Used with CameraModule
* Activity Scope is Used with Battery Module
* Fragment Scope is Used with Processor Module
* */
public class Video12_MainActivity extends AppCompatActivity {

    private ActivityComponent component;

    private Battery battery_1,battery_2;
    private Camera camera_1,camera_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video12_main);

        replace(new Video12_MainFragment());

        component = DaggerActivityComponent.builder().build();

        battery_1 = component.getBattery();
        battery_2 = component.getBattery();

        Log.e("Video 12","---------- Activity ---------------");

        Log.e("Video 12", "Battery 1 = "+battery_1.toString());
        Log.e("Video 12", "Battery 2 = "+battery_2.toString());

        ApplicationComponent applicationComponent = ((Video12_MainApplication) getApplication()).getComponent();

        camera_1 = applicationComponent.getCamera();
        camera_2 = applicationComponent.getCamera();

        Log.e("Video 12","Camera 1 = "+camera_1.toString());
        Log.e("Video 12", "Camera 2 = "+camera_2.toString());
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