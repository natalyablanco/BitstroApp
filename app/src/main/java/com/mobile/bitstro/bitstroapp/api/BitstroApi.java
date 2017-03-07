package com.mobile.bitstro.bitstroapp.api;

import com.mobile.bitstro.bitstroapp.models.Recommendation;
import com.mobile.bitstro.bitstroapp.models.User;

import io.reactivex.Single;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by natalyablanco on 27/02/2017.
 */

public interface BitstroApi {

    //TODO: Change endpoints

    @GET("/users/{userId}.json")
    Single<User> getUser(@Path("userId") String userId, @Query("auth") String auth);

    @POST("/dev-tags.json")
    Single<ResponseBody> login(@Query("auth") String auth);

    @GET("/users.json")
    Single<Void> logout(@Query("auth") String auth);

    @PUT("/dev-links/{id}.json")
    Single<User> createUser(@Query("auth") String auth, @Body User user);

    @PUT("/dev-tags/{tag}/links/{id}.json")
    Single<Object> deleteUser(@Path("id") String idUser, @Query("auth") String auth, @Body Boolean placeholder);

    @GET("/dev-tags/{id}.json")
    Single<Recommendation> getRecomendation(@Query("auth")String token);


}