package com.example.dagger2.video_1;

import android.util.Log;

public class Mobile {

    Battery battery;
    Processor processor;

    public Mobile(Battery battery,Processor processor) {
        this.battery = battery;
        this.processor = processor;
        Log.e("Video 1","Mobile Created");
    }

}
