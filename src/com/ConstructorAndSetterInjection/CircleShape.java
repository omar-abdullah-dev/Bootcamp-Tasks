package com.ConstructorAndSetterInjection;

public class CircleShape implements Shape {
    private Draw2dShape draw2dShape;
    private Draw3dShape draw3dShape;

    // Constructor Injection for Draw2dShape and Draw3dShape objects
    public CircleShape(Draw2dShape draw2dShape, Draw3dShape draw3dShape) {
        this.draw2dShape = draw2dShape;
        this.draw3dShape = draw3dShape;
    }

    @Override
    public void draw2d() {
        draw2dShape.draw("Circle");
    }

    @Override
    public void draw3d() {
        draw3dShape.draw("Circle");
    }
}
