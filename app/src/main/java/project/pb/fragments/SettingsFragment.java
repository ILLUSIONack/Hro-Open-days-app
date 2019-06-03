package project.pb.fragments;

import android.content.Context;
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
import android.widget.Toast;

import project.pb.R;

public class SettingsFragment extends Fragment {

    private Switch myswitch;
    private SharedPref sharedPref;

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

        // Dark theme toast off message
        CharSequence toast_text_theme_on = "Dark theme turned on";
        Context context = getContext();
        int duration_toast_theme = Toast.LENGTH_SHORT;
        final Toast toast_theme_on = Toast.makeText(context, toast_text_theme_on, duration_toast_theme);
        
        // Dark theme off message
        final CharSequence toast_text_theme_off = "Dark theme turned off";
        final Toast toast_theme_off = Toast.makeText(context,toast_text_theme_off, duration_toast_theme);

        if (sharedPref.loadNightModeState() == true) {
            myswitch.setChecked(true);
        }
        myswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    sharedPref.setNightModeState(true);
                    restart();
                    toast_theme_on.show();
                    //getActivity().recreate();
                } else {
                    sharedPref.setNightModeState(false);
                    restart();
                    toast_theme_off.show();
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
