package com.shapesWithAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("com/shapesWithAnnotations/applicationContext.xml");
        Scanner in = new Scanner(System.in);

        Circle circle = container.getBean(Circle.class);
        System.out.print("Enter circle radius (e.g. 5): ");
        if (in.hasNextDouble()) {
            circle.setRadius(in.nextDouble());
            System.out.println("Circle area is: " + circle.getArea());
        }

        Square square = container.getBean(Square.class);
        System.out.print("Enter square side (e.g. 4): ");
        if (in.hasNextDouble()) {
            square.setSide(in.nextDouble());
            System.out.println("Square area is: " + square.getArea());
        }
        in.close();
    }
}
