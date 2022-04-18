package com.example.essmeapp.codebase;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

/**
 * Created by: phucpt
 * Date: 4/10/2022
 * Time: 8:33 PM
 */

// Functional Interface là interface chỉ chứa duy nhất 1 abstract function, có thể chứa các default function

@FunctionalInterface
public interface IFragmentInflate<T> {
    T inflate(LayoutInflater inflater, @Nullable ViewGroup container, Boolean attachToParent);
}
