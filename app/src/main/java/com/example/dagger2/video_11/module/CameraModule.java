package com.example.dagger2.video_11.module;

import com.example.dagger2.video_11.Model.Camera;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class CameraModule {

    @Provides
    Camera getCamera(@Named("megapixel") int megapixel) {
        return new Camera(megapixel);
    }

}
