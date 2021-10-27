package com.example.dagger2.video_2.component;

import com.example.dagger2.video_2.model.Mobile;

import dagger.Component;

/* Component : Is backbone of Dagger 2 is mainly used to provide the dependencies
*  */
@Component
public interface MobileComponent {

    /* Provisional Method : Is used for to create the Class Object By Using the @Inject Annotation */
    Mobile getMobile();

}
