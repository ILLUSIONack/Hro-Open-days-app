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
import project.pb.study.StudyData;

public class StudyPageFragment extends Fragment implements View.OnClickListener {

    private ImageButton VoltijdInfButton, VoltijdTechInfButton, VoltijdCommButton,
            VoltijdCmdButton, DeeltijdInfButton, DeeltijdCommButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_courseselection, container, false);
        initialise(view);
        return view;

    }

    public void initialise(View view){
        getActivity().setTitle("Studies");
        VoltijdInfButton = view.findViewById(R.id.InfKeuzeImageButton);
        VoltijdTechInfButton = view.findViewById(R.id.TechInformKeuzeImageButton);
        VoltijdCommButton = view.findViewById(R.id.CommunicatieKeuzeImageButton);
        VoltijdCmdButton = view.findViewById(R.id.CmdKeuzeImageButton);
        DeeltijdInfButton = view.findViewById(R.id.DeeltijdInfKeuzeButton);
        DeeltijdCommButton = view.findViewById(R.id.DeeltijdCommKeuzeButton);
        VoltijdInfButton.setOnClickListener(this);
        VoltijdTechInfButton.setOnClickListener(this);
        VoltijdCommButton.setOnClickListener(this);
        VoltijdCmdButton.setOnClickListener(this);
        DeeltijdInfButton.setOnClickListener(this);
        DeeltijdCommButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(v.getContext(), GeneralCourseInformation.class);
        switch (v.getId()){
            case R.id.InfKeuzeImageButton:
                i.putExtra("opleiding", StudyData.VOLTIJD_INFORMATICA);
                v.getContext().startActivity(i);
                break;
            case R.id.TechInformKeuzeImageButton:
                i.putExtra("opleiding", StudyData.VOLTIJD_TECHNISE);
                v.getContext().startActivity(i);
                break;
            case R.id.CommunicatieKeuzeImageButton:
                i.putExtra("opleiding", StudyData.VOLTIJD_COMMUNICATIE);
                v.getContext().startActivity(i);
                break;
            case R.id.CmdKeuzeImageButton:
                i.putExtra("opleiding", StudyData.VOLTIJD_COMMUNICATIE_MEDIA);
                v.getContext().startActivity(i);
                break;
            case R.id.DeeltijdInfKeuzeButton:
                i.putExtra("opleiding", StudyData.DEELTIJD_INFORMATICA);
                v.getContext().startActivity(i);
                break;
            case R.id.DeeltijdCommKeuzeButton:
                i.putExtra("opleiding", StudyData.DEELTIJD_COMMUNICATIE);
                v.getContext().startActivity(i);
                break;
        }
    }
}
