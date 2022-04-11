package com.example.essmeapp.ui.homepage;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.essmeapp.codebase.BaseViewModel;
import com.example.essmeapp.model.FieldListItem;
import com.example.essmeapp.model.Fields;
import com.example.essmeapp.model.HomePage;
import com.example.essmeapp.service.EssmeApi;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by: phucpt
 * Date: 4/10/2022
 * Time: 8:42 PM
 */

public class HomePageViewModel extends BaseViewModel {
    int key = -1;
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

    @RequiresApi(api = Build.VERSION_CODES.N)
    List<FieldListItem> adjustField4View(List<Fields> fields) {
        ArrayList<FieldListItem> result = new ArrayList<>();

        TreeMap<Integer, ArrayList<Fields>> map = new TreeMap<>();

        fields.forEach(field -> {
            key = key == -1 ? 0 : key;
            if (map.containsKey(key)) {
                map.get(key).add(field);
            } else {
                ArrayList<Fields> list = new ArrayList<>();
                map.put(key, list);
            }
            if (map.get(key).size() == 4) {
                key++;
            }
        });

        map.forEach((integer, field) -> {
            FieldListItem item = new FieldListItem();
            item.setFields(field);
            result.add(item);
        });

        return result;
    }
}
