package project.pb.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Calendar;

import project.pb.R;
import project.pb.opendag.OpenDagData;

public class OpenDayInformation extends AppCompatActivity {

    private Button addcalender;
    private TextView generalInfo;
    private ImageButton shareButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inf1);
        generalInfo = findViewById(R.id.textView3);
        addcalender = findViewById(R.id.addcalender);

        final OpenDagData key = (OpenDagData) getIntent().getSerializableExtra("open_dag_informatie");
        String[] content = key.getInformation();
        String s = "";
        for(int i = 0; i < content.length; i++) {
            s += content[i] + "\n";
        }
        generalInfo.setMovementMethod(new ScrollingMovementMethod());
        generalInfo.setText(s);


        shareButton = findViewById(R.id.shareButton);
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Your friend has invited you to join this open day: " + key.getName() +" Visit: "+ key.getLink();
                String shareSub = key.getName()+" Invitation";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(myIntent,"Share using"));

            }
        });

        addcalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendarEvent = Calendar.getInstance();
                calendarEvent.set(key.getDate()[0], key.getDate()[1], key.getDate()[2]);
                Intent intent = new Intent(Intent.ACTION_EDIT);
                intent.setType("vnd.android.cursor.item/event");
                intent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        calendarEvent.getTimeInMillis());
                intent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        calendarEvent.getTimeInMillis() + 60 * 60 * 1000);
                intent.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
                intent.putExtra(CalendarContract.Events.TITLE, key.getName());
                intent.putExtra(CalendarContract.Events.DESCRIPTION, key.getDescription());
                intent.putExtra(CalendarContract.Events.EVENT_LOCATION, key.getLocation());
                intent.putExtra(CalendarContract.Events.RRULE, "FREQ=YEARLY");
                startActivity(intent);
            }
        });
    }
}
