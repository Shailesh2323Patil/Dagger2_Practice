package com.example.dagger2.video_12.component;

import com.example.dagger2.video_12.Model.Processor;
import com.example.dagger2.video_12.module.MediaTekModule;
import com.example.dagger2.video_12.scopes.FragmentScope;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@FragmentScope
@Component(modules = {MediaTekModule.class})
public interface FragmentComponent {

    Processor getProcessor();

    @Component.Factory
    interface factory {

        FragmentComponent create(@BindsInstance @Named("clockSpeed") int clockSpeed,@BindsInstance @Named("core") int core);

    }
}
