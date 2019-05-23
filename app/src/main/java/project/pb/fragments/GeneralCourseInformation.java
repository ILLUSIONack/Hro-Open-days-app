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

        generalInfo.setOnTouchListener(new MultiTouchListener());
    }
}


