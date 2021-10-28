package com.example.dagger2.video_8.part_1.component;


import com.example.dagger2.video_8.part_1.Video8_MainActivity_Part_1;
import com.example.dagger2.video_8.part_1.module.BatteryModule;
import com.example.dagger2.video_8.part_1.module.SnapdragonModule;

import dagger.Component;


/*
* Here we Provide SnapdragonModule and MediaTekModule for the implementation of
* Processor but we need to take care that we can not set the Two Module classes for same interface
* implementation at one time due to ambiguity, the dagger is does not recognise the
* who is going to provide the implementation of Processor.
*  */

@Component(modules = {BatteryModule.class, SnapdragonModule.class})
public interface MobileComponent {
    void inject(Video8_MainActivity_Part_1 video8_mainActivityPart1);
}
