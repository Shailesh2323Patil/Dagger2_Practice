package com.example.dagger2.video_14.module;

import com.example.dagger2.video_14.Model.Camera;
import com.example.dagger2.video_14.scopes.ApplicationScope;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class CameraModule {

    @ApplicationScope
    @Provides
    Camera getCamera(@Named("megapixel") int megapixel) {
        return new Camera(megapixel);
    }

}
