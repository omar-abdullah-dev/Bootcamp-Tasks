package com.injectLiteral;

import com.injectLiteral.config.DBOperations;

public class Plane implements Vehicle {
    private DBOperations dbOps;
    private String brand;

    @Override
    public void saveToDB() {
        dbOps.save(this);
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    public void setDbOps(DBOperations dbOps) {
        this.dbOps = dbOps;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
