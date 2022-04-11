package com.example.essmeapp.ui.homepage;

import com.example.essmeapp.codebase.BaseViewModel;
import com.example.essmeapp.model.HomePage;
import com.example.essmeapp.service.EssmeApi;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by: phucpt
 * Date: 4/10/2022
 * Time: 8:42 PM
 */

public class HomePageViewModel extends BaseViewModel {
    String mName = "Phucpt";
    Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://essme.luanbt.live/api/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build();

    EssmeApi essmeApi = retrofit.create(EssmeApi.class);

    Call<HomePage> getHomePage = essmeApi.getHomePage();
}
