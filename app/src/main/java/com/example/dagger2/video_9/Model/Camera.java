package com.example.dagger2.video_9.Model;


import android.util.Log;

public class Camera {

    int megapixel;

    public Camera(int megapixel) {
        this.megapixel = megapixel;
        Log.e("Video 9","Camera "+megapixel+" Megapixel");
    }

}
