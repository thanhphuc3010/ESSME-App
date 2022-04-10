package com.example.essmeapp;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.essmeapp.codebase.BaseFragment;
import com.example.essmeapp.databinding.FragmentHomePageBinding;

/**
 * Created by: phucpt
 * Date: 4/10/2022
 * Time: 8:41 PM
 */

public class HomePageFragment extends BaseFragment<FragmentHomePageBinding, HomePageViewModel> {

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
    public void onClick(View view) { }

    @Override
    public void initializeViews() {

    }

    @Override
    public void initializeComponents() {

    }

    @Override
    public void initializeEvents() {

    }

    @Override
    public void initializeData() {

    }
}
