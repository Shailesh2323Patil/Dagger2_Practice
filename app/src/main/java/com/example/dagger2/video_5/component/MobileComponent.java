package com.example.dagger2.video_5.component;


import com.example.dagger2.video_5.Video5_MainActivity;
import com.example.dagger2.video_5.module.BatteryModule;

import dagger.Component;

@Component(modules = BatteryModule.class)
public interface MobileComponent {
    void inject(Video5_MainActivity video5_mainActivity);
}
