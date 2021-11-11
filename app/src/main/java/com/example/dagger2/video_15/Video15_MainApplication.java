package com.example.dagger2.video_15;

import android.app.Application;
import android.util.Log;


import com.example.dagger2.video_15.Model.Camera;
import com.example.dagger2.video_15.component.ApplicationComponent;
import com.example.dagger2.video_15.component.DaggerApplicationComponent;

public class Video15_MainApplication extends Application {

    private ApplicationComponent component;

    private Camera camera1,camera2;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder().setMegaPixel(108).build();

        camera1 = component.getCamera();
        camera2 = component.getCamera();

        Log.e("Video 15","---------- Application ---------------");

        Log.e("Video 15","Camera 1 = "+camera1.toString());
        Log.e("Video 15", "Camera 2 = "+camera2.toString());
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
