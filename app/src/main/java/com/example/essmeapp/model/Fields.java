package com.example.essmeapp.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by: phucpt
 * Date: 4/11/2022
 * Time: 12:03 AM
 */

public class Fields {
    private String name;

    @SerializedName("name_vn")
    private String nameVN;

    @SerializedName("image")
    private String imageUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameVN() {
        return nameVN;
    }

    public void setNameVN(String nameVN) {
        this.nameVN = nameVN;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
