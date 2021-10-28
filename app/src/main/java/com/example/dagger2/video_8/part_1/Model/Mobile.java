package com.example.dagger2.video_8.part_1.Model;

import android.util.Log;

import javax.inject.Inject;


/*
 * This is Directed Acyclic Graph ( Without Cycle ) acronym id DAG (Dagger).
 * Mobile class is dependent on Processor and Battery
 * So it is Directed to the both classes
 *
 *
 *  clock speed       clock speed
 *       |                |
 *       |                |
 *  Snapdragon        MediaTek          Lithium          Cobalt
 *       |                |                |               |
 *       |                |                |               |
 *       ----Processor ----                 ----Battery----
 *     (Interface) |                              |
 *                 |                              |
 *                  ------------Mobile------------
 *        ( Mobile is not dependent on Processor Classes )
 * */
public class Mobile {

    Battery battery;
    Processor processor;

    @Inject
    public Mobile(Battery battery, Processor processor) {
        this.battery = battery;
        this.processor = processor;

        Log.e("Video 8", "Mobile: ");
    }

    public void run() {
        processor.start();
        Log.e("Video 8", "run: ");
    }
}
