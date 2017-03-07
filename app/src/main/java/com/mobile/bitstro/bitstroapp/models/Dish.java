package com.mobile.bitstro.bitstroapp.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


/**
 * Created by natal on 08/11/2016.
 */


@AutoValue
public abstract class Dish {

    abstract String id();
    abstract String title();
    abstract int menu();
    abstract String description();
    abstract String image();
    abstract Map<String, Object> additionalProperties();

    public static Dish create(String id, String title, int menu, String description, String image, Map<String, Object> additionalProperties) {
        return new AutoValue_Dish(id, title, menu, description, image, additionalProperties);
    }

    public static TypeAdapter<Dish> typeAdapter(Gson gson) {
        return new AutoValue_Dish.GsonTypeAdapter(gson);
    }
}
