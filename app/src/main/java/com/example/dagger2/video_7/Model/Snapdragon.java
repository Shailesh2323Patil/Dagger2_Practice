package com.example.dagger2.video_7.Model;

import android.util.Log;

import javax.inject.Inject;


/*
 * Interface implementation is done by the implementation class
 * for example for Processor which is interface and can't set the @Inject for this
 * we create class as Snapdragon and and provide the implementation for Processor
 * and create the module for Snapdragon Class
 *  */
public class Snapdragon implements Processor {

    int clockSpeed;

    /* ------------------------------------
    * The Dependency is Provide by the Snapdragon module
    * because we need to provide clock speed at the runtime
    * -------------------------------------
    * */
    public Snapdragon(int clockSpeed) {
        this.clockSpeed = clockSpeed;
        Log.e("Video 7", "Snapdragon: Clock Speed "+clockSpeed);
    }

    @Override
    public void start() {
        Log.e("Video 7", "start: Snapdragon (Processor)");
    }
}
