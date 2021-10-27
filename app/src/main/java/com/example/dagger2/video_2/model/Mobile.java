package com.example.dagger2.video_2.model;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {

    Battery battery;
    Processor processor;

    /* Inject is used to create to Object of the class */
    /* The @Inject is On Constructor so it is known as Constructor Injection */
    /* In The Class Constructor Injection can be added on only one Constructor */
    /*
     * This is Directed Acyclic Graph ( Without Cycle ) acronym id DAG (Dagger).
     * Mobile class is dependent on Processor and Battery
     * So it is Directed to the both classes
     *
     *         Processor       Battery
     *            |               |
     *            |               |
     *            ------Mobile-----
     * */
    @Inject
    public Mobile(Battery battery, Processor processor) {
        this.battery = battery;
        this.processor = processor;
        Log.e("Video 2","Mobile Created");
    }

    public void run() {
        Log.e("Video 2","Run :");
    }
}



