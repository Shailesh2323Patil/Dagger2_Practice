package com.example.dagger2.video_15.component;

import com.example.dagger2.video_15.Model.Camera;
import com.example.dagger2.video_15.module.CameraModule;
import com.example.dagger2.video_15.scopes.ApplicationScope;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@ApplicationScope
@Component(modules = {CameraModule.class})
public interface ApplicationComponent {

    Camera getCamera();

    ActivityComponent getActivityComponent();

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder setMegaPixel(@Named("megapixel") int megapixel);

        ApplicationComponent build();
    }

}
