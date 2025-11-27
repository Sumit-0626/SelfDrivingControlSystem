package com.sdcs.model;

public class Vehicle implements Trackable {

    private int id;
    private String vehicleNumber;
    private String status;
    private double currentLat;
    private double currentLng;

    public Vehicle(int id, String vehicleNumber, String status,
                   double currentLat, double currentLng) {

        this.id = id;
        this.vehicleNumber = vehicleNumber;
        this.status = status;
        this.currentLat = currentLat;
        this.currentLng = currentLng;
    }

    @Override
    public void updateLocation(double lat, double lng) {
        this.currentLat = lat;
        this.currentLng = lng;
    }

    public int getId() { return id; }
    public String getVehicleNumber() { return vehicleNumber; }
    public String getStatus() { return status; }
    public double getCurrentLat() { return currentLat; }
    public double getCurrentLng() { return currentLng; }

}
