package com.company.Models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Customer implements Comparable<Customer>{

    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("longitude")
    @Expose
    private String longitude;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public int compareTo(Customer o) {
        if (userId == o.userId)
            return 0;
        if (userId < o.userId)
            return -1;
        return 1;
    }
}