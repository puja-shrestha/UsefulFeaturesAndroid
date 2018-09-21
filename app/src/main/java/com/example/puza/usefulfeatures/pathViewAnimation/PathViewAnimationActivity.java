package com.example.puza.usefulfeatures.pathViewAnimation;

import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.DecelerateInterpolator;

import com.example.puza.usefulfeatures.R;
import com.richpath.RichPath;
import com.richpath.RichPathView;
import com.richpathanimator.RichPathAnimator;

public class PathViewAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_path_view_animation);

        RichPathView notificationsRichPathView = findViewById(R.id.ic_notifications);

        RichPath top = notificationsRichPathView.findRichPathByName("top");
        RichPath bottom = notificationsRichPathView.findRichPathByName("bottom");

        RichPathAnimator.animate(top)
                .interpolator(new DecelerateInterpolator())
                .rotation(0, 20, -20, 10, -10, 5, -5, 2, -2, 0)
                .duration(4000)
                .andAnimate(bottom)
                .interpolator(new DecelerateInterpolator())
                .rotation(0, 10, -10, 5, -5, 2, -2, 0)
                .startDelay(50)
                .duration(4000)
                .start();
    }
}
