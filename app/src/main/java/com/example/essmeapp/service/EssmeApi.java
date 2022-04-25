package com.example.essmeapp.service;

import com.example.essmeapp.model.DirectRequest;
import com.example.essmeapp.model.ExpertResponse;
import com.example.essmeapp.model.HomePage;
import com.example.essmeapp.model.Question;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

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

    @GET("experts/search?what=khoa&radius=5&page=0&size=100&asc=true")
    Call<ExpertResponse> getExperts();

    @POST("requests/direct")
    @Headers({"Content-Type: application/json;charset=UTF-8"})
    Call<DirectRequest> orderExpert(@Body String directRequest,
                               @Header("Authorization") String auth);
}
