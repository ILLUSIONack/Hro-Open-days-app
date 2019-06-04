package project.pb.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;

import project.pb.R;
import project.pb.study.StudyData;
import project.pb.zoom.MultiTouchListener;

public class GeneralCourseInformation extends Activity {

    private TextView generalInfo,nameTitle;
    private StudyData key;
    private LinearLayout generalCoursePage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.generalcourseinfo);
        nameTitle = findViewById(R.id.nameTitleStudy);
        generalCoursePage = findViewById(R.id.generalCoursePage);
        generalInfo = findViewById(R.id.informaticag);
        generalInfo.setScrollbarFadingEnabled(false);
        generalInfo.setMovementMethod(new ScrollingMovementMethod());
        generalInfo.setText(getData());
        generalInfo.setScrollbarFadingEnabled(false);
        generalInfo.setMovementMethod(new ScrollingMovementMethod());
        generalInfo.setOnTouchListener(new MultiTouchListener(generalCoursePage));
        nameTitle.setText(key.getName());
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


