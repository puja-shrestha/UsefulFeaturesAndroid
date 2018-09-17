package com.example.puza.usefulfeatures;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.sackcentury.shinebuttonlib.ShineButton;


public class DrawableViewActivity extends AppCompatActivity {

    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_view);

//
//        ShineButton shineButton = (ShineButton) findViewById(R.id.po_image2);
//        shineButton.init(activity);

        ShineButton shineButtonJava = new ShineButton(this);
        shineButtonJava.setBtnColor(Color.GRAY);
        shineButtonJava.setBtnFillColor(Color.RED);
        shineButtonJava.setShapeResource(R.raw.heart);
        shineButtonJava.setAllowRandomColor(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
        shineButtonJava.setLayoutParams(layoutParams);
//        if (linearLayout != null) {
//            linearLayout.addView(shineButtonJava);
//        }
    }
}
