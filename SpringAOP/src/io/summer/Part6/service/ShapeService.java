package io.summer.Part6.service;

import io.summer.Part6.aspect.CustomAdviceAnnotation;
import io.summer.Part6.model.Circle;
import io.summer.Part6.model.Triangle;

public class ShapeService {

    private Circle circle;
    private Triangle triangle;

    @CustomAdviceAnnotation
    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }
    
    public Triangle getTriangle() {
        return triangle;
    }

    @CustomAdviceAnnotation
    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}