package com.example.essmeapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

/**
 * Created by phucpt on 4/26/2022
 */

public class PersonalInformationAdapter extends FragmentStateAdapter {
    ArrayList<Fragment> fragments = new ArrayList<>();

    public PersonalInformationAdapter(@NonNull Fragment fragment) {
        super(fragment);
        fragments.add(new ExpertInfoFragment());
        fragments.add(new CustomerInfoFragment());
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragments.get(position);
    }

    @Override
    public int getItemCount() {
        return fragments.size();
    }
}
