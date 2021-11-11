package com.example.dagger2.video_13.Model;

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
    }

    @Override
    public void start() { }
}
