package project.pb.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import project.pb.R;
import project.pb.maps.CustomMapAdapter;
import project.pb.maps.ImageExpandation;
import project.pb.maps.MapsData;

public class MapWijnhaven107 extends FragmentActivity {

    private int shortAnimationDuration;
    private ListView androidListView;
    private MapsData mapsData = MapsData.WIJNHAVEN_107;

    private TextView clickAnywhere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.floor_plan_107);

        clickAnywhere = findViewById(R.id.clickAnywhere);

        final RelativeLayout layout = findViewById(R.id.container);
        final ImageView imageView = findViewById(R.id.expanded_image);

        shortAnimationDuration = getResources().getInteger(
                android.R.integer.config_shortAnimTime);

        androidListView = (ListView) findViewById(R.id.mapslisted);

        CustomMapAdapter customAdapter = new CustomMapAdapter(this,
                mapsData.getTitles(), mapsData.getDrawables());

        androidListView.setAdapter(customAdapter);

        androidListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                display(mapsData.getDrawables()[position]);
            }
        });

    }

    private void display(int drawable) {
        Intent intent = new Intent(this, MapImageDisplay.class);
        intent.putExtra("drawable", drawable);
        startActivity(intent);

    }
}