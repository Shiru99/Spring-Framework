package DependencyInjection.WithDI;

public class Main {
    public static void main(String[] args) {
        
        DrawingShape drawingShape = new DrawingShape();

        drawingShape.setShape(new Triangle());
        drawingShape.draw();

        drawingShape.setShape(new Circle());
        drawingShape.draw();
    }
}
