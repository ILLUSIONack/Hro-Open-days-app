package project.pb.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import project.pb.R;
import project.pb.study.StudyData;
import project.pb.zoom.MultiTouchListener;

public class GeneralCourseInformation extends Activity {

    private TextView generalInfo, nameTitle;
    private StudyData key;
    private ImageView studyPicture;
    private SharedPref sharedPref;

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

        nameTitle = findViewById(R.id.nameTitle);
        studyPicture = findViewById(R.id.studyPicture);

        nameTitle.setText(key.getName());
        studyPicture.setImageResource(key.getPic1());
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


