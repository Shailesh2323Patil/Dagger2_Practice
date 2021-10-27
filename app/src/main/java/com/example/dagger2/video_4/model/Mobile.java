package com.example.dagger2.video_4.model;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {

    /*
    * Field Injection
    * This is having 2nd Priority of execution
    * 1. If inside the class the constructor injection is available then
    * No need to set Injection method in component class for Field Injection
    * 2. If there is No Constructor Injection provide at that moment we have to
    * set inject method for field injection in component interface.
    *  */
    @Inject
    Battery battery;

    Processor processor;
    /*
    * Constructor Injection
    * This is having 1st Priority of execution
    * */
    @Inject
    public Mobile(Processor processor) {
        this.processor = processor;
        Log.e("Video 4","Mobile");
    }

    public void run() {
        Log.e("Video 4","Run : ");
    }

    /*
    * Method Injection
    * This is having 3rd Priority of execution
    * 1. If inside the class the constructor injection is available then
    * No need to set Injection method in component class for Method Injection
    * 2. If there is No Constructor Injection provide at that moment we have to
    * set inject method for method injection in component interface.
    * */
    @Inject
    public void connectCharger(Charger charger) {
        charger.setCharger(this);
    }
}
