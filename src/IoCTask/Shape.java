package IoCTask;

public interface Shape {
    void draw();
// we can use it to reduce the redundancy of the code by passing the Object as an argument
    default void draw(Shape shape){
        System.out.println("OVRLD: Drawing "+shape.getClass().getSimpleName());
    }
    
}
