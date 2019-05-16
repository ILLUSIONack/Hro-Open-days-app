package project.pb.fragments;

import android.content.Context;
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
        getActivity().setTitle("FAQ");

        expandableListView = view.findViewById(R.id.eListView);
        fillData();

        listAdapter = new MyExListAdaptor(getContext(),Questions,answers);
        expandableListView.setAdapter(listAdapter);
        return view;

    }

    public void fillData(){
        Questions = new ArrayList<>();
        answers = new HashMap<>();

        Questions.add("What is the school called?");
        Questions.add("Where is the school located?");

        List<String> answer1 = new ArrayList<>();
        List<String> answer2 = new ArrayList<>();

        answer1.add("The school is called HRO");
        answer2.add("The school is located near the central station");

        answers.put(Questions.get(0),answer1);
        answers.put(Questions.get(1),answer2);
    }
}
