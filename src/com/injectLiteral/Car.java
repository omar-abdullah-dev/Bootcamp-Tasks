package com.injectLiteral;

import com.injectLiteral.config.DBOperations;

public class Car implements Vehicle {
    private DBOperations dbOps;
    private String brand;

    // Constructor injection
    public Car(DBOperations dbOps) {
        this.dbOps = dbOps;
    }

    @Override
    public void saveToDB() {
        dbOps.save(this);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }
}
