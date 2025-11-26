package com.sdcs.model;

public class Technician extends User {
    public Technician(int id, String username, String password) {
        super(id, username, password, "technician");
    }

    @Override
    public String getDashboardPage() {
        return "/tech";
    }
}
