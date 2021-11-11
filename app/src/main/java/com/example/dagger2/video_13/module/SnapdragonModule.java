package com.example.dagger2.video_13.module;

import com.example.dagger2.video_13.Model.Processor;
import com.example.dagger2.video_13.Model.Snapdragon;

import dagger.Module;
import dagger.Provides;

@Module
public class SnapdragonModule {

    int clockSpeed;

    /*-----------------------------------
    * Here we provide clock speed from the runtime value
    * -----------------------------------
    * */
    public SnapdragonModule(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    /*  ------------------------------------
    * Here Suppose, We need to provide clockSpeed value
    * to other class or method or variable then we can not provide it
    * by using clockSpeed in Constructor
    * So hence, we need to create the provide method for it.
    * Here we have not set the @Named Parameter it only work on the
    * int data type means, it data type is required in snapdragon class
    * and it is provided by this method
    * ------------------------------------
    * */
    @Provides
    int getClockSpeed() {
        return clockSpeed;
    }

    @Provides
    Processor getProcessor(Snapdragon snapdragon) {
        return snapdragon;
    }

}
