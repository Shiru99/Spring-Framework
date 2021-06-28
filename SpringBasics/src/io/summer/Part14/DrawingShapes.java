package io.summer.Part14;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingShapes {
    public static void main(String[] args) {
        
        var applicationContext = new ClassPathXmlApplicationContext("io/summer/Part14/spring.xml");
        applicationContext.registerShutdownHook();
        
        Shape shape = (Shape) applicationContext.getBean("shape");
        shape.draw();

        applicationContext.close();
    }
}
