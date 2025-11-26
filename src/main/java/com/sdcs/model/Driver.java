package com.sdcs.model;

public class Driver extends User {
    public Driver(int id, String username, String password) {
        super(id, username, password, "driver");
    }

    @Override
    public String getDashboardPage() {
        return "/drivers";
    }
}
