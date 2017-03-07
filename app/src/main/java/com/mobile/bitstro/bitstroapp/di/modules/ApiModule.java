package com.mobile.bitstro.bitstroapp.di.modules;

import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.mobile.bitstro.bitstroapp.api.BitstroApi;
import com.mobile.bitstro.bitstroapp.factories.BitstroAdapterFactory;
import com.mobile.bitstro.bitstroapp.factories.NullOnEmptyConverterFactory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public final class ApiModule {
    private ApiModule() {
    }

    @Provides
    @Singleton
    public static BitstroApi providesBitstroApi() {
        GsonConverterFactory gsonConverterFactory = GsonConverterFactory.create(
                new GsonBuilder()
                    .registerTypeAdapterFactory(BitstroAdapterFactory.create())
                    .create());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://bitstro-9404e.firebaseio.com/")
                .addConverterFactory(new NullOnEmptyConverterFactory(gsonConverterFactory))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        return retrofit.create(BitstroApi.class);
    }
}
