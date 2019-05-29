package project.pb.fragments;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ScrollView;

import project.pb.R;
import project.pb.zoom.MultiTouchListener;

public class MapWijnhaven_99 extends FragmentActivity implements View.OnClickListener {

    private Animator currentAnimator;

    private int shortAnimationDuration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.floor_plan_99);

        final View thumb1View = findViewById(R.id.thumb_button_1);
        final View thumb2View = findViewById(R.id.thumb_button_2);
        final View thumb3View = findViewById(R.id.thumb_button_3);
        final View thumb4View = findViewById(R.id.thumb_button_4);
        final View thumb5View = findViewById(R.id.thumb_button_5);
        final View thumb6View = findViewById(R.id.thumb_button_6);
        final View thumb7View = findViewById(R.id.thumb_button_7);
        final View thumb8View = findViewById(R.id.thumb_button_8);
        final View thumb9View = findViewById(R.id.thumb_button_9);

        thumb1View.setOnClickListener(this);
        thumb2View.setOnClickListener(this);
        thumb3View.setOnClickListener(this);
        thumb4View.setOnClickListener(this);
        thumb5View.setOnClickListener(this);
        thumb6View.setOnClickListener(this);
        thumb7View.setOnClickListener(this);
        thumb8View.setOnClickListener(this);
        thumb9View.setOnClickListener(this);

        shortAnimationDuration = getResources().getInteger(
                android.R.integer.config_shortAnimTime);

    }

    private void zoomImageFromThumb(final View thumbView, int imageResId) {
        if (currentAnimator != null) {
            currentAnimator.cancel();
        }

        final ImageView expandedImageView = (ImageView) findViewById(R.id.expanded_image);
        expandedImageView.setImageResource(imageResId);

        final Rect startBounds = new Rect();
        final Rect finalBounds = new Rect();
        final Point globalOffset = new Point();


        thumbView.getGlobalVisibleRect(startBounds);
        findViewById(R.id.container)
                .getGlobalVisibleRect(finalBounds, globalOffset);
        startBounds.offset(-globalOffset.x, -globalOffset.y);
        finalBounds.offset(-globalOffset.x, -globalOffset.y);

        float startScale;
        if ((float) finalBounds.width() / finalBounds.height()
                > (float) startBounds.width() / startBounds.height()) {
            startScale = (float) startBounds.height() / finalBounds.height();
            float startWidth = startScale * finalBounds.width();
            float deltaWidth = (startWidth - startBounds.width()) / 2;
            startBounds.left -= deltaWidth;
            startBounds.right += deltaWidth;
        } else {
            startScale = (float) startBounds.width() / finalBounds.width();
            float startHeight = startScale * finalBounds.height();
            float deltaHeight = (startHeight - startBounds.height()) / 2;
            startBounds.top -= deltaHeight;
            startBounds.bottom += deltaHeight;
        }

        thumbView.setAlpha(0f);
        expandedImageView.setVisibility(View.VISIBLE);

        expandedImageView.setPivotX(1f);
        expandedImageView.setPivotY(1f);

        AnimatorSet set = new AnimatorSet();
        set
                .play(ObjectAnimator.ofFloat(expandedImageView, View.X,
                        startBounds.left, finalBounds.left))
                .with(ObjectAnimator.ofFloat(expandedImageView, View.Y,
                        startBounds.top, finalBounds.top))
                .with(ObjectAnimator.ofFloat(expandedImageView, View.SCALE_X,
                        startScale, 1f))
                .with(ObjectAnimator.ofFloat(expandedImageView,
                        View.SCALE_Y, startScale, 1f));
        set.setDuration(shortAnimationDuration);
        set.setInterpolator(new DecelerateInterpolator());
        set.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                currentAnimator = null;
            }

            @Override
            public void onAnimationCancel(Animator animation) {
                currentAnimator = null;
            }
        });
        set.start();
        currentAnimator = set;


        final float startScaleFinal = startScale;
        expandedImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentAnimator != null) {
                    currentAnimator.cancel();
                }

                // Animate the four positioning/sizing properties in parallel,
                // back to their original values.
                AnimatorSet set = new AnimatorSet();
                set.play(ObjectAnimator
                        .ofFloat(expandedImageView, View.X, startBounds.left))
                        .with(ObjectAnimator
                                .ofFloat(expandedImageView,
                                        View.Y, startBounds.top))
                        .with(ObjectAnimator
                                .ofFloat(expandedImageView,
                                        View.SCALE_X, startScaleFinal))
                        .with(ObjectAnimator
                                .ofFloat(expandedImageView,
                                        View.SCALE_Y, startScaleFinal));
                set.setDuration(shortAnimationDuration);
                set.setInterpolator(new DecelerateInterpolator());
                set.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        thumbView.setAlpha(1f);
                        expandedImageView.setVisibility(View.GONE);
                        currentAnimator = null;
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {
                        thumbView.setAlpha(1f);
                        expandedImageView.setVisibility(View.GONE);
                        currentAnimator = null;
                    }
                });
                set.start();
                currentAnimator = set;
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.thumb_button_1:
                zoomImageFromThumb(v, R.drawable.wijnhaven_99_min2);
                break;
            case R.id.thumb_button_2:
                zoomImageFromThumb(v, R.drawable.wijnhaven_99_min1);
                break;
            case R.id.thumb_button_3:
                zoomImageFromThumb(v, R.drawable.wijnhaven_99_1);
                break;
            case R.id.thumb_button_4:
                zoomImageFromThumb(v, R.drawable.wijnhaven_99_2);
                break;
            case R.id.thumb_button_5:
                zoomImageFromThumb(v, R.drawable.wijnhaven_99_3);
                break;
            case R.id.thumb_button_6:
                zoomImageFromThumb(v, R.drawable.wijnhaven_99_4);
                break;
            case R.id.thumb_button_7:
                zoomImageFromThumb(v, R.drawable.wijnhaven_99_5);
                break;
            case R.id.thumb_button_8:
                zoomImageFromThumb(v, R.drawable.wijnhaven_99_bg);
                break;
            case R.id.thumb_button_9:
                zoomImageFromThumb(v, R.drawable.wijnhaven_99_dak);
                break;
        }
    }
}

