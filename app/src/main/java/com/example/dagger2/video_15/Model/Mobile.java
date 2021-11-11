package com.example.dagger2.video_15.Model;

import javax.inject.Inject;


/*
 * This is Directed Acyclic Graph ( Without Cycle ) acronym id DAG (Dagger).
 * Mobile class is dependent on Processor and Battery
 * So it is Directed to the both classes
 *
 *                                   Core
 *                                    |
 *  clock speed       clock speed     |
 *       |                |-----------
 *       |                |
 *  Snapdragon        MediaTek          Lithium          Cobalt             Megapixel
 *       |                |                |               |                    |
 *       |                |                |               |                    |
 *       ----Processor ----                 ----Battery----                  Camera
 *     (Interface) |                              |                             |
 *                 |                              |                             |
 *                  ------------Mobile------------------------------------------
 *        ( Mobile is not dependent on Processor Classes )
 * */
public class Mobile {

    Battery battery;
    Processor processor;
    Camera camera;

    @Inject
    public Mobile(Battery battery, Processor processor, Camera camera) {
        this.battery = battery;
        this.processor = processor;
        this.camera = camera;

    }

    public void run() {
        processor.start();
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "battery=" + battery +
                ", processor=" + processor +
                ", camera=" + camera +
                '}';
    }
}
