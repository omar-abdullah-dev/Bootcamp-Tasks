package com.shapes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("com/shapes/applicationContext.xml");

        // Singleton scope test
        Circle circle1 = container.getBean("circle", Circle.class);
        Circle circle2 = container.getBean("circle", Circle.class);
        System.out.println("Are Circle instances identical (Singleton)? " + (circle1 == circle2));
        System.out.println("Circle 1 memory location: " + circle1);
        System.out.println("Circle 2 memory location: " + circle2);
        circle1.draw();

        // Prototype scope test
        Square square1 = container.getBean("square", Square.class);
        Square square2 = container.getBean("square", Square.class);
        System.out.println("Are Square instances identical (Prototype)? " + (square1 == square2));
        System.out.println("Square 1 memory location: " + square1);
        System.out.println("Square 2 memory location: " + square2);
        square1.draw();
    }
}
