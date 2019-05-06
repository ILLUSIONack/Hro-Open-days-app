package project.pb.fragments;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

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

    private void insert() {
        Calendar calendarEvent = Calendar.getInstance();
        Intent intent = new Intent(Intent.ACTION_EDIT);
        intent.setType("vnd.android.cursor.item/event");
        intent.putExtra("beginTime", calendarEvent.getTimeInMillis());
        intent.putExtra("endTime", calendarEvent.getTimeInMillis() + 60 * 60 * 1000);
        intent.putExtra("title", "Sample Event");
        intent.putExtra("allDay", true);
        intent.putExtra("rule", "FREQ=YEARLY");
        startActivity(intent);
    }
}
