package com.example.dagger2.video_6.module;

import com.example.dagger2.video_6.Model.Processor;
import com.example.dagger2.video_6.Model.Snapdragon;

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

    @Provides
    Processor getProcessor(Snapdragon snapdragon) {
        return snapdragon;
    }

}
