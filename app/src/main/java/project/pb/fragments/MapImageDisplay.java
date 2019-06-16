package project.pb.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.widget.ImageView;

import project.pb.R;
import project.pb.zoom.MultiTouchListener;

public class MapImageDisplay extends Activity {

    private ImageView imageView;
    private SharedPref sharedPref;
    private ConstraintLayout imageMapDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPref = new SharedPref(getApplicationContext());
        if(sharedPref.loadNightModeState() == true) {
            setTheme(R.style.DarkTheme);
        } else {
            setTheme(R.style.AppTheme);
        }
        setContentView(R.layout.map_image_display);
        imageView = findViewById(R.id.expanded_image);
        imageMapDisplay = findViewById(R.id.imageMapDisplay);
        int id = getIntent().getIntExtra("drawable", 0);
        imageView.setImageResource(id);
        imageView.setOnTouchListener(new MultiTouchListener(imageMapDisplay));
    }
}
