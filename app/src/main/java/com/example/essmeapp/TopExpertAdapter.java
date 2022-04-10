package com.example.essmeapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.essmeapp.model.Expert;
import com.example.essmeapp.service.ExpertFragment;

import java.util.List;

/**
 * Created by: phucpt
 * Date: 4/11/2022
 * Time: 12:53 AM
 */
public class TopExpertAdapter extends FragmentStateAdapter {

    private List<Expert> experts;

    public TopExpertAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Expert expert = experts.get(position);
        Bundle bundle = new Bundle();
        bundle.putSerializable("expert", expert);
        ExpertFragment expertFragment = new ExpertFragment();
        expertFragment.setArguments(bundle);
        return expertFragment;
    }

    @Override
    public int getItemCount() {
        if (experts != null) {
            return experts.size();
        }
        return 0;
    }

    public void submitData(List<Expert> experts) {
        this.experts = experts;
        notifyDataSetChanged();
    }
}
