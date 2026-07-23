import com.vehicles.Car;
import com.vehicles.Plane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        //          Task 2: Bean init - destroy methods (Beans Lifecycle)
        System.out.println("*****************");
        Car car = container.getBean("car", Car.class);
        car.setModel("BMW X6");
        car.saveToDB();
        System.out.println("-----------------");
        Plane plane = container.getBean("plane", Plane.class);
        plane.setModel("AirBus 124");
        plane.saveToDB();
//        for calling Destroy method
        ((ClassPathXmlApplicationContext) container).close();
    }
}