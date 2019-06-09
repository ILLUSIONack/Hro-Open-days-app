package project.pb.maps;

import android.content.Context;
import android.content.Intent;

import project.pb.fragments.MapImageDisplay;

public class ImageExpandation {

    private Context context;
    private int image;

    public ImageExpandation(Context context, int image) {
        this.context = context;
        this.image = image;
    }

    public void show() {
        Intent intent = new Intent(context, MapImageDisplay.class);
        intent.putExtra("drawable", image);
        context.startActivity(intent);
    }
}
