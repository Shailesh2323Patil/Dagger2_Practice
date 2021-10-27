package com.example.dagger2.video_5.Model;

import android.util.Log;

import javax.inject.Inject;



/*
 * This is Directed Acyclic Graph ( Without Cycle ) acronym id DAG (Dagger).
 * Mobile class is dependent on Processor and Battery
 * So it is Directed to the both classes
 *
 *                 Lithium          Cobalt
 *                     |               |
 *                     |               |
 *         Processor    ----Battery----
 *            |               |
 *            |               |
 *            ------Mobile-----
 * */
public class Mobile {

    Battery battery;
    Processor processor;

    @Inject
    public Mobile(Battery battery,Processor processor) {
        this.battery = battery;
        this.processor = processor;

        Log.e("Video 5", "Mobile: ");
    }

    public void run() {
        Log.e("Video 5", "run: ");
    }
}
