package project.pb.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import project.pb.R;

public class OpenDagenInformation extends Activity {

    ListView listView;
    List list = new ArrayList();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opendayinfo);

        listView = (ListView)findViewById(R.id.dates);
        list.add("04/04/2019 | 16:00-18:00");
        list.add("08/04/2019 | 20:00-22:00");
        list.add("20/04/2019 | 18:00-20:00");

        adapter = new ArrayAdapter(OpenDagenInformation.this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);


    }
}
