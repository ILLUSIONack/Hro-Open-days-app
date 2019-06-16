package project.pb.fragments;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import project.pb.R;
import project.pb.maps.CustomMapAdapter;
import project.pb.maps.FloorsData;
import project.pb.maps.ImageExpandation;

public class MapWijnhaven99 extends Activity {

    private SharedPref sharedPref;
    private ListView androidListView;
    private FloorsData mapsData = FloorsData.WIJNHAVEN_99;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPref = new SharedPref(getApplicationContext());
        if(sharedPref.loadNightModeState() == true) {
            setTheme(R.style.DarkTheme);
        } else {
            setTheme(R.style.AppTheme);
        }

        setContentView(R.layout.floor_plan_99);

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

