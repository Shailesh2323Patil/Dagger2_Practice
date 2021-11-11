package com.example.dagger2.video_10.module;

import com.example.dagger2.video_10.Model.Battery;
import com.example.dagger2.video_10.Model.Cobalt;
import com.example.dagger2.video_10.Model.Lithium;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


/*
* @Module is used to provide the third party class library implementation
* The classes having no access on it's constructor
*  */
@Module
public class BatteryModule {

    /*
    * @Provides is used for to provide related implementation for main class.
    * For example for Battery Class we need the cobalt and lithium class implementation.
    * In provide method the return type is not dependent on any instance variable then we
    * can set this method as Static method
    * */
    @Provides
    static Cobalt getCobalt() {
        return new Cobalt();
    }


    @Provides
    static Lithium getLithium() {
        return new Lithium();
    }

    /*
    * --------------------------------------
    * This one of the method to assign @Singleton on @Provide
    * annotation for Battery Class
    * --------------------------------------
    * */
    @Singleton
    @Provides
    static Battery getBattery(Cobalt cobalt, Lithium lithium) {
        return new Battery(cobalt, lithium);
    }
}
