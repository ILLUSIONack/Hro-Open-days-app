package project.pb.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import project.pb.MyExListAdaptor;
import project.pb.R;

public class FAQFragment extends Fragment {

    private SharedPref sharedPref;
    private ExpandableListView expandableListView;
    private List<String> questions;
    private Map<String, List<String>> answers;
    private ExpandableListAdapter listAdapter;
    private List<String> answers_completed;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        sharedPref = new SharedPref(getContext().getApplicationContext());
        if(sharedPref.loadNightModeState() == true) {
            getActivity().setTheme(R.style.DarkTheme);
        } else {
            getActivity().setTheme(R.style.AppTheme);
        }

        View view = inflater.inflate(R.layout.gestelde_vragen, container, false);
        initialisation(view);
        return view;
    }


    public void fillData() {
        answers = new HashMap<>();

        questions = Arrays.asList(
                "Can i park outside the school?", "Where is the school located?",
                "Is the food available at the Open day?", "What time does the Open day usually end?",
                "Can i park outside the school?", "Where is the school located?",
                "Is the food available at the Open day?", "What time does the Open day usually end?",
                "Can i park outside the school?", "Where is the school located?",
                "Is the food available at the Open day?", "What time does the Open day usually end?"
        );

        answers_completed = Arrays.asList(
                "Yes, you can find paid parking outside.", "The school is located near the station Beurs",
                "Yes, snacks and drinks are provided", "Yes, you can find paid parking outside.",
                "The school is located near the station Beurs",
                "Yes, snacks and drinks are provided", "Depends on the chosen study but usually at 15:00",
                "Depends on the chosen study but usually at 15:00", "Yes, you can find paid parking outside.",
                "The school is located near the station Beurs", "Yes, snacks and drinks are provided",
                "Depends on the chosen study but usually at 15:00"
        );

        for (int i = 0; i < questions.size(); i++) {
            answers.put(questions.get(i), Arrays.asList(answers_completed.get(i)));
        }
    }


    public void initialisation(View view) {
        getActivity().setTitle("FAQ");
        expandableListView = view.findViewById(R.id.eListView);
        fillData();
        listAdapter = new MyExListAdaptor(getContext(), questions, answers);
        expandableListView.setAdapter(listAdapter);
    }
}
