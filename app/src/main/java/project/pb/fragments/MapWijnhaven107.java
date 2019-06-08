package project.pb.fragments;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import project.pb.R;
import project.pb.maps.CustomMapAdapter;
import project.pb.maps.FloorsData;
import project.pb.maps.ImageExpandation;

public class MapWijnhaven107 extends FragmentActivity {

    private ListView androidListView;
    private FloorsData mapsData = FloorsData.WIJNHAVEN_107;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.floor_plan_107);

        androidListView = (ListView) findViewById(R.id.mapslisted);

        CustomMapAdapter customAdapter = new CustomMapAdapter(this,
                mapsData.getFloors());

        androidListView.setAdapter(customAdapter);

        androidListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                new ImageExpandation(view.getContext(),
                        mapsData.getFloors()[position].getImage()).show();
            }
        });

    }
}