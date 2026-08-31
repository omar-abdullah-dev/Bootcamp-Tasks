package com.vehicles.config;

import com.vehicles.Vehicle;

public class DBOperations {
    private String url;
    private String userName;
    private String password;

    public void save(Vehicle vehicle) {
        System.out.println("Connecting to database using configurations :  ");
        System.out.println(String.format("Url: %s Username: %s Password: %s", this.url, this.userName, this.password));
        System.out.println("Saving ....");
        System.out.println(String.format("%s %s Saved to DB Successfully", vehicle.getModel(), vehicle.getClass().getSimpleName()));
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void connectToDatabase() {
        System.out.println("connection to database established ……");
    }

    public void disconnectFromDatabase() {
        System.out.println("connection to database closed……");
    }
}
