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
    private String[] titles;
    private int[] drawables;

    public CustomMapAdapter(Context context, String[] titles, int[] drawables) {
        this.context = context;
        this.titles = titles;
        this.drawables = drawables;
    }

    @Override
    public int getCount() {
        return drawables.length;
    }

    @Override
    public Object getItem(int position) {
        return drawables[position];
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
        textView.setText("Floor: " + titles[position]);
        imageView.setImageResource(drawables[position]);
        return convertView;
    }
}
