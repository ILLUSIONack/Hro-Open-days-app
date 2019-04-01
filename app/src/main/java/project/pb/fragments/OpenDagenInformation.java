package project.pb.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import project.pb.R;
import project.pb.study.StudyData;

public class OpenDagenInformation extends Activity {

    private ListView listView;
    private List list = new ArrayList();
    private ArrayAdapter adapter;
    private TextView information;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opendayinfo);

        information = findViewById(R.id.textView3);

        StudyData key = (StudyData) getIntent().getSerializableExtra("opleiding");
        String[] opendayContent = key.getOpenDayInformation();
        String[] opendayDates = key.getOpenDaysDates();

        String s = "";
        for(int i = 0; i < opendayContent.length; i++) {
            s += opendayContent[i] + "\n";
        }

        information.setMovementMethod(new ScrollingMovementMethod());
        information.setText(s);

        listView = (ListView)findViewById(R.id.dates);
        for(int i = 0; i < opendayDates.length; i++) {
            list.add(opendayDates[i]);
        }

        adapter = new ArrayAdapter(OpenDagenInformation.this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);


    }
}
