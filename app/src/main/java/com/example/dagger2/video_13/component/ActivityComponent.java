package com.example.dagger2.video_13.component;

import com.example.dagger2.video_13.Model.Battery;
import com.example.dagger2.video_13.module.BatteryModule;
import com.example.dagger2.video_13.scopes.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(modules = {BatteryModule.class})
public interface ActivityComponent {
    Battery getBattery();
}
