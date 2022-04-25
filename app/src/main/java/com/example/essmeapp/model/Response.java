package com.example.essmeapp.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by phucpt on 4/26/2022
 */

public class Response {
    private String content;
    @SerializedName("expert_id")
    private String expertId;
    private String uid;

    public Response() {
    }

    public Response(String content, String expertId, String uid) {
        this.content = content;
        this.expertId = expertId;
        this.uid = uid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExpertId() {
        return expertId;
    }

    public void setExpertId(String expertId) {
        this.expertId = expertId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
