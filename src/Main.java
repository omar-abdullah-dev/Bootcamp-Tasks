import com.shapesWithAnnotations.Circle;
import com.shapesWithAnnotations.Square;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner in = new Scanner(System.in);
        Circle circle = container.getBean(Circle.class);
        circle.setRadius(in.nextDouble());
        System.out.println("Circle area is:"+circle.getArea());
        Square square = container.getBean(Square.class);
        square.setSide(in.nextDouble());
        System.out.println("Square area is:"+square.getArea());
    }
}