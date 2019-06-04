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
import project.pb.hints.HintExecutor;

public class SettingsFragment extends Fragment {

    private Switch myswitch, notificationSwitch;
    private SharedPref sharedPref;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        sharedPref = new SharedPref(getContext().getApplicationContext());

        if(sharedPref.loadNightModeState() == true) {
            getActivity().setTheme(R.style.DarkTheme);
        } else {
            getActivity().setTheme(R.style.AppTheme);
        }
        View view = inflater.inflate(R.layout.settings_page, container, false);
        getActivity().setTitle("Settings");

        myswitch = (Switch) view.findViewById(R.id.switch3);
        notificationSwitch = (Switch) view.findViewById(R.id.switch1);

        CharSequence toast_text_theme_on = "Dark theme turned on";
        Context context = getContext();
        int duration_toast_theme = Toast.LENGTH_SHORT;
        final Toast toast_theme_on = Toast.makeText(context, toast_text_theme_on, duration_toast_theme);

        final CharSequence toast_text_theme_off = "Dark theme turned off";
        final Toast toast_theme_off = Toast.makeText(context,toast_text_theme_off, duration_toast_theme);

        final CharSequence toast_text_notification_on = "Notifications turned on";
        final Toast toast_notification_on = Toast.makeText(context,toast_text_notification_on, duration_toast_theme);

        final CharSequence toast_text_notification_off = "Notifications turned off";
        final Toast toast_notification_off = Toast.makeText(context, toast_text_notification_off, duration_toast_theme);

        if (sharedPref.getNotificationState() == true) {
            notificationSwitch.setChecked(true);
        }
        if (sharedPref.loadNightModeState() == true) {
            myswitch.setChecked(true);
        }

        notificationSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    toast_notification_on.show();
                    sharedPref.setNotification(true);
                    HintExecutor.setRunning(true);
                    HintExecutor.start(getContext());
                } else {
                    toast_notification_off.show();
                    sharedPref.setNotification(false);
                    HintExecutor.setRunning(false);
                }
            }
        });
        myswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    toast_theme_on.show();
                    sharedPref.setNightModeState(true);
                    restart();
                } else {
                    toast_theme_off.show();
                    sharedPref.setNightModeState(false);
                    restart();
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