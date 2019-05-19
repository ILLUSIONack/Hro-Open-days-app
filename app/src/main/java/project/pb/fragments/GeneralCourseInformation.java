package project.pb.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;

import project.pb.R;
import project.pb.study.StudyData;

public class GeneralCourseInformation extends Activity {

    private TextView generalInfo;

    private float mScale = 1f;
    private ScaleGestureDetector mScaleGestureDetector;
    private GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.generalcourseinfo);

        generalInfo = findViewById(R.id.informaticag);

        final StudyData key = (StudyData) getIntent().getSerializableExtra("opleiding");
        String[] content = key.getGeneralInformation();
        String s = "";
        for(int i = 0; i < content.length; i++) {
            s += content[i] + "\n";
        }
        generalInfo.setScrollbarFadingEnabled(false);
        generalInfo.setMovementMethod(new ScrollingMovementMethod());
        generalInfo.setText(s);

        gestureDetector = new GestureDetector(this, new GestureListener());

        mScaleGestureDetector = new ScaleGestureDetector(this, new ScaleGestureDetector.SimpleOnScaleGestureListener(){
            @Override
            public boolean onScale(ScaleGestureDetector detector) {
                float scale = 1 - detector.getScaleFactor();
                float prevScale = mScale;
                mScale += scale;

                if (mScale > 1.5f)
                    mScale = 1.5f;

                ScaleAnimation scaleAnimation = new ScaleAnimation(1f / prevScale, 1f / mScale, 1f / prevScale, 1f / mScale, detector.getFocusX(), detector.getFocusY());
                scaleAnimation.setDuration(0);
                scaleAnimation.setFillAfter(true);
                generalInfo.startAnimation(scaleAnimation);
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


