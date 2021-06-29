package io.summer.Part16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Circle extends Shape {

    String shapeType = "Circle";

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
        System.out.print("Drawing Circle with center - ");
        System.out.print("("+getCenter().getX()+","+getCenter().getY()+")"+"\t");
        System.out.println();
    }
}
