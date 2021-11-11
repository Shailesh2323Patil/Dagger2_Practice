package com.example.dagger2.video_14;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.dagger2.R;
import com.example.dagger2.video_14.Model.Battery;
import com.example.dagger2.video_14.Model.Camera;
import com.example.dagger2.video_14.Model.Mobile;
import com.example.dagger2.video_14.Model.Processor;
import com.example.dagger2.video_14.component.ActivityComponent;
import com.example.dagger2.video_14.component.ApplicationComponent;
import com.example.dagger2.video_14.component.FragmentComponent;
import com.example.dagger2.video_14.module.SnapdragonModule;

public class Video14_MainFragment extends Fragment {

    View view;

    private FragmentComponent fragmentComponent;

    private Processor processor_1,processor_2;
    private Camera camera_1,camera_2;
    private Battery battery_1,battery_2;
    private Mobile mobile_1,mobile_2;

    public Video14_MainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_video12__main, container, false);

        Log.e("Video 14","-------------- Fragment --------------");

        ApplicationComponent applicationComponent = ((Video14_MainApplication) getActivity().getApplicationContext()).getComponent();
        camera_1 = applicationComponent.getCamera();
        camera_2 = applicationComponent.getCamera();

        Log.e("Video 14","Camera 1 = "+camera_1.toString());
        Log.e("Video 14","Camera 2 = "+camera_2.toString());

        ActivityComponent activityComponent = ((Video14_MainActivity) getActivity()).getComponent();
        battery_1 = activityComponent.getBattery();
        battery_2 = activityComponent.getBattery();

        Log.e("Video 14","Battery 1 = "+battery_1.toString());
        Log.e("Video 14","Battery 2 = "+battery_2.toString());

        //-------------------------------------------------------------------------
        // Here we get our Fragment Component from Activity Component
        //-------------------------------------------------------------------------
        fragmentComponent = activityComponent.getFragmentComponent(new SnapdragonModule(4));
        processor_1 = fragmentComponent.getProcessor();
        processor_2 = fragmentComponent.getProcessor();

        Log.e("Video 14","Processor 1 = "+processor_1.toString());
        Log.e("Video 14","Processor 2 = "+processor_2.toString());

        mobile_1 = fragmentComponent.getMobile();
        mobile_2 = fragmentComponent.getMobile();
        Log.e("Video 14","Mobile 1 = "+mobile_1.toString());
        Log.e("Video 14","Mobile 2 = "+mobile_2.toString());

        return view;
    }
}