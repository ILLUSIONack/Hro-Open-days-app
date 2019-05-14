package project.pb.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import project.pb.R;
import project.pb.study.StudyData;

public class GeneralCourseInformation extends Activity {

    private TextView generalInfo;

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
        generalInfo.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                System.out.println("Pointer touches: " + event.getPointerCount());
                // TODO Auto-generated method stub
                if(event.getPointerCount() == 1) {
                    Log.d("Scroll","1-pointer touch");
                    v.getParent().requestDisallowInterceptTouchEvent(false);

                }
                if(event.getPointerCount() == 2){
                    Log.d("Zoom","2-pointer touch");
                    v.getParent().requestDisallowInterceptTouchEvent(true);

                }
                return false;
            }
        });
    }
}


