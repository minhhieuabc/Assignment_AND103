package com.example.assignment_and103.Activitys;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;


import android.os.Bundle;
import android.view.MenuItem;

import com.example.assignment_and103.Adapter.ViewPagerAdapter;
import com.example.assignment_and103.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private ViewPager2 viewPager;
    private ViewPagerAdapter viewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setUpViewPager();
        setUpBottomNav();
    }

    private void initView(){
        bottomNavigationView = findViewById(R.id.bottom_nav);
        viewPager = findViewById(R.id.viewPager);
    }

    private void setUpBottomNav(){
        bottomNavigationView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.item_home) {
                viewPager.setCurrentItem(0, true);
                return true;
            } else if(item.getItemId() == R.id.item_category){
                viewPager.setCurrentItem(1, true);
                return true;
            } else if(item.getItemId() == R.id.item_personal){
                viewPager.setCurrentItem(2, true);
                return true;
            }
            return false;
        });
    }
    private void setUpViewPager(){
        viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                switch (position){
                    case 0: bottomNavigationView.getMenu().findItem(R.id.item_home).setChecked(true);
                    break;
                    case 1: bottomNavigationView.getMenu().findItem(R.id.item_category).setChecked(true);
                    break;
                    case 2: bottomNavigationView.getMenu().findItem(R.id.item_personal).setChecked(true);
                    break;
                }
            }
        });
    }
}