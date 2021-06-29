package io.summer.Part17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class Circle extends Shape implements ApplicationEventPublisherAware {

    @Autowired
    Point center;

    public Point getCenter() {
        return center;
    }

    ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void draw() {
        
        DrawingEvent event = new DrawingEvent(this);
        publisher.publishEvent(event);

        System.out.print("Drawing Circle with center - ");
        getCenter().pointDetails();
        System.out.println();
    }
}