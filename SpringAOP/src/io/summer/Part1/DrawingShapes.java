package io.summer.Part1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingShapes {
    public static void main(String[] args) {
        
        var applicationContext = new ClassPathXmlApplicationContext("io/summer/Part1/spring.xml");

        Shape shape = (Shape) applicationContext.getBean("shape");
        shape.draw();

        applicationContext.close();
        
    }
}
