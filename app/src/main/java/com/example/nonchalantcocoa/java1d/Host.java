package com.example.nonchalantcocoa.java1d;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Host {
    private LatLng location;
    private Map<String,Boolean> users;
    private double radius;
    private Signal signal;
    private List priceList;
    private List cuisineList;
    private List avaCuisineList;
    private List resultList;
    private String status;
    private int shopCounter;

    public Host(LatLng location, Map<String, Boolean> users, double radius, Signal signal,
                List priceList, List cuisineList, List avaCuisineList, List resultList, String status, int shopCounter) {
        this.location = location;
        this.users = users;
        this.radius = radius;
        this.signal = signal;
        this.priceList = priceList;
        this.cuisineList = cuisineList;
        this.avaCuisineList = avaCuisineList;
        this.resultList = resultList;
        this.status = status;
        this.shopCounter = shopCounter;
    }

    public Host(LatLng location, Map<String, Boolean> users, double radius) {
        this.location = location;
        this.users = users;
        this.radius = radius;
        this.signal = new Signal();

        ArrayList priceList = new ArrayList();
        priceList.add(0);

        ArrayList cuisineList = new ArrayList();
        cuisineList.add(0);

        ArrayList avaCuisineList = new ArrayList();
        avaCuisineList.add(0);

        ArrayList resultList = new ArrayList();
        resultList.add(0);

        this.priceList = priceList;
        this.cuisineList = cuisineList;
        this.avaCuisineList = avaCuisineList;
        this.resultList = resultList;
        this.status = "open";
        this.shopCounter = 0;
    }

    public LatLng getLocation() {
        return location;
    }

    public Map<String, Boolean> getUsers() {
        return users;
    }

    public double getRadius() {
        return radius;
    }

    public Signal getSignal() {
        return signal;
    }

    public List getPriceList() {
        return priceList;
    }

    public List getCuisineList() {
        return cuisineList;
    }

    public List getAvaCuisineList() {
        return avaCuisineList;
    }

    public List getResultList() {
        return resultList;
    }

    public String getStatus() {
        return status;
    }

    public int getShopCounter() {
        return shopCounter;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
// Put a comment here to avoid                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      error: illegal character: '\u0000'