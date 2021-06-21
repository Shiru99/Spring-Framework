package DependencyInjection.WithDI;

public class Triangle extends Shape {

    String shapeType = "Triangle";

    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}
