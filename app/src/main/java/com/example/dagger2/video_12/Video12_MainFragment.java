package com.example.dagger2.video_12;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dagger2.R;
import com.example.dagger2.video_12.Model.Battery;
import com.example.dagger2.video_12.Model.Camera;
import com.example.dagger2.video_12.Model.Processor;
import com.example.dagger2.video_12.component.ActivityComponent;
import com.example.dagger2.video_12.component.ApplicationComponent;
import com.example.dagger2.video_12.component.DaggerFragmentComponent;
import com.example.dagger2.video_12.component.FragmentComponent;

public class Video12_MainFragment extends Fragment {

    View view;

    private FragmentComponent component;

    private Processor processor_1,processor_2;
    private Camera camera_1,camera_2;
    private Battery battery_1,battery_2;


    public Video12_MainFragment() {
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



        Log.e("Video 12","-------------- Fragment --------------");

        component = DaggerFragmentComponent.factory().create(4,8);
        processor_1 = component.getProcessor();
        processor_2 = component.getProcessor();

        Log.e("Video 12","Processor 1 = "+processor_1.toString());
        Log.e("Video 12","Processor 2 = "+processor_2.toString());

        ApplicationComponent applicationComponent = ((Video12_MainApplication) getActivity().getApplicationContext()).getComponent();
        camera_1 = applicationComponent.getCamera();
        camera_2 = applicationComponent.getCamera();

        Log.e("Video 12","Camera 1 = "+camera_1.toString());
        Log.e("Video 12","Camera 2 = "+camera_2.toString());

        ActivityComponent activityComponent = ((Video12_MainActivity) getActivity()).getComponent();
        battery_1 = activityComponent.getBattery();
        battery_2 = activityComponent.getBattery();

        Log.e("Video 12","Battery 1 = "+battery_1.toString());
        Log.e("Video 12","Battery 2 = "+battery_2.toString());

        return view;
    }
}