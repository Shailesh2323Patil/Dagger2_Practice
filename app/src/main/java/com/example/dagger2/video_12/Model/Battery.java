package com.example.dagger2.video_12.Model;


public class Battery {

    /* This class is act like Third Party Class we can not create the instance of this class
    *  So here we can not add @Inject annotation
    *  */

    Cobalt cobalt;
    Lithium lithium;

    public Battery(Cobalt cobalt, Lithium lithium) {
        this.cobalt = cobalt;

        this.lithium = lithium;
    }

}
