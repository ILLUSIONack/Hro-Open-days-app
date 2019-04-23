package project.pb.fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
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
        generalInfo.setMovementMethod(new ScrollingMovementMethod());
        generalInfo.setText(s);
    }
}
