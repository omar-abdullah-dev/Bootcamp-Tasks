package com.IoCTask;

public interface Shape {
    void draw();

    // Default method to reduce code redundancy by passing the Object as an argument
    default void draw(Shape shape) {
        System.out.println("OVRLD: Drawing " + shape.getClass().getSimpleName());
    }
}
