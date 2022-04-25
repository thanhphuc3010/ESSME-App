package com.example.essmeapp.model;

import java.util.ArrayList;

/**
 * Created by phucpt on 4/26/2022
 */

public class ResponseRequest {
    private ArrayList<Request> content;

    public ArrayList<Request> getContent() {
        return content;
    }

    public void setContent(ArrayList<Request> content) {
        this.content = content;
    }
}
