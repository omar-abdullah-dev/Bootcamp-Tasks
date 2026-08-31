package com.ConstructorAndSetterInjection;

public class SquareShape implements Shape {
    private Draw2dShape draw2dSquare;
    private Draw3dShape draw3dSquare;

    // Setter Injection for Draw2dShape and Draw3dShape objects
    public void setDraw2dSquare(Draw2dShape draw2dSquare) {
        this.draw2dSquare = draw2dSquare;
    }

    public void setDraw3dSquare(Draw3dShape draw3dSquare) {
        this.draw3dSquare = draw3dSquare;
    }

    @Override
    public void draw2d() {
        draw2dSquare.draw("Square");
    }

    @Override
    public void draw3d() {
        draw3dSquare.draw("Square");
    }
}
