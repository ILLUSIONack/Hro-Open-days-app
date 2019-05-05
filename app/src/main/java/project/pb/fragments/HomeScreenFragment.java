package project.pb.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

import project.pb.R;
import project.pb.opendag.OpenDagData;

public class HomeScreenFragment extends Fragment {

    private ImageButton inf1Button, tinf1Button, cmdButton, com1Button, inf2Button, com2Button;

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
                Intent i = new Intent(v.getContext(), OpenDayInformation.class);
                i.putExtra("open_dag_informatie", OpenDagData.INFORMATICA_VT);
                v.getContext().startActivity(i);
            }
        });
        tinf1Button = view.findViewById(R.id.tinf1Button);
        tinf1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), OpenDayInformation.class);
                i.putExtra("open_dag_informatie", OpenDagData.TECHNISCHE_INFORMATICA_VT);
                v.getContext().startActivity(i);
            }
        });
        cmdButton = view.findViewById(R.id.cmdButton);
        cmdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), OpenDayInformation.class);
                i.putExtra("open_dag_informatie", OpenDagData.COMMUNICATIE_EN_MEDIA_VT);
                v.getContext().startActivity(i);
            }
        });
        com1Button = view.findViewById(R.id.com1Button);
        com1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), OpenDayInformation.class);
                i.putExtra("open_dag_informatie", OpenDagData.COMMUNICATIE_VT);
                v.getContext().startActivity(i);
            }
        });
        inf2Button = view.findViewById(R.id.inf2Button);
        inf2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), OpenDayInformation.class);
                i.putExtra("open_dag_informatie", OpenDagData.INFORMATICA_DT);
                v.getContext().startActivity(i);
            }
        });
        com2Button = view.findViewById(R.id.com2Button);
        com2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), OpenDayInformation.class);
                i.putExtra("open_dag_informatie", OpenDagData.COMMUNICATIE_DT);
                v.getContext().startActivity(i);
            }
        });
        return view;
    }

}
