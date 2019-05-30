package project.pb.fragments;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;

import project.pb.MainActivity;
import project.pb.R;
import project.pb.maps.CustomMapAdapter;
import project.pb.maps.ImageExpandation;
import project.pb.maps.MapsData;
import project.pb.zoom.MultiTouchListener;

public class MapWijnhaven_99 extends FragmentActivity {

    private int shortAnimationDuration;
    private ListView androidListView;
    private MapsData mapsData = MapsData.WIJNHAVEN_99;
    private ProgressDialog progressDialog;
    private TextView clickAnywhere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.floor_plan_99);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading maps...");
        progressDialog.show();

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

        progressDialog.dismiss();
    }
}

