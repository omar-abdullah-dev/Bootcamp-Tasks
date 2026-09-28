package com.IoCTask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/IoCTask/applicationContext.xml");

        Shape circle = context.getBean("circle", Shape.class);
        Shape rectangle = context.getBean("rectangle", Shape.class);
        Shape triangle = context.getBean("triangle", Shape.class);

        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
