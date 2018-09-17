package com.example.puza.usefulfeatures.parallax_tabLayout;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.puza.usefulfeatures.R;
import com.example.puza.usefulfeatures.parallax_tabLayout.MainPagerAdapter;

public class ParallaxEffectTabLayoutActivity extends AppCompatActivity {

//    @BindView(R.id.toolbar)
//    Toolbar toolbar;
//
//    @BindView(R.id.fab)
//    FloatingActionButton fab;
//
//    @BindView(R.id.tabs)
//    TabLayout tabs;
//
//    @BindView(R.id.viewPager)
//    ViewPager viewPager;

    private Toolbar toolbar;
    private  FloatingActionButton fab;
    private TabLayout  tabs;
    private  ViewPager viewPager;

    MainPagerAdapter adapter;

    CharSequence Titles[]={"TAB 1","TAB 2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parallax_effect_tab_layout);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        tabs = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

//        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        setUpTabs();
        setUpClick();
    }

    void setUpClick(){
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });
    }

    void setUpTabs(){
        adapter = new MainPagerAdapter(this.getSupportFragmentManager(),Titles,Titles.length);
        viewPager.setAdapter(adapter);
        tabs.setupWithViewPager(viewPager);
        setupTabIcons();
    }

    private void setupTabIcons() {
        tabs.getTabAt(0).setIcon(R.mipmap.ic_launcher);
        tabs.getTabAt(1).setIcon(R.mipmap.ic_launcher);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}