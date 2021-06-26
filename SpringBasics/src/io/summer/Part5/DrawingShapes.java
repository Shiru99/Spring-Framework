package io.summer.Part5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingShapes {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("io/summer/Part5/spring.xml");

        Polygon polygon = (Polygon) applicationContext.getBean("polygonX");
        polygon.draw();
        
        ((AbstractApplicationContext) applicationContext).close();
    }
}