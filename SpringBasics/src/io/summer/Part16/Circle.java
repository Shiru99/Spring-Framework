package io.summer.Part16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle extends Shape {

    String shapeType = "Circle";

    MessageSource messageSource;

    Point center;

    public Point getCenter() {
        return center;
    }

    @Autowired
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.print("Drawing Circle : ");
        System.out.println("Circle center - ("+getCenter().getX()+","+getCenter().getY()+")");
    }
}
