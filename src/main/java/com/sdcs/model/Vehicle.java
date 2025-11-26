package com.sdcs.model;

public class Vehicle implements Trackable {

    public int id;
    public String name;
    public String status;
    public double current_lat;
    public double current_lng;

    public Vehicle(int id, String name, String status, double current_lat, double current_lng) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.current_lat = current_lat;
        this.current_lng = current_lng;
    }



    @Override
    public void updateLocation(double lat, double lon) {
        this.current_lat = lat;
        this.current_lng = lon;
    }
}
