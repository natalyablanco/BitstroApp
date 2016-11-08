package com.mobile.bitstro.bitstroapp.rest;


import com.mobile.bitstro.bitstroapp.model.Restaurant;
import com.mobile.bitstro.bitstroapp.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by natal on 06/11/2016.
 */

public interface  BitstroClient {

    @GET("/restaurants/")
    Call<List<Restaurant>> restaurants();

    @GET("/users/")
    Call<List<User>> users();
}