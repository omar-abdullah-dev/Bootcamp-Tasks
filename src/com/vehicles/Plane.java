package com.vehicles;


import com.vehicles.config.DBOperations;

public class Plane implements Vehicle {
    DBOperations dbOps;
    String model;

    @Override
    public void saveToDB() {
        dbOps.save(this);
    }

    @Override
    public String getModel() {
        return this.model;
    }

    public void setDbOps(DBOperations dbOps) {
        this.dbOps = dbOps;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
