package com.example.dagger2.video_13.component;

import com.example.dagger2.video_13.Model.Camera;
import com.example.dagger2.video_13.module.CameraModule;
import com.example.dagger2.video_13.scopes.ApplicationScope;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@ApplicationScope
@Component(modules = {CameraModule.class})
public interface ApplicationComponent {

    Camera getCamera();

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder setMegaPixel(@Named("megapixel") int megapixel);

        ApplicationComponent build();
    }

}
