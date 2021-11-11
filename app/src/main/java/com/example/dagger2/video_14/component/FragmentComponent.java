package com.example.dagger2.video_14.component;

import com.example.dagger2.video_14.Model.Mobile;
import com.example.dagger2.video_14.Model.Processor;
import com.example.dagger2.video_14.module.MediaTekModule;
import com.example.dagger2.video_14.module.SnapdragonModule;
import com.example.dagger2.video_14.scopes.FragmentScope;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;


/*
* Here we want to initialise the Mobile class.
* but the Mobile class is dependent on Camera and Battery Class
* and those classes are created by Application Component and Activity Component
* So here for providing the Camera and Battery Dependency to Mobile Classes we use
* Component Dependency using dependencies inside @Component
* */

/*
* Check The Mobile class implementation in Video13_MainFragment
* */

@FragmentScope
@Subcomponent(modules = {SnapdragonModule.class})
public interface FragmentComponent {

    Processor getProcessor();

    Mobile getMobile();
}
