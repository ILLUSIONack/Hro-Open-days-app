package project.pb.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.widget.ScrollView;

import project.pb.R;
import project.pb.zoom.MultiTouchListener;

public class MapActivityFragment extends Activity {

    private ScrollView scrollViewMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);
        scrollViewMaps = findViewById(R.id.scrollViewMaps);
        scrollViewMaps.setScrollbarFadingEnabled(false);
        scrollViewMaps.setOnTouchListener(new MultiTouchListener());
    }

}
