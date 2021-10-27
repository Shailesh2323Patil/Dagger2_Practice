package com.example.dagger2.video_6.component;


import com.example.dagger2.video_6.Video6_MainActivity;
import com.example.dagger2.video_6.module.BatteryModule;
import com.example.dagger2.video_6.module.MediaTekModule;
import com.example.dagger2.video_6.module.SnapdragonModule;

import dagger.Component;


/*
* Here we Provide SnapdragonModule and MediaTekModule for the implementation of
* Processor but we need to take care that we can not set the Two Module classes for same interface
* implementation at one time due to ambiguity, the dagger is does not recognise the
* who is going to provide the implementation of Processor.
*  */

@Component(modules = {BatteryModule.class, MediaTekModule.class})
public interface MobileComponent {
    void inject(Video6_MainActivity video6_mainActivity);
}
