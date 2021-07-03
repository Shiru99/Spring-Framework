package io.summer.Part8.service;

import io.summer.Part8.model.Circle;
import io.summer.Part8.model.Triangle;

public class FactoryService {
    public Object getBean(String beanType) {
        // if(beanType.equals("shapeService")) return new ShapeService();
        if(beanType.equals("shapeService")) return new ShapeServiceProxy();
        if(beanType.equals("circle")) return new Circle();
        if(beanType.equals("triangle")) return new Triangle();
        return null;
    }
}
