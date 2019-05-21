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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import project.pb.MyExListAdaptor;
import project.pb.R;

public class FAQFragment extends Fragment {

    ExpandableListView expandableListView;
    List<String> Questions;
    Map<String,List<String>> answers;
    ExpandableListAdapter listAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.gestelde_vragen, container, false);
        initialisation(view);
        return view;

    }


    public void fillData(){
        Questions = new ArrayList<>();
        answers = new HashMap<>();

        Questions.add("Can i park outside the school?");
        Questions.add("Where is the school located?");
        Questions.add("Is the food available at the Open day?");
        Questions.add("What time does the Open day usually end?");

        List<String> answer1 = new ArrayList<>();
        List<String> answer2 = new ArrayList<>();
        List<String> answer3 = new ArrayList<>();
        List<String> answer4 = new ArrayList<>();

        answer1.add("Yes, you can find paid parking outside.");
        answer2.add("The school is located near the station Beurs");
        answer3.add("Yes, snacks and drinks are provided");
        answer4.add("Depends on the chosen study but usually at 15:00");

        answers.put(Questions.get(0),answer1);
        answers.put(Questions.get(1),answer2);
        answers.put(Questions.get(2),answer3);
        answers.put(Questions.get(3),answer4);
    }


    public void initialisation(View view){
        getActivity().setTitle("FAQ");

        expandableListView = view.findViewById(R.id.eListView);
        fillData();

        listAdapter = new MyExListAdaptor(getContext(),Questions,answers);
        expandableListView.setAdapter(listAdapter);
    }
}
