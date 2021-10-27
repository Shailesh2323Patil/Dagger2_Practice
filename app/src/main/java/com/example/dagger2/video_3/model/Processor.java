package com.example.dagger2.video_3.model;

import android.util.Log;

import javax.inject.Inject;

public class Processor {

    @Inject
    public Processor() {
        Log.e("Video 3","Processor");
    }
}
