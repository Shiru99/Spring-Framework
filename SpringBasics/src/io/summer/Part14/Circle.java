package io.summer.Part14;

import jakarta.annotation.Resource;

public class Circle extends Shape {

    String shapeType = "Circle";

    Point center;

    public Point getCenter() {
        return center;
    }

    // @Resource : By Default checks for beanName - center
    @Resource
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.print("Drawing Circle with center - ");
        getCenter().pointDetails();
        System.out.println();
    }
    
}
