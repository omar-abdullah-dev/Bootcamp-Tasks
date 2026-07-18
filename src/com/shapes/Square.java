package com.shapes;

import com.shapes.Draw2D;
import com.shapes.Draw3D;
import com.shapes.Shape;

public class Square implements Shape {
    private Draw2D draw2D;
    private Draw3D draw3D;

    public void setDraw2D(Draw2D draw2D) {
        this.draw2D = draw2D;
    }

    public void setDraw3D(Draw3D draw3D) {
        this.draw3D = draw3D;
    }

    @Override
    public void draw() {
        draw2D.draw(this);
        draw3D.draw(this);
    }
}
