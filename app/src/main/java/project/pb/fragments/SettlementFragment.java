package project.pb.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;

import project.pb.R;

public class SettlementFragment extends Fragment implements View.OnClickListener {

    private ScrollView scrollSettlement;
    private Button mapButton_99;
    private Button mapButton_103;
    private Button mapButton_107;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.settlement_fragment, container, false);
        initialise(view);
        return view;

    }

    public void initialise(View view){
        getActivity().setTitle("About HR");
        scrollSettlement = view.findViewById(R.id.scrollSettlement);
        scrollSettlement.setScrollbarFadingEnabled(false);
        mapButton_99 = view.findViewById(R.id.mapButton99);
        mapButton_103 = view.findViewById(R.id.mapButton103);
        mapButton_107 = view.findViewById(R.id.mapButton107);
        mapButton_99.setOnClickListener(this);
        mapButton_103.setOnClickListener(this);
        mapButton_107.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.mapButton99:
                startActivity(new Intent(v.getContext(), MapWijnhaven99.class));
                break;
            case R.id.mapButton103:
                startActivity(new Intent(v.getContext(), MapWijnhaven103.class));
                break;
            case R.id.mapButton107:
                startActivity(new Intent(v.getContext(), MapWijnhaven107.class));
                break;
        }
    }
}
