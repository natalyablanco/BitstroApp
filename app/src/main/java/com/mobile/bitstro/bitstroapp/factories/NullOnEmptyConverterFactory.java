package com.mobile.bitstro.bitstroapp.factories;

import retrofit2.Converter;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by natalyablanco on 27/02/2017.
 */

public class NullOnEmptyConverterFactory extends Converter.Factory {
    public NullOnEmptyConverterFactory(GsonConverterFactory gsonConverterFactory) {
    }
}
