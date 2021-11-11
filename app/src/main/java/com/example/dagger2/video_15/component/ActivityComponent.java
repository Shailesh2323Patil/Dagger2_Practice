package com.example.dagger2.video_15.component;

import com.example.dagger2.video_15.Model.Battery;
import com.example.dagger2.video_15.module.BatteryModule;
import com.example.dagger2.video_15.scopes.ActivityScope;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {BatteryModule.class})
public interface ActivityComponent {

    Battery getBattery();

    /*
    * If Component's Module is dependent on any instance variable then
    * at that moment we need to specify in method
    * For ex. Here inside the FragmentComponent we need to set SnapdragonModule
    * because it has dependency of ClockSpeed
    * */
    FragmentComponent.Builder getFragmentComponentBuilder();
}
