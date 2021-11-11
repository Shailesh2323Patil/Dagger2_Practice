package com.example.dagger2.video_10.Model;

import android.util.Log;

import javax.inject.Inject;

public class Snapdragon implements Processor {

    int clockSpeed;

    /*
    * Here we can provide the clockSpeed by @Provide method in
    * Module Class
    * */
    @Inject
    public Snapdragon(int clockSpeed) {
        this.clockSpeed = clockSpeed;
        Log.e("Video 10", "Snapdragon: Clock Speed "+clockSpeed);
    }

    @Override
    public void start() {
        Log.e("Video 10", "start: Snapdragon (Processor)");
    }
}
