package com.example.geek14.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by geek14 on 08-11-2017.
 */

public  interface Api {




    String BASE_URL = "https://simplifiedcoding.net/demos/";

    @GET("marvel")
    Call<List<Qwerty>> getHeroes();








}
