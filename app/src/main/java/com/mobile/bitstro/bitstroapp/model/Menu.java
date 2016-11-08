package com.mobile.bitstro.bitstroapp.model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;


/**
 * Created by natal on 08/11/2016.
 */


@Generated("org.jsonschema2pojo")
public class Menu {

    private String title;
    private String description;
    private List<Dish> dishes = new ArrayList<Dish>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The dishes
     */
    public List<Dish> getDishes() {
        return dishes;
    }

    /**
     *
     * @param dishes
     * The dishes
     */
    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}