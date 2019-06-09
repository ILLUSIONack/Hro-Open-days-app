package project.pb.maps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import project.pb.R;

public class CustomMapAdapter extends BaseAdapter {

    private Context context;
    private Floor[] floors;

    public CustomMapAdapter(Context context, Floor[] floors) {
        this.context = context;
        this.floors = floors;
    }

    @Override
    public int getCount() {
        return floors.length;
    }

    @Override
    public Object getItem(int position) {
        return floors[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.mappedlist, null);
        TextView textView = (TextView) convertView.findViewById(R.id.theimagetitle);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.theimage);
        textView.setText(floors[position].getTitle());
        imageView.setImageResource(floors[position].getImage());
        return convertView;
    }
}
