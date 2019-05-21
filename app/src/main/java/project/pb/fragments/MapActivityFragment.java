package project.pb.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.animation.ScaleAnimation;
import android.widget.ScrollView;

import project.pb.R;

public class MapActivityFragment extends Activity {

    private ScrollView scrollViewMaps;

    private float mScale = 1f;
    private ScaleGestureDetector mScaleGestureDetector;
    private GestureDetector gestureDetector;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);
        scrollViewMaps = findViewById(R.id.scrollViewMaps);
        scrollViewMaps.setScrollbarFadingEnabled(false);

        gestureDetector = new GestureDetector(this, new GestureListener());

        mScaleGestureDetector = new ScaleGestureDetector(this, new ScaleGestureDetector.SimpleOnScaleGestureListener(){
            @Override
            public boolean onScale(ScaleGestureDetector detector) {
                float scale = 1 - detector.getScaleFactor();
                float prevScale = mScale;
                mScale += scale;

                if (mScale > 1.1f) {
                    mScale = 1.1f;
                }
                if (mScale < 0.4f) {
                    mScale = 0.4f;
                }

                ScaleAnimation scaleAnimation = new ScaleAnimation(1f / prevScale, 1f / mScale, 1f / prevScale, 1f / mScale, detector.getFocusX(), detector.getFocusY());
                scaleAnimation.setDuration(0);
                scaleAnimation.setFillAfter(true);
                scrollViewMaps.startAnimation(scaleAnimation);
                return true;
            }
        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        super.dispatchTouchEvent(event);
        mScaleGestureDetector.onTouchEvent(event);
        gestureDetector.onTouchEvent(event);
        return gestureDetector.onTouchEvent(event);
    }

    private class GestureListener extends GestureDetector.SimpleOnGestureListener{
        @Override
        public boolean onDown(MotionEvent e) {
            return true;
        }

        @Override
        public boolean onDoubleTap(MotionEvent e) {
            return true;
        }
    }
}
