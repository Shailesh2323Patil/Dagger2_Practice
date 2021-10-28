package com.example.dagger2.video_8.part_2.module;

import com.example.dagger2.video_8.part_2.Model.MediaTek;
import com.example.dagger2.video_8.part_2.Model.Processor;

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
