package com.example.nonchalantcocoa.java1d;

import com.google.android.gms.maps.model.LatLng;

import java.util.Map;

public class Host {
    public LatLng location;
    public Map<String,Boolean> users;
    public double radius;
    public Signal signal;

    public Host(LatLng location, Map<String, Boolean> users, double radius, Signal signal) {
        this.location = location;
        this.users = users;
        this.radius = radius;
        this.signal = signal;
    }

    public Host(LatLng location, Map<String, Boolean> users, double radius) {
        this.location = location;
        this.users = users;
        this.radius = radius;
        this.signal = new Signal();
    }
}
// Put a comment here to avoid                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      error: illegal character: '\u0000'