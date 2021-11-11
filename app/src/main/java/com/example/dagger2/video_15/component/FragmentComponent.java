package com.example.dagger2.video_15.component;

import com.example.dagger2.video_15.Model.MediaTek;
import com.example.dagger2.video_15.Model.Mobile;
import com.example.dagger2.video_15.Model.Processor;
import com.example.dagger2.video_15.module.MediaTekModule;
import com.example.dagger2.video_15.module.SnapdragonModule;
import com.example.dagger2.video_15.scopes.FragmentScope;

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
@Subcomponent(modules = {MediaTekModule.class})
public interface FragmentComponent {

    Processor getProcessor();

    Mobile getMobile();

    MediaTek getMediaTek();

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        Builder setClockSpeed(@Named("clockSpeed") int clockSpeed);

        @BindsInstance
        Builder setCore(@Named("core") int core);

        FragmentComponent build();
    }
}
