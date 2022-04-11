package com.example.essmeapp.ui.hptopexpert;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.essmeapp.codebase.BaseViewBindingFragment;
import com.example.essmeapp.codebase.IFragmentInflate;
import com.example.essmeapp.databinding.FragmentExpertBinding;
import com.example.essmeapp.model.Expert;

/**
 * Created by: phucpt
 * Date: 4/11/2022
 * Time: 12:39 AM
 */

public class ExpertFragment extends BaseViewBindingFragment<FragmentExpertBinding> {

    public ExpertFragment() {
        super(FragmentExpertBinding::inflate);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentExpertBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onClick(View view) {

    }

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
        Bundle bundle = getArguments();
        Expert expert = (Expert) bundle.get("expert");

        binding.txtName.setText(expert.getName());
        binding.txtDegree.setText(expert.getDegree());
        binding.txtCompany.setText(expert.getCompany());
    }
}
