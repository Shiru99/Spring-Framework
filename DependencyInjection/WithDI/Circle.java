package DependencyInjection.WithDI;

public class Circle extends Shape {

    String shapeType = "Circle";

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
    
}
