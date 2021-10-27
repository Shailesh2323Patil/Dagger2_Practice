package com.example.dagger2.video_3.model;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {

    Battery battery;
    Processor processor;

    @Inject
    public Mobile(Battery battery,Processor processor) {
        this.battery = battery;
        this.processor = processor;

        Log.e("Video 3","Mobile");
    }

    public void run() {
        Log.e("Video 3","run :");
    }

}
