package io.summer.Part15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;

@Component
// @Service - service object/implementation
// @Repository - data object
// @Controller - controller object


public class Circle extends Shape {

    String shapeType = "Circle";

    Point center;

    public Point getCenter() {
        return center;
    }

    @Autowired
    // @Resource(name = "pointA")
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
