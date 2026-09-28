package com.shapesWithAnnotations;

import org.springframework.stereotype.Component;

@Component
public class Square implements Shape {
    private double side;

    @Override
    public double getArea() {
        return (Math.pow(side, 2));
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
