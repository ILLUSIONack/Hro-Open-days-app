package project.pb.fragments;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

import project.pb.R;
import project.pb.fragments.opendays.inf1Activity;
import project.pb.notifications.NotificationCreation;

public class HomeScreenFragment extends Fragment {

    private View view;
    private ImageButton inf1Button;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_layout, container, false);

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());

        TextView textViewDate = view.findViewById(R.id.text_view_date);
        textViewDate.setText(currentDate);

        inf1Button = view.findViewById(R.id.inf1Button);
        inf1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationCreation notificationCreation =
                        new NotificationCreation(getContext(), "Study", "You have clicked on a study!");
                notificationCreation.display();
                Intent i = new Intent(v.getContext(), inf1Activity.class);
                 v.getContext().startActivity(i);
            }
        });
        return view;
    }

}
