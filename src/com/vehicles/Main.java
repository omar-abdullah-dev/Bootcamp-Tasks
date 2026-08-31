package com.vehicles;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("com/vehicles/applicationContext.xml");

        Car car = container.getBean("car", Car.class);
        car.setModel("Tesla Model 3");
        car.saveToDB();

        Plane plane = container.getBean("plane", Plane.class);
        plane.setModel("Boeing 777");
        plane.saveToDB();

        // Close container to trigger destroy methods
        container.close();
    }
}
