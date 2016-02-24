package com.github.r21nomi.sample.androidrpinterpolator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.github.r21nomi.androidrpinterpolator.RPInterpolator;
import com.github.r21nomi.sample.R;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private static final long ANIMATE_DURATION = 1000;
    private Map<RPInterpolator.Easing, View> mAnimateTargetSets = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setAnimateTargetViews();
        startAnimation();
    }

    private void setAnimateTargetViews() {
        for (RPInterpolator.Easing easing : RPInterpolator.Easing.values()) {
            View view = getLayoutInflater().inflate(R.layout.item, null);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startAnimation();
                }
            });
            ((TextView)view.findViewWithTag("name"))
                    .setText(easing.toString());
            ((LinearLayout)findViewById(R.id.root)).addView(view);

            mAnimateTargetSets.put(easing, view);
        }
    }

    private void startAnimation() {
        Display display = getDisplay(getApplication());
        Point size = new Point();
        display.getSize(size);

        float x = size.x - 600;

        for (RPInterpolator.Easing easing : mAnimateTargetSets.keySet()) {
            ObjectAnimator animator = ObjectAnimator.ofFloat(
                    mAnimateTargetSets.get(easing).findViewWithTag("target"), "translationX", 0, x);
            animator.setDuration(ANIMATE_DURATION);
            animator.setInterpolator(new RPInterpolator(easing));
            animator.start();
        }
    }

    private Display getDisplay(final Context context) {
        return ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
    }
}
