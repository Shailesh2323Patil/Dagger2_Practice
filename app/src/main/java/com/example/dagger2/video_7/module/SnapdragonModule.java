package com.example.dagger2.video_7.module;

import com.example.dagger2.video_7.Model.Processor;
import com.example.dagger2.video_7.Model.Snapdragon;

import dagger.Module;
import dagger.Provides;


/*
* This is Normal Implementation of the Processor
* Here we need to set the @Provide annotation with
* return Type of The Class.
*
*  */
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

    /*
    * -----------------------------------
    * Here the Snapdragon class having the instance variable
    * So we can provide it with @Inject ( Directly )
    * So We need to provide the clock speed at runtime
    * -----------------------------------
    * */
    @Provides
    Processor getProcessor() {
        return new Snapdragon(clockSpeed);
    }

}
