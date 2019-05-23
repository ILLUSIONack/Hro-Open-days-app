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
import project.pb.R;
import project.pb.opendag.OpenDagData;

public class HomeScreenFragment extends Fragment implements View.OnClickListener {

    private ImageButton inf1Button, tinf1Button, cmdButton, com1Button, inf2Button, com2Button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_layout, container, false);
        initialize(view);
        return view;
    }

    public void initialize(View view){
        getActivity().setTitle("Home");
        inf1Button = view.findViewById(R.id.inf1Button);
        tinf1Button = view.findViewById(R.id.tinf1Button);
        cmdButton = view.findViewById(R.id.cmdButton);
        com1Button = view.findViewById(R.id.com1Button);
        inf2Button = view.findViewById(R.id.inf2Button);
        com2Button = view.findViewById(R.id.com2Button);
        inf1Button.setOnClickListener(this);
        tinf1Button.setOnClickListener(this);
        cmdButton.setOnClickListener(this);
        com1Button.setOnClickListener(this);
        inf2Button.setOnClickListener(this);
        com2Button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(v.getContext(), OpenDayInformation.class);
        switch(v.getId()){
            case R.id.inf1Button:
                i.putExtra("open_dag_informatie", OpenDagData.INFORMATICA_VT);
                v.getContext().startActivity(i);
                break;
            case R.id.tinf1Button:
                i.putExtra("open_dag_informatie", OpenDagData.TECHNISCHE_INFORMATICA_VT);
                v.getContext().startActivity(i);
                break;
            case R.id.cmdButton:
                i.putExtra("open_dag_informatie", OpenDagData.COMMUNICATIE_EN_MEDIA_VT);
                v.getContext().startActivity(i);
                break;
            case R.id.com1Button:
                i.putExtra("open_dag_informatie", OpenDagData.COMMUNICATIE_VT);
                v.getContext().startActivity(i);
                break;
            case R.id.inf2Button:
                i.putExtra("open_dag_informatie", OpenDagData.INFORMATICA_DT);
                v.getContext().startActivity(i);
                break;
            case R.id.com2Button:
                i.putExtra("open_dag_informatie", OpenDagData.COMMUNICATIE_DT);
                v.getContext().startActivity(i);
                break;
        }
    }
}
