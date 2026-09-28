package com.validation.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DatabaseOperations implements Database {

    @Override
    public void insert(Database entity) {
        System.out.println("Inserting data into the database...");
    }
}
