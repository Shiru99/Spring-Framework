package io.summer.Part16;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingShapes {
    public static void main(String[] args) {
        
        var applicationContext = new ClassPathXmlApplicationContext("io/summer/Part16/spring.xml");
        applicationContext.registerShutdownHook();
        
        Shape shape = (Shape) applicationContext.getBean("circle");
        shape.draw();

        applicationContext.close();
    }
}
