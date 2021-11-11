package com.example.dagger2.video_11;

import android.app.Application;

import com.example.dagger2.video_11.component.DaggerMobileComponent;
import com.example.dagger2.video_11.component.MobileComponent;

public class Video11_MyApplication extends Application {

    MobileComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerMobileComponent
                        .factory()
                        .create(4,8,64);
    }

    public MobileComponent getComponent() {
        return component;
    }
}
