package com.example.dagger2.video_10.component;


import com.example.dagger2.video_10.Video10_MainActivity;
import com.example.dagger2.video_10.module.BatteryModule;
import com.example.dagger2.video_10.module.CameraModule;
import com.example.dagger2.video_10.module.MediaTekModule;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;


/*
* ------------------------------------------------
* @Singleton is used to make class as Singleton we use it
* on @Provide, Classes is the contain @Inject Annotation and
* @Binds annotation of module
* ------------------------------------------------
* */

/*
* If the any instance contains the @Singleton annotation then we need to
* set @Singleton at top of the @Component annotation also
*  */
@Singleton
@Component(modules = {BatteryModule.class, MediaTekModule.class, CameraModule.class})
public interface MobileComponent {

    void inject(Video10_MainActivity video8_mainActivityPart2);

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
