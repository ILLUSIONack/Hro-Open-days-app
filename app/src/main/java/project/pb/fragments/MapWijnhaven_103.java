package project.pb.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ScrollView;

import project.pb.R;

public class MapWijnhaven_103 extends Activity {

    private ScrollView scrollViewMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.floor_plan_103);
        scrollViewMaps = findViewById(R.id.scrollViewMaps);
        scrollViewMaps.setScrollbarFadingEnabled(false);

        //TODO THIS CAUSES THE SCROLLVIEW TO NOT SCROLL!!!!!!!!!!!!!!!!!!!!!!!!!!
        //scrollViewMaps.setOnTouchListener(new MultiTouchListener());
    }
}