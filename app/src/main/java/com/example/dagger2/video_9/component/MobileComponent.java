package com.example.dagger2.video_9.component;


import com.example.dagger2.video_9.Video9_MainActivity;
import com.example.dagger2.video_9.module.BatteryModule;
import com.example.dagger2.video_9.module.CameraModule;
import com.example.dagger2.video_9.module.MediaTekModule;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;


/*
* ------------------------------------------------
* Here We check how factory module pass the values to the MediaTekModule
* and Camera Module
*
* Here we provide the implementation for the MediaTekModule
* and in MediaTekModule implementation is for MediaTek class
* and it require two parameter so provide this by component builder
* ------------------------------------------------
*
* */
@Component(modules = {BatteryModule.class, MediaTekModule.class, CameraModule.class})
public interface MobileComponent {

    void inject(Video9_MainActivity video8_mainActivityPart2);


    /*
    * -----------------------------------------------
    * This is Factory component is used for to pass values from
    * Component to Module Class and Classes
    * -----------------------------------------------
    * */
    @Component.Factory
    interface Factory {
        /*
        * -----------------------------------------------
        * In this create method we set all the parameters
        * -----------------------------------------------
        * */
        MobileComponent create(@BindsInstance @Named("clockSpeed") int clockSpeed,
                               @BindsInstance @Named("core") int core,
                               @BindsInstance @Named("megapixel") int megapixel);

    }

}
