package io.summer.Part13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle extends Shape {

    String shapeType = "Circle";

    // @Autowired
    // @Qualifier("circleCenter")
    Point center;

    public Point getCenter() {
        return center;
    }

    /*
        Required annotation validates (required bean property must be injected with a value at the configuration time) during bean initialization

        Instead of throwing runtime error - throws error during initialization
    */

    @Required 
    @Autowired
    @Qualifier("circleCenter")
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
