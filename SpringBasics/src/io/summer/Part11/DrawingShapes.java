package io.summer.Part11;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingShapes {
    public static void main(String[] args) {

        var applicationContext = new ClassPathXmlApplicationContext("io/summer/Part11/spring.xml");

        Triangle scalarTriangle = (Triangle) applicationContext.getBean("ScalarTriangle");
        scalarTriangle.draw();

        applicationContext.close();
    }
}