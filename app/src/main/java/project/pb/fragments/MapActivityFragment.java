package project.pb.fragments;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import project.pb.R;
import project.pb.zoom.MultiTouchListener;

public class MapActivityFragment extends Activity {

    private ScrollView scrollViewMaps;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.floor_plan_99);
        scrollViewMaps = findViewById(R.id.scrollViewMaps);
        scrollViewMaps.setScrollbarFadingEnabled(false);
        scrollViewMaps.setOnTouchListener(new MultiTouchListener());

        //TODO resize images in Bitmap because it crashes on phone
    }
}
