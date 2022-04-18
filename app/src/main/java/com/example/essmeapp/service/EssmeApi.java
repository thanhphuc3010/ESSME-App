package com.example.essmeapp.service;

import com.example.essmeapp.model.HomePage;
import com.example.essmeapp.model.Question;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by: phucpt
 * Date: 4/11/2022
 * Time: 12:08 AM
 */

public interface EssmeApi {

    @GET("homepage")
    Call<HomePage> getHomePage();

    @GET("questions?limit=1000&sort=createdAt&desc=false")
    Call<List<Question>> getQuestions();
}
