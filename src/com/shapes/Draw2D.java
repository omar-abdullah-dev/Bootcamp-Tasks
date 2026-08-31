package com.shapes;

public class Draw2D {
    public void draw(Shape shape) {
        System.out.println(String.format("Drawing 2D %s", shape.getClass().getSimpleName()));
    }
}
