package com.shapes;

public class Draw3D {
    public void draw(Shape shape) {
        System.out.println(String.format("Drawing 3D %s", shape.getClass().getSimpleName()));
    }
}
