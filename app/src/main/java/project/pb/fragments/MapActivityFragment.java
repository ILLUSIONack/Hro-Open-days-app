package project.pb.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ScrollView;

import project.pb.R;

public class MapActivityFragment extends Activity {

    private ScrollView scrollViewMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);
        scrollViewMaps = findViewById(R.id.scrollViewMaps);
        scrollViewMaps.setScrollbarFadingEnabled(false);
    }
}
