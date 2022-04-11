package com.example.essmeapp.codebase;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

/**
 * Created by: phucpt
 * Date: 4/10/2022
 * Time: 8:33 PM
 */

public interface IFragmentInflate<T> {
    T inflate(LayoutInflater inflater, @Nullable ViewGroup container, Boolean attachToParent);
}
