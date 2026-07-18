import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.shapes.Square;
import com.vehicles.Car;
import com.vehicles.Plane;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        //          Task 1:  Bean Scopes
        Square square = container.getBean("square", Square.class);
        Square square2 = container.getBean("square", Square.class);
        System.out.println(square);
        System.out.println(square2);
        System.out.println(String.format("Ensure that prototype is working %s",square==square2));

        //          Task 2: Bean init - destroy methods (Beans Lifecycle)
        System.out.println("*****************");
        Car car = container.getBean("car", Car.class);
        car.setModel("BMW X6");
        car.saveToDB();
        System.out.println("-----------------");
        Plane plane = container.getBean("plane", Plane.class);
        plane.setModel("AirBus 124");
        plane.saveToDB();
        ((ClassPathXmlApplicationContext) container).close();
    }
}