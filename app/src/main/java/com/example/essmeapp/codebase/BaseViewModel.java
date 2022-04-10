package com.example.essmeapp.codebase;

import android.util.Log;

import androidx.lifecycle.ViewModel;

/**
 * Created by: phucpt
 * Date: 4/10/2022
 * Time: 9:29 PM
 */

public class BaseViewModel extends ViewModel {
    @Override
    protected void onCleared() {
        Log.d(this.getClass().getSimpleName(), "onCleared()...");
        super.onCleared();
    }
}
