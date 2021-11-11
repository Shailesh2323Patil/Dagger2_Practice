package com.example.dagger2.video_13;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.dagger2.R;
import com.example.dagger2.video_13.Model.Battery;
import com.example.dagger2.video_13.Model.Camera;
import com.example.dagger2.video_13.Model.Mobile;
import com.example.dagger2.video_13.Model.Processor;
import com.example.dagger2.video_13.component.ActivityComponent;
import com.example.dagger2.video_13.component.ApplicationComponent;
import com.example.dagger2.video_13.component.DaggerFragmentComponent;
import com.example.dagger2.video_13.component.FragmentComponent;

public class Video13_MainFragment extends Fragment {

    View view;

    private FragmentComponent fragmentComponent;

    private Processor processor_1,processor_2;
    private Camera camera_1,camera_2;
    private Battery battery_1,battery_2;
    private Mobile mobile_1,mobile_2;

    public Video13_MainFragment() {
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

        Log.e("Video 13","-------------- Fragment --------------");

        ApplicationComponent applicationComponent = ((Video13_MainApplication) getActivity().getApplicationContext()).getComponent();
        camera_1 = applicationComponent.getCamera();
        camera_2 = applicationComponent.getCamera();

        Log.e("Video 13","Camera 1 = "+camera_1.toString());
        Log.e("Video 13","Camera 2 = "+camera_2.toString());

        ActivityComponent activityComponent = ((Video13_MainActivity) getActivity()).getComponent();
        battery_1 = activityComponent.getBattery();
        battery_2 = activityComponent.getBattery();

        Log.e("Video 13","Battery 1 = "+battery_1.toString());
        Log.e("Video 13","Battery 2 = "+battery_2.toString());

        fragmentComponent = DaggerFragmentComponent.builder()
                        .setClockSpeed(4)
                        .setCore(8)
                        .setApplicationComponent(applicationComponent)
                        .setActivityComponent(activityComponent)
                        .build();
        processor_1 = fragmentComponent.getProcessor();
        processor_2 = fragmentComponent.getProcessor();

        Log.e("Video 13","Processor 1 = "+processor_1.toString());
        Log.e("Video 13","Processor 2 = "+processor_2.toString());

        mobile_1 = fragmentComponent.getMobile();
        mobile_2 = fragmentComponent.getMobile();
        Log.e("Video 13","Mobile 1 = "+mobile_1.toString());
        Log.e("Video 13","Mobile 2 = "+mobile_2.toString());

        return view;
    }
}