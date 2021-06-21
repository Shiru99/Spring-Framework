package DependencyInjection.WithDI;

public class DrawingShape {
    Shape shape;

    void setShape(Shape shape) {
        this.shape = shape;
    }

    void draw() {
        this.shape.draw();
    }
}
