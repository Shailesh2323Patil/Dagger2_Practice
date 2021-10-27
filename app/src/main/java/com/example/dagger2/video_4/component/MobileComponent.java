package com.example.dagger2.video_4.component;

import com.example.dagger2.video_4.Video4_MainActivity;
import com.example.dagger2.video_4.model.Mobile;

import dagger.Component;

@Component
public interface MobileComponent {
    void inject(Video4_MainActivity video4_mainActivity);
}
