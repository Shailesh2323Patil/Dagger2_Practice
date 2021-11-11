package com.example.dagger2.video_9.module;

import com.example.dagger2.video_9.Model.MediaTek;
import com.example.dagger2.video_9.Model.Processor;

import dagger.Binds;
import dagger.Module;

/*
* This is abstract implementation of the class ,
* Here if do not want to return the class variable then we
* set this as abstract with @Binds annotation
*  */
@Module
public abstract class MediaTekModule {
    @Binds
    abstract Processor getProcessor(MediaTek mediaTek);
}
