package com.example.puza.usefulfeatures.bannerSlider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.puza.usefulfeatures.R;

import ss.com.bannerslider.Slider;

public class BannerSliderActivity extends AppCompatActivity {

    private Slider slider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner_slider);

        Slider.init(new PicassoImageLoadingService(this));
        slider = findViewById(R.id.banner_slider1);

        slider.setAdapter(new MainSliderAdapter());
    }
}
