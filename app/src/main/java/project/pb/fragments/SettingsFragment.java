package project.pb.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatDelegate;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;

import project.pb.R;

public class SettingsFragment extends Fragment {

    private Switch myswitch;
    SharedPref sharedPref;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        sharedPref = new SharedPref(getContext().getApplicationContext());
        if(sharedPref.loadNightModeState() == true) {
            getActivity().setTheme(R.style.DarkTheme);
        } else {
            getActivity().setTheme(R.style.AppTheme);
        }
        View view = inflater.inflate(R.layout.settings_page, container, false);
        getActivity().setTitle("Settings");

        //sharedPref = new SharedPref(getContext().getApplicationContext());
        myswitch = (Switch) view.findViewById(R.id.switch3);

        if (sharedPref.loadNightModeState() == true) {
            myswitch.setChecked(true);
        }
        myswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    sharedPref.setNightModeState(true);
                    restart();
                    //getActivity().recreate();
                } else {
                    sharedPref.setNightModeState(false);
                    restart();
                    //getActivity().recreate();
                }
            }
        });
        return view;
    }

    private void restart() {
        getFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new SettingsFragment()).commit();
    }
}
