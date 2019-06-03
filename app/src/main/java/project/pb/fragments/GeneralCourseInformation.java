package project.pb.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import project.pb.R;
import project.pb.study.StudyData;
import project.pb.zoom.MultiTouchListener;

public class GeneralCourseInformation extends Activity {

    private TextView generalInfo;
    private StudyData key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.generalcourseinfo);
        initialise();
    }

    private void initialise(){

        generalInfo = findViewById(R.id.informaticag);
        generalInfo.setScrollbarFadingEnabled(false);
        generalInfo.setMovementMethod(new ScrollingMovementMethod());
        generalInfo.setText(getData());
        generalInfo.setOnTouchListener(new MultiTouchListener());
    }

    private String getData(){
        key = (StudyData) getIntent().getSerializableExtra("opleiding");
        String[] content = key.getGeneralInformation();
        String s = "";
        for(int i = 0; i < content.length; i++) {
            s += content[i] + "\n";
        }
        return s;
    }

}


