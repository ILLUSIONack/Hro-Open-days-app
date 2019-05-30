package project.pb.fragments;

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

public class MapWijnhaven103 extends FragmentActivity {

    private int shortAnimationDuration;
    private ListView androidListView;
    private MapsData mapsData = MapsData.WIJNHAVEN_103;

    private TextView clickAnywhere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.floor_plan_103);

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
                new ImageExpandation(view, mapsData.getDrawables()[position],
                        shortAnimationDuration, imageView, layout, clickAnywhere).show();
            }
        });

    }
}
