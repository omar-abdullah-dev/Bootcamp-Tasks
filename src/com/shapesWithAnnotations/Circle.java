package com.shapesWithAnnotations;


import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {
    private double radius;
    @Override
    public double getArea() {
        return (Math.PI*(Math.pow(radius,2)));
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
