package com.github.r21nomi.sample.androidrpinterpolator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.github.r21nomi.androidrpinterpolator.RPInterpolator;
import com.github.r21nomi.sample.R;

public class MainActivity extends AppCompatActivity {

    private static final long ANIMATE_DURATION = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInterpolatorName();
        startAnimation();
    }

    private void startAnimation() {
        Display display = getDisplay(getApplication());
        Point size = new Point();
        display.getSize(size);

        float x = size.x - 600;

        ObjectAnimator animator_1 = ObjectAnimator.ofFloat(findViewById(R.id.item1)
                .findViewWithTag("target"), "translationX", 0, x);
        animator_1.setDuration(ANIMATE_DURATION);
        animator_1.setInterpolator(new RPInterpolator(RPInterpolator.Easing.SINE_IN_OUT));
        animator_1.start();

        ObjectAnimator animator_2 = ObjectAnimator.ofFloat(findViewById(R.id.item2)
                .findViewWithTag("target"), "translationX", 0, x);
        animator_2.setDuration(ANIMATE_DURATION);
        animator_2.setInterpolator(new RPInterpolator(RPInterpolator.Easing.QUAD_IN_OUT));
        animator_2.start();

        ObjectAnimator animator_3 = ObjectAnimator.ofFloat(findViewById(R.id.item3)
                .findViewWithTag("target"), "translationX", 0, x);
        animator_3.setDuration(ANIMATE_DURATION);
        animator_3.setInterpolator(new RPInterpolator(RPInterpolator.Easing.CUBIC_IN_OUT));
        animator_3.start();

        ObjectAnimator animator_4 = ObjectAnimator.ofFloat(findViewById(R.id.item4)
                .findViewWithTag("target"), "translationX", 0, x);
        animator_4.setDuration(ANIMATE_DURATION);
        animator_4.setInterpolator(new RPInterpolator(RPInterpolator.Easing.QUART_IN_OUT));
        animator_4.start();

        ObjectAnimator animator_5 = ObjectAnimator.ofFloat(findViewById(R.id.item5)
                .findViewWithTag("target"), "translationX", 0, x);
        animator_5.setDuration(ANIMATE_DURATION);
        animator_5.setInterpolator(new RPInterpolator(RPInterpolator.Easing.QUINT_IN_OUT));
        animator_5.start();

        ObjectAnimator animator_6 = ObjectAnimator.ofFloat(findViewById(R.id.item6)
                .findViewWithTag("target"), "translationX", 0, x);
        animator_6.setDuration(ANIMATE_DURATION);
        animator_6.setInterpolator(new RPInterpolator(RPInterpolator.Easing.EXPO_IN_OUT));
        animator_6.start();

        ObjectAnimator animator_7 = ObjectAnimator.ofFloat(findViewById(R.id.item7)
                .findViewWithTag("target"), "translationX", 0, x);
        animator_7.setDuration(ANIMATE_DURATION);
        animator_7.setInterpolator(new RPInterpolator(RPInterpolator.Easing.CIRC_IN_OUT));
        animator_7.start();

        ObjectAnimator animator_8 = ObjectAnimator.ofFloat(findViewById(R.id.item8)
                .findViewWithTag("target"), "translationX", 0, x);
        animator_8.setDuration(ANIMATE_DURATION);
        animator_8.setInterpolator(new RPInterpolator(RPInterpolator.Easing.BACK_IN_OUT));
        animator_8.start();

        ObjectAnimator animator_9 = ObjectAnimator.ofFloat(findViewById(R.id.item9)
                .findViewWithTag("target"), "translationX", 0, x);
        animator_9.setDuration(ANIMATE_DURATION);
        animator_9.setInterpolator(new RPInterpolator(RPInterpolator.Easing.ELASTIC_IN_OUT));
        animator_9.start();

        ObjectAnimator animator_10 = ObjectAnimator.ofFloat(findViewById(R.id.item10)
                .findViewWithTag("target"), "translationX", 0, x);
        animator_10.setDuration(ANIMATE_DURATION);
        animator_10.setInterpolator(new RPInterpolator(RPInterpolator.Easing.BOUNCE_IN_OUT));
        animator_10.start();
    }

    private void setInterpolatorName() {
        findTextViewWithTag(findViewById(R.id.item1), "name").setText(RPInterpolator.Easing.SINE_IN_OUT.toString());
        findTextViewWithTag(findViewById(R.id.item2), "name").setText(RPInterpolator.Easing.QUAD_IN_OUT.toString());
        findTextViewWithTag(findViewById(R.id.item3), "name").setText(RPInterpolator.Easing.CUBIC_IN_OUT.toString());
        findTextViewWithTag(findViewById(R.id.item4), "name").setText(RPInterpolator.Easing.QUART_IN_OUT.toString());
        findTextViewWithTag(findViewById(R.id.item5), "name").setText(RPInterpolator.Easing.QUINT_IN_OUT.toString());
        findTextViewWithTag(findViewById(R.id.item6), "name").setText(RPInterpolator.Easing.EXPO_IN_OUT.toString());
        findTextViewWithTag(findViewById(R.id.item7), "name").setText(RPInterpolator.Easing.CIRC_IN_OUT.toString());
        findTextViewWithTag(findViewById(R.id.item8), "name").setText(RPInterpolator.Easing.BACK_IN_OUT.toString());
        findTextViewWithTag(findViewById(R.id.item9), "name").setText(RPInterpolator.Easing.ELASTIC_IN_OUT.toString());
        findTextViewWithTag(findViewById(R.id.item10), "name").setText(RPInterpolator.Easing.BOUNCE_IN_OUT.toString());
    }

    private Display getDisplay(final Context context) {
        return ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
    }

    private TextView findTextViewWithTag(View container, String tag) {
        return (TextView)container.findViewWithTag(tag);
    }
}
