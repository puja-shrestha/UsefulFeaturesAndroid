package com.example.puza.usefulfeatures;

import android.app.Activity;
import android.os.Bundle;

import com.flaviofaria.kenburnsview.KenBurnsView;

public class kenburnViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kenburn_view);

        KenBurnsView kbv = (KenBurnsView) findViewById(R.id.image);
    }
}