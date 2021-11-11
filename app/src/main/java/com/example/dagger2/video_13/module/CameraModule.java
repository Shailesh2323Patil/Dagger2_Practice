package com.example.dagger2.video_13.module;

import com.example.dagger2.video_13.Model.Camera;
import com.example.dagger2.video_13.scopes.ApplicationScope;

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
