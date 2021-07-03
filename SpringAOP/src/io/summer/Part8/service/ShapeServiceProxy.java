package io.summer.Part8.service;

import io.summer.Part8.aspect.LoggingAspect;
import io.summer.Part8.model.Circle;

public class ShapeServiceProxy extends ShapeService {
    public Circle getCircle() {
        
        new LoggingAspect().loggingAdvice();        // Before
        Object returnVal =  super.getCircle();
        new LoggingAspect().nextAdvice();           // After

        return (Circle) returnVal;
    }
}
