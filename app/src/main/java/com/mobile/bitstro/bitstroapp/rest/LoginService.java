package com.mobile.bitstro.bitstroapp.rest;

import com.mobile.bitstro.bitstroapp.model.AccessToken;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by natal on 07/11/2016.
 */

public interface LoginService {

    @FormUrlEncoded
    @POST("/users/auth_login/")
    Call<AccessToken> getAccessToken(
            @Field("code") String code,
            @Field("grant_type") String grantType);
}