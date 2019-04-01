package project.pb.fragments;

import android.content.Intent;
import android.media.Image;
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

public class StudyPageFragment extends Fragment {

    private ImageButton VoltijdInfButton, VoltijdTechInfButton, VoltijdCommButton,
            VoltijdCmdButton, DeeltijdInfButton, DeeltijdCommButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_courseselection, container, false);
        VoltijdInfButton = view.findViewById(R.id.InfKeuzeImageButton);
        VoltijdInfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), GeneralCourseInformation.class);
                i.putExtra("opleiding", StudyData.VOLTIJD_INFORMATICA);
                v.getContext().startActivity(i);
            }
        });
        VoltijdTechInfButton = view.findViewById(R.id.TechInformKeuzeImageButton);
        VoltijdTechInfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), GeneralCourseInformation.class);
                i.putExtra("opleiding", StudyData.VOLTIJD_TECHNISE);
                v.getContext().startActivity(i);
            }
        });
        VoltijdCommButton = view.findViewById(R.id.CommunicatieKeuzeImageButton);
        VoltijdCommButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), GeneralCourseInformation.class);
                i.putExtra("opleiding", StudyData.VOLTIJD_COMMUNICATIE);
                v.getContext().startActivity(i);
            }
        });
        VoltijdCmdButton = view.findViewById(R.id.CmdKeuzeImageButton);
        VoltijdCmdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), GeneralCourseInformation.class);
                i.putExtra("opleiding", StudyData.VOLTIJD_COMMUNICATIE_MEDIA);
                v.getContext().startActivity(i);
            }
        });
        DeeltijdInfButton = view.findViewById(R.id.DeeltijdInfKeuzeButton);
        DeeltijdInfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), GeneralCourseInformation.class);
                i.putExtra("opleiding", StudyData.DEELTIJD_INFORMATICA);
                v.getContext().startActivity(i);
            }
        });
        DeeltijdCommButton = view.findViewById(R.id.DeeltijdCommKeuzeButton);
        DeeltijdCommButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), GeneralCourseInformation.class);
                i.putExtra("opleiding", StudyData.DEELTIJD_COMMUNICATIE);
                v.getContext().startActivity(i);
            }
        });
        return view;

    }
}
