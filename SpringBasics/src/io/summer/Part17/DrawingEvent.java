package io.summer.Part17;

import org.springframework.context.ApplicationEvent;

public class DrawingEvent extends ApplicationEvent {

    public DrawingEvent(Object source) {
        super(source);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "toString functionality of DrawingEvent Class";
    }
}
