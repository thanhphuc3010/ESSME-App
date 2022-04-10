package com.example.essmeapp.service;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.essmeapp.databinding.FragmentExpertBinding;
import com.example.essmeapp.model.Expert;

/**
 * Created by: phucpt
 * Date: 4/11/2022
 * Time: 12:39 AM
 */

public class ExpertFragment extends Fragment {

    private FragmentExpertBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentExpertBinding.inflate(inflater, container, false);

        Bundle bundle = getArguments();
        Expert expert =  (Expert)bundle.get("expert");

        binding.txtName.setText(expert.getName());
        binding.txtDegree.setText(expert.getDegree());
        binding.txtCompany.setText(expert.getCompany());

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
