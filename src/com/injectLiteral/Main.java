package com.injectLiteral;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("com/injectLiteral/applicationContext.xml");

        Car car = container.getBean("car", Car.class);
        car.setBrand("BMW");
        car.saveToDB();

        Plane plane = container.getBean("plane", Plane.class);
        plane.setBrand("AirBus");
        plane.saveToDB();
    }
}
