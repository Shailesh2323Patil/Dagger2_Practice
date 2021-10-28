package com.example.dagger2.video_8.part_2.component;


import com.example.dagger2.video_8.part_2.Video8_MainActivity_Part_2;
import com.example.dagger2.video_8.part_2.module.BatteryModule;
import com.example.dagger2.video_8.part_2.module.MediaTekModule;
import com.example.dagger2.video_8.part_2.module.SnapdragonModule;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;


/*
* ------------------------------------------------
* Here we provide the implementation for the MediaTekModule
* and in MediaTekModule implementation is for MediaTek class
* and it require two parameter so provide this by component builder
* ------------------------------------------------
*
* */
@Component(modules = {BatteryModule.class, MediaTekModule.class})
public interface MobileComponent {

    void inject(Video8_MainActivity_Part_2 video8_mainActivityPart2);

    /*
    * ----------------------------------
    * Here @Component.Builder is use to create the builder
    * an the builder is use to provide runtime values in Specific module classes
    * ----------------------------------
    *  */
    @Component.Builder
    interface Builder {
        /*
        * ----------------------------------
        * @BindsInstance is use to set variables from the runtime
        * ----------------------------------
        * */
        @BindsInstance
        Builder setClockSpeed(@Named("clockSpeed") int clockSpeed);

        /*
         * ----------------------------------
         * @BindsInstance is use to set variables from the runtime
         * ----------------------------------
         * */
        @BindsInstance
        Builder setCore(@Named("core") int core);

        /*
        * ----------------------------------
        * build() usually return the Same Component
        * ----------------------------------
        * */
        MobileComponent build();
    }
}
