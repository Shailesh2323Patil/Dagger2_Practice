package com.example.dagger2.video_7.Model;

import android.util.Log;

import javax.inject.Inject;


/*
* Interface implementation is done by the implementation class
* for example for Processor which is interface and can't set the @Inject for this
* we create class as MediaTek and and provide the implementation for Processor
* and create the module for MediaTek Class
*  */
public class MediaTek implements Processor {

    @Inject
    public MediaTek() {
        Log.e("Video 7", "MediaTek: ( Processor Implementation )");
    }

    @Override
    public void start() {
        Log.e("Video 7", "start: MediaTek ( Processor )");
    }
}
