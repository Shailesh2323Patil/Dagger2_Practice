package com.example.dagger2.video_12.component;

import com.example.dagger2.video_12.Model.Battery;
import com.example.dagger2.video_12.module.BatteryModule;
import com.example.dagger2.video_12.scopes.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(modules = {BatteryModule.class})
public interface ActivityComponent {
    Battery getBattery();
}
