package com.example.dagger2.video_4.model;

import android.util.Log;

import javax.inject.Inject;

public class Charger {

    @Inject
    public Charger() {
    }

    void setCharger(Mobile mobile) {
        Log.e("Video 4", "setCharger: ");
    }
}
