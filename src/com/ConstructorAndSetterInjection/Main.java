package com.ConstructorAndSetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext("com/ConstructorAndSetterInjection/applicationContext.xml");
        Shape circle = iocContainer.getBean("circle", Shape.class);
        Shape square = iocContainer.getBean("square", Shape.class);

        // draw circle
        circle.draw2d();
        circle.draw3d();

        // draw square
        square.draw2d();
        square.draw3d();
    }
}
