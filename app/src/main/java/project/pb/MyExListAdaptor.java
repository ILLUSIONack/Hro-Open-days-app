package project.pb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

public class MyExListAdaptor extends BaseExpandableListAdapter {

    private Context context;
    private List<String> Questions;
    private Map<String,List<String>> answers;

    public MyExListAdaptor(Context context, List<String> questions, Map<String, List<String>> answers) {
        this.context = context;
        this.Questions = questions;
        this.answers = answers;
    }

    @Override
    public int getGroupCount() {
        return Questions.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return answers.get(Questions.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return Questions.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return answers.get(Questions.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String Question = (String) getGroup(groupPosition);

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_parent,null);
        }

        TextView txtParent = (TextView) convertView.findViewById(R.id.parent);
        txtParent.setText(Question);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String answers = (String) getChild(groupPosition,childPosition);

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_child,null);
        }

        TextView txtChild = (TextView) convertView.findViewById(R.id.child);
        txtChild.setText(answers);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
