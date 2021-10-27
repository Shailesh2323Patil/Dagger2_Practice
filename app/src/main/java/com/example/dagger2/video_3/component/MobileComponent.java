package com.example.dagger2.video_3.component;

import com.example.dagger2.video_3.Video3_MainActivity;
import com.example.dagger2.video_3.model.Mobile;

import dagger.Component;

@Component
public interface MobileComponent {

    Mobile getMobile();

    void inject(Video3_MainActivity activity);

}
