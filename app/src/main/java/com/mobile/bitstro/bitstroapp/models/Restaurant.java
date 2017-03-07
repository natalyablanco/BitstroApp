package com.mobile.bitstro.bitstroapp.models;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Restaurant {

    private String name;
    private String logo;
    private String description;
    private String qrCode;
    private List<Menu> menus = new ArrayList<Menu>();
    private User user;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     *
     * @param logo
     * The logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
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
     * The qrCode
     */
    public String getQrCode() {
        return qrCode;
    }

    /**
     *
     * @param qrCode
     * The qr_code
     */
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    /**
     *
     * @return
     * The menus
     */
    public List<Menu> getMenus() {
        return menus;
    }

    /**
     *
     * @param menus
     * The menus
     */
    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    /**
     *
     * @return
     * The user
     */
    public User getUser() {
        return user;
    }

    /**
     *
     * @param user
     * The user
     */
    public void setUser(User user) {
        this.user = user;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
