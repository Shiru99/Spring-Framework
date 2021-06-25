package io.summer.Part3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingShapes {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("io/summer/Part3/spring.xml");

        Triangle equilateralTriangle = (Triangle) applicationContext.getBean("EquilateralTriangle");
        equilateralTriangle.draw();
        

        ((AbstractApplicationContext) applicationContext).close();
    }
}