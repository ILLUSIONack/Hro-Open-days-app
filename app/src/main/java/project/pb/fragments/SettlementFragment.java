package project.pb.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.ScrollView;

import project.pb.R;

public class SettlementFragment extends Fragment implements View.OnClickListener {

    private ScrollView scrollSettlement;
    private Button routeButtonMap, mapButton, studyButton;
    private SharedPref sharedPref;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        sharedPref = new SharedPref(getContext().getApplicationContext());
        if(sharedPref.loadNightModeState() == true) {
            getActivity().setTheme(R.style.DarkTheme);
        } else {
            getActivity().setTheme(R.style.AppTheme);
        }

        final View view = inflater.inflate(R.layout.settlement_fragment, container, false);
        initialise(view);
        return view;

    }

    public void initialise(View view) {
        getActivity().setTitle("About HR");

        scrollSettlement = view.findViewById(R.id.scrollSettlement);
        scrollSettlement.setScrollbarFadingEnabled(false);
        routeButtonMap = view.findViewById(R.id.routeButtonMap);
        mapButton = view.findViewById(R.id.mapButton);
        studyButton = view.findViewById(R.id.studyButton);
        studyButton.setOnClickListener(this);
        routeButtonMap.setOnClickListener(this);
        mapButton.setOnClickListener(this);

    }


    private void openMaps(String location) {
        Uri gmmIntentUri = Uri.parse(location);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getContext().getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }

    private void popMenuButtonRoute(View v){
        PopupMenu popup = new PopupMenu(getContext(), v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.equalizer, popup.getMenu());
        popup.show();
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.wijnhaven99:
                        openMaps("google.navigation:q=Wijnhaven 99, 3011 WN Rotterdam");
                        break;
                    case R.id.wijnhaven103:
                        openMaps("google.navigation:q=Wijnhaven 103, 3011 WN Rotterdam");
                        break;
                    case R.id.wijnhaven107:
                        openMaps("google.navigation:q=Wijnhaven 107, 3011 WN Rotterdam");
                        break;
                }
                return true;
            }
        });
    }

    private void popMenuButtonFloors(View v){
        PopupMenu popup = new PopupMenu(getContext(), v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.floormaps, popup.getMenu());
        popup.show();
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.wijnhaven99:
                        startActivity(new Intent(getContext(), MapWijnhaven99.class));
                        break;
                    case R.id.wijnhaven103:
                        startActivity(new Intent(getContext(), MapWijnhaven103.class));
                        break;
                    case R.id.wijnhaven107:
                        startActivity(new Intent(getContext(), MapWijnhaven107.class));
                        break;
                }
                System.out.println("Item Id: " + item.getTitle());
                return true;
            }
        });
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.routeButtonMap:
                popMenuButtonRoute(v);
                break;
            case R.id.mapButton:
                popMenuButtonFloors(v);
                break;
            case R.id.studyButton:
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new StudyPageFragment()).commit();
                break;
        }
    }
}
