package com.example.dagger2.video_14;

import android.app.Application;
import android.util.Log;

import com.example.dagger2.video_14.Model.Camera;
import com.example.dagger2.video_14.component.ApplicationComponent;
import com.example.dagger2.video_14.component.DaggerApplicationComponent;

public class Video14_MainApplication extends Application {

    private ApplicationComponent component;

    private Camera camera1,camera2;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder().setMegaPixel(108).build();

        camera1 = component.getCamera();
        camera2 = component.getCamera();

        Log.e("Video 14","---------- Application ---------------");

        Log.e("Video 14","Camera 1 = "+camera1.toString());
        Log.e("Video 14", "Camera 2 = "+camera2.toString());
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
