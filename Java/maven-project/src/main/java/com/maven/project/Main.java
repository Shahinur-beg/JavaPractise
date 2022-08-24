package com.maven.project;

import com.google.gson.Gson;
public class Main {
    public static void main(String[] args) {
        MyApp app1 = new MyApp("Shahin",23);
        Gson gson = new Gson();
        System.out.println(gson.toJson(app1));
    }
}