package DependencyInjection.WithoutDI;

public class Main {
    public static void main(String[] args) {

        // M-1
        // Triangle triangle = new Triangle();
        // triangle.draw();

        // Circle circle = new Circle();
        // circle.draw();


        // Using Polymorphism

        Shape shape = new Triangle();
        shape.draw();

        shape = new Circle();
        shape.draw();
    }
}
