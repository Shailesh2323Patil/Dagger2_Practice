package com.example.dagger2.video_8.part_2.Model;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;


/*
* Interface implementation is done by the implementation class
* for example for Processor which is interface and can't set the @Inject for this
* we create class as MediaTek and and provide the implementation for Processor
* and create the module for MediaTek Class
*  */
public class MediaTek implements Processor {

    int clockSpeed;
    int core;

    /*
    * ---------------------------------------------------
    * @Named annotation is solves the problem of same data type ambiguity,
    * means dagger does not recognise the variable directly
    * so we do this by @Named annotation to give the same data type values to different variable.
    * For example,
    * in below example if we not set the @Named parameter then
    * dagger gives error for clockSpeed as well as core because both having same data type as int
    * ---------------------------------------------------
    * */
    @Inject
    public MediaTek(@Named("clockSpeed") int clockSpeed,@Named("core") int core) {
        this.clockSpeed = clockSpeed;
        this.core = core;
        Log.e("Video 8", "MediaTek: ( Processor Implementation ) clock speed = "+clockSpeed+" core = "+core);
    }

    @Override
    public void start() {
        Log.e("Video 8", "start: MediaTek ( Processor )");
    }
}
