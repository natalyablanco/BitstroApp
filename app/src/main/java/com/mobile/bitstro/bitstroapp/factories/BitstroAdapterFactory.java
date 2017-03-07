package com.mobile.bitstro.bitstroapp.factories;

import com.google.gson.Gson;
import com.google.gson.TypeAdapterFactory;
import com.ryanharter.auto.value.gson.GsonTypeAdapterFactory;

/**
 * Created by natalyablanco on 27/02/2017.
 */

@GsonTypeAdapterFactory
public abstract class BitstroAdapterFactory implements TypeAdapterFactory {
    public static TypeAdapterFactory create() {
        return new AutoValueGson_BitstroAdapterFactory();
    }
}
