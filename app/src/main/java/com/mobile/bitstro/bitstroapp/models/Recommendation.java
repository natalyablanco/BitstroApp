package com.mobile.bitstro.bitstroapp.models;

/**
 * Created by natalyablanco on 27/02/2017.
 */

public class Recommendation {

    Dish dishRecommended;
    Restaurant restaurantRecommended;

    public Recommendation(Dish dishRecommended,
            Restaurant restaurantRecommended) {
        this.dishRecommended = dishRecommended;
        this.restaurantRecommended = restaurantRecommended;
    }

    public Dish getDishRecommended() {
        return dishRecommended;
    }

    public void setDishRecommended(Dish dishRecommended) {
        this.dishRecommended = dishRecommended;
    }

    public Restaurant getRestaurantRecommended() {
        return restaurantRecommended;
    }

    public void setRestaurantRecommended(
            Restaurant restaurantRecommended) {
        this.restaurantRecommended = restaurantRecommended;
    }
}
