package com.example.essmeapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.essmeapp.codebase.BaseFragment;
import com.example.essmeapp.databinding.FragmentHomePageBinding;
import com.example.essmeapp.model.Expert;
import com.example.essmeapp.model.HomePage;

import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by: phucpt
 * Date: 4/10/2022
 * Time: 8:41 PM
 */

public class HomePageFragment extends BaseFragment<FragmentHomePageBinding, HomePageViewModel> {

    public final String Tag = this.getClass().getSimpleName();

    private TopExpertAdapter adapter;

    public HomePageFragment() {
        super(FragmentHomePageBinding::inflate);
    }

    @Override
    protected Class<HomePageViewModel> getViewModel() {
        return HomePageViewModel.class;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // binding.txtTitle.setText(viewModel.mName);
    }

    @Override
    public void onClick(View view) {
    }

    @Override
    public void initializeViews() {

    }

    @Override
    public void initializeComponents() {
        adapter = new TopExpertAdapter(requireActivity());
        binding.lstExpert.setAdapter(adapter);
    }

    @Override
    public void initializeEvents() {

    }

    @Override
    public void initializeData() {
        viewModel.getHomePage.enqueue(new Callback<HomePage>() {
            @Override
            public void onResponse(Call<HomePage> call, Response<HomePage> response) {
                HomePage homePage = response.body();
                List<Expert> experts = homePage.getTopExperts();
                adapter.submitData(experts);
                Log.d(Tag, "" + experts.size());
            }

            @Override
            public void onFailure(Call<HomePage> call, Throwable t) {
                Log.d(Tag, Tag);
            }
        });
    }
}
