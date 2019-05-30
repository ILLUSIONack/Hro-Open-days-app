package project.pb.fragments;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ScrollView;

import project.pb.R;

public class MapWijnhaven_103 extends Activity implements View.OnClickListener {

    private Animator currentAnimator;

    private int shortAnimationDuration;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.floor_plan_103);

        final View thumb21View = findViewById(R.id.thumb_button_21);
        final View thumb22View = findViewById(R.id.thumb_button_22);
        final View thumb23View = findViewById(R.id.thumb_button_23);
        final View thumb24View = findViewById(R.id.thumb_button_24);
        final View thumb25View = findViewById(R.id.thumb_button_25);
        final View thumb26View = findViewById(R.id.thumb_button_26);
        final View thumb27View = findViewById(R.id.thumb_button_27);
        final View thumb28View = findViewById(R.id.thumb_button_28);
        final View thumb29View = findViewById(R.id.thumb_button_29);

        thumb21View.setOnClickListener(this);
        thumb22View.setOnClickListener(this);
        thumb23View.setOnClickListener(this);
        thumb24View.setOnClickListener(this);
        thumb25View.setOnClickListener(this);
        thumb26View.setOnClickListener(this);
        thumb27View.setOnClickListener(this);
        thumb28View.setOnClickListener(this);
        thumb29View.setOnClickListener(this);
        
        shortAnimationDuration = getResources().getInteger(
                android.R.integer.config_shortAnimTime);
    }

    private void zoomImageFromThumb(final View thumbView, int imageResId) {
        if (currentAnimator != null) {
            currentAnimator.cancel();
        }

        final ImageView expandedImageView2 = (ImageView) findViewById(R.id.expanded_image2);
        expandedImageView2.setImageResource(imageResId);

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
        expandedImageView2.setVisibility(View.VISIBLE);

        expandedImageView2.setPivotX(1f);
        expandedImageView2.setPivotY(1f);

        AnimatorSet set = new AnimatorSet();
        set
                .play(ObjectAnimator.ofFloat(expandedImageView2, View.X,
                        startBounds.left, finalBounds.left))
                .with(ObjectAnimator.ofFloat(expandedImageView2, View.Y,
                        startBounds.top, finalBounds.top))
                .with(ObjectAnimator.ofFloat(expandedImageView2, View.SCALE_X,
                        startScale, 1f))
                .with(ObjectAnimator.ofFloat(expandedImageView2,
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
        expandedImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentAnimator != null) {
                    currentAnimator.cancel();
                }

                // Animate the four positioning/sizing properties in parallel,
                // back to their original values.
                AnimatorSet set = new AnimatorSet();
                set.play(ObjectAnimator
                        .ofFloat(expandedImageView2, View.X, startBounds.left))
                        .with(ObjectAnimator
                                .ofFloat(expandedImageView2,
                                        View.Y, startBounds.top))
                        .with(ObjectAnimator
                                .ofFloat(expandedImageView2,
                                        View.SCALE_X, startScaleFinal))
                        .with(ObjectAnimator
                                .ofFloat(expandedImageView2,
                                        View.SCALE_Y, startScaleFinal));
                set.setDuration(shortAnimationDuration);
                set.setInterpolator(new DecelerateInterpolator());
                set.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        thumbView.setAlpha(1f);
                        expandedImageView2.setVisibility(View.GONE);
                        currentAnimator = null;
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {
                        thumbView.setAlpha(1f);
                        expandedImageView2.setVisibility(View.GONE);
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
            case R.id.thumb_button_21:
                zoomImageFromThumb(v, R.drawable.wijnhaven_103_min1);
                break;
            case R.id.thumb_button_22:
                zoomImageFromThumb(v, R.drawable.wijnhaven_103_bg);
                break;
            case R.id.thumb_button_23:
                zoomImageFromThumb(v, R.drawable.wijnhaven_103_1);
                break;
            case R.id.thumb_button_24:
                zoomImageFromThumb(v, R.drawable.wijnhaven_103_2);
                break;
            case R.id.thumb_button_25:
                zoomImageFromThumb(v, R.drawable.wijnhaven_103_3);
                break;
            case R.id.thumb_button_26:
                zoomImageFromThumb(v, R.drawable.wijnhaven_103_4);
                break;
            case R.id.thumb_button_27:
                zoomImageFromThumb(v, R.drawable.wijnhaven_103_5);
                break;
            case R.id.thumb_button_28:
                zoomImageFromThumb(v, R.drawable.wijnhaven_103_6);
                break;
            case R.id.thumb_button_29:
                zoomImageFromThumb(v, R.drawable.wijnhaven_103_dak);
                break;
        }
    }
}