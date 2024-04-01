package com.example.assignment_and103.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.assignment_and103.Fragment.HomeFragment;
import com.example.assignment_and103.Fragment.OtherFragment;
import com.example.assignment_and103.Fragment.ProfileFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new HomeFragment();
            case 1: return new OtherFragment();
            case 2: return new ProfileFragment();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
