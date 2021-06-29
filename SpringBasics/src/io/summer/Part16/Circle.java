package io.summer.Part16;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle extends Shape {

    String shapeType = "Circle";

    @Autowired     // M-2 (using bean defined in XML)
    MessageSource messageSource;

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
        
        // System.out.print("Drawing Circle"+" : ");
        // System.out.println("Circle center - ("+getCenter().getX()+","+getCenter().getY()+")");

        System.out.print(messageSource.getMessage("greetings-ITL", null,"Default Greetings", Locale.ITALIAN)+", ");
        System.out.print(messageSource.getMessage("drawing.circle", null,"Drawing", null)+" : ");
        System.out.println(messageSource.getMessage(
            "circle.center",
            new Object[]{getCenter().getX(),getCenter().getY()},
            "center of circle",
            null
        ));
    }
}
