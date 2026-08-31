package com.injectLiteral.config;

import com.injectLiteral.Vehicle;

public class DBOperations {
    private String url;
    private String username;
    private String password;

    public void save(Vehicle vehicle) {
        System.out.println("Connecting to database with properties...");
        System.out.println(String.format("Url: %s userName: %s password: %s", this.url, this.username, this.password));
        System.out.println(String.format("Saving %s %s to DB...", vehicle.getBrand(), vehicle.getClass().getSimpleName()));
        System.out.println("Saved to DB Successfully");
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
