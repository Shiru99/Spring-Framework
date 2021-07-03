package io.summer.Part8.service;

import io.summer.Part8.model.Circle;
import io.summer.Part8.model.Triangle;

public class ShapeService {

    private Circle circle;
    private Triangle triangle;

    public Circle getCircle() {
        System.out.println("Circle Getter is called");
        return circle;
    }
    public void setCircle(Circle circle) {
        System.out.println("Circle Setter is called");
        this.circle = circle;
    }
    public Triangle getTriangle() {
        System.out.println("Triangle Getter is called");
        return triangle;
    }
    public void setTriangle(Triangle triangle) {
        System.out.println("Triangle Setter is called");
        this.triangle = triangle;
    }
}