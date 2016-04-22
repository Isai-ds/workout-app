package com.example.xmz0426.workout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WorkDetailFragment extends Fragment {
    private long workoutId;
    public WorkDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_work_detail, container, false);
    }
    public void setWorkoutId(long workoutId) {
        this.workoutId = workoutId;
    }
    @Override
    public void onStart(){
        super.onStart();
        View view = getView();
        if (view !=null){
            TextView title = (TextView)view.findViewById(R.id.textTitle);
            Workout w = Workout.workouts[(int)workoutId];
            title.setText(w.getName());
            TextView description = (TextView)view.findViewById(R.id.textDescription);
            description.setText(w.getDescription());

        }
    }
}
