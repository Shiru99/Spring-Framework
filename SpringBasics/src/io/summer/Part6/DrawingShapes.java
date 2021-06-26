package io.summer.Part6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingShapes {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("io/summer/Part6/spring.xml");

        Triangle scalarTriangle = (Triangle) applicationContext.getBean("ScalarTriangle");
        scalarTriangle.draw();
        
        ((AbstractApplicationContext) applicationContext).close();
    }
}