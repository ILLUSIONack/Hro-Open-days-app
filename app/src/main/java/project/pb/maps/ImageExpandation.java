package project.pb.maps;

import android.widget.ImageView;

public class ImageExpandation {
    private int imageResId;
    private ImageView expandedImageView;

    public ImageExpandation(int imageResId,
                            ImageView expandedImageView) {
        this.imageResId = imageResId;
        this.expandedImageView = expandedImageView;
    }

    public void show() {
        expandedImageView.setImageResource(imageResId);
    }
}
