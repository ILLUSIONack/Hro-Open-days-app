package project.pb.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

import project.pb.R;
import project.pb.opendag.OpenDagData;

public class OpenDayInformation extends AppCompatActivity {

    private TextView generalInfo;
    private Button addcalender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inf1);
        generalInfo = findViewById(R.id.textView3);
        addcalender = findViewById(R.id.addcalender);

        addcalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
        });
        final OpenDagData key = (OpenDagData) getIntent().getSerializableExtra("open_dag_informatie");
        String[] content = key.getInformation();
        String s = "";
        for(int i = 0; i < content.length; i++) {
            s += content[i] + "\n";
        }
        generalInfo.setMovementMethod(new ScrollingMovementMethod());
        generalInfo.setText(s);

    }
}
