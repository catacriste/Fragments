package com.example.vigion.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class FragmentsTabSliding extends FragmentActivity {

    ViewPager viewPager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments_tab_sliding);

        viewPager = (ViewPager)findViewById(R.id.fragmenttabslidding);

        FragmentManager fragmentManager = getSupportFragmentManager();
        viewPager.setAdapter(new MeuFragmentAdapter(fragmentManager));
        viewPager.setCurrentItem(1);
    }

}

class MeuFragmentAdapter extends FragmentPagerAdapter {
    MeuFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        if(position == 0)
        {
            fragment = new Fragment_inicio_sbv();
        }
        if(position == 1)
        {
            fragment = new Fragment_Main();
        }
        if(position == 2)
        {
            fragment = new Fragment_Info();
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
