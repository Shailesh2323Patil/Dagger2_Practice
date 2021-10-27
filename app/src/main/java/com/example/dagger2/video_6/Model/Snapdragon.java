package com.example.dagger2.video_6.Model;

import android.util.Log;

import javax.inject.Inject;


/*
 * Interface implementation is done by the implementation class
 * for example for Processor which is interface and can't set the @Inject for this
 * we create class as Snapdragon and and provide the implementation for Processor
 * and create the module for Snapdragon Class
 *  */
public class Snapdragon implements Processor {

    @Inject
    public Snapdragon() {
        Log.e("Video 6", "Snapdragon: ( Processor Implementation ) ");
    }

    @Override
    public void start() {
        Log.e("Video 6", "start: Snapdragon (Processor)");
    }
}
