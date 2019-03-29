package project.pb.fragments;

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

public class StudyPageFragment extends Fragment {

    private ImageButton VoltijdInfButton;
    private ImageButton VoltijdTechInfButton;
    private ImageButton VoltijdCommButton;
    private ImageButton VoltijdCmdButton;
    private ImageButton DeeltijdInfButton;
    private ImageButton DeeltijdCommButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_courseselection, container, false);
        VoltijdInfButton = view.findViewById(R.id.InfKeuzeImageButton);
        VoltijdInfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        VoltijdTechInfButton = view.findViewById(R.id.TechInformKeuzeImageButton);
        VoltijdTechInfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        VoltijdCommButton = view.findViewById(R.id.CommunicatieKeuzeImageButton);
        VoltijdCommButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        VoltijdCmdButton = view.findViewById(R.id.CmdKeuzeImageButton);
        VoltijdCmdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        DeeltijdInfButton = view.findViewById(R.id.DeeltijdInfKeuzeButton);
        DeeltijdInfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        DeeltijdCommButton = view.findViewById(R.id.DeeltijdCommKeuzeButton);
        DeeltijdCommButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return view;

    }
}
