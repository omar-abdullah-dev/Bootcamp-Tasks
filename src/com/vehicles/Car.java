package com.vehicles;

import com.vehicles.config.DBOperations;

public class Car implements Vehicle {
    private DBOperations dbOps;
    private String model;

    public Car(DBOperations dbOps) {
        this.dbOps = dbOps;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public void saveToDB() {
        dbOps.save(this);
    }

    public void setModel(String model) {
        this.model = model;
    }
}
