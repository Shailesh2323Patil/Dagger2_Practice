package com.example.dagger2.video_13.component;

import com.example.dagger2.video_13.Model.Mobile;
import com.example.dagger2.video_13.Model.Processor;
import com.example.dagger2.video_13.module.MediaTekModule;
import com.example.dagger2.video_13.scopes.FragmentScope;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;


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
@Component(dependencies = {ApplicationComponent.class,ActivityComponent.class},modules = {MediaTekModule.class})
public interface FragmentComponent {

    Processor getProcessor();

    Mobile getMobile();

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder setClockSpeed(@Named("clockSpeed") int clockSpeed);

        @BindsInstance
        Builder setCore(@Named("core") int core);

        /*
        * Create the Application Dependency using this method
        * */
        Builder setApplicationComponent(ApplicationComponent applicationComponent);

        /*
        * Create the Activity Dependency using this method
        * */
        Builder setActivityComponent(ActivityComponent activityComponent);

        FragmentComponent build();
    }
}
