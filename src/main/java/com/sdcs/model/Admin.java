package com.sdcs.model;

public class Admin extends User {
    public Admin(int id, String username, String password) {
        super(id, username, password, "admin");
    }

    @Override
    public String getDashboardPage() {
        return "/admin";
    }
}
